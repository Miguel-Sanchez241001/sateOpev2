package pe.bn.com.sate.ope.transversal.dto.sate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Modificacion_Tarjeta")
public class ModificacionTarjeta {
	
	@XmlElement(name = "CodEmisor")
	private String CodEmisor;
	
	@XmlElement(name = "CodUsuario")
	private String CodUsuario;
	
	@XmlElement(name = "NumTerminal")
	private String NumTerminal;
	
	@XmlElement(name = "NumReferencia")
	private String NumReferencia;
	
	@XmlElement(name = "MonedaProducto")
	private String MonedaProducto;
	
	@XmlElement(name = "CodigoProducto")
	private String CodigoProducto;
	
	@XmlElement(name = "NumCuentaAsociada")
	private String NumCuentaAsociada;
	
	@XmlElement(name = "IndAutGenCodCliente")
	private String IndAutGenCodCliente;
	
	@XmlElement(name = "NumTarjetaMonedero")
	private String NumTarjetaMonedero;
	
	@XmlElement(name = "TipoTarjeta")
	private String TipoTarjeta;
	
	@XmlElement(name = "SecuenciaTarjeta")
	private String SecuenciaTarjeta;
	
	@XmlElement(name = "TipoEmisionTarjeta")
	private String TipoEmisionTarjeta;
	
	@XmlElement(name = "NombrePlasticoLinea1")
	private String NombrePlasticoLinea1;
	
	@XmlElement(name = "NombrePlasticoLinea2")
	private String NombrePlasticoLinea2;
	
	@XmlElement(name = "CodigoBloqueo")
	private String CodigoBloqueo;
	
	@XmlElement(name = "MotivoBloqueo")
	private String MotivoBloqueo;
	
	@XmlElement(name = "DireccionEnvioTipoVia")
	private String DireccionEnvioTipoVia;
	
	@XmlElement(name = "DireccionEnvioNombreVia")
	private String DireccionEnvioNombreVia;
	
	@XmlElement(name = "DireccionEnvioNum")
	private String DireccionEnvioNum;
	
	@XmlElement(name = "DireccionEnvioNumDpto")
	private String DireccionEnvioNumDpto;
	
	@XmlElement(name = "DireccionEnvioOficina")
	private String DireccionEnvioOficina;
	
	@XmlElement(name = "DireccionEnvioPiso")
	private String DireccionEnvioPiso;
	
	@XmlElement(name = "DireccionEnvioManzana")
	private String DireccionEnvioManzana;
	
	@XmlElement(name = "DireccionEnvioLote")
	private String DireccionEnvioLote;
	
	@XmlElement(name = "DireccionEnvioNumInterior")
	private String DireccionEnvioNumInterior;
	
	@XmlElement(name = "DireccionEnvioSector")
	private String DireccionEnvioSector;
	
	@XmlElement(name = "DireccionEnvioKilometro")
	private String DireccionEnvioKilometro;
	
	@XmlElement(name = "DireccionEnvioTipoZona")
	private String DireccionEnvioTipoZona;
	
	@XmlElement(name = "DireccionEnvioNombreZona")
	private String DireccionEnvioNombreZona;
	
	@XmlElement(name = "DireccionEnvioReferencia")
	private String DireccionEnvioReferencia;
	
	@XmlElement(name = "DireccionEnvioUbigeo")
	private String DireccionEnvioUbigeo;
	
	@XmlElement(name = "IndTipoDireccion")
	private String IndTipoDireccion;
	
	@XmlElement(name = "SucursalOriginal")
	private String SucursalOriginal;
	
	@XmlElement(name = "Mandatorio1")
	private String Mandatorio1;
	
	@XmlElement(name = "Mandatorio2")
	private String Mandatorio2;
	
	@XmlElement(name = "SucursalActual")
	private String SucursalActual;
	
	@XmlElement(name = "CodigoPromocion")
	private String CodigoPromocion;
	
	
	
	
	
	@XmlElement(name = "FechaTxnTerminal")
	private String FechaTxnTerminal;
	
	@XmlElement(name = "HoraTxnTerminal")
	private String HoraTxnTerminal;
	
	@XmlElement(name = "Reservado")
	private String Reservado;
	
	@XmlElement(name = "IdTransaccion")
	private String IdTransaccion;
	
	@XmlElement(name = "CodRespuesta")
	private String CodRespuesta;
	
	@XmlElement(name = "DescRespuesta")
	private String DescRespuesta;

	// Getter Methods

	public String getCodEmisor() {
		return CodEmisor;
	}

	public String getCodUsuario() {
		return CodUsuario;
	}

	public String getNumTerminal() {
		return NumTerminal;
	}

	public String getNumReferencia() {
		return NumReferencia;
	}

