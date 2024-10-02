package pe.bn.com.sate.ope.transversal.dto.sate;

public class SolicitudTarjeta {

	private Long id;
	private String tipoDocumento;
	private String numDocumento;
	private String nombres;
	private String apellidos;
	private String dispEfectivo;
	private String usoExtranjero;
	private String tipoTarjeta;
	private String diseno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDispEfectivo() {
		return dispEfectivo;
	}

	public void setDispEfectivo(String dispEfectivo) {
		this.dispEfectivo = dispEfectivo;
	}

	public String getUsoExtranjero() {
		return usoExtranjero;
	}

	public void setUsoExtranjero(String usoExtranjero) {
		this.usoExtranjero = usoExtranjero;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public String getDiseno() {
		return diseno;
	}

	public void setDiseno(String diseno) {
		this.diseno = diseno;
	}

	@Override
	public String toString() {
		return "SolicitudTarjeta [id=" + id + ", tipoDocumento="
				+ tipoDocumento + ", numDocumento=" + numDocumento
				+ ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", dispEfectivo=" + dispEfectivo + ", usoExtranjero="
				+ usoExtranjero + ", tipoTarjeta=" + tipoTarjeta + "]";
	}

}
