package pe.bn.com.sate.ope.transversal.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceMCProcesosException;
import pe.bn.com.sate.ope.transversal.util.excepciones.InternalExcepcion;

public class SoapClientUtil {
	/**
	 * Parsea una cadena XML y la convierte en un objeto Document.
	 * 
	 * Este método toma una cadena XML como entrada, la convierte en un flujo de
	 * bytes utilizando codificación UTF-8, y luego la parsea en un documento
	 * DOM. El documento se normaliza para asegurar un formato consistente.
	 * 
	 * @param xml
	 *            la cadena XML a parsear
	 * @return un objeto Document que representa el XML parseado
	 * @throws InternalExcepcion
	 *             si ocurre un error al intentar parsear el XML
	 */
	public static Document parseXmlResponse(String xml)
			throws InternalExcepcion {
		try {
			// Convierte la cadena XML a un flujo de bytes usando UTF-8
			ByteArrayInputStream inputStream = new ByteArrayInputStream(
					xml.getBytes("UTF-8"));

			// Configura y crea un DocumentBuilder
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Parsea el XML y normaliza el documento
			Document document = builder.parse(inputStream);
			document.getDocumentElement().normalize();

			return document;

		} catch (SAXException | IOException | ParserConfigurationException e) {
			// Lanza una excepción personalizada en caso de error
			throw new InternalExcepcion("Error al parsear el XML: "
					+ e.getMessage(), e);
		}
	}

	/**
	 * Obtiene el contenido de texto de un elemento XML específico.
	 * 
	 * Este método busca un elemento en el documento XML por su nombre de
	 * etiqueta y retorna el contenido de texto del primer elemento encontrado.
	 * 
	 * @param documentoXML
	 *            el documento XML en el que se buscará el elemento
	 * @param tagName
	 *            el nombre de la etiqueta a buscar
	 * @return el contenido de texto del elemento si se encuentra
	 * @throws InternalExcepcion
	 *             si no se encuentra el elemento o si no contiene texto
	 */
	public static String getTextFromElement(Document documentoXML,
			String tagName) throws InternalExcepcion {
		// Obtener la lista de elementos con el nombre de la etiqueta
		NodeList nodeList = documentoXML.getElementsByTagName(tagName);

		if (nodeList != null && nodeList.getLength() > 0) {
			// Obtener el primer elemento de la lista (suponiendo que solo hay
			// uno)
			Node node = nodeList.item(0);

			if (node != null && node.getNodeType() == Node.ELEMENT_NODE) {
				// Retornar el contenido de texto si se encuentra
				return node.getTextContent();
			}
		}
		// Si no se encuentra la etiqueta, lanzar una excepción personalizada
		throw new InternalExcepcion(
				"No se encontró el elemento con la etiqueta: " + tagName);
	}

	/**
	 * Envía una solicitud SOAP a un servicio web y devuelve la respuesta como
	 * un String.
	 * 
	 * @param wsdlUrl
	 *            La URL del WSDL del servicio web SOAP.
	 * @param soapAction
	 *            La acción SOAP específica para el servicio web.
	 * @param soapRequest
	 *            La solicitud SOAP en formato XML.
	 * @return La respuesta del servicio web en formato String.
	 * @throws ExternalServiceMCProcesosException
	 *             Si ocurre un error durante el envío o recepción de la
	 *             solicitud.
	 */
	public static String sendSoapRequest(String wsdlUrl, String soapAction, String soapRequest) throws ExternalServiceMCProcesosException {
		
		
		try{
    	

    	URL url = new URL(wsdlUrl);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        SSLContext sslContext = CertificadoUtil.getSslContext(wsdlUrl);
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
        
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
        connection.setRequestProperty("SOAPAction", soapAction);
        connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
        connection.setRequestProperty("User-Agent", "Apache-HttpClient/4.5.5 (Java/16.0.2)");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setDoOutput(true);
        connection.setConnectTimeout(15000); // 15 segundos
        connection.setReadTimeout(15000); // 15 segundos

        // Enviar la solicitud SOAP
        try (OutputStream os = connection.getOutputStream()) {
            os.write(soapRequest.getBytes("UTF-8"));
            os.flush();
        }

        // Capturar y registrar la respuesta
        int statusCode = connection.getResponseCode();

        if (statusCode == 200) {
            StringBuilder response = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine);
                }
            }
            return response.toString();
        } else {
            throw new ExternalServiceMCProcesosException("Error: Código de estado de la respuesta: " + statusCode,new Throwable());
        }
		}catch(Exception E){
            throw new ExternalServiceMCProcesosException("Error: Consumo WS IZIPAY: " + E.getMessage(),E);
		} 
    }

	private static void ignoreSSL() throws Exception {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {

			@Override
			public X509Certificate[] getAcceptedIssuers() { 
				return null;
			}

			@Override
			public void checkServerTrusted(X509Certificate[] arg0, String arg1)
					throws CertificateException {

			}

			@Override
			public void checkClientTrusted(X509Certificate[] arg0, String arg1)
					throws CertificateException { 

			}
		} };

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		// Deshabilitar verificación de nombre de host
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {

			@Override
			public boolean verify(String arg0, SSLSession arg1) { // TODO
				return true;
			}

		});
	}

	/**
     * Convierte un XML en formato String a un objeto de la clase especificada.
     *
     * @param <T>     El tipo de objeto al que se desea convertir el XML.
     * @param reader  El StringReader que contiene el XML.
     * @param class1  La clase del objeto en el que se desea convertir el XML.
     * @return El objeto de tipo T resultante de la conversión del XML.
     * @throws InternalExcepcion Si ocurre un error durante la conversión del XML a objeto.
     */
    public static <T> T convertirXMLAObjeto(StringReader reader, Class<T> class1) throws InternalExcepcion {
        try {
            JAXBContext context = JAXBContext.newInstance(class1);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (T) unmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            // Lanza una nueva excepción con un mensaje detallado, preservando el stack trace original
            throw new InternalExcepcion("Error al convertir el XML a un objeto de tipo " + class1.getName(), e);
        } catch (Exception e) {
            // Captura cualquier otra excepción inesperada
            throw new InternalExcepcion("Ocurrió un error inesperado al intentar convertir el XML a un objeto.", e);
        }
    }

    /**
     * Convierte un XML en formato Node a un objeto de la clase especificada.
     *
     * @param <T>    El tipo de objeto al que se desea convertir el XML.
     * @param node   El Node que contiene el XML.
     * @param class1 La clase del objeto en el que se desea convertir el XML.
     * @return El objeto de tipo T resultante de la conversión del XML.
     * @throws InternalExcepcion Si ocurre un error durante la conversión del XML a objeto.
     */
    public static <T> T convertirNodeAObjeto(Node node, Class<T> class1) throws InternalExcepcion {
        try {
            JAXBContext context = JAXBContext.newInstance(class1);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (T) unmarshaller.unmarshal(node);
        } catch (JAXBException e) {
            // Lanza una nueva excepción con un mensaje detallado, preservando el stack trace original
            throw new InternalExcepcion("Error al convertir el Node XML a un objeto de tipo " + class1.getName(), e);
        } catch (Exception e) {
            // Captura cualquier otra excepción inesperada
            throw new InternalExcepcion("Ocurrió un error inesperado al intentar convertir el Node XML a un objeto.", e);
        }
    }
	
	
}
