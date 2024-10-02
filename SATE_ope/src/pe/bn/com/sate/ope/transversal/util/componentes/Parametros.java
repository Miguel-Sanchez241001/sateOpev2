package pe.bn.com.sate.ope.transversal.util.componentes;

import org.springframework.stereotype.Component;

@Component("parametros")
public class Parametros {

	private String urlComp;
	private String errorComp;
	private String desErrorComp;

	// PARAMETROS RENIEC
	public String consultaReniec;
	public String sistemaReniec;
	public String user1Reniec;
	public String userReniec;

	// PARAMETROS MC
	public String codigoEmisorMc;
	public String codigoUsuarioMc;
	public String numTerminalMc;
	public String prefijoNumReferenciaMc;
	public String wsUsuarioMc;
	public String wsClaveMc;
	public String wsSoapMc;
	public String wsComercioMc;
	



	// PARAMETROS TIEMPO
	private String sesionExpiradaTiempo;
	private String conexionTiempo;
	private String respuestaTiempo;

	public String getSesionExpiradaTiempo() {
		return sesionExpiradaTiempo;
	}

	public void setSesionExpiradaTiempo(String sesionExpiradaTiempo) {
		this.sesionExpiradaTiempo = sesionExpiradaTiempo;
	}

	public String getConexionTiempo() {
		return conexionTiempo;
	}

	public void setConexionTiempo(String conexionTiempo) {
		this.conexionTiempo = conexionTiempo;
	}

	public String getRespuestaTiempo() {
		return respuestaTiempo;
	}

	public void setRespuestaTiempo(String respuestaTiempo) {
		this.respuestaTiempo = respuestaTiempo;
	}

	public String getErrorComp() {
		return errorComp;
	}

	public void setErrorComp(String errorComp) {
		this.errorComp = errorComp;
	}

	public String getDesErrorComp() {
		return desErrorComp;
	}

	public void setDesErrorComp(String desErrorComp) {
		this.desErrorComp = desErrorComp;
	}

	public String getUrlComp() {
		return urlComp;
	}

	public void setUrlComp(String urlComp) {
		this.urlComp = urlComp;
	}

	public String getConsultaReniec() {
		return consultaReniec;
	}

	public void setConsultaReniec(String consultaReniec) {
		this.consultaReniec = consultaReniec;
	}

	public String getSistemaReniec() {
		return sistemaReniec;
	}

	public void setSistemaReniec(String sistemaReniec) {
		this.sistemaReniec = sistemaReniec;
	}

	public String getUser1Reniec() {
		return user1Reniec;
	}

	public void setUser1Reniec(String user1Reniec) {
		this.user1Reniec = user1Reniec;
	}

	public String getUserReniec() {
		return userReniec;
	}

	public void setUserReniec(String userReniec) {
		this.userReniec = userReniec;
	}

	public String getCodigoEmisorMc() {
		return codigoEmisorMc;
	}

	public void setCodigoEmisorMc(String codigoEmisorMc) {
		this.codigoEmisorMc = codigoEmisorMc;
	}

	public String getCodigoUsuarioMc() {
		return codigoUsuarioMc;
	}

	public void setCodigoUsuarioMc(String codigoUsuarioMc) {
		this.codigoUsuarioMc = codigoUsuarioMc;
	}

	public String getNumTerminalMc() {
		return numTerminalMc;
	}

	public void setNumTerminalMc(String numTerminalMc) {
		this.numTerminalMc = numTerminalMc;
	}

	public String getPrefijoNumReferenciaMc() {
		return prefijoNumReferenciaMc;
	}

	public void setPrefijoNumReferenciaMc(String prefijoNumReferenciaMc) {
		this.prefijoNumReferenciaMc = prefijoNumReferenciaMc;
	}

	public String getWsUsuarioMc() {
		return wsUsuarioMc;
	}

	public void setWsUsuarioMc(String wsUsuarioMc) {
		this.wsUsuarioMc = wsUsuarioMc;
	}

	public String getWsClaveMc() {
		return wsClaveMc;
	}

	public void setWsClaveMc(String wsClaveMc) {
		this.wsClaveMc = wsClaveMc;
	}
	public String getWsSoapMc() {
		return wsSoapMc;
	}

	public void setWsSoapMc(String wsSoapMc) {
		this.wsSoapMc = wsSoapMc;
	}

	public String getWsComercioMc() {
		return wsComercioMc;
	}

	public void setWsComercioMc(String wsComercioMc) {
		this.wsComercioMc = wsComercioMc;
	}
	
	
}
