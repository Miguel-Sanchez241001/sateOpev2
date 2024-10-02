package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.Date;

public class EstadoTarjeta {

	private Long id;
	private Long idTarjeta;
	private String estado;
	private String estadoCuenta;
	private String motivo;
	private String usuarioRegistro;
	private Date fechaRegistro;

	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	@Override
	public String toString() {
		return "EstadoTarjeta [id=" + id + ", idTarjeta=" + idTarjeta
				+ ", estado=" + estado + ", motivo=" + motivo
				+ ", usuarioRegistro=" + usuarioRegistro + ", fechaRegistro="
				+ fechaRegistro + "]";
	}

}
