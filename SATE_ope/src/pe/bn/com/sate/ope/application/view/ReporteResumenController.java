package pe.bn.com.sate.ope.application.view;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.ReporteResumenModel;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.ReporteResumenFacade;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

@Controller("reporteResumenController")
@Scope("view")
public class ReporteResumenController {

	private final static Logger logger = Logger
			.getLogger(ReporteResumenController.class);

	private ReporteResumenModel reporteResumenModel;

	@Autowired
	private ReporteResumenFacade reporteResumenFacade;

	@PostConstruct
	public void init() {
		reporteResumenModel = new ReporteResumenModel();
	}

	public void buscarReporte() {
		try {
			if (reporteResumenModel.validarFechasCorte()) {
				LimpiarListasResumen();
				switch (reporteResumenModel.getTipoReporteSeleccionado()) {
				case 1:
					reporteResumenModel.setListaTarjetas(reporteResumenFacade
							.obtenerListaTarjetas(reporteResumenModel
									.getFechaCorteInicialSeleccionada(),
									reporteResumenModel
											.getFechaCorteFinalSeleccionada()));
					break;
				case 2:
					reporteResumenModel
							.setListaTransacciones(reporteResumenFacade.obtenerListaTransacciones(
									reporteResumenModel
											.getFechaCorteInicialSeleccionada(),
									reporteResumenModel
											.getFechaCorteFinalSeleccionada()));
					break;
				case 3:
					reporteResumenModel.setListaCargos(reporteResumenFacade
							.obtenerListaCargos(reporteResumenModel
									.getFechaCorteInicialSeleccionada(),
									reporteResumenModel
											.getFechaCorteFinalSeleccionada()));
					break;
				}

				if ((reporteResumenModel.getListaTarjetas() == null || reporteResumenModel
						.getListaTarjetas().isEmpty())
						&& (reporteResumenModel.getListaTransacciones() == null || reporteResumenModel
								.getListaTransacciones().isEmpty())
						&& (reporteResumenModel.getListaCargos() == null || reporteResumenModel
								.getListaCargos().isEmpty()))
					UsefulWebApplication
							.mostrarMensajeJSF(
									ConstantesGenerales.SEVERITY_ERROR, "",
									"No se encontró ningún registro en el rango de fechas seleccionadas.");
			} else {
				LimpiarListasResumen();
				UsefulWebApplication
						.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR,
								"",
								"Fecha inicial debe estar antes o ser igual que la fecha final.");
			}
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}
	}

	private void LimpiarListasResumen() {
		reporteResumenModel.setListaTarjetas(null);
		reporteResumenModel.setListaTransacciones(null);
		reporteResumenModel.setListaCargos(null);
	}

	public ReporteResumenModel getReporteResumenModel() {
		return reporteResumenModel;
	}

	public void setReporteResumenModel(ReporteResumenModel reporteResumenModel) {
		this.reporteResumenModel = reporteResumenModel;
	}

}
