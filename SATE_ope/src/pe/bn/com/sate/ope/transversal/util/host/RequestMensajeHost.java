package pe.bn.com.sate.ope.transversal.util.host;

import org.apache.log4j.Logger;

import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceIGWException;
import pe.bn.com.sate.ope.transversal.dto.host.Solicitud;
import pe.bn.com.sate.ope.transversal.util.DateFormaterUtil;

/**
 * Clase que maneja las solicitudes de mensajes al sistema host.
 */
public class RequestMensajeHost {

    private final static Logger logger = Logger.getLogger(RequestMensajeHost.class);

    /**
     * Genera una solicitud para el sistema host con los parámetros especificados.
     *
     * @param ruc              El RUC de la empresa.
     * @param cic              El CIC de la empresa.
     * @param tipoDocumento    El tipo de documento del usuario.
     * @param numDocumento     El numero de documento del usuario.
     * @param password1        La primera contrase�a.
     * @param password2        La segunda contrase�a (opcional).
     * @param tipoOperacion    El tipo de operación a realizar.
     * @return                 La solicitud generada con la respuesta del sistema host.
     */
    public Solicitud getSolicitud(String ruc, String cic, String tipoDocumento,
                                  String numDocumento, String password1, String password2,
                                  String tipoOperacion) {

        logger.info("[RequestMensajeHost] - Inicio del método getSolicitud");
        // TODO COMENTAR DATOS DE AUTENTICACION 
        logger.info("[RequestMensajeHost] - Parámetros de entrada: ");
        logger.info("RUC: " + ruc);
        logger.info("CIC: " + cic);
        logger.info("Tipo de Documento: " + tipoDocumento);
        logger.info("Numero de Documento: " + numDocumento);
        logger.info("Contrase�a 1: " + password1);
        logger.info("Contrase�a 2: " + (password2 != null ? password2 : "No proporcionada"));
        logger.info("Tipo de Operación: " + tipoOperacion);

        CicsSoapConnection cics = new CicsSoapConnection();
        Solicitud solicitud = null;

        try {
            BodySolicitud solicitudInput = new BodySolicitud();
            solicitudInput.cargarData(tipoOperacion, "SAOP",
                    DateFormaterUtil.getTimeStamp(), "WEB",
                    "AA-BB-CC-DD-EE-FF", ruc, cic, tipoDocumento, numDocumento,
                    password1, password2 == null ? password1 : password2,
                    "PJMO");

            logger.info("[RequestMensajeHost] - Solicitud enviada: " + solicitudInput);

            BodySolicitud bodyIn = new BodySolicitud();
            BodySolicitud solicitudOutPut = cics.enviarTrama(solicitudInput, bodyIn);

            logger.info("[RequestMensajeHost] - Respuesta del host: " + solicitudOutPut);

            if ("9995".equals(solicitudOutPut.getByTag("msgnoHost").trim())) {
                solicitud = new Solicitud();
                solicitud.setcError(solicitudOutPut.getByTag("DFH-CERROR").trim());
                solicitud.setMsj(solicitudOutPut.getByTag("DFH-MSJ").trim());
                logger.error("[RequestMensajeHost] - Error en la respuesta del host: " + solicitud.getcError() + " - " + solicitud.getMsj());
            } else if ("0000".equals(solicitudOutPut.getByTag("msgnoHost").trim())) {
                if (solicitudOutPut != null) {
                    solicitud = new Solicitud();

                    solicitud.settOperacion(solicitudOutPut.getByTag("DFH-TOPERACION").trim());
                    solicitud.setModulo(solicitudOutPut.getByTag("DFH-MODULO").trim());
                    solicitud.setTimeStamp(solicitudOutPut.getByTag("DFH-TIMESTAMP").trim());
                    solicitud.setcCanal(solicitudOutPut.getByTag("DFH-CCANAL").trim());
                    solicitud.setcTerm(solicitudOutPut.getByTag("DFH-CTERM").trim());
                    solicitud.setcEmpresa(solicitudOutPut.getByTag("DFH-CEMPRESA").trim());
                    solicitud.setCic(solicitudOutPut.getByTag("DFH-CIC").trim());
                    solicitud.setTipoDoc(solicitudOutPut.getByTag("DFH-TIPDOC").trim());
                    solicitud.setNumDoc(solicitudOutPut.getByTag("DFH-NUMDOC").trim());
                    solicitud.setClave(solicitudOutPut.getByTag("DFH-CLAVE-6").trim());
                    solicitud.setClaveAnt(solicitudOutPut.getByTag("DFH-CLAVE-6-ANT").trim());
                    solicitud.setcUsuario(solicitudOutPut.getByTag("DFH-CUSUARIO").trim());
                    solicitud.setcError(solicitudOutPut.getByTag("DFH-CERROR").trim());
                    solicitud.setMsj(solicitudOutPut.getByTag("DFH-MSJ").trim());

                    logger.info("[RequestMensajeHost] - Solicitud procesada correctamente: " + solicitud);
                }
            } else {
                logger.error("[RequestMensajeHost] - Código de respuesta inesperado: " + solicitudOutPut.getByTag("msgnoHost").trim());
            }

        } catch (Exception e) {
            logger.error("[RequestMensajeHost] - Error en el método getSolicitud: " + e.getMessage(), e);
            throw new ExternalServiceIGWException(e.getMessage());
        }

        logger.info("[RequestMensajeHost] - Fin del método getSolicitud");
        return solicitud;
    }
}
