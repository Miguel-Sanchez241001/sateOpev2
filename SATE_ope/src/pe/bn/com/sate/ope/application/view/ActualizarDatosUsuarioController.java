package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.ActualizarDatosUsuarioModel;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.InterfaceGatewayFacade;
import pe.bn.com.sate.ope.infrastructure.service.internal.RolService;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

@Controller("actualizarDatosUsuarioController")
@Scope("view")
public class ActualizarDatosUsuarioController implements Serializable {

	private final Logger logger = Logger
			.getLogger(ActualizarDatosUsuarioController.class);
	
	private static final long serialVersionUID = 1L;

	private ActualizarDatosUsuarioModel actualizarDatosUsuarioModel;

	private @Autowired
	UsuarioService usuarioService;

	@Autowired
	private RolService rolService;

	private @Autowired
	InterfaceGatewayFacade fwInterfaceGateway;

	@PostConstruct
	public void init() {
		actualizarDatosUsuarioModel = new ActualizarDatosUsuarioModel();
		actualizarDatosUsuarioModel.setUsuario(usuarioService.buscarUsuario(
				UsefulWebApplication.obtenerUsuario().getTipoDocumento(),
				UsefulWebApplication.obtenerUsuario().getNumDocumento()));
		actualizarDatosUsuarioModel.setPerfilLetras(rolService.buscarRolPorId(
				actualizarDatosUsuarioModel.getUsuario().getUsuarioPerfil())
				.getDescripcion());

	}

	public void actualizarDatosUsuario() {
		try {
			usuarioService.actualizaDatosUsuario(actualizarDatosUsuarioModel
					.getUsuario());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_INFO,
					ConstantesGenerales.TITULO_MENSAJE,
					"Se actualizo correctamente");
		} catch (InternalServiceException ie) {
			logger.error(ie.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
		}
	}

	public void cambiarContrasenia() {
		try {
			if (actualizarDatosUsuarioModel.sonClavesIguales()) {
				if (actualizarDatosUsuarioModel.esClaveNuevaDiferente()) {
					fwInterfaceGateway.cambiarClave(UsefulWebApplication
							.obtenerUsuario().getRuc(),
							actualizarDatosUsuarioModel.getUsuario()
									.getTipoDocumento(),
							actualizarDatosUsuarioModel.getUsuario()
									.getNumeroDocumento(),
							actualizarDatosUsuarioModel.getUsuario()
									.getCorreoLaboral(),
							actualizarDatosUsuarioModel.getTecladoNueva()
									.getClave(), actualizarDatosUsuarioModel
									.getTecladoActual().getClave());
					actualizarDatosUsuarioModel.limpiarFormulario();
					UsefulWebApplication
							.mostrarMensajeJSF(
									ConstantesGenerales.SEVERITY_INFO,
									ConstantesGenerales.TITULO_MENSAJE,
									"Se cambio la clave, cierre sesión para ver los cambios");
				} else {
					UsefulWebApplication.mostrarMensajeJSF(
							ConstantesGenerales.SEVERITY_ERROR,
							ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
							"Clave nueva debe ser diferente a  la actual");
				}
			} else {
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_ERROR,
						ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
						"Clave nueva y confirmación no coinciden");
			}
		} catch (ServiceException se) {
			logger.error(se.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
					se.getMessage());
		}
	}

	public ActualizarDatosUsuarioModel getActualizarDatosUsuarioModel() {
		return actualizarDatosUsuarioModel;
	}

	public void setActualizarDatosUsuarioModel(
			ActualizarDatosUsuarioModel actualizarDatosUsuarioModel) {
		this.actualizarDatosUsuarioModel = actualizarDatosUsuarioModel;
	}

}