	public String getMonedaProducto() {
		return MonedaProducto;
	}

	public String getCodigoProducto() {
		return CodigoProducto;
	}

	public String getNumCuentaAsociada() {
		return NumCuentaAsociada;
	}

	public String getIndAutGenCodCliente() {
		return IndAutGenCodCliente;
	}

	public String getNumTarjetaMonedero() {
		return NumTarjetaMonedero;
	}

	public String getTipoTarjeta() {
		return TipoTarjeta;
	}

	public String getSecuenciaTarjeta() {
		return SecuenciaTarjeta;
	}

	public String getTipoEmisionTarjeta() {
		return TipoEmisionTarjeta;
	}

	public String getNombrePlasticoLinea1() {
		return NombrePlasticoLinea1;
	}

	public String getNombrePlasticoLinea2() {
		return NombrePlasticoLinea2;
	}

	public String getCodigoBloqueo() {
		return CodigoBloqueo;
	}

	public String getMotivoBloqueo() {
		return MotivoBloqueo;
	}

	public String getDireccionEnvioTipoVia() {
		return DireccionEnvioTipoVia;
	}

	public String getDireccionEnvioNombreVia() {
		return DireccionEnvioNombreVia;
	}

	public String getDireccionEnvioNum() {
		return DireccionEnvioNum;
	}

	public String getDireccionEnvioNumDpto() {
		return DireccionEnvioNumDpto;
	}

	public String getDireccionEnvioOficina() {
		return DireccionEnvioOficina;
	}

	public String getDireccionEnvioPiso() {
		return DireccionEnvioPiso;
	}

	public String getDireccionEnvioManzana() {
		return DireccionEnvioManzana;
	}

	public String getDireccionEnvioLote() {
		return DireccionEnvioLote;
	}

	public String getDireccionEnvioNumInterior() {
		return DireccionEnvioNumInterior;
	}

	public String getDireccionEnvioSector() {
		return DireccionEnvioSector;
	}

	public String getDireccionEnvioKilometro() {
		return DireccionEnvioKilometro;
	}

	public String getDireccionEnvioTipoZona() {
		return DireccionEnvioTipoZona;
	}

	public String getDireccionEnvioNombreZona() {
		return DireccionEnvioNombreZona;
	}

	public String getDireccionEnvioReferencia() {
		return DireccionEnvioReferencia;
	}

	public String getDireccionEnvioUbigeo() {
		return DireccionEnvioUbigeo;
	}

	public String getIndTipoDireccion() {
		return IndTipoDireccion;
	}

	public String getSucursalOriginal() {
		return SucursalOriginal;
	}

	public String getMandatorio1() {
		return Mandatorio1;
	}

	public String getMandatorio2() {
		return Mandatorio2;
	}

	public String getSucursalActual() {
		return SucursalActual;
	}

	public String getCodigoPromocion() {
		return CodigoPromocion;
	}

	public String getFechaTxnTerminal() {
		return FechaTxnTerminal;
	}

	public String getHoraTxnTerminal() {
		return HoraTxnTerminal;
	}

	public String getReservado() {
		return Reservado;
	}

	public String getIdTransaccion() {
		return IdTransaccion;
	}

	public String getCodRespuesta() {
		return CodRespuesta;
	}

	public String getDescRespuesta() {
		return DescRespuesta;
	}

	// Setter Methods

	public void setCodEmisor(String CodEmisor) {
		this.CodEmisor = CodEmisor;
	}

	public void setCodUsuario(String CodUsuario) {
		this.CodUsuario = CodUsuario;
	}

	public void setNumTerminal(String NumTerminal) {
		this.NumTerminal = NumTerminal;
	}

	public void setNumReferencia(String NumReferencia) {
		this.NumReferencia = NumReferencia;
	}

	public void setMonedaProducto(String MonedaProducto) {
		this.MonedaProducto = MonedaProducto;
	}

	public void setCodigoProducto(String CodigoProducto) {
		this.CodigoProducto = CodigoProducto;
	}

	public void setNumCuentaAsociada(String NumCuentaAsociada) {
		this.NumCuentaAsociada = NumCuentaAsociada;
	}

	public void setIndAutGenCodCliente(String IndAutGenCodCliente) {
		this.IndAutGenCodCliente = IndAutGenCodCliente;
	}

	public void setNumTarjetaMonedero(String NumTarjetaMonedero) {
		this.NumTarjetaMonedero = NumTarjetaMonedero;
	}

	public void setTipoTarjeta(String TipoTarjeta) {
		this.TipoTarjeta = TipoTarjeta;
	}

	public void setSecuenciaTarjeta(String SecuenciaTarjeta) {
		this.SecuenciaTarjeta = SecuenciaTarjeta;
	}

