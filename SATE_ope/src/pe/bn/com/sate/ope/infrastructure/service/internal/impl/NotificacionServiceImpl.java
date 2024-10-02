package pe.bn.com.sate.ope.infrastructure.service.internal.impl;

import java.util.Date;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.ResponseMessage;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.ArrayOfTns1ReqListMessage;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.DatosCorreo;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.DatosParametro;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.ReqListMessage;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.RequestMessage;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.message.ServiceMessageProxy;
import pe.bn.com.sate.ope.infrastructure.service.internal.NotificacionService;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.ServicioWebUtil;
import pe.bn.com.sate.ope.transversal.util.componentes.Parametros;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

/**
 * Implementación del servicio de notificación para el envío de correos a los usuarios.
 */
@Service
public class NotificacionServiceImpl implements NotificacionService {
    private final Logger logger = Logger.getLogger(NotificacionServiceImpl.class);
    
    @Autowired
    private Parametros parametros;

    /**
     * Envía un correo electrónico a un usuario con su clave de acceso.
     * 
     * @param usuario el usuario al que se le enviará el correo.
     * @param clave la clave que se enviará al usuario.
     * @throws InternalServiceException si ocurre un error durante el envío del correo.
     */
    @Override
    public void enviarMailUsuarioClave(Usuario usuario, String clave) {
        logger.info("Inicio del método enviarMailUsuarioClave");
        
        try {
            // Crea una instancia del proxy del servicio de mensajería.
            ServiceMessageProxy serviceMessage = new ServiceMessageProxy();
            
            // Cambia los tiempos de espera para la conexión y respuesta.
            ServicioWebUtil.cambiarTiempoEspera(parametros.getConexionTiempo(),
                                                 parametros.getRespuestaTiempo(),
                                                 (BindingProvider) serviceMessage._getDescriptor().getProxy());

            // Crea un mensaje de solicitud para el envío del correo.
            RequestMessage rqMessage = new RequestMessage();
            rqMessage.setCodRequermiento(ConstantesGenerales.COD_REQUERIMIENTO_ENVIO_SMS);

            // Crea un objeto para la lista de requisitos.
            ArrayOfTns1ReqListMessage arr = new ArrayOfTns1ReqListMessage();
            ReqListMessage rlm = new ReqListMessage();

            // Crea y configura los datos del correo.
            DatosCorreo datos = new DatosCorreo();
            datos.setAsunto("Acceso a Tarjeta Empresarial - Banco de la Nacion");
            // TODO CAMBIAR ======= > CORREO ELECTRONICO
            datos.setCorreoDestinatario("pra_msanchezs@bn.com.pe"); // Se puede cambiar por usuario.getCorreoLaboral() si es necesario.
			//datos.setCorreoDestinatario(usuario.getCorreoLaboral());

            // Configura los parámetros del correo.
            DatosParametro params = new DatosParametro();
            params.setParametro1(usuario.nombreCompleto());
            params.setParametro2(clave);
            params.setParametro3(new Date().toString()); // Se puede cambiar por una fecha formateada si es necesario.
            // params.setParametro4("http://localhost:9080/SATE_ope/"); // Se puede descomentar si se requiere.

            // Establece los datos del correo y parámetros en el mensaje de requisitos.
            rlm.setDatosCorreo(datos);
            rlm.setDatosParametro(params);

            // Agrega el mensaje de requisitos a la lista.
            arr.getItem().add(rlm);
            rqMessage.setReqListMessage(arr);
            
            // Envía el mensaje utilizando el servicio de mensajería.
            serviceMessage.sendMessage(rqMessage);

        } catch (Exception ex) {
            logger.error("Error en enviarMailUsuarioClave: " + ex.getMessage(), ex);
            throw new InternalServiceException(ex.getMessage(), ex);
        } finally {
            logger.info("Fin del método enviarMailUsuarioClave");
        }
    }
}
