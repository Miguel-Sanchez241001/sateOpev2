package pe.bn.com.sate.ope.application.view;

import java.text.ParseException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.ConsultarMovimientosModel;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.FWMCProcesos;
import pe.bn.com.sate.ope.infrastructure.facade.ReporteResumenFacade;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.persistence.mapper.internal.AsignacionMapper;
import pe.bn.com.sate.ope.persistence.mapper.internal.CargoMapper;
import pe.bn.com.sate.ope.transversal.dto.sate.Asignacion;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.TipoBusqueda;
import pe.bn.com.sate.ope.transversal.util.excepciones.InternalExcepcion;

@Controller("consultarMovimientosController")
@Scope("view")
public class ConsultarMovimientosController {

	private final static Logger logger = Logger.getLogger(ConsultarMovimientosController.class);

	private ConsultarMovimientosModel consultarMovimientosModel;

	private @Autowired FWMCProcesos fwmcProcesos;

	private @Autowired TarjetaService tarjetaService;
	@Autowired
	private ReporteResumenFacade reporteResumenFacade;

	@PostConstruct
	public void init() {
		consultarMovimientosModel = new ConsultarMovimientosModel();
	}

	public void buscarMovimientos() {
		consultarMovimientosModel.limpiarMovimientosTarjeta();
		try {
			consultarMovimientosModel.setDatosTarjetaCliente(tarjetaService.buscarDatosTarjetasCliente(
					consultarMovimientosModel.getTipoBusqueda(), consultarMovimientosModel.getNumeroTarjeta(), "B"));

			// consultarMovimientosModel.setMovimientosTarjeta(fwmcProcesos
			// .consultarMovimientosPorTarjeta(consultarMovimientosModel
			// .getNumeroTarjeta()));

			// aui debe llegar el valor del pop-up

			try {
				fwmcProcesos.consultaMovimientoPorExpediente(
						consultarMovimientosModel.getDatosTarjetaCliente().getTarjeta().getNumeroCuenta(),
						consultarMovimientosModel.getDatosTarjetaCliente().getTarjeta().getTipoMoneda(),
						consultarMovimientosModel.getDatosTarjetaCliente().getTarjeta().getFechaTerminoLinea()

				);
			} catch (InternalExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ServiceException se) {
			logger.error(se.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR, "", se.getMessage());
			UsefulWebApplication.actualizarComponente("msgs");
			UsefulWebApplication.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
		}
	}

	public void seleccionarAsignacion() {
		consultarMovimientosModel.limpiarMovimientosTarjeta();
		try {
			consultarMovimientosModel.setDatosTarjetaCliente(tarjetaService.buscarDatosTarjetasCliente(
					consultarMovimientosModel.getTipoBusqueda(), consultarMovimientosModel.getNumeroTarjeta(), "B"));

			// consultarMovimientosModel.setMovimientosTarjeta(fwmcProcesos
			// .consultarMovimientosPorTarjeta(consultarMovimientosModel
			// .getNumeroTarjeta()));

			// aui debe llegar el valor del pop-up

			try {
				fwmcProcesos.consultaMovimientoPorExpediente(
						consultarMovimientosModel.getDatosTarjetaCliente().getTarjeta().getNumeroCuenta(),
						consultarMovimientosModel.getDatosTarjetaCliente().getTarjeta().getTipoMoneda(),
						consultarMovimientosModel.getDatosTarjetaCliente().getTarjeta().getFechaTerminoLinea()

				);
			} catch (InternalExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ServiceException se) {
			logger.error(se.getMessage());
			UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR, "", se.getMessage());
			UsefulWebApplication.actualizarComponente("msgs");
			UsefulWebApplication.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
		}
	}

	public ConsultarMovimientosModel getConsultarMovimientosModel() {
		return consultarMovimientosModel;
	}

	public void setConsultarMovimientosModel(ConsultarMovimientosModel consultarMovimientosModel) {
		this.consultarMovimientosModel = consultarMovimientosModel;
	}

	public void buscarAsignaciones() {
		try {
			List<Asignacion> asignaciones = null;
			if (consultarMovimientosModel.getTipoBusqueda().equals(TipoBusqueda.NUM_TARJETA.getId())) {
				asignaciones = reporteResumenFacade
						.obtenerAsignacionesPorTarjeta(consultarMovimientosModel.getNumeroTarjeta());

			} else if (consultarMovimientosModel.getTipoBusqueda().equals(TipoBusqueda.DNI.getId())
					|| consultarMovimientosModel.getTipoBusqueda().equals(TipoBusqueda.CARNET_EXTRANJERIA.getId())) {
				asignaciones = reporteResumenFacade.obtenerAsignacionesPorDocumento(
						consultarMovimientosModel.getTipoBusqueda(), consultarMovimientosModel.getNumeroTarjeta());
			}
			consultarMovimientosModel.setAsignacionesTotal(asignaciones);
			// MOSTRAR MODAL COMPONENTE
			UsefulWebApplication.ejecutar("wvSeleccionarAsignacion.show()");
			// formulario del componente
			UsefulWebApplication.actualizarComponente("formSeleccionarAsignacion");
		} catch (InternalExcepcion se) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(se.getMessage());
		}

	}

}
