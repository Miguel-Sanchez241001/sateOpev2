package pe.bn.com.sate.ope.infrastructure.facade;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import pe.bn.com.sate.ope.application.view.LoginController;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.EmpresaService;
import pe.bn.com.sate.ope.infrastructure.service.internal.NotificacionService;
import pe.bn.com.sate.ope.infrastructure.service.internal.PermisoService;
import pe.bn.com.sate.ope.infrastructure.service.internal.RolService;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.transversal.configuration.security.UsuarioSeguridad;
import pe.bn.com.sate.ope.transversal.dto.host.Solicitud;
import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;
import pe.bn.com.sate.ope.transversal.dto.sate.Permiso;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.StringsUtils;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesSeguridad;
import pe.bn.com.sate.ope.transversal.util.enums.RespuestaInterfaceGateway;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstado;
import pe.bn.com.sate.ope.transversal.util.host.RequestMensajeHost;

@Component
public class InterfaceGatewayFacade {

	private @Autowired
	UsuarioService usuarioService;
	private @Autowired
	PermisoService permisoService;
	private @Autowired
	RolService rolService;
	private @Autowired
	EmpresaService empresaService;
	private @Autowired
	NotificacionService notificacionService;

	private final static Logger logger = Logger
			.getLogger(InterfaceGatewayFacade.class);
	
	public Authentication buscarUsuarioInterfaceGateway(String ruc, String cic,
			String tipoDocumento, String numDocumento, String password)
			throws ServiceException {

		RequestMensajeHost requestMensajeHost = new RequestMensajeHost();
		
		
		Solicitud solicitud = requestMensajeHost.getSolicitud(ruc, cic,
				tipoDocumento, numDocumento, password, password,
				ConstantesGenerales.VERIFICAR_CLAVE);
		Usuario usuario = null;
		List<Permiso> permisos = null;

		if (solicitud != null) {
			if (solicitud.getcError().equals(
					RespuestaInterfaceGateway.EXITO.getCodigo())) {
				usuario = usuarioService.buscarUsuario(tipoDocumento,
						numDocumento);
				if (usuario.getFlagCambioClave() == null
						|| usuario.getFlagCambioClave().equals(
								TipoEstado.INACTIVO.getId())) {
					permisos = permisoService.buscarPermisosPorRole(usuario
							.getUsuarioPerfil());
				} else {
					permisos = permisoService
							.buscarPermisosPorRole(ConstantesGenerales.ROL_NUEVO);
				}

				UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(
						"No username", password,
						obtenerPermisosSeguridad(permisos));

				UsuarioSeguridad usuarioSeguridad = new UsuarioSeguridad(
						"No username", password,
						obtenerPermisosSeguridad(permisos), usuario.getId(),
						usuario.getApPaterno(), usuario.getApMaterno(),
						usuario.getNombres(), usuario.getTipoDocumento(),
						usuario.getNumeroDocumento(), ruc, permisos, rolService
								.buscarRolPorId(usuario.getUsuarioPerfil())
								.getDescripcion(), usuario.getFlagCambioClave());
				userToken.setDetails(usuarioSeguridad);

				return userToken;
			} else {
				throw new InternalServiceException(solicitud.getMsj());
			}
		} else {
			throw new InternalServiceException(
					"Error interno, vuelva a intentarlo");
		}

	}

	public void generarClave(String ruc, String tipoDocumento,
			String numDocumento, String correoElectronico, Usuario usuario)
			throws ServiceException {

		RequestMensajeHost requestMensajeHost = new RequestMensajeHost();
		Empresa empresa = empresaService.buscarEmpresaAfiliada(ruc);
		if (empresa != null) {
			String clave = StringsUtils.random();
			Solicitud solicitud = requestMensajeHost.getSolicitud(ruc,
					empresa.getCic(), tipoDocumento, numDocumento, clave, null,
					ConstantesGenerales.GENERAR_CLAVE);
			System.out
					.println("**********CLAVE GENERADA*********** : " + clave);

			if (solicitud.getcError().equals(
					RespuestaInterfaceGateway.EXITO.getCodigo())) {
				notificacionService.enviarMailUsuarioClave(usuario, clave);
			} else {
				throw new InternalServiceException(solicitud.getMsj());
			}

		} else {
			throw new InternalServiceException(
					"RUC de empresa no se encuentra afiliado");
		}

	}

	public void recuperarClave(String ruc, String tipoDocumento,
			String numDocumento, String correoElectronico)
			throws InternalServiceException {
		logger.info(" inicio metodo recuperarClaveFacade");

		RequestMensajeHost requestMensajeHost = new RequestMensajeHost();
		Empresa empresa = empresaService.buscarEmpresaAfiliada(ruc);
		Usuario usuario = usuarioService.buscarUsuario(tipoDocumento,
				numDocumento);

		if (empresa != null) {
			if (usuario != null) {
				if (usuarioService.existeUsuarioEmpresa(usuario, ruc)) {
					if (usuario.getCorreoLaboral() != null
							&& usuario.getCorreoLaboral().equals(
									correoElectronico)) {
						String clave = StringsUtils.random();
						System.out.println("CLAVE : " + clave);
						
						Solicitud solicitud = requestMensajeHost.getSolicitud(
								ruc, empresa.getCic(), tipoDocumento,
								numDocumento, clave, null,
								ConstantesGenerales.CAMBIAR_CLAVE_OLVIDO);

						if (solicitud.getcError().equals(
								RespuestaInterfaceGateway.EXITO.getCodigo())) {
							notificacionService.enviarMailUsuarioClave(usuario,
									clave);
							logger.info(" fin metodo recuperarClaveFacade");
						} else {
							throw new InternalServiceException(
									solicitud.getMsj());
						}
					} else {
						throw new InternalServiceException(
								"Correo no pertenece a la persona");
					}
				} else {
					throw new InternalServiceException(
							"Persona no pertenece al RUC de la empresa");
				}
			} else {
				throw new InternalServiceException(
						"Número de documento no pertenece a ningún usuario");
			}
		} else {
			throw new InternalServiceException(
					"RUC de empresa no se encuentra afiliado");
		}

	}

	public void cambiarClave(String ruc, String tipoDocumento,
			String numDocumento, String correoElectronico, String clave,
			String claveAnt) {

		RequestMensajeHost requestMensajeHost = new RequestMensajeHost();
		Empresa empresa = empresaService.buscarEmpresaAfiliada(ruc);
		Usuario usuario = usuarioService.buscarUsuario(tipoDocumento,
				numDocumento);

		Solicitud solicitud = requestMensajeHost.getSolicitud(ruc,
				empresa.getCic(), tipoDocumento, numDocumento, clave, claveAnt,
				ConstantesGenerales.CAMBIAR_CLAVE);

		if (solicitud.getcError().equals(
				RespuestaInterfaceGateway.EXITO.getCodigo())) {
			usuario.setFlagCambioClave("0");
			usuarioService.actualizaDatosUsuario(usuario);
		} else {
			throw new InternalServiceException(solicitud.getMsj());
		}

	}

	private List<GrantedAuthority> obtenerPermisosSeguridad(
			List<Permiso> permisos) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (Permiso permiso : permisos) {

			if (ConstantesSeguridad.OPCION_ACC.containsKey(permiso
					.getCodFuncionalidad())) {
				authorities.add(new SimpleGrantedAuthority(
						ConstantesSeguridad.OPCION_ACC.get(permiso
								.getCodFuncionalidad())));
			}
		}
		return authorities;
	}
}
