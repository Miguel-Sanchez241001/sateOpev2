package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.Date;

public class Cargo {
	private Date fechaCorte;
	private Date fechaProceso;
	private String numeroCuenta;
	private Double montoCargado;
	private Double montoPendiente;
	private Double saldoInicial;
	private Double saldoFinal;

	public Date getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

	public Date getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getMontoCargado() {
		return montoCargado;
	}

	public void setMontoCargado(Double montoCargado) {
		this.montoCargado = montoCargado;
	}

	public Double getMontoPendiente() {
		return montoPendiente;
	}

	public void setMontoPendiente(Double montoPendiente) {
		this.montoPendiente = montoPendiente;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Double getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(Double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

}
