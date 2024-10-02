package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.Date;

import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

public class Tarjeta {
	private Long id;
	private Long idEmpresa;
	private Long idUsu;
	private Long idCli;
	private String numTarjeta; //
	private String disposicionEfectivo;
	private String porcentajeDisposicionEfectivo;
	

	private String usoDispocionEfectivo;
	private String usoExtranjero;
	private String usoComprasWeb;
	public String getUsoComprasWeb() {
		return usoComprasWeb;
	}

	public void setUsoComprasWeb(String usoComprasWeb) {
		this.usoComprasWeb = usoComprasWeb;
	}

	private String tipoTarjeta;
	private String diseno;
	private String observaciones;
	private String tipoMoneda;
	private String entregaUbicacion;
	private String entregaAgenciaBN;
	private String entregaDepartamento;
	private String entregaProvincia;
	private String entregaDistrito;
	private String entregaUbigeo;
	private String entregaReferencia;
	private String entregaDireccion;
	private String nroAutorizacion;
	private Date fechaAutorizacion;
	private Date fechaCreacion;
	private String usuarioCreacion;
	private Date fechaInicioLinea;
	private Date fechaTerminoLinea;
	private Double montoLineaAsignado;
	private Double montoLineaActual;
	private Double montoCompraUsado;
	private Double montoPorProcesar;
	private Double dispEfectivoUsado;

	private String estadoCuenta;
	private String numeroCuenta;
	private Date fechaAperturaCuenta;
	private String flagActualizarEstadoCuenta;

	private String descripcionUbicacion;
	private String empresa;
	private String estado;
	private String motivoBloqueo;
	private String usuarioBloqueo;
	private Date fechaBloqueo;

	private String tipoDocumento;
	private String numeroDocumento;
	private String Nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;

	private String operadorCelular;
	private String email;
	private String numeroCelular;
	private String flagActualizarContacto;

	public String getDescripcionUbicacion() {
		return descripcionUbicacion;
	}

	public void setDescripcionUbicacion(String descripcionUbicacion) {
		this.descripcionUbicacion = descripcionUbicacion;
	}
	public String getPorcentajeDisposicionEfectivo() {
		return porcentajeDisposicionEfectivo;
	}

	public void setPorcentajeDisposicionEfectivo(
			String porcentajeDisposicionEfectivo) {
		this.porcentajeDisposicionEfectivo = porcentajeDisposicionEfectivo;
	}
	public String getMotivoBloqueo() {
		return motivoBloqueo;
	}

	public void setMotivoBloqueo(String motivoBloqueo) {
		this.motivoBloqueo = motivoBloqueo;
	}

	public String getUsuarioBloqueo() {
		return usuarioBloqueo;
	}

	public void setUsuarioBloqueo(String usuarioBloqueo) {
		this.usuarioBloqueo = usuarioBloqueo;
	}

	public Date getFechaBloqueo() {
		return fechaBloqueo;
	}

