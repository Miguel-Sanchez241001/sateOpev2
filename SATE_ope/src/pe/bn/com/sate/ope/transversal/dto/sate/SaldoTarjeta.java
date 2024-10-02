package pe.bn.com.sate.ope.transversal.dto.sate;

import pe.bn.com.sate.ope.transversal.dto.ws.ConsultaSaldos;
import pe.bn.com.sate.ope.transversal.util.Fecha;

import java.util.Date;

public class SaldoTarjeta {

	private Date fechaExpiracion;
	private Double lineaCredito;
	private Double dispConsumo;
	private String sigDispConsumo;
	private Double efectivo;
	private Double dispEfectivo;
	private String sigDispEfectivo;
	private Double pagoMinimo;
	private Double pagoTotal;
	private Double pagoFacturado;
	private Date fechaLimPago;
	private String cuentaPrincipal;
	private Double dispActual;
	private String sigDispActual;
	private Date fechaUltPago;
	private Date fechaUltFact;
	private Date fechaApertura;
	private String formaPago;
	private String puntosPlata;
	private String sigPuntosPlata;
	private String puntosPlataCons;
	private String sigPuntosPlataCons;
	private Double pagoMinimito;
	private Double contable;
	private String sigContable;
	private int diasMora;
	private Double importeMora;
	private String calificacionCliente;
	private int indCambioPin;
	private String numSeguimiento;
	private String codBonus;
	private int indNominada;

