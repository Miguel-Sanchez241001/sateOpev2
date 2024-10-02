package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.CrearUsuarioModel;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceIGWException;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceWsReniecException;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.FWPersonaNatural;
import pe.bn.com.sate.ope.infrastructure.facade.InterfaceGatewayFacade;
import pe.bn.com.sate.ope.infrastructure.service.internal.RolService;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstado;

@Controller("crearUsuarioController")
@Scope("view")
public class CrearUsuarioController implements Serializable {

	private final static Logger logger = Logger
			.getLogger(CrearUsuarioController.class);

	private static final long serialVersionUID = 1L;

	private CrearUsuarioModel crearUsuarioModel;

	private @Autowired
	UsuarioService usuarioService;

	private @Autowired
	RolService rolService;

	private @Autowired
	FWPersonaNatural fwPersonaNatural;

	private @Autowired
	InterfaceGatewayFacade fwInterfaceGateway;

	@PostConstruct
	public void init() {
		crearUsuarioModel = new CrearUsuarioModel();
		crearUsuarioModel.setRoles(rolService.buscarRoles());

		for (int i = 0; i < crearUsuarioModel.getRoles().size(); i++) {
			if (crearUsuarioModel.getRoles().get(i).getId().equals((long) 0))
				crearUsuarioModel.getRoles().remove(i);
		}
	}

	public void buscarPersona() {
		try {
			logger.info("[CrearUsuarioController] - Iniciando metodo buscarPersona");
			Usuario usuarioBusqueda = fwPersonaNatural.buscarUsuario(
					crearUsuarioModel.getTipoDocumentoSeleccionado(),
					crearUsuarioModel.getNumDocumentoSeleccionado());
			crearUsuarioModel.setPersonaExiste(usuarioBusqueda != null);
			// Se realiza la busqueda en el servicio de la RENIEC
			if (usuarioBusqueda == null) {
				crearUsuarioModel.setUsuarioSeleccionado(new Usuario());
				// Mensaje de validacion
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_ERROR,
						ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
						"No existe persona con el tipo y número de documento");
			} else {
				crearUsuarioModel.setUsuarioSeleccionado(usuarioBusqueda);
			}
			logger.info("[CrearUsuarioController] - Fin metodo buscarPersona");
		} catch (ExternalServiceWsReniecException es) {
			logger.error(es.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
					"La persona no ha sido encontrada con el DNI indicado");
		}

	}

	public void registrarCuentaUsuario() {
		try {

			if (!crearUsuarioModel.esTipoDocumentoDNI()
					|| crearUsuarioModel.validarDNI()) {

				if (usuarioService.buscarUsuario(
						crearUsuarioModel.getTipoDocumentoSeleccionado(),
						crearUsuarioModel.getNumDocumentoSeleccionado()) == null) {

					if (crearUsuarioModel.getUsuarioSeleccionado().getId() == null) {
						crearUsuarioModel
								.getUsuarioSeleccionado()
								.setTipoDocumento(
										crearUsuarioModel
												.getTipoDocumentoSeleccionado());
						crearUsuarioModel.getUsuarioSeleccionado()
								.setNumeroDocumento(
										crearUsuarioModel
												.getNumDocumentoSeleccionado());
					}
					crearUsuarioModel.getUsuarioSeleccionado()
							.setUsuarioPerfil(
									crearUsuarioModel.getRolSeleccionado());
					crearUsuarioModel.getUsuarioSeleccionado().setEstado(
							TipoEstado.ACTIVO.getId());
					crearUsuarioModel.getUsuarioSeleccionado()
							.setRepresentanteCreador(
									(usuarioService.buscarUsuario(
											UsefulWebApplication
													.obtenerUsuario()
													.getTipoDocumento(),
											UsefulWebApplication
													.obtenerUsuario()
													.getNumDocumento()))
											.getId());
					try {
						usuarioService.registrarUsuario(crearUsuarioModel
								.getUsuarioSeleccionado());

						fwInterfaceGateway.generarClave(UsefulWebApplication
								.obtenerUsuario().getRuc(), crearUsuarioModel
								.getUsuarioSeleccionado().getTipoDocumento(),
								crearUsuarioModel.getUsuarioSeleccionado()
										.getNumeroDocumento(),
								crearUsuarioModel.getUsuarioSeleccionado()
										.getCorreoLaboral(), crearUsuarioModel
										.getUsuarioSeleccionado());
						crearUsuarioModel.inicializarFormularioUsuario();
						UsefulWebApplication.mostrarMensajeJSF(
								ConstantesGenerales.SEVERITY_INFO,
								ConstantesGenerales.TITULO_MENSAJE,
								"Se registro exitosamente");
					} catch (InternalServiceException ise) {
						UsefulWebApplication.mostrarMensajeJSF(
								ConstantesGenerales.SEVERITY_ERROR,
								ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
								ise.getMessage());
					} catch (ExternalServiceIGWException ese) {
						UsefulWebApplication
								.mostrarMensajeJSF(
										ConstantesGenerales.SEVERITY_ERROR,
										ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_IGF,
										ese.getMessage());
					} catch (ServiceException se) {
						UsefulWebApplication.mostrarMensajeJSF(
								ConstantesGenerales.SEVERITY_ERROR,
								ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
								se.getMessage());
					}
					UsefulWebApplication
							.actualizarComponente("formCrearCuenta:msgs");
				} else {
					UsefulWebApplication.mostrarMensajeJSF(
							ConstantesGenerales.SEVERITY_ERROR,
							ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
							"Usuario ya se encuentra registrado");
					UsefulWebApplication
							.actualizarComponente("formCrearCuenta:msgs");
				}
			} else {
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_ERROR,
						ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
						"La persona no ha sido buscada");
			}

		} catch (InternalServiceException ise) {
			logger.error(ise.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ise.getMessage());
		}

	}

	public CrearUsuarioModel getCrearUsuarioModel() {
		return crearUsuarioModel;
	}

	public void setCrearUsuarioModel(CrearUsuarioModel crearUsuarioModel) {
		this.crearUsuarioModel = crearUsuarioModel;
	}
	  public void reiniciarFormularioCliente() {
	        logger.info("Reiniciando el formulario debido al cambio en el tipo de documento.");
	        crearUsuarioModel.reiniciarDatosCliente();
	        logger.info("Formulario reiniciado.");
	    }
}
