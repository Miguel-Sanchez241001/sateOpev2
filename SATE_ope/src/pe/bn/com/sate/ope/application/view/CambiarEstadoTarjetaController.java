package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.CambiarEstadoTarjetaModel;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceMCProcesosException;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.FWMCProcesos;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.transversal.dto.sate.EstadoTarjeta;
import pe.bn.com.sate.ope.transversal.dto.sate.ModificacionTarjeta;
import pe.bn.com.sate.ope.transversal.dto.ws.DTOModificacionTarjeta;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.componentes.Parametros;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesWS;
import pe.bn.com.sate.ope.transversal.util.enums.MotivosBloqueoCuenta;
import pe.bn.com.sate.ope.transversal.util.enums.MotivosBloqueoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoBusqueda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstadoTarjeta;
import pe.bn.com.sate.ope.transversal.util.excepciones.InternalExcepcion;

@Controller("cambiarEstadoTarjetaController")
@Scope("view")
public class CambiarEstadoTarjetaController implements Serializable {

	private final static Logger logger = Logger
			.getLogger(CambiarEstadoTarjetaController.class);

	private static final long serialVersionUID = 1L;

	private CambiarEstadoTarjetaModel cambiarEstadoTarjetaModel;

	private @Autowired
	TarjetaService tarjetaService;

	private @Autowired
	FWMCProcesos fwmcProcesos;

	private @Autowired
	Parametros parametros;
	
	@PostConstruct
	public void init() {
		cambiarEstadoTarjetaModel = new CambiarEstadoTarjetaModel();
	}

	public void buscarTarjeta() {
		//MGL
		try {
			if (cambiarEstadoTarjetaModel.getTipoBusqueda().equals(TipoBusqueda.NUM_TARJETA.getId())) {
				cambiarEstadoTarjetaModel.setDatosTarjetaCliente(tarjetaService
						.buscarDatosTarjetasCliente(
								cambiarEstadoTarjetaModel.getTipoBusqueda(),
								cambiarEstadoTarjetaModel.getNumDocumento(),
								"C"));

				if (cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
						.getTarjeta() != null) {
					// if (cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
					// .getTarjeta().getEstado()
					// .equals(TipoEstadoTarjeta.TARJETA_ACTIVADA.getCod())
					// || (cambiarEstadoTarjetaModel
					// .getDatosTarjetaCliente()
					// .getTarjeta()
					// .getEstado()
					// .equals(TipoEstadoTarjeta.TARJETA_BLOQUEADA
					// .getCod()) && cambiarEstadoTarjetaModel
					// .getDatosTarjetaCliente()
					// .getTarjeta()
					// .getMotivoBloqueo()
					// .equals(MotivosBloqueoTarjeta.NO_RECLAMADA
					// .getId()))) {
					cambiarEstadoTarjetaModel.setBusquedaRealizada(true);

					EstadoTarjeta estadoTarjeta = new EstadoTarjeta();
					estadoTarjeta.setEstado(cambiarEstadoTarjetaModel
							.getDatosTarjetaCliente().getTarjeta().getEstado());
					estadoTarjeta.setFechaRegistro(cambiarEstadoTarjetaModel
							.getDatosTarjetaCliente().getTarjeta()
							.getFechaBloqueo());
					estadoTarjeta.setMotivo(cambiarEstadoTarjetaModel
							.getDatosTarjetaCliente().getTarjeta()
							.getMotivoBloqueo());
					estadoTarjeta.setUsuarioRegistro(cambiarEstadoTarjetaModel
							.getDatosTarjetaCliente().getTarjeta()
							.getUsuarioBloqueo());
					estadoTarjeta.setEstadoCuenta(cambiarEstadoTarjetaModel
							.getDatosTarjetaCliente().getTarjeta()
							.getEstadoCuenta());

					cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
							.setEstadoTarjeta(estadoTarjeta);

					cambiarEstadoTarjetaModel
							.setMotivosBloqueoTarjetas(Arrays.asList(MotivosBloqueoTarjeta
									.motivosBloqueoPorIdMotivo(cambiarEstadoTarjetaModel
											.getDatosTarjetaCliente()
											.getTarjeta().getEstado())));

					cambiarEstadoTarjetaModel
							.setMotivosBloqueoCuenta(Arrays.asList(MotivosBloqueoCuenta
									.motivosBloqueoPorIdMotivo(cambiarEstadoTarjetaModel
											.getDatosTarjetaCliente()
											.getTarjeta().getEstadoCuenta())));

					cambiarEstadoTarjetaModel
							.setBusquedaBloqueoTarjeta(cambiarEstadoTarjetaModel
									.getDatosTarjetaCliente()
									.getTarjeta()
									.getEstado()
									.equals(TipoEstadoTarjeta.TARJETA_BLOQUEADA
											.getCod()));

					UsefulWebApplication
							.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
					// } else {
					// UsefulWebApplication.mostrarMensajeJSF(3, "",
					// "La tarjeta tiene el estado :"
					// + cambiarEstadoTarjetaModel
					// .getDatosTarjetaCliente()
					// .getTarjeta().getEstado());
					// UsefulWebApplication.actualizarComponente("msgs");
					// }
				} else {
					UsefulWebApplication.mostrarMensajeJSF(3, "",
							"El número de tarjeta no existe");

					UsefulWebApplication.actualizarComponente("msgs");

					cambiarEstadoTarjetaModel.setBusquedaRealizada(false);

					cambiarEstadoTarjetaModel.setBusquedaBloqueoTarjeta(false);
					UsefulWebApplication
							.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
				}

			} else if (cambiarEstadoTarjetaModel.getTipoBusqueda().equals(
					TipoBusqueda.DNI.getId())
					|| cambiarEstadoTarjetaModel.getTipoBusqueda().equals(
							TipoBusqueda.CARNET_EXTRANJERIA.getId())) {
				cambiarEstadoTarjetaModel.setDatosTarjetaCliente(tarjetaService
						.buscarDatosTarjetasCliente(
								cambiarEstadoTarjetaModel.getTipoBusqueda(),
								cambiarEstadoTarjetaModel.getNumDocumento(),
								"C"));

				cambiarEstadoTarjetaModel.setBusquedaRealizada(false);

				cambiarEstadoTarjetaModel.setBusquedaBloqueoTarjeta(false);

				if (cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
						.getCliente() == null) {
					UsefulWebApplication
							.mostrarMensajeJSF(3, "",
									"No existe TarjetaHabiente con ese tipo y número de documento.");
					UsefulWebApplication.actualizarComponente("msgs");
				} else {
					UsefulWebApplication.ejecutar("wvSeleccionarTajeta.show()");
					UsefulWebApplication
							.actualizarComponente("formSeleccionarTarjeta");
					UsefulWebApplication
							.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
				}

			}
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}

	}

