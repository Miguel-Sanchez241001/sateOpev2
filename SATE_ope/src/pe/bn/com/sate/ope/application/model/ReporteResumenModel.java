package pe.bn.com.sate.ope.application.model;

import java.util.Arrays;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Cargo;
import pe.bn.com.sate.ope.transversal.dto.sate.TarjetaResumen;
import pe.bn.com.sate.ope.transversal.dto.sate.Transaccion;
import pe.bn.com.sate.ope.transversal.util.Fecha;
import pe.bn.com.sate.ope.transversal.util.enums.TipoDocumento;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstadoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoReporteResumen;

public class ReporteResumenModel {

	private List<TipoReporteResumen> listaReporteResumen;
	private List<String> listaFechaCorte;
	private int tipoReporteSeleccionado;
	private String fechaCorteInicialSeleccionada;
	private String fechaCorteFinalSeleccionada;

	private List<TarjetaResumen> listaTarjetas;
	private List<Transaccion> listaTransacciones;
	private List<Cargo> listaCargos;

	public ReporteResumenModel() {
		listaFechaCorte = Fecha.inicializarListaFechaCorte();
		listaReporteResumen = Arrays.asList(TipoReporteResumen.values());
	}

	public boolean validarFechasCorte() {
		if (Fecha.transformarADate(fechaCorteInicialSeleccionada).after(
				Fecha.transformarADate(fechaCorteFinalSeleccionada)))
			return false;
		else
			return true;
	}

	public String estadoEnLetras(String estado) {
		return TipoEstadoTarjeta.enLetras(estado);
	}

	public String tipoDocumentoLetras(String tipoDocumento) {
		return TipoDocumento.tipoDocumentoBducLetras(tipoDocumento);

	}

	public List<TipoReporteResumen> getListaReporteResumen() {
		return listaReporteResumen;
	}

	public void setListaReporteResumen(
			List<TipoReporteResumen> listaReporteResumen) {
		this.listaReporteResumen = listaReporteResumen;
	}

	public List<String> getListaFechaCorte() {
		return listaFechaCorte;
	}

	public void setListaFechaCorte(List<String> listaFechaCorte) {
		this.listaFechaCorte = listaFechaCorte;
	}

	public int getTipoReporteSeleccionado() {
		return tipoReporteSeleccionado;
	}

	public void setTipoReporteSeleccionado(int tipoReporteSeleccionado) {
		this.tipoReporteSeleccionado = tipoReporteSeleccionado;
	}

	public String getFechaCorteInicialSeleccionada() {
		return fechaCorteInicialSeleccionada;
	}

	public void setFechaCorteInicialSeleccionada(
			String fechaCorteInicialSeleccionada) {
		this.fechaCorteInicialSeleccionada = fechaCorteInicialSeleccionada;
	}

	public String getFechaCorteFinalSeleccionada() {
		return fechaCorteFinalSeleccionada;
	}

	public void setFechaCorteFinalSeleccionada(
			String fechaCorteFinalSeleccionada) {
		this.fechaCorteFinalSeleccionada = fechaCorteFinalSeleccionada;
	}

	public List<TarjetaResumen> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<TarjetaResumen> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(List<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public List<Cargo> getListaCargos() {
		return listaCargos;
	}

	public void setListaCargos(List<Cargo> listaCargos) {
		this.listaCargos = listaCargos;
	}

}
