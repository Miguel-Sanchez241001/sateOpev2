package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.Date;

public class Asignacion {

	private Long idAsi;

	private Long idTar;

	private String codigoAsignacion;

	private Date fechaInicioLinea;

	private Date fechaFinLinea;

	private Date fechaRegistro;

	private String linea;

	private String cuentaExpediente;

	public Long getIdAsi() {
		return idAsi;
	}

	public void setIdAsi(Long idAsi) {
		this.idAsi = idAsi;
	}

	public Long getIdTar() {
		return idTar;
	}

	public void setIdTar(Long idTar) {
		this.idTar = idTar;
	}

	public String getCodigoAsignacion() {
		return codigoAsignacion;
	}

	public void setCodigoAsignacion(String codigoAsignacion) {
		this.codigoAsignacion = codigoAsignacion;
	}

	public Date getFechaInicioLinea() {
		return fechaInicioLinea;
	}

	public void setFechaInicioLinea(Date fechaInicioLinea) {
		this.fechaInicioLinea = fechaInicioLinea;
	}

	public Date getFechaFinLinea() {
		return fechaFinLinea;
	}

	public void setFechaFinLinea(Date fechaFinLinea) {
		this.fechaFinLinea = fechaFinLinea;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getCuentaExpediente() {
		return cuentaExpediente;
	}

	public void setCuentaExpediente(String cuentaExpediente) {
		this.cuentaExpediente = cuentaExpediente;
	}

	@Override
	public String toString() {
		return "Asignacion [idAsi=" + idAsi + ", idTar=" + idTar + ", codigoAsignacion=" + codigoAsignacion
				+ ", fechaInicioLinea=" + fechaInicioLinea + ", fechaFinLinea=" + fechaFinLinea + ", fechaRegistro="
				+ fechaRegistro + ", linea=" + linea + ", cuentaExpediente=" + cuentaExpediente + "]";
	}

}
