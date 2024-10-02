package pe.bn.com.sate.ope.application.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.DatosTarjetaCliente;
import pe.bn.com.sate.ope.transversal.dto.sate.EstadoTarjeta;
import pe.bn.com.sate.ope.transversal.dto.sate.Tarjeta;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.enums.CodDocumentoWebservice;
import pe.bn.com.sate.ope.transversal.util.enums.MotivosBloqueoCuenta;
import pe.bn.com.sate.ope.transversal.util.enums.MotivosBloqueoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoBusqueda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstadoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjetaNegocio;

public class CambiarEstadoTarjetaModel {

	private List<TipoBusqueda> listaTipoBusqueda;
	private String tipoBusqueda;
	private String numDocumento;

	private DatosTarjetaCliente datosTarjetaCliente;

	private Tarjeta tarjetaSeleccionada;

	private boolean busquedaRealizada;

	private boolean busquedaBloqueoTarjeta;

	private List<MotivosBloqueoTarjeta> motivosBloqueoTarjetas;

	private List<MotivosBloqueoCuenta> motivosBloqueoCuenta;

	private EstadoTarjeta estadoTarjeta;

	private String motivoSeleccionado;

	private String estadoCuentaSeleccionado;

	private String tipoBloqueoSeleccionado;

	public CambiarEstadoTarjetaModel() {
		listaTipoBusqueda = Arrays.asList(TipoBusqueda.values());
		datosTarjetaCliente = new DatosTarjetaCliente();
		// motivosBloqueoTarjetas =
		// Arrays.asList(MotivosBloqueoTarjeta.values());
		tipoBusqueda = "N";
		tipoBloqueoSeleccionado = "T";
	}

	public String getMotivoSeleccionado() {
		return motivoSeleccionado;
	}

	public void setMotivoSeleccionado(String motivoSeleccionado) {
		this.motivoSeleccionado = motivoSeleccionado;
	}

	public EstadoTarjeta getEstadoTarjeta() {
		return estadoTarjeta;
	}

	public void setEstadoTarjeta(EstadoTarjeta estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}

	public List<MotivosBloqueoTarjeta> getMotivosBloqueoTarjetas() {
		return motivosBloqueoTarjetas;
	}

	public void setMotivosBloqueoTarjetas(
			List<MotivosBloqueoTarjeta> motivosBloqueoTarjetas) {
		this.motivosBloqueoTarjetas = motivosBloqueoTarjetas;
	}

	public boolean isBusquedaBloqueoTarjeta() {
		return busquedaBloqueoTarjeta;
	}

	public void setBusquedaBloqueoTarjeta(boolean busquedaBloqueoTarjeta) {
		this.busquedaBloqueoTarjeta = busquedaBloqueoTarjeta;
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

	public Tarjeta getTarjetaSeleccionada() {
		return tarjetaSeleccionada;
	}

	public void setTarjetaSeleccionada(Tarjeta tarjetaSeleccionada) {
		this.tarjetaSeleccionada = tarjetaSeleccionada;
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

	public String descripcionMotivoBloqueotarjeta(String codigo) {
		return MotivosBloqueoTarjeta.descripcionMotivoBloqueoTarjeta(codigo);
	}

	public String descripcionNumeroTarjeta(String numTarjeta) {
		return UsefulWebApplication.formatoNumTarjeta(numTarjeta);
	}

	public void iniciarEstadoTarjeta() {
		estadoTarjeta = new EstadoTarjeta();
		if (busquedaBloqueoTarjeta) {
			estadoTarjeta.setFechaRegistro(new Date());
			estadoTarjeta
					.setEstado(TipoEstadoTarjeta.TARJETA_ACTIVADA.getCod());
			estadoTarjeta.setMotivo(motivoSeleccionado);
			estadoTarjeta.setUsuarioRegistro(UsefulWebApplication
					.obtenerUsuario().getUsername());
			estadoTarjeta
					.setIdTarjeta(datosTarjetaCliente.getTarjeta().getId());
		} else {
			estadoTarjeta.setFechaRegistro(new Date());
			estadoTarjeta.setEstado(TipoEstadoTarjeta.TARJETA_BLOQUEADA
					.getCod());
			estadoTarjeta.setMotivo(motivoSeleccionado);
			estadoTarjeta.setUsuarioRegistro(UsefulWebApplication
					.obtenerUsuario().getUsername());
			estadoTarjeta
					.setIdTarjeta(datosTarjetaCliente.getTarjeta().getId());
		}
	}

	public void inicializarFormulario() {
		datosTarjetaCliente = new DatosTarjetaCliente();
		motivoSeleccionado = null;
		numDocumento = null;
		tipoBusqueda = null;
		busquedaRealizada = false;
		busquedaBloqueoTarjeta = false;
		estadoTarjeta = null;
		estadoCuentaSeleccionado = null;
		tipoBusqueda = "N";
		tipoBloqueoSeleccionado = "T";

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

	public List<MotivosBloqueoCuenta> getMotivosBloqueoCuenta() {
		return motivosBloqueoCuenta;
	}

	public void setMotivosBloqueoCuenta(
			List<MotivosBloqueoCuenta> motivosBloqueoCuenta) {
		this.motivosBloqueoCuenta = motivosBloqueoCuenta;
	}

	public String getEstadoCuentaSeleccionado() {
		return estadoCuentaSeleccionado;
	}

	public void setEstadoCuentaSeleccionado(String estadoCuentaSeleccionado) {
		this.estadoCuentaSeleccionado = estadoCuentaSeleccionado;
	}

	public String getTipoBloqueoSeleccionado() {
		return tipoBloqueoSeleccionado;
	}

	public void setTipoBloqueoSeleccionado(String tipoBloqueoSeleccionado) {
		this.tipoBloqueoSeleccionado = tipoBloqueoSeleccionado;
	}

	public String valorBoton() {
//MGL
		if (tipoBloqueoSeleccionado.equals("T"))
			if (datosTarjetaCliente.getTarjeta().getEstado()
					.equals(TipoEstadoTarjeta.TARJETA_BLOQUEADA.getCod()))
				return "Activar";
			else
				return "Bloquear";
		else if (datosTarjetaCliente.getTarjeta().getEstadoCuenta()
				.equals(MotivosBloqueoCuenta.TEMPORAL.getId()))
			return "Activar";
		else
			return "Bloquear";

	}
	
	public String obtenerMotivo(String id,String descripcion){
		return (id+"-"+descripcion);
	}
	
	public String obtenerEstadoCuenta(String id,String descripcion){
		return (id+"-"+descripcion);
	}
}
