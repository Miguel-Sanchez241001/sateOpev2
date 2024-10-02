package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;
import java.text.ParseException;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.BuscarTarjetaModel;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceBnTablasException;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceMCProcesosException;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.BuscarTarjetaFacade;
import pe.bn.com.sate.ope.infrastructure.service.external.AgenciaService;
import pe.bn.com.sate.ope.infrastructure.service.external.UbigeoService;
import pe.bn.com.sate.ope.infrastructure.service.internal.ClienteService;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.transversal.dto.sate.EstadoTarjeta;
import pe.bn.com.sate.ope.transversal.dto.tablas.Ubigeo;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.TipoBusqueda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstadoTarjeta;

@Controller("buscarTarjetaController")
@Scope("view")
public class BuscarTarjetaController implements Serializable {

	private final static Logger logger = Logger
			.getLogger(BuscarTarjetaController.class);

	private static final long serialVersionUID = 1L;

	private BuscarTarjetaModel buscarTarjetaModel;

	private @Autowired
	TarjetaService tarjetaService;

	private @Autowired
	ClienteService clienteService;

	private @Autowired
	AgenciaService agenciaService;

	private @Autowired
	UbigeoService ubigeoService;

	@Autowired
	private BuscarTarjetaFacade buscarTarjetaFacade;

	@PostConstruct
	public void init() {
		buscarTarjetaModel = new BuscarTarjetaModel();
	}

	public void seleccionarTarjeta() {
		buscarTarjetaModel.setBusquedaRealizada(true);
		
		//MGL
//		buscarTarjetaFacade.actualizarSaldoTarjeta(buscarTarjetaModel
//				.getTarjetaSeleccionada().getNumTarjeta());		
		try {
			try {
				buscarTarjetaFacade.actualizarSaldoTarjeta(	
					buscarTarjetaModel.getTarjetaSeleccionada().getNumTarjeta(),
					buscarTarjetaModel.getTarjetaSeleccionada().getNumeroCuenta(),				
					buscarTarjetaModel.getTarjetaSeleccionada().getTipoMoneda(),
					buscarTarjetaModel.getTarjetaSeleccionada().getFechaTerminoLinea()
						);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
			}		
		} catch (ExternalServiceMCProcesosException este) {
			UsefulWebApplication
			.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_MC,
					ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_MC);
			logger.error(este.getMessage());
		}
		
		
		buscarTarjetaModel.getDatosTarjetaCliente().setTarjeta(buscarTarjetaModel.getTarjetaSeleccionada());
		
	
		buscarTarjetaModel.setTipoOperacionActualizar(TipoEstadoTarjeta
				.esEstadoTarjetaParaActualizarDatosContacto(buscarTarjetaModel
						.getDatosTarjetaCliente().getTarjeta().getEstado()));
		buscarTarjetaModel.setTipoOperacionCancelar(TipoEstadoTarjeta
				.esEstadoTarjetaCancelarTarjeta(buscarTarjetaModel
						.getDatosTarjetaCliente().getTarjeta().getEstado()));
		// buscarTarjetaModel
		// .getDatosTarjetaCliente()
		// .getCliente()
		// .setFlagActualizar(
		// buscarTarjetaModel
		// .getDatosTarjetaCliente()
		// .getTarjeta()
		// .getEstado()
		// .equals(TipoEstadoTarjeta.TARJETA_ACTIVADA
		// .getCod()) ? "1" : "0");

		if (buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
				.getEntregaUbigeo() != null) {

			Ubigeo departamento = ubigeoService.buscarLocalidad(
					buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
							.getEntregaUbigeo(), 1);
			Ubigeo provincia = ubigeoService.buscarLocalidad(buscarTarjetaModel
					.getDatosTarjetaCliente().getTarjeta().getEntregaUbigeo(),
					2);
			Ubigeo distrito = ubigeoService.buscarLocalidad(buscarTarjetaModel
					.getDatosTarjetaCliente().getTarjeta().getEntregaUbigeo(),
					3);

			buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
					.setEntregaDepartamento(departamento.getDescripcion());
			buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
					.setEntregaProvincia(provincia.getDescripcion());
			buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
					.setEntregaDistrito(distrito.getDescripcion());
		}

