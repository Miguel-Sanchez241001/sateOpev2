package pe.bn.com.sate.ope.transversal.util;

import java.util.Map;

import javax.xml.ws.BindingProvider;

public class ServicioWebUtil {

	public static void cambiarTiempoEspera(String tiempoConexion,
			String tiempoRespuesta, BindingProvider proxy) {
		Map<String, Object> request = proxy.getRequestContext();
		request.put(
				com.ibm.wsspi.webservices.Constants.CONNECTION_TIMEOUT_PROPERTY,
				tiempoConexion);
		request.put(
				com.ibm.wsspi.webservices.Constants.RESPONSE_TIMEOUT_PROPERTY,
				tiempoRespuesta);
	}

}