	public void setFechaBloqueo(Date fechaBloqueo) {
		this.fechaBloqueo = fechaBloqueo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Long getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(Long idUsu) {
		this.idUsu = idUsu;
	}

	public Long getIdCli() {
		return idCli;
	}

	public void setIdCli(Long idCli) {
		this.idCli = idCli;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getDisposicionEfectivo() {
		return disposicionEfectivo;
	}

	public void setDisposicionEfectivo(String disposicionEfectivo) {
		this.disposicionEfectivo = disposicionEfectivo;
	}

	public String getUsoDispocionEfectivo() {
		return usoDispocionEfectivo;
	}

	public void setUsoDispocionEfectivo(String usoDispocionEfectivo) {
		if (usoDispocionEfectivo.equals("T")) {
			setPorcentajeDisposicionEfectivo(ConstantesGenerales.PORCENTAJE_EFECTIVO);
		}else{
			setPorcentajeDisposicionEfectivo("00000");
		}
		this.usoDispocionEfectivo = usoDispocionEfectivo;
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public String getEntregaUbicacion() {
		return entregaUbicacion;
	}

	public void setEntregaUbicacion(String entregaUbicacion) {
		this.entregaUbicacion = entregaUbicacion;
	}

	public String getEntregaAgenciaBN() {
		return entregaAgenciaBN;
	}

	public void setEntregaAgenciaBN(String entregaAgenciaBN) {
		this.entregaAgenciaBN = entregaAgenciaBN;
	}

	public String getEntregaDepartamento() {
		return entregaDepartamento;
	}

	public void setEntregaDepartamento(String entregaDepartamento) {
		this.entregaDepartamento = entregaDepartamento;
	}

	public String getEntregaReferencia() {
		return entregaReferencia;
	}

	public void setEntregaReferencia(String entregaReferencia) {
		this.entregaReferencia = entregaReferencia;
	}

	public String getNroAutorizacion() {
		return nroAutorizacion;
	}

	public void setNroAutorizacion(String nroAutorizacion) {
		this.nroAutorizacion = nroAutorizacion;
	}

	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}

	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaInicioLinea() {
		return fechaInicioLinea;
	}

	public void setFechaInicioLinea(Date fechaInicioLinea) {
		this.fechaInicioLinea = fechaInicioLinea;
	}

	public Date getFechaTerminoLinea() {
		return fechaTerminoLinea;
	}

	public void setFechaTerminoLinea(Date fechaTerminoLinea) {
		this.fechaTerminoLinea = fechaTerminoLinea;
	}

	public Double getMontoLineaAsignado() {
		return montoLineaAsignado;
	}

	public void setMontoLineaAsignado(Double montoLineaAsignado) {
		this.montoLineaAsignado = montoLineaAsignado;
	}

	public Double getMontoLineaActual() {
		return montoLineaActual;
	}

	public void setMontoLineaActual(Double montoLineaActual) {
		this.montoLineaActual = montoLineaActual;
	}

	public Double getMontoCompraUsado() {
		return montoCompraUsado;
	}

	public void setMontoCompraUsado(Double montoCompraUsado) {
		this.montoCompraUsado = montoCompraUsado;
	}

	public Double getMontoPorProcesar() {
		return montoPorProcesar;
	}

	public void setMontoPorProcesar(Double montoPorProcesar) {
		this.montoPorProcesar = montoPorProcesar;
	}

	public Double getDispEfectivoUsado() {
		return dispEfectivoUsado;
	}

	public void setDispEfectivoUsado(Double dispEfectivoUsado) {
		this.dispEfectivoUsado = dispEfectivoUsado;
	}

	public String getEntregaProvincia() {
		return entregaProvincia;
	}

	public void setEntregaProvincia(String entregaProvincia) {
		this.entregaProvincia = entregaProvincia;
	}

	public String getEntregaDistrito() {
		return entregaDistrito;
	}

	public void setEntregaDistrito(String entregaDistrito) {
		this.entregaDistrito = entregaDistrito;
	}

	public String getEntregaDireccion() {
		return entregaDireccion;
	}

	public void setEntregaDireccion(String entregaDireccion) {
		this.entregaDireccion = entregaDireccion;
	}

	public String getEntregaUbigeo() {
		return entregaUbigeo;
	}

	public void setEntregaUbigeo(String entregaUbigeo) {
		this.entregaUbigeo = entregaUbigeo;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getOperadorCelular() {
		return operadorCelular;
	}

	public void setOperadorCelular(String operadorCelular) {
		this.operadorCelular = operadorCelular;
	}

	public String getFlagActualizarContacto() {
		return flagActualizarContacto;
	}

	public void setFlagActualizarContacto(String flagActualizarContacto) {
		this.flagActualizarContacto = flagActualizarContacto;
	}

	public String getDiseno() {
		return diseno;
	}

	public void setDiseno(String tipoDiseno) {
		this.diseno = tipoDiseno;
	}

	public String getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Date getFechaAperturaCuenta() {
		return fechaAperturaCuenta;
	}

	public void setFechaAperturaCuenta(Date fechaAperturaCuenta) {
		this.fechaAperturaCuenta = fechaAperturaCuenta;
	}

	public String getFlagActualizarEstadoCuenta() {
		return flagActualizarEstadoCuenta;
	}

	public void setFlagActualizarEstadoCuenta(String flagActualizarEstadoCuenta) {
		this.flagActualizarEstadoCuenta = flagActualizarEstadoCuenta;
	}

	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", idEmpresa=" + idEmpresa + ", idUsu="
				+ idUsu + ", idCli=" + idCli + ", numTarjeta=" + numTarjeta
				+ ", disposicionEfectivo=" + disposicionEfectivo
				+ ", usoDispocionEfectivo=" + usoDispocionEfectivo
				+ ", usoExtranjero=" + usoExtranjero + ", tipoTarjeta="
				+ tipoTarjeta + ", observaciones=" + observaciones
				+ ", tipoMoneda=" + tipoMoneda + ", entregaUbicacion="
				+ entregaUbicacion + ", entregaAgenciaBN=" + entregaAgenciaBN
				+ ", entregaDepartamento=" + entregaDepartamento
				+ ", entregaProvincia=" + entregaProvincia
				+ ", entregaDistrito=" + entregaDistrito + ", entregaUbigeo="
				+ entregaUbigeo + ", entregaReferencia=" + entregaReferencia
				+ ", entregaDireccion=" + entregaDireccion
				+ ", nroAutorizacion=" + nroAutorizacion
				+ ", fechaAutorizacion=" + fechaAutorizacion
				+ ", fechaCreacion=" + fechaCreacion + ", usuarioCreacion="
				+ usuarioCreacion + ", fechaInicioLinea=" + fechaInicioLinea
				+ ", fechaTerminoLinea=" + fechaTerminoLinea
				+ ", montoLineaAsignado=" + montoLineaAsignado
				+ ", montoLineaActual=" + montoLineaActual
				+ ", montoCompraUsado=" + montoCompraUsado
				+ ", montoPorProcesar=" + montoPorProcesar
				+ ", dispEfectivoUsado=" + dispEfectivoUsado
				+ ", descripcionUbicacion=" + descripcionUbicacion
				+ ", empresa=" + empresa + ", estado=" + estado
				+ ", motivoBloqueo=" + motivoBloqueo + ", usuarioBloqueo="
				+ usuarioBloqueo + ", fechaBloqueo=" + fechaBloqueo
				+ ", tipoDocumento=" + tipoDocumento + ", numeroDocumento="
				+ numeroDocumento + ", Nombres=" + Nombres
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + "]";
	}

}