		if (buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
				.getDescripcionUbicacion() == null) {
			buscarTarjetaModel
					.getDatosTarjetaCliente()
					.getTarjeta()
					.setDescripcionUbicacion(
							agenciaService
									.buscarAgenciaPorCodAgencia(
											buscarTarjetaModel
													.getDatosTarjetaCliente()
													.getTarjeta()
													.getEntregaAgenciaBN())
									.getDescripcion());
		}
	}

	public void buscarTarjeta() {
		//MGL
		try {
			if (buscarTarjetaModel.getTipoBusqueda().equals(TipoBusqueda.NUM_TARJETA.getId())) {
				
				//buscarTarjetaFacade.actualizarSaldoTarjeta(buscarTarjetaModel.getNumDocumento());
							
				buscarTarjetaModel.setDatosTarjetaCliente(tarjetaService.buscarDatosTarjetasCliente(
								buscarTarjetaModel.getTipoBusqueda(),
								buscarTarjetaModel.getNumDocumento(), "B"));
				
				try {
					buscarTarjetaFacade.actualizarSaldoTarjeta(	
					buscarTarjetaModel.getNumDocumento(),
					buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta().getNumeroCuenta(),
					buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta().getTipoMoneda(),
					buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta().getFechaTerminoLinea()
							);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta() != null) {
					
					if (buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
							.getEstado().equals(TipoEstadoTarjeta.TARJETA_ACTIVADA.getCod())
							|| buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
									.getEstado().equals(TipoEstadoTarjeta.TARJETA_BLOQUEADA.getCod())) {
						
						buscarTarjetaModel.setBusquedaRealizada(true);
						buscarTarjetaModel.setTipoOperacionActualizar(TipoEstadoTarjeta
										.esEstadoTarjetaParaActualizarDatosContacto(buscarTarjetaModel
												.getDatosTarjetaCliente().getTarjeta().getEstado()));
						
						buscarTarjetaModel.setTipoOperacionCancelar(TipoEstadoTarjeta
										.esEstadoTarjetaCancelarTarjeta(buscarTarjetaModel
												.getDatosTarjetaCliente().getTarjeta().getEstado()));
						// buscarTarjetaModel
						// .getDatosTarjetaCliente()
						// .getCliente()
						// .setFlagActualizar(
						// buscarTarjetaModel
						// .getDatosTarjetaCliente()
						// .getTarjeta()
						// .getEstado()
						// .equals(TipoEstadoTarjeta.TARJETA_ACTIVADA
						// .getCod()) ? "1" : "0");

						System.out.println("EntregaUbigeo:"+ buscarTarjetaModel.getDatosTarjetaCliente()
								.getTarjeta().getEntregaUbigeo());
						String codDepartamento = buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta()
								.getEntregaUbigeo().substring(0, 2);
						System.out.println("EntregaUbigeo:"	+ buscarTarjetaModel.getDatosTarjetaCliente()
										.getTarjeta().getEntregaUbigeo().substring(0, 2));
						String codProvincia = buscarTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getEntregaUbigeo().substring(2, 4);
						System.out.println("EntregaUbigeo:"
								+ buscarTarjetaModel.getDatosTarjetaCliente()
										.getTarjeta().getEntregaUbigeo()
										.substring(2, 4));
						String codDistrito = buscarTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getEntregaUbigeo().substring(4);
						System.out.println("EntregaUbigeo:"
								+ buscarTarjetaModel.getDatosTarjetaCliente()
										.getTarjeta().getEntregaUbigeo()
										.substring(4));
						buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta().setEntregaDepartamento(
							ubigeoService.buscarLocalidad(codDepartamento.concat("0000"),1).getDescripcion());
						
						buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta().setEntregaProvincia(
							ubigeoService.buscarLocalidad(codDepartamento.concat(codProvincia.concat("00")),2).getDescripcion());
						
						buscarTarjetaModel.getDatosTarjetaCliente().getTarjeta().setEntregaDistrito(
							ubigeoService.buscarLocalidad(codDepartamento.concat(codProvincia
									.concat(codDistrito)),3).getDescripcion());
						
						if (buscarTarjetaModel.getDatosTarjetaCliente()
								.getTarjeta().getDescripcionUbicacion() == null) {
							buscarTarjetaModel
									.getDatosTarjetaCliente()
									.getTarjeta()
									.setDescripcionUbicacion(
											agenciaService
													.buscarAgenciaPorCodAgencia(
															buscarTarjetaModel
																	.getDatosTarjetaCliente()
																	.getTarjeta()
																	.getEntregaAgenciaBN())
													.getDescripcion());
						}

						EstadoTarjeta estadoTarjeta = new EstadoTarjeta();
						estadoTarjeta.setEstado(buscarTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getEstado());
						estadoTarjeta.setFechaRegistro(buscarTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getFechaBloqueo());
						estadoTarjeta.setMotivo(buscarTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getMotivoBloqueo());
						estadoTarjeta.setUsuarioRegistro(buscarTarjetaModel
								.getDatosTarjetaCliente().getTarjeta()
								.getUsuarioBloqueo());

						buscarTarjetaModel.getDatosTarjetaCliente()
								.setEstadoTarjeta(estadoTarjeta);

						UsefulWebApplication
								.actualizarComponente("formEmpresa:pgResultado");
					} else {
						UsefulWebApplication.mostrarMensajeJSF(3, "",
								"La tarjeta tiene el estado : "
										+ buscarTarjetaModel
												.getDatosTarjetaCliente()
												.getTarjeta().getEstado());
						UsefulWebApplication.actualizarComponente("msgs");
					}
				} else {
					UsefulWebApplication.mostrarMensajeJSF(3, "",
							"El número de tarjeta no existe");

					UsefulWebApplication.actualizarComponente("msgs");

					buscarTarjetaModel.setBusquedaRealizada(false);

					UsefulWebApplication
							.actualizarComponente("formEmpresa:pgResultado");
				}

			} else if (buscarTarjetaModel.getTipoBusqueda().equals(
					TipoBusqueda.DNI.getId())
					|| buscarTarjetaModel.getTipoBusqueda().equals(
							TipoBusqueda.CARNET_EXTRANJERIA.getId())) {
				buscarTarjetaModel.setDatosTarjetaCliente(tarjetaService
						.buscarDatosTarjetasCliente(
								buscarTarjetaModel.getTipoBusqueda(),
								buscarTarjetaModel.getNumDocumento(), "B"));

				buscarTarjetaModel.setBusquedaRealizada(false);

				if (buscarTarjetaModel.getDatosTarjetaCliente().getCliente() == null) {
					UsefulWebApplication
							.mostrarMensajeJSF(3, "",
									"No existe TarjetaHabiente con ese tipo y número de documento.");
					UsefulWebApplication.actualizarComponente("msgs");
				} else {
					UsefulWebApplication.ejecutar("wvSeleccionarTajeta.show()");
					UsefulWebApplication
							.actualizarComponente("formSeleccionarTarjeta");
					UsefulWebApplication
							.actualizarComponente("formEmpresa:pgResultado");
				}

			}
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		} catch (ExternalServiceBnTablasException este) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS,
					ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS);
			logger.error(este.getMessage());
		} catch (ExternalServiceMCProcesosException este) {
			UsefulWebApplication
					.mostrarMensajeJSF(
							ConstantesGenerales.SEVERITY_ERROR,
							ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_MC,
							ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_MC);
			logger.error(este.getMessage());
		} catch (ServiceException es) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
					ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
			logger.error(es.getMessage());
		}
	}

	public void cancelarTarjeta() {
		try {
			buscarTarjetaModel.iniciarEstadoTarjeta();
			tarjetaService.actualizarEstadoTarjeta(buscarTarjetaModel
					.getEstadoTarjeta());

			UsefulWebApplication.mostrarMensajeJSF(1, "",
					"Se canceló la solicitud");
			buscarTarjetaModel.inicializarFormulario();
			UsefulWebApplication.actualizarComponente("msgs");
			UsefulWebApplication
					.actualizarComponente("formEmpresa:pgResultado");
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}
	}

	public void actualizarDatosContactoTarjetaHabiente() {
		try {
			tarjetaService.actualizarContacto(buscarTarjetaModel
					.getDatosTarjetaCliente().getTarjeta());
			clienteService.actualizarCliente(buscarTarjetaModel
					.getDatosTarjetaCliente().getCliente());
			UsefulWebApplication.mostrarMensajeJSF(1, "",
					"Se actualizo los datos de contacto exitosamente");
			buscarTarjetaModel.inicializarFormulario();
			UsefulWebApplication.actualizarComponente("msgs");
			UsefulWebApplication
					.actualizarComponente("formEmpresa:pgResultado");
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}
	}

	public BuscarTarjetaModel getBuscarTarjetaModel() {
		return buscarTarjetaModel;
	}

	public void setBuscarTarjetaModel(BuscarTarjetaModel buscarTarjetaModel) {
		this.buscarTarjetaModel = buscarTarjetaModel;
	}

}
