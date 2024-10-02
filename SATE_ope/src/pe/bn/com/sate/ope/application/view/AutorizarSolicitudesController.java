package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.AutorizarSolicitudModel;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

@Controller("autorizarSolicitudesController")
@Scope("view")
public class AutorizarSolicitudesController implements Serializable {

	private final Logger logger = Logger
			.getLogger(AutorizarSolicitudesController.class);

	private static final long serialVersionUID = 1L;

	private AutorizarSolicitudModel autorizarSolicitudModel;

	private @Autowired
	TarjetaService tarjetaService;

	@PostConstruct
	public void init() {
		autorizarSolicitudModel = new AutorizarSolicitudModel();
		autorizarSolicitudModel.setSolicitudesTarjeta(tarjetaService
				.buscarTodosSolicitudTarjetaPendientes());
	}

	public void autorizarSolicitudTarjeta() {
		try {
			if (autorizarSolicitudModel.validarCantidadSolicitudes()) {
				tarjetaService.aprobarSolicitudTarjeta(autorizarSolicitudModel
						.getSolicitudesTarjetaSeleccionado());
				autorizarSolicitudModel.setSolicitudesTarjeta(tarjetaService
						.buscarTodosSolicitudTarjetaPendientes());
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_INFO,
						ConstantesGenerales.TITULO_MENSAJE,
						"La(s) aprobacion(es) se realizaron exitosamente.");
			} else {
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_ERROR, "",
						"Seleccione 1 a más solicitudes");
			}
		} catch (InternalServiceException ie) {
			logger.error(ie.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
		}
	}

	public void rechazarSolicitudTarjeta() {
		try {
			if (autorizarSolicitudModel.validarCantidadSolicitudes()) {
				tarjetaService.rechazarSolicitudTarjeta(autorizarSolicitudModel
						.getSolicitudesTarjetaSeleccionado());
				autorizarSolicitudModel.setSolicitudesTarjeta(tarjetaService
						.buscarTodosSolicitudTarjetaPendientes());
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_INFO,
						ConstantesGenerales.TITULO_MENSAJE,
						"Los rechazos se realizaron exitosamente.");
			} else {
				UsefulWebApplication.mostrarMensajeJSF(
						ConstantesGenerales.SEVERITY_ERROR, "",
						"Seleccione 1 a más solicitudes");
			}
		} catch (InternalServiceException ie) {
			logger.error(ie.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
		}
	}

	public AutorizarSolicitudModel getAutorizarSolicitudModel() {
		return autorizarSolicitudModel;
	}

	public void setAutorizarSolicitudModel(
			AutorizarSolicitudModel autorizarSolicitudModel) {
		this.autorizarSolicitudModel = autorizarSolicitudModel;
	}

}
