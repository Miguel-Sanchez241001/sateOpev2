package pe.bn.com.sate.ope.application.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import pe.bn.com.sate.ope.application.model.SolicitarTarjetaModel;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceBnTablasException;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceWsReniecException;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.FWPersonaNatural;
import pe.bn.com.sate.ope.infrastructure.service.external.AgenciaService;
import pe.bn.com.sate.ope.infrastructure.service.external.UbigeoService;
import pe.bn.com.sate.ope.infrastructure.service.internal.ClienteService;
import pe.bn.com.sate.ope.infrastructure.service.internal.EmpresaService;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.transversal.configuration.security.SecurityContextFacade;
import pe.bn.com.sate.ope.transversal.dto.sate.Cliente;
import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;
import pe.bn.com.sate.ope.transversal.dto.tablas.Agencia;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjetaNegocio;

@Controller("solicitarTarjetaController")
@Scope("view")
public class SolicitarTarjetaController implements Serializable {

    private static final Logger logger = Logger.getLogger(SolicitarTarjetaController.class);

    private static final long serialVersionUID = 1L;

    private SolicitarTarjetaModel solicitarTarjetaModel;

    @Autowired
    private FWPersonaNatural fwPersonaNatural;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private TarjetaService tarjetaService;

    @Autowired
    private UbigeoService ubigeoService;

    @Autowired
    private AgenciaService agenciaService;

    @Autowired
    private EmpresaService empresaService;

    /**
     * Método que se ejecuta después de la construcción del bean.
     * Inicializa el modelo y carga los departamentos.
     */
    @PostConstruct
    public void init() {
        solicitarTarjetaModel = new SolicitarTarjetaModel();
        try {
            solicitarTarjetaModel.setDepartamentos(ubigeoService.buscarDepartamentos());
        } catch (InternalServiceException ise) {
            logger.error(ise.getMessage());
        } catch (ServiceException se) {
            logger.error(se.getMessage());
        }
        mostrarOpcionPorTipoUbicacion();
    }

    /**
     * Busca un cliente según el tipo y número de documento seleccionado.
     * Si no se encuentra en la base de datos, intenta buscar en la RENIEC.
     */
    public void buscarCliente() {
        try {
            Cliente clienteBusqueda = clienteService.buscarCliente(
                solicitarTarjetaModel.getTipoDocumentoSeleccionado(),
                solicitarTarjetaModel.getNumDocumentoSeleccionado());

            if (clienteBusqueda == null) {
                clienteBusqueda = fwPersonaNatural.buscarCliente(
                    solicitarTarjetaModel.getTipoDocumentoSeleccionado(),
                    solicitarTarjetaModel.getNumDocumentoSeleccionado());
            }

            if (clienteBusqueda == null) {
                solicitarTarjetaModel.setClienteSeleccionado(new Cliente());
                solicitarTarjetaModel.setPersonaExiste(false);
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
                    "No existe persona con el tipo y número de documento.");
            } else {
                solicitarTarjetaModel.setPersonaExiste(true);
                solicitarTarjetaModel.setClienteSeleccionado(clienteBusqueda);
            }
        } catch (InternalServiceException ise) {
            logger.error(ise.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
                ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
        } catch (ExternalServiceWsReniecException ese) {
            logger.error(ese.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_RENIEC,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_RENIEC);
        } catch (ServiceException se) {
            logger.error(se.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
                se.getMessage());
        }
    }