	public SaldoTarjeta(ConsultaSaldos consultaSaldos) {
		fechaExpiracion = Fecha.transformarADateMC(consultaSaldos.getFechaExpiracion());
		lineaCredito=Double.valueOf(consultaSaldos.getSaldoLineaCredito());
		dispConsumo=Double.valueOf(consultaSaldos.getSaldoDispConsumo());
		sigDispConsumo=consultaSaldos.getSaldoSigDispConsumo();
		efectivo=Double.valueOf(consultaSaldos.getSaldoDispEfectivo());
		dispEfectivo=Double.valueOf(consultaSaldos.getSaldoDispEfectivo());
		sigDispEfectivo=consultaSaldos.getSaldoSigDispEfectivo();
		pagoMinimo=Double.valueOf(consultaSaldos.getSaldoPagoMinimo());
		pagoTotal=Double.valueOf(consultaSaldos.getSaldoPagoTotal());
		pagoFacturado=Double.valueOf(consultaSaldos.getSaldoPagoFacturado());
		fechaLimPago=Fecha.transformarADateMC(consultaSaldos.getSaldoFechaLimPago());
		cuentaPrincipal=consultaSaldos.getSaldoCuentaPrincipal();
		dispActual=Double.valueOf(consultaSaldos.getSaldoDispActual());
		sigDispActual=consultaSaldos.getSaldoSigDispActual();
		fechaUltPago=Fecha.transformarADateMC(consultaSaldos.getSaldoFechaUltPago());
		fechaUltFact=Fecha.transformarADateMC(consultaSaldos.getSaldoFechaUltFact());
		fechaApertura=Fecha.transformarADateMC(consultaSaldos.getSaldoFechaApertura());
		formaPago=consultaSaldos.getSaldoFormaPago();
		puntosPlataCons=consultaSaldos.getSaldoPuntosPlataCons();
		sigPuntosPlataCons=consultaSaldos.getSaldoSigPuntosPlataCons();
		puntosPlataCons=consultaSaldos.getSaldoPuntosPlataCons();
		sigPuntosPlataCons=consultaSaldos.getSaldoSigPuntosPlataCons();
		pagoMinimito=Double.valueOf(consultaSaldos.getSaldoPagoMinimito());
		contable=Double.valueOf(consultaSaldos.getSaldoContable());
		sigContable=consultaSaldos.getSaldoSigContable();
		diasMora=Integer.valueOf(consultaSaldos.getSaldoDiasMora());
		importeMora=Double.valueOf(consultaSaldos.getSaldoImporteMora());
		calificacionCliente=consultaSaldos.getSaldoCalificacionCliente();
		indCambioPin=Integer.valueOf(consultaSaldos.getSaldoIndCambioPin());
		numSeguimiento=consultaSaldos.getSaldoNumSeguimiento();
		codBonus=consultaSaldos.getSaldoCodBonus();
		indNominada=Integer.valueOf(consultaSaldos.getSaldoIndNominada());
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public Double getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(Double lineaCredito) {
		this.lineaCredito = lineaCredito;
	}

	public Double getDispConsumo() {
		return dispConsumo;
	}

	public void setDispConsumo(Double dispConsumo) {
		this.dispConsumo = dispConsumo;
	}

	public String getSigDispConsumo() {
		return sigDispConsumo;
	}

	public void setSigDispConsumo(String sigDispConsumo) {
		this.sigDispConsumo = sigDispConsumo;
	}

	public Double getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(Double efectivo) {
		this.efectivo = efectivo;
	}

	public Double getDispEfectivo() {
		return dispEfectivo;
	}

	public void setDispEfectivo(Double dispEfectivo) {
		this.dispEfectivo = dispEfectivo;
	}

	public String getSigDispEfectivo() {
		return sigDispEfectivo;
	}

	public void setSigDispEfectivo(String sigDispEfectivo) {
		this.sigDispEfectivo = sigDispEfectivo;
	}

	public Double getPagoMinimo() {
		return pagoMinimo;
	}

	public void setPagoMinimo(Double pagoMinimo) {
		this.pagoMinimo = pagoMinimo;
	}

	public Double getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(Double pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	public Double getPagoFacturado() {
		return pagoFacturado;
	}

	public void setPagoFacturado(Double pagoFacturado) {
		this.pagoFacturado = pagoFacturado;
	}

	public Date getFechaLimPago() {
		return fechaLimPago;
	}

	public void setFechaLimPago(Date fechaLimPago) {
		this.fechaLimPago = fechaLimPago;
	}

	public String getCuentaPrincipal() {
		return cuentaPrincipal;
	}

	public void setCuentaPrincipal(String cuentaPrincipal) {
		this.cuentaPrincipal = cuentaPrincipal;
	}

	public Double getDispActual() {
		return dispActual;
	}

	public void setDispActual(Double dispActual) {
		this.dispActual = dispActual;
	}

	public String getSigDispActual() {
		return sigDispActual;
	}

	public void setSigDispActual(String sigDispActual) {
		this.sigDispActual = sigDispActual;
	}

	public Date getFechaUltPago() {
		return fechaUltPago;
	}

	public void setFechaUltPago(Date fechaUltPago) {
		this.fechaUltPago = fechaUltPago;
	}

	public Date getFechaUltFact() {
		return fechaUltFact;
	}

	public void setFechaUltFact(Date fechaUltFact) {
		this.fechaUltFact = fechaUltFact;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getPuntosPlata() {
		return puntosPlata;
	}

	public void setPuntosPlata(String puntosPlata) {
		this.puntosPlata = puntosPlata;
	}

	public String getSigPuntosPlata() {
		return sigPuntosPlata;
	}

	public void setSigPuntosPlata(String sigPuntosPlata) {
		this.sigPuntosPlata = sigPuntosPlata;
	}

	public String getPuntosPlataCons() {
		return puntosPlataCons;
	}

	public void setPuntosPlataCons(String puntosPlataCons) {
		this.puntosPlataCons = puntosPlataCons;
	}

	public String getSigPuntosPlataCons() {
		return sigPuntosPlataCons;
	}

	public void setSigPuntosPlataCons(String sigPuntosPlataCons) {
		this.sigPuntosPlataCons = sigPuntosPlataCons;
	}

	public Double getPagoMinimito() {
		return pagoMinimito;
	}

	public void setPagoMinimito(Double pagoMinimito) {
		this.pagoMinimito = pagoMinimito;
	}

	public Double getContable() {
		return contable;
	}

	public void setContable(Double contable) {
		this.contable = contable;
	}

	public String getSigContable() {
		return sigContable;
	}

	public void setSigContable(String sigContable) {
		this.sigContable = sigContable;
	}

	public int getDiasMora() {
		return diasMora;
	}

	public void setDiasMora(int diasMora) {
		this.diasMora = diasMora;
	}

	public Double getImporteMora() {
		return importeMora;
	}

	public void setImporteMora(Double importeMora) {
		this.importeMora = importeMora;
	}

	public String getCalificacionCliente() {
		return calificacionCliente;
	}

	public void setCalificacionCliente(String calificacionCliente) {
		this.calificacionCliente = calificacionCliente;
	}

	public int getIndCambioPin() {
		return indCambioPin;
	}

	public void setIndCambioPin(int indCambioPin) {
		this.indCambioPin = indCambioPin;
	}

	public String getNumSeguimiento() {
		return numSeguimiento;
	}

	public void setNumSeguimiento(String numSeguimiento) {
		this.numSeguimiento = numSeguimiento;
	}

	public String getCodBonus() {
		return codBonus;
	}

	public void setCodBonus(String codBonus) {
		this.codBonus = codBonus;
	}

	public int getIndNominada() {
		return indNominada;
	}

	public void setIndNominada(int indNominada) {
		this.indNominada = indNominada;
	}
}
