package pe.bn.com.sate.ope.transversal.dto.ws;

import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesWS;

public class DTOwservice {

	private String soapTemplate;
	private final String soapAction;
	private final String resultTag;
	private final String startTag;
	private final String endTag;
	private final String replacementMarker;

	public DTOwservice(String dynamicWord) {
		this.replacementMarker = "SOAP_CONTENT"; // Puedes cambiar este valor
													// según tus necesidades
		this.soapTemplate = String
				.format("<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">"
						+ "<Body>"
						+ "<%s xmlns=\"http://tempuri.org/\">"
						+ "<XML>%s</XML>" + "</%s>" + "</Body>" + "</Envelope>",
						dynamicWord, replacementMarker, dynamicWord);

		if(dynamicWord.equals(ConstantesWS.SOACTION_MODIFICACION_TARJETA)|| 
				dynamicWord.equals(ConstantesWS.SOACTION_BLOQUEO_TARJETA)|| 
				dynamicWord.equals(ConstantesWS.SOACTION_BLOQUEO_TARJETA)|| 
				dynamicWord.equals(ConstantesWS.SOACTION_MODIFICACION_CLIENTE)||
				dynamicWord.equals(ConstantesWS.SOACTION_MODIFICACION_CLIENTES)
				//|| dynamicWord.equals(ConstantesWS.SOACTION_CONSULTA_DATOS_CLIENTE)
				){
				//SOACTION_CONSULTA_DATOS_EXPEDIENTE
			this.soapTemplate = this.soapTemplate.replace("XML", "xml");
		}
		
		
		this.soapAction = String.format("http://tempuri.org/IService1/%s",
				dynamicWord);
		this.resultTag = dynamicWord + "Result";
		this.startTag = String.format("<%s>", dynamicWord);
		this.endTag = String.format("</%s>", dynamicWord);
	}

	public String getSoapTemplate() {
		return soapTemplate;
	}

	public String getSoapAction() {
		return soapAction;
	}

	public String getResultTag() {
		return resultTag;
	}

	public String getStartTag() {
		return startTag;
	}

	public String getEndTag() {
		return endTag;
	}

	public String getReplacementMarker() {
		return replacementMarker;
	}

	@Override
	public String toString() {
		return "DTOwservice [soapTemplate=" + soapTemplate + ", soapAction="
				+ soapAction + ", ResultTag=" + resultTag + ", StartTag="
				+ startTag + ", EndTag=" + endTag + ", replacementMarker="
				+ replacementMarker + "]";
	}
}