	public void seleccionarTarjeta() {
		cambiarEstadoTarjetaModel.setBusquedaRealizada(true);
		cambiarEstadoTarjetaModel.getDatosTarjetaCliente().setTarjeta(
				cambiarEstadoTarjetaModel.getTarjetaSeleccionada());
		System.out.println("Motivo:"
				+ cambiarEstadoTarjetaModel.getTarjetaSeleccionada()
						.getMotivoBloqueo());

		/*cambiarEstadoTarjetaModel.setMotivosBloqueoTarjetas(Arrays
				.asList(MotivosBloqueoTarjeta
						.motivosBloqueoPorIdMotivo(cambiarEstadoTarjetaModel
								.getTarjetaSeleccionada().getMotivoBloqueo())));*/
		cambiarEstadoTarjetaModel.setMotivosBloqueoTarjetas(Arrays
				.asList(MotivosBloqueoTarjeta
						.motivosBloqueoPorIdMotivo(cambiarEstadoTarjetaModel
								.getDatosTarjetaCliente()
								.getTarjeta().getEstado())));
		
		cambiarEstadoTarjetaModel.setMotivosBloqueoCuenta(Arrays
				.asList(MotivosBloqueoCuenta
						.motivosBloqueoPorIdMotivo(cambiarEstadoTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getEstadoCuenta())));
	}

