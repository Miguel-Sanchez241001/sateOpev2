package pe.bn.com.sate.ope.application.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Asignacion;
import pe.bn.com.sate.ope.transversal.dto.sate.DatosTarjetaCliente;
import pe.bn.com.sate.ope.transversal.dto.sate.MovimientoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoBusqueda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoMoneda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoMontoMC;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjetaMC;

public class ConsultarMovimientosModel {

	private Date fechaInicio;
	private Date fechaFin;
	private String numeroTarjeta;
	private List<TipoBusqueda> listaTipoBusqueda;
	private String tipoBusqueda;
	
	
	private Asignacion asignacionSeleccionada;
	
	
	private List<Asignacion> asignacionesTotal;
	
	
	
	
	
	
	
	public Asignacion getAsignacionSeleccionada() {
		return asignacionSeleccionada;
	}

	public void setAsignacionSeleccionada(Asignacion asignacionSeleccionada) {
		this.asignacionSeleccionada = asignacionSeleccionada;
	}

	public List<Asignacion> getAsignacionesTotal() {
		return asignacionesTotal;
	}

	public void setAsignacionesTotal(List<Asignacion> asignacionesTotal) {
		this.asignacionesTotal = asignacionesTotal;
	}

	private List<MovimientoTarjeta> movimientosTarjeta;
	private DatosTarjetaCliente datosTarjetaCliente;

	public ConsultarMovimientosModel() {
		listaTipoBusqueda = Arrays.asList(TipoBusqueda.values());
		datosTarjetaCliente = new DatosTarjetaCliente();
		asignacionesTotal = new ArrayList<>();
	}

	public void limpiarMovimientosTarjeta() {
		if (movimientosTarjeta != null)
			movimientosTarjeta.clear();
	}

	public List<MovimientoTarjeta> getMovimientosTarjeta() {
		return movimientosTarjeta;
	}

	public void setMovimientosTarjeta(List<MovimientoTarjeta> movimientosTarjeta) {
		this.movimientosTarjeta = movimientosTarjeta;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String tipoMontoLetras(String tipoMonto) {
		return TipoMontoMC.enLetras(tipoMonto);
	}

	public String tipoTarjetaLetras(String tipoTarjeta) {
		return TipoTarjetaMC.enLetras(tipoTarjeta);
	}

	public String tipoMonedaLetras(String tipoMoneda) {
		return TipoMoneda.decripcionTipoMoneda(tipoMoneda);
	}

	public boolean existenMovimientosTarjeta() {
		return (movimientosTarjeta != null && movimientosTarjeta.size() > 0) ? true
				: false;
	}

	public List<TipoBusqueda> getListaTipoBusqueda() {
		return listaTipoBusqueda;
	}

	public void setListaTipoBusqueda(List<TipoBusqueda> listaTipoBusqueda) {
		this.listaTipoBusqueda = listaTipoBusqueda;
	}

	public String getTipoBusqueda() {
		return tipoBusqueda;
	}

	public void setTipoBusqueda(String tipoBusqueda) {
		this.tipoBusqueda = tipoBusqueda;
	}

	public DatosTarjetaCliente getDatosTarjetaCliente() {
		return datosTarjetaCliente;
	}

	public void setDatosTarjetaCliente(DatosTarjetaCliente datosTarjetaCliente) {
		this.datosTarjetaCliente = datosTarjetaCliente;
	}
	
	public int obtenerBusquedaLength() {

		return TipoBusqueda.obtenerLength(tipoBusqueda);
	}

	public String obtenerBusquedaValidatorMessage() {
		return "El " + TipoBusqueda.tipoBusquedaLetras(tipoBusqueda)
				+ " debe  tener " + TipoBusqueda.obtenerLength(tipoBusqueda)
				+ " dígitos";
	}
	public String obtenerBusquedaRequiredMessage() {
		return "Ingrese un número de "
				+ TipoBusqueda.tipoBusquedaLetras(tipoBusqueda);
	}

}
