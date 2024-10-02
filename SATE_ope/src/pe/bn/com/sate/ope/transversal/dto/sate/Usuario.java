package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.Date;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.Identidad2;

public class Usuario {

	private Long id;
	private String token;
	private String caducidadToken;
	private String tipoDocumento;
	private String caducidadClave;// 2
	private String numeroDocumento;
	private String clave;
	private String nombres;
	private String apPaterno;
	private String apMaterno;
	private String correoLaboral;
	private String telefonoFijo;
	private String telefonoMovil;
	private String estado;
	private Date fechaRegistro;
	private String motivoBaja;
	private String codigoTelefono;
	private String estadoToken;
	private String motivoBloqueoToken;
	private String anexo;
	private String nivelFirmante;
	private String operadora;
	private String estadoClave;
	private String correoPersonal;

	private String username;
	private String password;
	private Long usuarioPerfil;
	private Long representanteCreador;

	private String flagCambioClave;

	public Usuario() {
		
	}

	public Usuario(Identidad2 vIdentidad2, String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.nombres = vIdentidad2.getNombres().trim();
		this.apPaterno = vIdentidad2.getApellidoPaterno().trim();
		this.apMaterno = vIdentidad2.getApellidoMaterno().trim();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = vIdentidad2.getNumDoc().trim();
	}

	public String nombreCompleto() {
		String nombreCompleto = "";

		if (nombres != null)
			nombreCompleto += nombres;
		if (apPaterno != null)
			nombreCompleto += " " + apPaterno;
		if (apMaterno != null)
			nombreCompleto += " " + apMaterno;

		return nombreCompleto;

	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getUsuarioPerfil() {
		return usuarioPerfil;
	}

	public void setUsuarioPerfil(Long usuarioPerfil) {
		this.usuarioPerfil = usuarioPerfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCaducidadToken() {
		return caducidadToken;
	}

	public void setCaducidadToken(String caducidadToken) {
		this.caducidadToken = caducidadToken;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getCaducidadClave() {
		return caducidadClave;
	}

	public void setCaducidadClave(String caducidadClave) {
		this.caducidadClave = caducidadClave;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreoLaboral() {
		return correoLaboral;
	}

	public void setCorreoLaboral(String correoLaboral) {
		this.correoLaboral = correoLaboral;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getMotivoBaja() {
		return motivoBaja;
	}

	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}

	public String getCodigoTelefono() {
		return codigoTelefono;
	}

	public void setCodigoTelefono(String codigoTelefono) {
		this.codigoTelefono = codigoTelefono;
	}

	public String getEstadoToken() {
		return estadoToken;
	}

	public void setEstadoToken(String estadoToken) {
		this.estadoToken = estadoToken;
	}

	public String getMotivoBloqueoToken() {
		return motivoBloqueoToken;
	}

	public void setMotivoBloqueoToken(String motivoBloqueoToken) {
		this.motivoBloqueoToken = motivoBloqueoToken;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getNivelFirmante() {
		return nivelFirmante;
	}

	public void setNivelFirmante(String nivelFirmante) {
		this.nivelFirmante = nivelFirmante;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getEstadoClave() {
		return estadoClave;
	}

	public void setEstadoClave(String estadoClave) {
		this.estadoClave = estadoClave;
	}

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public Long getRepresentanteCreador() {
		return representanteCreador;
	}

	public void setRepresentanteCreador(Long representanteCreador) {
		this.representanteCreador = representanteCreador;
	}

	public String getFlagCambioClave() {
		return flagCambioClave;
	}

	public void setFlagCambioClave(String flagCambioClave) {
		this.flagCambioClave = flagCambioClave;
	}
	@Override
	public String toString() {
		return "Usuario [tipoDocumento=" + tipoDocumento + ", numeroDocumento="
				+ numeroDocumento + ", clave=" + clave + ", nombres=" + nombres
				+ ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno
				+ ", correoLaboral=" + correoLaboral + ", correoPersonal="
				+ correoPersonal + ", username=" + username + ", password="
				+ password + ", usuarioPerfil=" + usuarioPerfil
				+ ", representanteCreador=" + representanteCreador
				+ ", flagCambioClave=" + flagCambioClave + "]";
	}
}