    /**
     * Registra una solicitud de tarjeta con los datos del cliente seleccionado.
     */
    public void registrarSolicitudTarjeta() {
        try {
            solicitarTarjetaModel.generarUbigeoPorUbicacion();
            solicitarTarjetaModel.getClienteSeleccionado().setTipoDocumento(
                solicitarTarjetaModel.getTipoDocumentoSeleccionado());
            solicitarTarjetaModel.getClienteSeleccionado().setNroDocumento(
                solicitarTarjetaModel.getNumDocumentoSeleccionado());
            tarjetaService.registrarSolicitudTarjeta(
                solicitarTarjetaModel.getTarjeta(),
                solicitarTarjetaModel.getClienteSeleccionado());
            reiniciarPasos();
            solicitarTarjetaModel.inicializarFormulario();
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_INFO,
                ConstantesGenerales.TITULO_MENSAJE,
                "Se registró la solicitud exitosamente");
            UsefulWebApplication.actualizarComponente("msgs");
        } catch (InternalServiceException ise) {
            logger.error(ise.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
                ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
        } catch (ExternalServiceWsReniecException ese) {
            logger.error(ese.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_RENIEC,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_RENIEC);
        } catch (ServiceException se) {
            logger.error(se.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
                ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
        }
    }

    /**
     * Busca el tipo de tarjeta según el uso seleccionado (nacional o extranjero).
     */
    public void buscarTipoTarjeta() {
 
            solicitarTarjetaModel.setListaTipoTarjeta( TipoTarjeta.buscarTipoTarjeta());
         
    }
    public void buscarTipoTarjetaNegocio() {
    	
    	  if (solicitarTarjetaModel.getTipoTarjetaSeleccionada().getCodigoBim().equals(ConstantesGenerales.BIM_BLACK)) {
              solicitarTarjetaModel.setListaTipoTarjetaNegocio(
              		TipoTarjetaNegocio.buscarTipoTarjetaBLACK());
          } else if (solicitarTarjetaModel.getTipoTarjetaSeleccionada().getCodigoBim().equals(ConstantesGenerales.BIM_CORPORATE)) {
              solicitarTarjetaModel.setListaTipoTarjetaNegocio(
              		TipoTarjetaNegocio.buscarTipoTarjetaCORP());
          
          } else {
              solicitarTarjetaModel.setListaTipoTarjetaNegocio(null);
          }
    	  
    /*    if (solicitarTarjetaModel.getTarjeta().getUsoExtranjero().equals(ConstantesGenerales.USO_EXTRANJERO)) {
            solicitarTarjetaModel.setListaTipoTarjetaNegocio(
            		TipoTarjetaNegocio.buscarTipoTarjetaUsoNacional());
        } else if (solicitarTarjetaModel.getTarjeta().getUsoExtranjero().equals(ConstantesGenerales.USO_NACIONAL)) {
            solicitarTarjetaModel.setListaTipoTarjetaNegocio(
            		TipoTarjetaNegocio.buscarTipoTarjetaUsoNacional());
        
        } else {
            solicitarTarjetaModel.setListaTipoTarjetaNegocio(null);
        }*/
    }
    /**
     * Fija el tipo de tarjeta y el diseño seleccionados en el modelo.
     */
    public void fijarTipoTarjetaYDiseno() {
       solicitarTarjetaModel.getTarjeta().setTipoTarjeta(
            solicitarTarjetaModel.getTipoTarjetaNegocioSeleccionada().getCodigo());
        solicitarTarjetaModel.getTarjeta().setDiseno(
            solicitarTarjetaModel.getTipoTarjetaNegocioSeleccionada().getDiseno());
    }

    /**
     * Muestra opciones según el tipo de ubicación de entrega seleccionada.
     */
    public void mostrarOpcionPorTipoUbicacion() {
        try {
            if (solicitarTarjetaModel.getTarjeta().getEntregaUbicacion()
                    .equals(ConstantesGenerales.ENTREGA_AGENCIA_BN)) {
                solicitarTarjetaModel.getTarjeta().setEntregaDireccion(null);
                solicitarTarjetaModel.setEsEntregaBN(true);
                solicitarTarjetaModel.setEsEntregaUE(false);
                solicitarTarjetaModel.setEsEntregaReferencia(true);
                solicitarTarjetaModel.getTarjeta().setEntregaDepartamento(null);
                solicitarTarjetaModel.getTarjeta().setEntregaProvincia(null);
                solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
                solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
            } else if (solicitarTarjetaModel.getTarjeta().getEntregaUbicacion()
                    .equals(ConstantesGenerales.ENTREGA_UNIDAD_EJECUTORA)) {

                Empresa empresa = empresaService
                    .buscarEmpresaPorRUC(SecurityContextFacade
                        .getAuthenticatedUser().getRuc());
                solicitarTarjetaModel.getTarjeta().setEntregaDireccion(
                    empresa.getDireccion());
                solicitarTarjetaModel.getTarjeta().setEntregaUbigeo(
                    empresa.getUbigeo());
                solicitarTarjetaModel.getTarjeta().setEntregaAgenciaBN("0000");
                solicitarTarjetaModel.getTarjeta().setEntregaReferencia(
                    empresa.getReferencia());
                solicitarTarjetaModel.setAgenciasBN(null);

                solicitarTarjetaModel.setEsEntregaBN(false);
                solicitarTarjetaModel.setEsEntregaUE(true);
                solicitarTarjetaModel.setEsEntregaReferencia(true);
                solicitarTarjetaModel.getTarjeta().setEntregaDepartamento(null);
                solicitarTarjetaModel.getTarjeta().setEntregaProvincia(null);
                solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
                solicitarTarjetaModel.setAgenciaSeleccionada(null);
            } else {
                solicitarTarjetaModel.getTarjeta().setEntregaDireccion(null);
                solicitarTarjetaModel.setAgenciasBN(null);

                solicitarTarjetaModel.setEsEntregaBN(false);
                solicitarTarjetaModel.setEsEntregaUE(false);
                solicitarTarjetaModel.setEsEntregaReferencia(false);
                solicitarTarjetaModel.getTarjeta().setEntregaDepartamento(null);
                solicitarTarjetaModel.getTarjeta().setEntregaProvincia(null);
                solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
                solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
                solicitarTarjetaModel.setAgenciaSeleccionada(null);
            }
        } catch (ExternalServiceBnTablasException se) {
            logger.error(se.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS);
        }
    }

    /**
     * Busca agencias según el ubigeo seleccionado.
     */
    public void buscarAgenciasPorUbigeo() {
        logger.info("[SolicitarTarjetaController] Inicio metodo buscarAgenciasPorUbigeo");
        String provincia = solicitarTarjetaModel.getTarjeta().getEntregaProvincia();
        String departamento = solicitarTarjetaModel.getTarjeta().getEntregaDepartamento();
        String distrito = solicitarTarjetaModel.getTarjeta().getEntregaDistrito();
        logger.info("[SolicitarTarjetaController] valor departamento: " + departamento);
        logger.info("[SolicitarTarjetaController] valor Provincia: " + provincia);
        logger.info("[SolicitarTarjetaController] valor distrito: " + distrito);

        if (distrito == null) {
            solicitarTarjetaModel.getTarjeta().setEntregaAgenciaBN(null);
            solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
        } else {
            try {
                solicitarTarjetaModel.setAgenciasBN(agenciaService
                    .buscarAgenciasPorUbigeo(departamento, provincia, distrito));
                solicitarTarjetaModel.getTarjeta().setEntregaAgenciaBN(null);
                solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
            } catch (ExternalServiceBnTablasException este) {
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS,
                    ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS);
                logger.error(este.getMessage());
            } catch (ServiceException es) {
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
                    ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
                logger.error(es.getMessage());
            }
        }
        logger.info("[SolicitarTarjetaController] Fin metodo buscarAgenciasPorUbigeo");
    }

