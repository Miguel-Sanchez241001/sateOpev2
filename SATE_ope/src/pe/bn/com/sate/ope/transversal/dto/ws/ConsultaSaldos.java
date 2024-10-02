package pe.bn.com.sate.ope.transversal.dto.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 

@XmlRootElement(name = "Consulta_Saldos")
public class ConsultaSaldos {

	@XmlElement(name = "CodEmisor")
	private String CodEmisor;

	@XmlElement(name = "CodUsuario")
	private String CodUsuario;

	@XmlElement(name = "NumTerminal")
	private String NumTerminal;

	@XmlElement(name = "NumTarjetaMonedero")
	private String NumTarjetaMonedero;

	@XmlElement(name = "NumReferencia")
	private String NumReferencia;

	@XmlElement(name = "FechaExpiracion")
	private String FechaExpiracion;

	@XmlElement(name = "Comercio")
	private String Comercio;

	@XmlElement(name = "Moneda")
	private String Moneda;

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

	@XmlElement(name = "CodAutorizacion")
	private String CodAutorizacion;

	@XmlElement(name = "SaldoMoneda")
	private String SaldoMoneda;

	@XmlElement(name = "SaldoCodBloqueo")
	private String SaldoCodBloqueo;

	@XmlElement(name = "SaldoDescBloqueo")
	private String SaldoDescBloqueo;

	@XmlElement(name = "SaldoNombreTarjeta")
	private String SaldoNombreTarjeta;

	@XmlElement(name = "SaldoFechaExpiracion")
	private String SaldoFechaExpiracion;

	@XmlElement(name = "SaldoLineaCredito")
	private String SaldoLineaCredito;

	//
	@XmlElement(name = "SaldoDispConsumo")
	private String SaldoDispConsumo;

	@XmlElement(name = "SaldoSigDispConsumo")
	private String SaldoSigDispConsumo;

	@XmlElement(name = "SaldoEfectivo")
	private String SaldoEfectivo;

	@XmlElement(name = "SaldoDispEfectivo")
	private String SaldoDispEfectivo;

	@XmlElement(name = "SaldoSigDispEfectivo")
	private String SaldoSigDispEfectivo;

	@XmlElement(name = "SaldoPagoMinimo")
	private String SaldoPagoMinimo;

	@XmlElement(name = "SaldoPagoTotal")
	private String SaldoPagoTotal;

	@XmlElement(name = "SaldoPagoFacturado")
	private String SaldoPagoFacturado;

	@XmlElement(name = "SaldoFechaLimPago")
	private String SaldoFechaLimPago;

	@XmlElement(name = "SaldoCuentaPrincipal")
	private String SaldoCuentaPrincipal;

	@XmlElement(name = "SaldoDispActual")
	private String SaldoDispActual;

	@XmlElement(name = "SaldoSigDispActual")
	private String SaldoSigDispActual;

	@XmlElement(name = "SaldoFechaUltPago")
	private String SaldoFechaUltPago;

	@XmlElement(name = "SaldoFechaUltFact")
	private String SaldoFechaUltFact;

	@XmlElement(name = "SaldoFechaApertura")
	private String SaldoFechaApertura;

	@XmlElement(name = "SaldoFormaPago")
	private String SaldoFormaPago;

	@XmlElement(name = "SaldoPuntosPlata")
	private String SaldoPuntosPlata;
	//
	@XmlElement(name = "SaldoSigPuntosPlata")
	private String SaldoSigPuntosPlata;

	@XmlElement(name = "SaldoPuntosPlataCons")
	private String SaldoPuntosPlataCons;

	@XmlElement(name = "SaldoSigPuntosPlataCons")
	private String SaldoSigPuntosPlataCons;

	@XmlElement(name = "SaldoPagoMinimito")
	private String SaldoPagoMinimito;

	@XmlElement(name = "SaldoContable")
	private String SaldoContable;

	@XmlElement(name = "SaldoSigContable")
	private String SaldoSigContable;

	@XmlElement(name = "SaldoDiasMora")
	private String SaldoDiasMora;

	@XmlElement(name = "SaldoImporteMora")
	private String SaldoImporteMora;

	@XmlElement(name = "SaldoCalificacionCliente")
	private String SaldoCalificacionCliente;

	@XmlElement(name = "SaldoIndCambioPin")
	private String SaldoIndCambioPin;

	@XmlElement(name = "SaldoNumSeguimiento")
	private String SaldoNumSeguimiento;

	@XmlElement(name = "SaldoCodBonus")
	private String SaldoCodBonus;

	@XmlElement(name = "SaldoIndNominada")
	private String SaldoIndNominada;

	public String getCodEmisor() {
		return CodEmisor;
	}

	public void setCodEmisor(String codEmisor) {
		CodEmisor = codEmisor;
	}

	public String getCodUsuario() {
		return CodUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		CodUsuario = codUsuario;
	}

	public String getNumTerminal() {
		return NumTerminal;
	}

	public void setNumTerminal(String numTerminal) {
		NumTerminal = numTerminal;
	}