	public void setTipoEmisionTarjeta(String TipoEmisionTarjeta) {
		this.TipoEmisionTarjeta = TipoEmisionTarjeta;
	}

	public void setNombrePlasticoLinea1(String NombrePlasticoLinea1) {
		this.NombrePlasticoLinea1 = NombrePlasticoLinea1;
	}

	public void setNombrePlasticoLinea2(String NombrePlasticoLinea2) {
		this.NombrePlasticoLinea2 = NombrePlasticoLinea2;
	}

	public void setCodigoBloqueo(String CodigoBloqueo) {
		this.CodigoBloqueo = CodigoBloqueo;
	}

	public void setMotivoBloqueo(String MotivoBloqueo) {
		this.MotivoBloqueo = MotivoBloqueo;
	}

	public void setDireccionEnvioTipoVia(String DireccionEnvioTipoVia) {
		this.DireccionEnvioTipoVia = DireccionEnvioTipoVia;
	}

	public void setDireccionEnvioNombreVia(String DireccionEnvioNombreVia) {
		this.DireccionEnvioNombreVia = DireccionEnvioNombreVia;
	}

	public void setDireccionEnvioNum(String DireccionEnvioNum) {
		this.DireccionEnvioNum = DireccionEnvioNum;
	}

	public void setDireccionEnvioNumDpto(String DireccionEnvioNumDpto) {
		this.DireccionEnvioNumDpto = DireccionEnvioNumDpto;
	}

	public void setDireccionEnvioOficina(String DireccionEnvioOficina) {
		this.DireccionEnvioOficina = DireccionEnvioOficina;
	}

	public void setDireccionEnvioPiso(String DireccionEnvioPiso) {
		this.DireccionEnvioPiso = DireccionEnvioPiso;
	}

	public void setDireccionEnvioManzana(String DireccionEnvioManzana) {
		this.DireccionEnvioManzana = DireccionEnvioManzana;
	}

	public void setDireccionEnvioLote(String DireccionEnvioLote) {
		this.DireccionEnvioLote = DireccionEnvioLote;
	}

	public void setDireccionEnvioNumInterior(String DireccionEnvioNumInterior) {
		this.DireccionEnvioNumInterior = DireccionEnvioNumInterior;
	}

	public void setDireccionEnvioSector(String DireccionEnvioSector) {
		this.DireccionEnvioSector = DireccionEnvioSector;
	}

	public void setDireccionEnvioKilometro(String DireccionEnvioKilometro) {
		this.DireccionEnvioKilometro = DireccionEnvioKilometro;
	}

	public void setDireccionEnvioTipoZona(String DireccionEnvioTipoZona) {
		this.DireccionEnvioTipoZona = DireccionEnvioTipoZona;
	}

	public void setDireccionEnvioNombreZona(String DireccionEnvioNombreZona) {
		this.DireccionEnvioNombreZona = DireccionEnvioNombreZona;
	}

	public void setDireccionEnvioReferencia(String DireccionEnvioReferencia) {
		this.DireccionEnvioReferencia = DireccionEnvioReferencia;
	}

	public void setDireccionEnvioUbigeo(String DireccionEnvioUbigeo) {
		this.DireccionEnvioUbigeo = DireccionEnvioUbigeo;
	}

	public void setIndTipoDireccion(String IndTipoDireccion) {
		this.IndTipoDireccion = IndTipoDireccion;
	}

	public void setSucursalOriginal(String SucursalOriginal) {
		this.SucursalOriginal = SucursalOriginal;
	}

	public void setMandatorio1(String Mandatorio1) {
		this.Mandatorio1 = Mandatorio1;
	}

	public void setMandatorio2(String Mandatorio2) {
		this.Mandatorio2 = Mandatorio2;
	}

	public void setSucursalActual(String SucursalActual) {
		this.SucursalActual = SucursalActual;
	}

	public void setCodigoPromocion(String CodigoPromocion) {
		this.CodigoPromocion = CodigoPromocion;
	}

	public void setFechaTxnTerminal(String FechaTxnTerminal) {
		this.FechaTxnTerminal = FechaTxnTerminal;
	}

	public void setHoraTxnTerminal(String HoraTxnTerminal) {
		this.HoraTxnTerminal = HoraTxnTerminal;
	}

	public void setReservado(String Reservado) {
		this.Reservado = Reservado;
	}

	public void setIdTransaccion(String IdTransaccion) {
		this.IdTransaccion = IdTransaccion;
	}

	public void setCodRespuesta(String CodRespuesta) {
		this.CodRespuesta = CodRespuesta;
	}

	public void setDescRespuesta(String DescRespuesta) {
		this.DescRespuesta = DescRespuesta;
	}
}