    /**
     * Busca los datos de una agencia según el código de agencia seleccionado.
     */
    public void buscarDatosAgencia() {
        try {
            logger.info("[SolicitarTarjetaController] Inicio metodo buscarDatosAgencia");
            Agencia agencia = agenciaService
                .buscarAgenciaPorCodAgencia(solicitarTarjetaModel
                    .getAgenciaSeleccionada().getCodAgencia());
            solicitarTarjetaModel.getTarjeta().setEntregaDireccion(
                agencia == null ? "No hay dirección registrada" : agencia
                    .getDireccion());
            logger.info("[SolicitarTarjetaController] fin metodo buscarDatosAgencia");
        } catch (ExternalServiceBnTablasException este) {
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS,
                ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS);
            logger.error(este.getMessage());
        } catch (ServiceException es) {
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
                ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
            logger.error(es.getMessage());
        }
    }

    /**
     * Busca las provincias según el departamento seleccionado.
     */
    public void buscarProvincias() {
        logger.info("[SolicitarTarjetaController] Inicio metodo buscarProvincias");
        String departamento = solicitarTarjetaModel.getTarjeta().getEntregaDepartamento();
        logger.info("[SolicitarTarjetaController] valor departamento: " + departamento);

        if (departamento == null) {
            solicitarTarjetaModel.setProvincias(null);
            solicitarTarjetaModel.setDistritos(null);
            solicitarTarjetaModel.getTarjeta().setEntregaProvincia(null);
            solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
            solicitarTarjetaModel.setAgenciaSeleccionada(null);
            solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
        } else {
            try {
                solicitarTarjetaModel.setProvincias(ubigeoService
                    .buscarProvinciasPorDepartamento(departamento));
                solicitarTarjetaModel.setDistritos(null);
                solicitarTarjetaModel.getTarjeta().setEntregaProvincia(null);
                solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
                solicitarTarjetaModel.setAgenciaSeleccionada(null);
            } catch (ExternalServiceBnTablasException este) {
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS,
                    ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS);
                logger.error(este.getMessage());
            } catch (ServiceException es) {
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
                    ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
                logger.error(es.getMessage());
            }
        }
        logger.info("[SolicitarTarjetaController] Fin metodo buscarProvincias");
    }

    /**
     * Busca los distritos según la provincia seleccionada.
     */
    public void buscarDistritos() {
        logger.info("[SolicitarTarjetaController] Inicio metodo buscarDistritos");
        String provincia = solicitarTarjetaModel.getTarjeta().getEntregaProvincia();
        String departamento = solicitarTarjetaModel.getTarjeta().getEntregaDepartamento();
        logger.info("[SolicitarTarjetaController] valor Provincia: " + provincia);
        logger.info("[SolicitarTarjetaController] valor departamento: " + departamento);

        if (provincia == null) {
            logger.info("[SolicitarTarjetaController] Provincia nulo");
            solicitarTarjetaModel.setDistritos(null);
            solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
            solicitarTarjetaModel.setAgenciaSeleccionada(null);
            solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
        } else {
            try {
                solicitarTarjetaModel.setDistritos(ubigeoService
                    .buscarDistritosPorProvincia(departamento, provincia));
                solicitarTarjetaModel.getTarjeta().setEntregaDistrito(null);
                solicitarTarjetaModel.setAgenciaSeleccionada(null);
                solicitarTarjetaModel.getTarjeta().setEntregaReferencia(null);
            } catch (ExternalServiceBnTablasException este) {
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS,
                    ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS);
                logger.error(este.getMessage());
            } catch (ServiceException es) {
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.ERROR_PERSISTENCE_GENERAL,
                    ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
                logger.error(es.getMessage());
            }
        }
        logger.info("[SolicitarTarjetaController] Fin metodo buscarDistritos");
    }

    /**
     * Obtiene el modelo de solicitud de tarjeta.
     * 
     * @return el modelo de solicitud de tarjeta
     */
    public SolicitarTarjetaModel getSolicitarTarjetaModel() {
        return solicitarTarjetaModel;
    }

    /**
     * Establece el modelo de solicitud de tarjeta.
     * 
     * @param solicitarTarjetaModel el modelo de solicitud de tarjeta a establecer
     */
    public void setSolicitarTarjetaModel(SolicitarTarjetaModel solicitarTarjetaModel) {
        this.solicitarTarjetaModel = solicitarTarjetaModel;
    }

    /**
     * Avanza al siguiente paso en el proceso de solicitud de tarjeta.
     */
    public void avanzarPaso() {
    	
    	   // Nueva lógica que solo se ejecuta cuando el paso actual es 0
        if (solicitarTarjetaModel.getPasoActual() == 0) {
            // Aquí agregas la lógica adicional que deseas validar
        	String resVerificacion = tarjetaService.verificarSolicitudes(
            		solicitarTarjetaModel.getTipoDocumentoSeleccionado(),
            		solicitarTarjetaModel.getNumDocumentoSeleccionado()
            		);
            if (resVerificacion != null) { // Reemplaza 'condicionAdicional' con tu lógica específica
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
                    resVerificacion);
                return; // Salir del método si no se cumple la condición
            }
        }
    	
        if (solicitarTarjetaModel.getPasoActual() == 2) {
            // Aquí agregas la lógica adicional que deseas validar
        	String resVerificacion = tarjetaService.verificarTarjetasDisponible(
            		solicitarTarjetaModel.getTipoDocumentoSeleccionado(),
            		solicitarTarjetaModel.getNumDocumentoSeleccionado(),
            		solicitarTarjetaModel.getTarjeta()
            		);
            if (resVerificacion != null) { // Reemplaza 'condicionAdicional' con tu lógica específica
                UsefulWebApplication.mostrarMensajeJSF(
                    ConstantesGenerales.SEVERITY_ERROR,
                    ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
                    resVerificacion);
                return; // Salir del método si no se cumple la condición
            }
        }
        if (solicitarTarjetaModel.getPasoActual() != 0 || (!solicitarTarjetaModel.esTipoDocumentoDNI() || solicitarTarjetaModel.validarDNI())) {
            if (solicitarTarjetaModel.getPasoActual() < 3) {
                solicitarTarjetaModel.setPasoActual(solicitarTarjetaModel.getPasoActual() + 1);
                UsefulWebApplication.ejecutar("activar(" + solicitarTarjetaModel.getPasoActual() + ")");
            }
            } else {
            UsefulWebApplication.mostrarMensajeJSF(
                ConstantesGenerales.SEVERITY_ERROR,
                ConstantesGenerales.TITULO_ERROR_AGREGAR_PARAMETRO,
                "La persona no ha sido buscada");
        }
    }

    /**
     * Retrocede al paso anterior en el proceso de solicitud de tarjeta.
     */
    public void retrocederPaso() {
        UsefulWebApplication.ejecutar("desactivar(" + solicitarTarjetaModel.getPasoActual() + ")");

        if (solicitarTarjetaModel.getPasoActual() > 0)
            solicitarTarjetaModel.setPasoActual(solicitarTarjetaModel.getPasoActual() - 1);
    }

    /**
     * Reinicia los pasos del proceso de solicitud de tarjeta.
     */
    public void reiniciarPasos() {
        UsefulWebApplication.ejecutar("reiniciar(" + solicitarTarjetaModel.getPasoActual() + ")");
    }

    /**
     * Reinicia el formulario del cliente debido a un cambio en el tipo de documento.
     */
    public void reiniciarFormularioCliente() {
        logger.info("Reiniciando el formulario debido al cambio en el tipo de documento.");
        solicitarTarjetaModel.reiniciarDatosCliente();
        logger.info("Formulario reiniciado.");
    }
}
