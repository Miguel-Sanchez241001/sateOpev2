package pe.bn.com.sate.ope.application.model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.DatosTarjetaCliente;
import pe.bn.com.sate.ope.transversal.dto.sate.EstadoTarjeta;
import pe.bn.com.sate.ope.transversal.dto.sate.Tarjeta;
import pe.bn.com.sate.ope.transversal.util.NumeroALetras;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.CodDocumentoWebservice;
import pe.bn.com.sate.ope.transversal.util.enums.DisposicionEfectivo;
import pe.bn.com.sate.ope.transversal.util.enums.OperadorMovil;
import pe.bn.com.sate.ope.transversal.util.enums.TipoBusqueda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoDocumento;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstadoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoMoneda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjetaNegocio;

public class BuscarTarjetaModel {

	private List<TipoBusqueda> listaTipoBusqueda;
	private String tipoBusqueda;
	private String numDocumento;

	private List<OperadorMovil> listaOperadorMovil;
	private DatosTarjetaCliente datosTarjetaCliente;

	private Tarjeta tarjetaSeleccionada;

	private boolean busquedaRealizada;

	private boolean tipoOperacionCancelar;

	private boolean tipoOperacionActualizar;

	private EstadoTarjeta estadoTarjeta;

	public BuscarTarjetaModel() {
		listaTipoBusqueda = Arrays.asList(TipoBusqueda.values());
		datosTarjetaCliente = new DatosTarjetaCliente();
		listaOperadorMovil = Arrays.asList(OperadorMovil.values());
		tipoBusqueda = "N";
	}

	public EstadoTarjeta getEstadoTarjeta() {
		return estadoTarjeta;
	}

	public void setEstadoTarjeta(EstadoTarjeta estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}

	public boolean isTipoOperacionCancelar() {
		return tipoOperacionCancelar;
	}

	public void setTipoOperacionCancelar(boolean tipoOperacionCancelar) {
		this.tipoOperacionCancelar = tipoOperacionCancelar;
	}

	public boolean isTipoOperacionActualizar() {
		return tipoOperacionActualizar;
	}

	public void setTipoOperacionActualizar(boolean tipoOperacionActualizar) {
		this.tipoOperacionActualizar = tipoOperacionActualizar;
	}

	public Tarjeta getTarjetaSeleccionada() {
		return tarjetaSeleccionada;
	}

	public void setTarjetaSeleccionada(Tarjeta tarjetaSeleccionada) {
		this.tarjetaSeleccionada = tarjetaSeleccionada;
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

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public DatosTarjetaCliente getDatosTarjetaCliente() {
		return datosTarjetaCliente;
	}

	public void setDatosTarjetaCliente(DatosTarjetaCliente datosTarjetaCliente) {
		this.datosTarjetaCliente = datosTarjetaCliente;
	}

	public boolean isBusquedaRealizada() {
		return busquedaRealizada;
	}

	public void setBusquedaRealizada(boolean busquedaRealizada) {
		this.busquedaRealizada = busquedaRealizada;
	}

	public List<OperadorMovil> getListaOperadorMovil() {
		return listaOperadorMovil;
	}

	public void setListaOperadorMovil(List<OperadorMovil> listaOperadorMovil) {
		this.listaOperadorMovil = listaOperadorMovil;
	}

	public String descripcionTipoDocumento(String codigo) {
		return CodDocumentoWebservice.descripcionCodDocumentoWebservice(codigo);
	}

	public String descripcionTipoTarjeta(String codigo, String diseno) {
		return TipoTarjetaNegocio.descripcionTipotarjeta(codigo, diseno);
	}

	public String descripcionEstadoTarjeta(String codigo) {
		return TipoEstadoTarjeta.descripcionTipoEstadoTarjeta(codigo);
	}

	public String descripcionTipoMoneda(String id) {
		return TipoMoneda.decripcionTipoMoneda(id);
	}

	public String descripcionDisposicionEfectivo(String codigo) {
		return DisposicionEfectivo.descripcionDisposicionEfectivo(codigo);
	}

	public String descripcionNumeroTarjeta(String numTarjeta) {
		return UsefulWebApplication.formatoNumTarjeta(numTarjeta);
	}

	public void iniciarEstadoTarjeta() {
		estadoTarjeta = new EstadoTarjeta();
		estadoTarjeta.setFechaRegistro(new Date());
		estadoTarjeta.setEstado(TipoEstadoTarjeta.SOLICITUD_TARJETA_CANCELADA
				.getCod());
		estadoTarjeta.setUsuarioRegistro(UsefulWebApplication.obtenerUsuario()
				.getUsername());
		estadoTarjeta.setIdTarjeta(datosTarjetaCliente.getTarjeta().getId());

	}

	public String formatoNroAutorizacion(String nroAutorizacion) {
		return (nroAutorizacion == null || nroAutorizacion.isEmpty()) ? ConstantesGenerales.SIMBOLO_VACIO
				: nroAutorizacion;
	}

	public String formatoFechaAutorizacion(Date fechaAutorizacion) {
		return fechaAutorizacion == null ? ConstantesGenerales.SIMBOLO_VACIO
				: new SimpleDateFormat("dd/MM/yyyy").format(fechaAutorizacion);
	}

	public String formatoUsuarioCreador(String usuarioCreador) {
		return (usuarioCreador == null || usuarioCreador.isEmpty()) ? ConstantesGenerales.SIMBOLO_VACIO
				: usuarioCreador;
	}

	public String formatoFecha(Date fecha) {
		return (fecha == null) ? ConstantesGenerales.SIMBOLO_VACIO
				: new SimpleDateFormat("dd/MM/yyyy").format(fecha);
	}

	public String formatoMonto(Double monto) {
		return (monto == null) ? ConstantesGenerales.SIMBOLO_VACIO
				: NumeroALetras.numeroFormateado(monto);
	}

	public void inicializarFormulario() {
		datosTarjetaCliente = new DatosTarjetaCliente();
		numDocumento = null;
		tipoBusqueda = null;
		busquedaRealizada = false;
		estadoTarjeta = null;
		tarjetaSeleccionada = null;
		tipoOperacionCancelar = false;
		tipoOperacionActualizar = false;
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
