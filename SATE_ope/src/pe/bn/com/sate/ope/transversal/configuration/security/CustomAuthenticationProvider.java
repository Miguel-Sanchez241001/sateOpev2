package pe.bn.com.sate.ope.transversal.configuration.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

 import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.InterfaceGatewayFacade;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.comp.ParametroInterfazKeyProxy;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.comp.SistemaParametro;
import pe.bn.com.sate.ope.infrastructure.service.internal.EmpresaService;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.componentes.Parametros;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEmpresa;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstado;
import pe.bn.com.sate.ope.transversal.util.excepciones.LoginException;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	private @Autowired
	InterfaceGatewayFacade fwInterfaceGateway;

	private @Autowired
	EmpresaService empresaService;

	private @Autowired
	UsuarioService usuarioService;

	private @Autowired
	Parametros parametros;
	private final Logger logger = Logger
			.getLogger(CustomAuthenticationProvider.class);
	 /**
     * Autentica el usuario contra el gateway de servicios web.
     * 
     * @param authentication Objeto de autenticación con las credenciales del usuario.
     * @return Un token de autenticación si las credenciales son válidas.
     * @throws AuthenticationException Si la autenticación falla.
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return autenticacionWSInterfaceGateway(authentication);
    }

    /**
     * Verifica si el proveedor soporta el tipo de autenticación dado.
     * 
     * @param authentication Tipo de autenticación.
     * @return true si el proveedor soporta el tipo de autenticación, false en caso contrario.
     */
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    /**
     * Realiza la autenticación contra el gateway de servicios web.
     * 
     * @param authentication Objeto de autenticación con las credenciales del usuario.
     * @return Un token de autenticación si las credenciales son válidas.
     */
    private Authentication autenticacionWSInterfaceGateway(Authentication authentication) {
        try {
            String username = authentication.getName();
            String password = String.valueOf(authentication.getCredentials());
            logger.info("Autenticando usuario: " + username);

            String[] usernameAndDomain = username.split("-");
            if (usernameAndDomain.length != 3) {
                String mensaje = "Formato de usuario inválido.";
                logger.error(mensaje);
                throw new LoginException(mensaje);
            }

            Empresa empresa = empresaService.buscarEmpresaAfiliada(usernameAndDomain[0]);
            Usuario usuario = usuarioService.buscarUsuario(usernameAndDomain[1], usernameAndDomain[2]);

            if (empresa != null) {
                if (usuario != null) {
                    if (usuario.getEstado() != null && !usuario.getEstado().equals(TipoEstado.INACTIVO.getId())) {
                        if (usuarioService.existeUsuarioEmpresa(usuario, usernameAndDomain[0])) {
                            asignarParametros();
                            return fwInterfaceGateway.buscarUsuarioInterfaceGateway(
                                    usernameAndDomain[0], empresa.getCic(), usernameAndDomain[1], usernameAndDomain[2], password);
                        } else {
                            String mensaje = "Usuario no tiene acceso a esta " + TipoEmpresa.tipoEmpresaLetras(empresa.getTipo());
                            logger.error(usuario.getNumeroDocumento()+ " " + mensaje);
                            throw new LoginException(mensaje);
                        }
                    } else {
                        String mensaje = "Usted ya no es representante de la Unidad Ejecutora";
                        logger.error(usuario.getNumeroDocumento()+ " " +mensaje);
                        throw new LoginException(mensaje);
                    }
                } else {
                    String mensaje = "Número de documento no pertenece a ningún usuario";
                    logger.error(mensaje);
                    throw new LoginException(mensaje);
                }
            } else {
                String mensaje = "RUC de empresa o unidad ejecutora no se encuentra afiliado";
                logger.error(mensaje);
                throw new LoginException(mensaje);
            }
        } catch (InternalServiceException ise) {
            logger.error("Error interno de servicio: " + ise.getMessage(), ise);
           // throw new LoginException(ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
            throw new LoginException(ise.getMessage());
        } catch (ServiceException se) {
            logger.error("Error de servicio: " + se.getMessage(), se);
            throw new LoginException(ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_IGF);
        } catch (Exception e) {
            logger.error("Error inesperado: " + e.getMessage(), e);
            throw new LoginException(e.getMessage());
        }
    }
    /**
     * Asigna los parámetros necesarios para la autenticación.
     * 
     * @throws Exception Si hay un error en la asignación de los parámetros.
     */
    public void asignarParametros() throws Exception {
    	  logger.info("Asignando parámetros");
        byte[] llave = leerClavesSegurades();

        if (llave != null) {
            ParametroInterfazKeyProxy proxyComp = new ParametroInterfazKeyProxy();
            SistemaParametro sParam = proxyComp.datoParametroService(
                    ConstantesGenerales.SISTEMA, ConstantesGenerales.CUENTA, ConstantesGenerales.SEMILLA, llave, ConstantesGenerales.IDUSUARIO);

            logger.info("Código de proceso: " + sParam.getProceso().getCodigo());
            parametros.setErrorComp(sParam.getProceso().getCodigo());
            parametros.setDesErrorComp(sParam.getProceso().getDescripcion());

            if (sParam.getProceso().getCodigo().equals("00000")) {
                for (int n = 0; n < sParam.getGrupoParametro().getGrupoParametro().size(); n++) {
                    int cantFilas = sParam.getGrupoParametro().getGrupoParametro().get(n).getParametro().getParametro().size() - 1;
                    for (int j = 0; j < cantFilas + 1; j++) {
                        String param = sParam.getGrupoParametro().getGrupoParametro().get(n).getParametro().getParametro().get(j).getAliasParam();
                        String valor = sParam.getGrupoParametro().getGrupoParametro().get(n).getParametro().getParametro().get(j).getValorParam();
                        if (!param.equals("")) {
                            setParametros(sParam.getGrupoParametro().getGrupoParametro().get(n).getAliasGrupo(), param, valor);
                        }
                    }
                }
                logger.info("Parámetros asignados exitosamente");
            } else {
                logger.error("No se pudieron obtener los datos Comp");
                throw new Exception("No se pudo obtener los datos Comp");
            }
        } else {
            logger.error("Error al leer el archivo clavesegurades.key");
            throw new Exception("Error con la lectura del archivo clavesegurades.key");
        }
    }

	private void setParametros(String aliasGrupo, String param, String valor) {
		if (aliasGrupo.equals(ConstantesGenerales.GRUPO_CONEXION_RENIEC)) {
			this.setDatosReniec(param, valor);
		}
		if (aliasGrupo.equals(ConstantesGenerales.GRUPO_CONEXION_MC)) {
			this.setDatosMC(param, valor);
		}
		if (aliasGrupo.equals(ConstantesGenerales.GRUPO_TIEMPO)) {
			this.setDatosTiempo(param, valor);
		}
	}

	private void setDatosReniec(String param, String valor) {
		if (param.equals(ConstantesGenerales.PARAM_CONSULTRENIEC)) {
			parametros.setConsultaReniec(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_SISTEMARENIEC)) {
			parametros.setSistemaReniec(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_USER1RENIEC)) {
			parametros.setUser1Reniec(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_USERRENIEC)) {
			parametros.setUserReniec(valor);
		}
	}

	private void setDatosMC(String param, String valor) {
		if (param.equals(ConstantesGenerales.PARAM_CODIGOEMISOR)) {
			parametros.setCodigoEmisorMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_CODIGOUSUARIO)) {
			parametros.setCodigoUsuarioMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_NUMTERMINAL)) {
			parametros.setNumTerminalMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_PREFIJONUMREFERENCIA)) {
			parametros.setPrefijoNumReferenciaMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_WSUSUARIOMC)) {
			parametros.setWsUsuarioMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_WSCLAVEMC)) {
			parametros.setWsClaveMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_WSURLSOAPMC)) {
			parametros.setWsSoapMc(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_COMERCIO)) {
			parametros.setWsComercioMc(valor);
		}
	}

	private void setDatosTiempo(String param, String valor) {
		if (param.equals(ConstantesGenerales.PARAM_SESIONEXPIRADATIEMPO)) {
			parametros.setSesionExpiradaTiempo(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_CONEXIONTIEMPO)) {
			parametros.setConexionTiempo(valor);
		} else if (param.equals(ConstantesGenerales.PARAM_RESPUESTATIEMPO)) {
			parametros.setRespuestaTiempo(valor);
		}
	}

	public byte[] leerClavesSegurades() {
		try {
			FileInputStream fis = new FileInputStream(new File(
					ConstantesGenerales.RUTA_CLAVE_SEGURA));
			return IOUtils.toByteArray(fis);
		} catch (IOException e) {
			System.out.println("Error en la lectura del archivo: "
					+ e.getMessage());
			System.err.println("Error en la lectura de clavesegurades.key: "
					+ e.getMessage());
			return null;
		}
	}

}