package pe.bn.com.sate.ope.transversal.dto.host;

public class Solicitud {

	// Entrada
	private String tOperacion;
	private String modulo;
	private String timeStamp;
	private String cCanal;
	private String cTerm;
	private String cEmpresa;
	private String cic;
	private String tipoDoc;
	private String numDoc;
	private String clave;
	private String claveAnt;
	private String cUsuario;

	// Salida
	private String cError;
	private String msj;

	public String gettOperacion() {
		return tOperacion;
	}

	public void settOperacion(String tOperacion) {
		this.tOperacion = tOperacion;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getcCanal() {
		return cCanal;
	}

	public void setcCanal(String cCanal) {
		this.cCanal = cCanal;
	}

	public String getcTerm() {
		return cTerm;
	}

	public void setcTerm(String cTerm) {
		this.cTerm = cTerm;
	}

	public String getcEmpresa() {
		return cEmpresa;
	}

	public void setcEmpresa(String cEmpresa) {
		this.cEmpresa = cEmpresa;
	}

	public String getCic() {
		return cic;
	}

	public void setCic(String cic) {
		this.cic = cic;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getClaveAnt() {
		return claveAnt;
	}

	public void setClaveAnt(String claveAnt) {
		this.claveAnt = claveAnt;
	}

	public String getcError() {
		return cError;
	}

	public void setcError(String cError) {
		this.cError = cError;
	}

	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}

	public String getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

}
