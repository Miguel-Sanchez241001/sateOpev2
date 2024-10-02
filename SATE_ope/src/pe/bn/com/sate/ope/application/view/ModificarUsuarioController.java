package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.ModificarUsuarioModel;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.InterfaceGatewayFacade;
import pe.bn.com.sate.ope.infrastructure.service.internal.RolService;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

@Controller("modificarUsuarioController")
@Scope("view")
public class ModificarUsuarioController implements Serializable {

	private final static Logger logger = Logger
			.getLogger(ModificarUsuarioController.class);

	private static final long serialVersionUID = 1L;

	ModificarUsuarioModel modificarUsuarioModel;

	private @Autowired
	UsuarioService usuarioService;

	private @Autowired
	RolService rolService;

	private @Autowired
	InterfaceGatewayFacade fwInterfaceGateway;

	@PostConstruct
	public void init() {
		modificarUsuarioModel = new ModificarUsuarioModel();
		modificarUsuarioModel.setRoles(rolService.buscarRoles());

		for (int i = 0; i < modificarUsuarioModel.getRoles().size(); i++) {
			if (modificarUsuarioModel.getRoles().get(i).getId()
					.equals((long) 0))
				modificarUsuarioModel.getRoles().remove(i);
		}
	}

	public void buscarPersona() {
		try {
			Usuario usuarioBusqueda = usuarioService
					.buscarUsuarioSinRepresentante(modificarUsuarioModel
							.getTipoDocumentoSeleccionado(),
							modificarUsuarioModel.getNumDocumentoSeleccionado());
			// Se realiza la busqueda en el servicio de la RENIEC
			if (usuarioBusqueda == null) {
				modificarUsuarioModel.setPersonaExiste(false);
				modificarUsuarioModel.setUsuarioSeleccionado(new Usuario());
				// Mensaje de validacion
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_ERROR,
						ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
						"No existe persona con el tipo y número de documento");
			} else {
				modificarUsuarioModel.setPersonaExiste(true);
				modificarUsuarioModel.setUsuarioSeleccionado(usuarioBusqueda);
			}
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}

	}

	public void modificarCuentaUsuario() {
		try {
			usuarioService.actualizaDatosUsuario(modificarUsuarioModel
					.getUsuarioSeleccionado());
			modificarUsuarioModel.inicializarFormularioUsuario();
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_INFO,
					ConstantesGenerales.TITULO_MENSAJE,
					"Se actualizó exitosamente");
			UsefulWebApplication.actualizarComponente("formCrearCuenta:msgs");
		} catch (InternalServiceException ise) {
			logger.error(ise.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
		}
	}

	public ModificarUsuarioModel getModificarUsuarioModel() {
		return modificarUsuarioModel;
	}

	public void setModificarUsuarioModel(
			ModificarUsuarioModel modificarUsuarioModel) {
		this.modificarUsuarioModel = modificarUsuarioModel;
	}

}