	public String getNumTarjetaMonedero() {
		return NumTarjetaMonedero;
	}

	public void setNumTarjetaMonedero(String numTarjetaMonedero) {
		NumTarjetaMonedero = numTarjetaMonedero;
	}

	public String getNumReferencia() {
		return NumReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		NumReferencia = numReferencia;
	}

	public String getFechaExpiracion() {
		return FechaExpiracion;
	}

	public void setFechaExpiracion(String fechaExpiracion) {
		FechaExpiracion = fechaExpiracion;
	}

	public String getComercio() {
		return Comercio;
	}

	public void setComercio(String comercio) {
		Comercio = comercio;
	}

	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
	}

	public String getFechaTxnTerminal() {
		return FechaTxnTerminal;
	}

	public void setFechaTxnTerminal(String fechaTxnTerminal) {
		FechaTxnTerminal = fechaTxnTerminal;
	}

	public String getHoraTxnTerminal() {
		return HoraTxnTerminal;
	}

	public void setHoraTxnTerminal(String horaTxnTerminal) {
		HoraTxnTerminal = horaTxnTerminal;
	}

	public String getReservado() {
		return Reservado;
	}

	public void setReservado(String reservado) {
		Reservado = reservado;
	}

	public String getIdTransaccion() {
		return IdTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		IdTransaccion = idTransaccion;
	}

	public String getCodRespuesta() {
		return CodRespuesta;
	}

	public void setCodRespuesta(String codRespuesta) {
		CodRespuesta = codRespuesta;
	}

	public String getDescRespuesta() {
		return DescRespuesta;
	}

	public void setDescRespuesta(String descRespuesta) {
		DescRespuesta = descRespuesta;
	}

	public String getCodAutorizacion() {
		return CodAutorizacion;
	}

	public void setCodAutorizacion(String codAutorizacion) {
		CodAutorizacion = codAutorizacion;
	}

	public String getSaldoMoneda() {
		return SaldoMoneda;
	}

	public void setSaldoMoneda(String saldoMoneda) {
		SaldoMoneda = saldoMoneda;
	}

	public String getSaldoCodBloqueo() {
		return SaldoCodBloqueo;
	}

	public void setSaldoCodBloqueo(String saldoCodBloqueo) {
		SaldoCodBloqueo = saldoCodBloqueo;
	}

	public String getSaldoDescBloqueo() {
		return SaldoDescBloqueo;
	}

	public void setSaldoDescBloqueo(String saldoDescBloqueo) {
		SaldoDescBloqueo = saldoDescBloqueo;
	}

	public String getSaldoNombreTarjeta() {
		return SaldoNombreTarjeta;
	}

	public void setSaldoNombreTarjeta(String saldoNombreTarjeta) {
		SaldoNombreTarjeta = saldoNombreTarjeta;
	}

	public String getSaldoFechaExpiracion() {
		return SaldoFechaExpiracion;
	}

	public void setSaldoFechaExpiracion(String saldoFechaExpiracion) {
		SaldoFechaExpiracion = saldoFechaExpiracion;
	}

	public String getSaldoLineaCredito() {
		return SaldoLineaCredito;
	}

	public void setSaldoLineaCredito(String saldoLineaCredito) {
		SaldoLineaCredito = saldoLineaCredito;
	}

	public String getSaldoDispConsumo() {
		return SaldoDispConsumo;
	}

	public void setSaldoDispConsumo(String saldoDispConsumo) {
		SaldoDispConsumo = saldoDispConsumo;
	}

	public String getSaldoSigDispConsumo() {
		return SaldoSigDispConsumo;
	}

	public void setSaldoSigDispConsumo(String saldoSigDispConsumo) {
		SaldoSigDispConsumo = saldoSigDispConsumo;
	}

	public String getSaldoEfectivo() {
		return SaldoEfectivo;
	}

	public void setSaldoEfectivo(String saldoEfectivo) {
		SaldoEfectivo = saldoEfectivo;
	}

	public String getSaldoDispEfectivo() {
		return SaldoDispEfectivo;
	}

	public void setSaldoDispEfectivo(String saldoDispEfectivo) {
		SaldoDispEfectivo = saldoDispEfectivo;
	}

	public String getSaldoSigDispEfectivo() {
		return SaldoSigDispEfectivo;
	}

	public void setSaldoSigDispEfectivo(String saldoSigDispEfectivo) {
		SaldoSigDispEfectivo = saldoSigDispEfectivo;
	}

	public String getSaldoPagoMinimo() {
		return SaldoPagoMinimo;
	}

	public void setSaldoPagoMinimo(String saldoPagoMinimo) {
		SaldoPagoMinimo = saldoPagoMinimo;
	}

	public String getSaldoPagoTotal() {
		return SaldoPagoTotal;
	}

	public void setSaldoPagoTotal(String saldoPagoTotal) {
		SaldoPagoTotal = saldoPagoTotal;
	}

	public String getSaldoPagoFacturado() {
		return SaldoPagoFacturado;
	}

	public void setSaldoPagoFacturado(String saldoPagoFacturado) {
		SaldoPagoFacturado = saldoPagoFacturado;
	}

	public String getSaldoFechaLimPago() {
		return SaldoFechaLimPago;
	}

	public void setSaldoFechaLimPago(String saldoFechaLimPago) {
		SaldoFechaLimPago = saldoFechaLimPago;
	}

	public String getSaldoCuentaPrincipal() {
		return SaldoCuentaPrincipal;
	}

	public void setSaldoCuentaPrincipal(String saldoCuentaPrincipal) {
		SaldoCuentaPrincipal = saldoCuentaPrincipal;
	}

	public String getSaldoDispActual() {
		return SaldoDispActual;
	}

	public void setSaldoDispActual(String saldoDispActual) {
		SaldoDispActual = saldoDispActual;
	}

	public String getSaldoSigDispActual() {
		return SaldoSigDispActual;
	}

	public void setSaldoSigDispActual(String saldoSigDispActual) {
		SaldoSigDispActual = saldoSigDispActual;
	}

	public String getSaldoFechaUltPago() {
		return SaldoFechaUltPago;
	}

	public void setSaldoFechaUltPago(String saldoFechaUltPago) {
		SaldoFechaUltPago = saldoFechaUltPago;
	}

	public String getSaldoFechaUltFact() {
		return SaldoFechaUltFact;
	}

	public void setSaldoFechaUltFact(String saldoFechaUltFact) {
		SaldoFechaUltFact = saldoFechaUltFact;
	}

	public String getSaldoFechaApertura() {
		return SaldoFechaApertura;
	}

	public void setSaldoFechaApertura(String saldoFechaApertura) {
		SaldoFechaApertura = saldoFechaApertura;
	}

	public String getSaldoFormaPago() {
		return SaldoFormaPago;
	}

	public void setSaldoFormaPago(String saldoFormaPago) {
		SaldoFormaPago = saldoFormaPago;
	}

	public String getSaldoPuntosPlata() {
		return SaldoPuntosPlata;
	}

	public void setSaldoPuntosPlata(String saldoPuntosPlata) {
		SaldoPuntosPlata = saldoPuntosPlata;
	}

	public String getSaldoSigPuntosPlata() {
		return SaldoSigPuntosPlata;
	}

	public void setSaldoSigPuntosPlata(String saldoSigPuntosPlata) {
		SaldoSigPuntosPlata = saldoSigPuntosPlata;
	}

	public String getSaldoPuntosPlataCons() {
		return SaldoPuntosPlataCons;
	}

	public void setSaldoPuntosPlataCons(String saldoPuntosPlataCons) {
		SaldoPuntosPlataCons = saldoPuntosPlataCons;
	}

	public String getSaldoSigPuntosPlataCons() {
		return SaldoSigPuntosPlataCons;
	}

	public void setSaldoSigPuntosPlataCons(String saldoSigPuntosPlataCons) {
		SaldoSigPuntosPlataCons = saldoSigPuntosPlataCons;
	}

	public String getSaldoPagoMinimito() {
		return SaldoPagoMinimito;
	}

	public void setSaldoPagoMinimito(String saldoPagoMinimito) {
		SaldoPagoMinimito = saldoPagoMinimito;
	}

	public String getSaldoContable() {
		return SaldoContable;
	}

	public void setSaldoContable(String saldoContable) {
		SaldoContable = saldoContable;
	}

	public String getSaldoSigContable() {
		return SaldoSigContable;
	}

	public void setSaldoSigContable(String saldoSigContable) {
		SaldoSigContable = saldoSigContable;
	}

	public String getSaldoDiasMora() {
		return SaldoDiasMora;
	}

	public void setSaldoDiasMora(String saldoDiasMora) {
		SaldoDiasMora = saldoDiasMora;
	}

	public String getSaldoImporteMora() {
		return SaldoImporteMora;
	}

	public void setSaldoImporteMora(String saldoImporteMora) {
		SaldoImporteMora = saldoImporteMora;
	}

	public String getSaldoCalificacionCliente() {
		return SaldoCalificacionCliente;
	}

	public void setSaldoCalificacionCliente(String saldoCalificacionCliente) {
		SaldoCalificacionCliente = saldoCalificacionCliente;
	}

	public String getSaldoIndCambioPin() {
		return SaldoIndCambioPin;
	}

	public void setSaldoIndCambioPin(String saldoIndCambioPin) {
		SaldoIndCambioPin = saldoIndCambioPin;
	}

	public String getSaldoNumSeguimiento() {
		return SaldoNumSeguimiento;
	}

	public void setSaldoNumSeguimiento(String saldoNumSeguimiento) {
		SaldoNumSeguimiento = saldoNumSeguimiento;
	}

	public String getSaldoCodBonus() {
		return SaldoCodBonus;
	}

	public void setSaldoCodBonus(String saldoCodBonus) {
		SaldoCodBonus = saldoCodBonus;
	}

	public String getSaldoIndNominada() {
		return SaldoIndNominada;
	}

	public void setSaldoIndNominada(String saldoIndNominada) {
		SaldoIndNominada = saldoIndNominada;
	}

}