	public void cambiarEstadoTarjeta() {

		try {
			DTOModificacionTarjeta modificacionTarjeta = new DTOModificacionTarjeta();
			 
			cambiarEstadoTarjetaModel.iniciarEstadoTarjeta();
			
			String tipoMoneda = cambiarEstadoTarjetaModel.getDatosTarjetaCliente().getTarjeta().getTipoMoneda().trim();
			System.out.println("tipoMoneda:"+tipoMoneda);	
			String numTarjeta = cambiarEstadoTarjetaModel.getDatosTarjetaCliente().getTarjeta().getNumTarjeta().trim();
			System.out.println("numTarjeta:"+numTarjeta);
			
			String motivo = cambiarEstadoTarjetaModel.getMotivoSeleccionado();
			char guion = '-';
		    int posicion = motivo.indexOf(guion);
		       
		    String codMotivo = motivo.substring(0,posicion).trim();
		    String desMotivo = motivo.substring(posicion + 1).trim();
		    
		    System.out.println("codMotivo:"+codMotivo);
		    System.out.println("desMotivo:"+desMotivo);
		 	        
	        try {
	        	modificacionTarjeta = fwmcProcesos.modificacionTarjeta(tipoMoneda,numTarjeta,codMotivo,desMotivo);
	        	if (modificacionTarjeta.getCodRespuesta().equals("0000")) {        		
	        		
	        		cambiarEstadoTarjetaModel.inicializarFormulario();
	        		
	        		UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_INFO, "","Se cambio de estado exitosamente");
	        		UsefulWebApplication.actualizarComponente("msgs");
	        		UsefulWebApplication.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
	        			        		
	        	}else{
	        		UsefulWebApplication
					.mostrarMensajeJSF(
							ConstantesGenerales.SEVERITY_ERROR,
							modificacionTarjeta.getDescRespuesta(),
							ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_MC);
			
	        	}
	        } catch (InternalExcepcion e) {
				// TODO Auto-generated catch block			
				UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR,ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
				logger.error(e.getMessage());
	        }
//			if (cambiarEstadoTarjetaModel.getTipoBloqueoSeleccionado().equals("T")) {
//				
//				
//				
////				
////				 try {
////				 ModificacionTarjeta modificacionTarjeta = fwmcProcesos.modificarTarjeta(
////						 	cambiarEstadoTarjetaModel.getDatosTarjetaCliente().getTarjeta().getNumTarjeta(),
////						 	cambiarEstadoTarjetaModel.getEstadoTarjeta().getMotivo(),
////						 	cambiarEstadoTarjetaModel.getEstadoTarjeta().getMotivo());
////				 
////				 if (modificacionTarjeta.getCodRespuesta()
////				 .equals("0000")) {
//				
//				
//				System.out.println(cambiarEstadoTarjetaModel.getEstadoTarjeta().toString());
//				if (cambiarEstadoTarjetaModel.getEstadoTarjeta().getMotivo().equals(MotivosBloqueoTarjeta.ROBO.getId())) {
//					UsefulWebApplication.ejecutar("dgSolicitarTarjeta.show()");
//				} else {
//					tarjetaService.actualizarEstadoTarjeta(cambiarEstadoTarjetaModel.getEstadoTarjeta());
//
//					cambiarEstadoTarjetaModel.inicializarFormulario();
//					UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_INFO, "","Se cambio de estado exitosamente");
//					UsefulWebApplication.actualizarComponente("msgs");
//					UsefulWebApplication.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
//				}
//			} else {
//				cambiarEstadoTarjetaModel.getDatosTarjetaCliente().getTarjeta().setEstadoCuenta(cambiarEstadoTarjetaModel.getEstadoCuentaSeleccionado());
//
//				tarjetaService.actualizarEstadoCuenta(cambiarEstadoTarjetaModel.getDatosTarjetaCliente().getTarjeta());
//				cambiarEstadoTarjetaModel.inicializarFormulario();
//				UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_INFO, "","Se cambio de estado exitosamente");
//				UsefulWebApplication.actualizarComponente("msgs");
//				UsefulWebApplication.actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
//			}
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR,ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}
		// }else{
		// UsefulWebApplication.mostrarMensajeJSF(3,
		// "",modificacionTarjeta.getCodRespuesta()+"-"+modificacionTarjeta.getDescRespuesta());
		// UsefulWebApplication.actualizarComponente("msgs");
		// UsefulWebApplication
		// .actualizarComponente("formCambiarEstadoTarjeta:pgResultado");
		// }

		// } catch (JAXBException e) {
		// 
		// e.printStackTrace();
		// }
	}

	public void bloquearTarjetaRobo() {
		try {
			System.out.println("idtarjeta:"
					+ cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
							.getTarjeta().getId());
			System.out.println("idtarjeta:"
					+ cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
							.getCliente().getId());
			tarjetaService.bloquearTarjetaPorRobo(
					cambiarEstadoTarjetaModel.getEstadoTarjeta(),
					cambiarEstadoTarjetaModel.getDatosTarjetaCliente()
							.getTarjeta().getId(), cambiarEstadoTarjetaModel
							.getDatosTarjetaCliente().getCliente().getId());
			cambiarEstadoTarjetaModel.inicializarFormulario();
			UsefulWebApplication.mostrarMensajeJSF(1, "",
					"Se cambio de estado exitosamente");
			UsefulWebApplication.actualizarComponente("msgs");
			UsefulWebApplication.ejecutar("dgSolicitarTarjeta.hide()");
			UsefulWebApplication
					.actualizarComponente("formCambiarEstadoTarjeta");
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}
	}

	public CambiarEstadoTarjetaModel getCambiarEstadoTarjetaModel() {
		return cambiarEstadoTarjetaModel;
	}

	public void setCambiarEstadoTarjetaModel(
			CambiarEstadoTarjetaModel cambiarEstadoTarjetaModel) {
		this.cambiarEstadoTarjetaModel = cambiarEstadoTarjetaModel;
	}

}
