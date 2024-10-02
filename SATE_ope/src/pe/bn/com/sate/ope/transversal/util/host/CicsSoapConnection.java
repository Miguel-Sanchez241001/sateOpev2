package pe.bn.com.sate.ope.transversal.util.host;

import javax.xml.ws.BindingProvider;
import org.apache.log4j.Logger;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.interfaz.GatewayInterfaceProxy;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.interfaz.RequestGateway;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.interfaz.ResponseGateway;
import pe.bn.com.sate.ope.transversal.util.ServicioWebUtil;
import pe.bn.com.sate.ope.transversal.util.TramasUtils;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

/**
 * Clase que maneja la conexión SOAP con el sistema CICS.
 */
public class CicsSoapConnection {

    private final static Logger logger = Logger.getLogger(CicsSoapConnection.class);

    /**
     * Envía una trama al sistema CICS y recibe una respuesta.
     *
     * @param cabecera La cabecera de la trama.
     * @param body     El cuerpo de la trama.
     * @return         La respuesta del sistema CICS encapsulada en un objeto BodySolicitud.
     * @throws Exception Si ocurre algún error durante el proceso.
     */
    public BodySolicitud enviarTrama(BodySolicitud cabecera, BodySolicitud body) throws Exception {

        logger.info("[CicsSoapConnection] - Inicio del método enviarTrama");

        // Input
        BodySolicitud bodyOut = null;
        String head = cabecera.toString();
        head = TramasUtils.enmascararTramaRecepcion(head);
        String trama = head + body;
        String out = null;

        logger.info("[CicsSoapConnection] - Cabecera enmascarada: " + head);
        logger.info("[CicsSoapConnection] - Trama completa: " + trama);

        GatewayInterfaceProxy proxy = new GatewayInterfaceProxy();
        ServicioWebUtil.cambiarTiempoEspera("10", "10", (BindingProvider) proxy._getDescriptor().getProxy());

        RequestGateway peticion = new RequestGateway();
        peticion.setLongitud(ConstantesGenerales.LONGITUD_DEFECTO);
        peticion.setTransid(ConstantesGenerales.SEG_LOGIN_TRAN);
        peticion.setDatos(trama);
        peticion.setFiller("");
        bodyOut = new BodySolicitud();

        // Respuesta
        ResponseGateway respuesta = new ResponseGateway();

        try {
            logger.info("[CicsSoapConnection] - Enviando trama al sistema CICS");
            //MGL
            // TODO MODIFICAR =========> COMUNICACION HOST TRAMA LOCAL AUTENTICACION
            // AUTENTICACION HOST
//           respuesta = proxy.enviarTramaConsulta(peticion);
           
            // AUTENTICACION LOCAL
            respuesta.setDatos("02SATE2024-07-09-09.14.49.000599WEB 0:0:0:0:0:0:0:1     20131312955000013120479130829732    8436908436900312991                                                                              0000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        *");
            respuesta.setMensaje("INTERFAZ TERMINO OK");
            respuesta.setMsgno("0000");
            respuesta.setFiller("");
            
            logger.info("[CicsSoapConnection] - Respuesta del sistema CICS: " + respuesta);

            String msgnoHost = "";
            String msjeHost = "";
            String tramaMensajes = "";

            if ("0000".equals(respuesta.getMsgno()) && !respuesta.getDatos().equals("")) {
                BodySolicitud cabOut = new BodySolicitud();

                if (respuesta.getDatos().length() < cabOut.LongitudTrama()) {
                    throw new Exception("La cabecera del CICS SOAP no es válida.");
                }

                msgnoHost = respuesta.getMsgno();
                msjeHost = respuesta.getMensaje();
                tramaMensajes = msgnoHost + msjeHost;
                out = respuesta.getDatos() + tramaMensajes;
                bodyOut.FillBobyOk(out);

                logger.info("[CicsSoapConnection] - Trama procesada correctamente: " + out);

            } else if ("9995".equals(respuesta.getMsgno()) && respuesta.getDatos().equals("")) {
                msgnoHost = respuesta.getMsgno();
                msjeHost = respuesta.getMensaje();
                tramaMensajes = msgnoHost + msjeHost;
                bodyOut.FillBobyHost(tramaMensajes);

                logger.warn("[CicsSoapConnection] - Error en la respuesta del sistema CICS: " + tramaMensajes);
            }

            logger.info("[CicsSoapConnection] - Fin del método enviarTrama");

        } catch (Exception e) {
            logger.error("[CicsSoapConnection] - Error al conectar con el sistema CICS: " + e.getMessage(), e);
            throw new Exception("Ocurrió un error al tratar de conectarse a HOST");
        }

        return bodyOut;
    }
}
