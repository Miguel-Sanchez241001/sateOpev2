package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.Date;

public class MovimientoTarjeta {

	private String id;
	private Date fecha;
	private String descripcionTransaccion;
	private String moneda;
	private String monto;
	private String tipoMonto; 
	private String tipoTarjeta; 

	public MovimientoTarjeta() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcionTransaccion() {
		return descripcionTransaccion;
	}

	public void setDescripcionTransaccion(String descripcionTransaccion) {
		this.descripcionTransaccion = descripcionTransaccion;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getTipoMonto() {
		return tipoMonto;
	}

	public void setTipoMonto(String tipoMonto) {
		this.tipoMonto = tipoMonto;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
}
