package pe.bn.com.sate.ope.application.model;

import java.util.Arrays;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Cliente;
import pe.bn.com.sate.ope.transversal.dto.sate.Tarjeta;
import pe.bn.com.sate.ope.transversal.dto.tablas.Agencia;
import pe.bn.com.sate.ope.transversal.dto.tablas.Ubigeo;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.CodDocumentoWebservice;
import pe.bn.com.sate.ope.transversal.util.enums.EstadoCivil;
import pe.bn.com.sate.ope.transversal.util.enums.OperadorMovil;
import pe.bn.com.sate.ope.transversal.util.enums.TipoDocumento;
import pe.bn.com.sate.ope.transversal.util.enums.TipoMoneda;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjeta;
import pe.bn.com.sate.ope.transversal.util.enums.TipoTarjetaNegocio;

public class SolicitarTarjetaModel {



	/* Variables del formulario datos del cliente */
	private String tipoDocumentoSeleccionado;
	private String numDocumentoSeleccionado;
	private List<TipoDocumento> listaTipoDocumento;
	private List<OperadorMovil> listaOperadorMovil;
	private Cliente clienteSeleccionado;
	private List<TipoMoneda> listaTipoMoneda;

	/* Variables del formulario datos de la tarjeta */
	private List<TipoTarjetaNegocio> listaTipoTarjetaNegocio;
	private List<TipoTarjeta> listaTipoTarjeta;
	public List<TipoTarjeta> getListaTipoTarjeta() {
		return listaTipoTarjeta;
	}

	public void setListaTipoTarjeta(List<TipoTarjeta> listaTipoTarjeta) {
		this.listaTipoTarjeta = listaTipoTarjeta;
	}
	private List<Ubigeo> departamentos;
	private List<Ubigeo> provincias;
	private List<Ubigeo> distritos;
	private List<Agencia> agenciasBN;
	private Agencia agenciaSeleccionada;
	private boolean esEntregaBN;

	private boolean esEntregaUE;
	private boolean esEntregaReferencia;
	private Tarjeta tarjeta;
	private TipoTarjetaNegocio tipoTarjetaNegocioSeleccionada;
	private TipoTarjeta tipoTarjetaSeleccionada;

	public TipoTarjeta getTipoTarjetaSeleccionada() {
		return tipoTarjetaSeleccionada;
	}

	public void setTipoTarjetaSeleccionada(TipoTarjeta tipoTarjetaSeleccionada) {
		this.tipoTarjetaSeleccionada = tipoTarjetaSeleccionada;
	}
	private int pasoActual;

	private List<EstadoCivil> listaEstadoCivil;

	private boolean personaExiste;

	public SolicitarTarjetaModel() {
		inicializarFormulario();
	}

	public boolean validarDNI() {
		if (clienteSeleccionado != null
				&& clienteSeleccionado.getNroDocumento() != null
				&& clienteSeleccionado.getNroDocumento().equals(
						numDocumentoSeleccionado)) {
			return true;
		} else {
			return false;
		}
	}

	public int obtenerDocumentoLength() {
		return TipoDocumento.obtenerLength(tipoDocumentoSeleccionado);
	}

	public String obtenerDocumentoValidatorMessage() {
		return "El "
				+ TipoDocumento
						.tipoDocumentoBducLetras(tipoDocumentoSeleccionado)
				+ " debe tener "
				+ TipoDocumento.obtenerLength(tipoDocumentoSeleccionado)
				+ " dígitos";
	}

	public String obtenerDocumentoRequiredMessage() {
		return "Ingrese un número de "
				+ TipoDocumento
						.tipoDocumentoBducLetras(tipoDocumentoSeleccionado);
	}

	public boolean isPersonaExiste() {
		return personaExiste;
	}

	public void setPersonaExiste(boolean personaExiste) {
		this.personaExiste = personaExiste;
	}

	public Agencia getAgenciaSeleccionada() {
		return agenciaSeleccionada;
	}

	public void setAgenciaSeleccionada(Agencia agenciaSeleccionada) {
		this.agenciaSeleccionada = agenciaSeleccionada;
	}

	public List<TipoMoneda> getListaTipoMoneda() {
		return listaTipoMoneda;
	}

	public void setListaTipoMoneda(List<TipoMoneda> listaTipoMoneda) {
		this.listaTipoMoneda = listaTipoMoneda;
	}

	public String getTipoDocumentoSeleccionado() {
		return tipoDocumentoSeleccionado;
	}

	public void setTipoDocumentoSeleccionado(String tipoDocumentoSeleccionado) {
		this.tipoDocumentoSeleccionado = tipoDocumentoSeleccionado;
	}

	public List<TipoDocumento> getListaTipoDocumento() {
		return listaTipoDocumento;
	}

	public void setListaTipoDocumento(
			List<TipoDocumento> listaTipoDocumento) {
		this.listaTipoDocumento = listaTipoDocumento;
	}

	public String getNumDocumentoSeleccionado() {
		return numDocumentoSeleccionado;
	}

	public void setNumDocumentoSeleccionado(String numDocumentoSeleccionado) {
		this.numDocumentoSeleccionado = numDocumentoSeleccionado;
	}

	public Cliente getClienteSeleccionado() {
		return clienteSeleccionado;
	}

	public void setClienteSeleccionado(Cliente clienteSeleccionado) {
		this.clienteSeleccionado = clienteSeleccionado;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<OperadorMovil> getListaOperadorMovil() {
		return listaOperadorMovil;
	}

	public void setListaOperadorMovil(List<OperadorMovil> listaOperadorMovil) {
		this.listaOperadorMovil = listaOperadorMovil;
	}

	public List<TipoTarjetaNegocio> getListaTipoTarjetaNegocio() {
		return listaTipoTarjetaNegocio;
	}

	public void setListaTipoTarjetaNegocio(List<TipoTarjetaNegocio> listaTipoTarjeta) {
		this.listaTipoTarjetaNegocio = listaTipoTarjeta;
	}

	public boolean isEsEntregaBN() {
		return esEntregaBN;
	}

	public void setEsEntregaBN(boolean esEntregaBN) {
		this.esEntregaBN = esEntregaBN;
	}

	public boolean isEsEntregaUE() {
		return esEntregaUE;
	}

	public void setEsEntregaUE(boolean esEntregaUE) {
		this.esEntregaUE = esEntregaUE;
	}

	public boolean isEsEntregaReferencia() {
		return esEntregaReferencia;
	}

	public void setEsEntregaReferencia(boolean esEntregaReferencia) {
		this.esEntregaReferencia = esEntregaReferencia;
	}

	public List<Ubigeo> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Ubigeo> departamentos) {
		this.departamentos = departamentos;
	}

	public List<Ubigeo> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Ubigeo> provincias) {
		this.provincias = provincias;
	}

	public List<Ubigeo> getDistritos() {
		return distritos;
	}

	public void setDistritos(List<Ubigeo> distritos) {
		this.distritos = distritos;
	}

	public List<Agencia> getAgenciasBN() {
		return agenciasBN;
	}

	public void setAgenciasBN(List<Agencia> agenciasBN) {
		this.agenciasBN = agenciasBN;
	}

	public void inicializarFormulario() {
		tarjeta = new Tarjeta();
		tarjeta.setTipoMoneda(TipoMoneda.MONEDA_SOLES.getId());
		tarjeta.setEntregaUbicacion("4");
		
		clienteSeleccionado = new Cliente();
		listaOperadorMovil = Arrays.asList(OperadorMovil.values());
		listaTipoDocumento = Arrays.asList(TipoDocumento.values());
		listaTipoMoneda = Arrays.asList(TipoMoneda.values());
		personaExiste = true;
		listaEstadoCivil = Arrays.asList(EstadoCivil.values());
		tipoDocumentoSeleccionado = TipoDocumento.DNI.getCodigoBduc();
		numDocumentoSeleccionado = null;

		esEntregaBN = true;
		esEntregaUE = false;
		esEntregaReferencia = false;
		provincias = null;
		distritos = null;
		agenciasBN = null;
		agenciaSeleccionada = null;
		tipoTarjetaNegocioSeleccionada = null;
		pasoActual = 0;
	}
	public void reiniciarDatosCliente() {
		clienteSeleccionado = new Cliente();
		listaOperadorMovil = Arrays.asList(OperadorMovil.values());
		listaTipoDocumento = Arrays.asList(TipoDocumento.values());
		listaTipoMoneda = Arrays.asList(TipoMoneda.values());
		personaExiste = true;
		listaEstadoCivil = Arrays.asList(EstadoCivil.values());
 		numDocumentoSeleccionado = null;
	}
	public void generarUbigeoPorUbicacion() {

		if (tarjeta.getEntregaUbicacion().equals(
				ConstantesGenerales.ENTREGA_AGENCIA_BN)) {
			tarjeta.setEntregaUbigeo(tarjeta.getEntregaDepartamento().concat(
					tarjeta.getEntregaProvincia().concat(
							tarjeta.getEntregaDistrito())));
			tarjeta.setEntregaAgenciaBN(agenciaSeleccionada.getCodAgencia());
			tarjeta.setEntregaDireccion(agenciaSeleccionada.getDireccion());
		}
	}

	public List<EstadoCivil> getListaEstadoCivil() {
		return listaEstadoCivil;
	}

	public void setListaEstadoCivil(List<EstadoCivil> listaEstadoCivil) {
		this.listaEstadoCivil = listaEstadoCivil;
	}

	public int getPasoActual() {
		return pasoActual;
	}

	public void setPasoActual(int pasoActual) {
		this.pasoActual = pasoActual;
	}

	public TipoTarjetaNegocio getTipoTarjetaNegocioSeleccionada() {
		return tipoTarjetaNegocioSeleccionada;
	}

	public void setTipoTarjetaNegocioSeleccionada(TipoTarjetaNegocio tipoTarjetaNegocioSeleccionada) {
		this.tipoTarjetaNegocioSeleccionada = tipoTarjetaNegocioSeleccionada;
	}

	public boolean esTipoDocumentoDNI() {
		if (tipoDocumentoSeleccionado != null
				&& tipoDocumentoSeleccionado.equals(TipoDocumento.DNI
						.getCodigoBduc()))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "SolicitarTarjetaModel [tipoDocumentoSeleccionado="
				+ tipoDocumentoSeleccionado + ", numDocumentoSeleccionado="
				+ numDocumentoSeleccionado + ", listaOperadorMovil="
				+ listaOperadorMovil + ", clienteSeleccionado="
				+ clienteSeleccionado + ", departamentos=" + departamentos
				+ ", provincias=" + provincias + ", distritos=" + distritos
				+ ", agenciaSeleccionada=" + agenciaSeleccionada
				+ ", esEntregaBN=" + esEntregaBN + ", esEntregaUE="
				+ esEntregaUE + ", esEntregaReferencia=" + esEntregaReferencia
				+ ", tarjeta=" + tarjeta + ", pasoActual=" + pasoActual
				+ ", personaExiste=" + personaExiste + "]";
	}
}
