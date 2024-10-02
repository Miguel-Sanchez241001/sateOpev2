package pe.bn.com.sate.ope.application.model;

import java.util.Arrays;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Rol;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.NumeroALetras;
import pe.bn.com.sate.ope.transversal.util.enums.CodDocumentoWebservice;
import pe.bn.com.sate.ope.transversal.util.enums.OperadorMovil;
import pe.bn.com.sate.ope.transversal.util.enums.TipoDocumento;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstado;

public class ModificarUsuarioModel {

	private String tipoDocumentoSeleccionado;
	private String numDocumentoSeleccionado;
	private List<TipoDocumento> listaTipoDocumento;
	private List<OperadorMovil> listaOperadorMovil;
	private Usuario usuarioSeleccionado;

	private List<Rol> roles;
	private Long rolSeleccionado;
	private List<TipoEstado> estadosUsuario;
	private String estadoSeleccionado;

	private boolean personaExiste;

	public ModificarUsuarioModel() {
		usuarioSeleccionado = new Usuario();
		listaOperadorMovil = Arrays.asList(OperadorMovil.values());
		listaTipoDocumento = Arrays.asList(TipoDocumento.values());
		estadosUsuario = Arrays.asList(TipoEstado.values());
		personaExiste = false;
		tipoDocumentoSeleccionado = TipoDocumento.DNI.getCodigoBduc();
	}

	public void limpiarNumeroDocumento() {
		numDocumentoSeleccionado = "";
	}

	public String getTipoDocumentoSeleccionado() {
		return tipoDocumentoSeleccionado;
	}

	public void setTipoDocumentoSeleccionado(String tipoDocumentoSeleccionado) {
		this.tipoDocumentoSeleccionado = tipoDocumentoSeleccionado;
	}

	public String getNumDocumentoSeleccionado() {
		return numDocumentoSeleccionado;
	}

	public void setNumDocumentoSeleccionado(String numDocumentoSeleccionado) {
		this.numDocumentoSeleccionado = numDocumentoSeleccionado;
	}

	public List<TipoDocumento> getListaTipoDocumento() {
		return listaTipoDocumento;
	}

	public void setListaTipoDocumento(List<TipoDocumento> listaTipoDocumento) {
		this.listaTipoDocumento = listaTipoDocumento;
	}

	public List<OperadorMovil> getListaOperadorMovil() {
		return listaOperadorMovil;
	}

	public void setListaOperadorMovil(List<OperadorMovil> listaOperadorMovil) {
		this.listaOperadorMovil = listaOperadorMovil;
	}

	public Usuario getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	public Long getRolSeleccionado() {
		return rolSeleccionado;
	}

	public void setRolSeleccionado(Long rolSeleccionado) {
		this.rolSeleccionado = rolSeleccionado;
	}

	public boolean isPersonaExiste() {
		return personaExiste;
	}

	public void setPersonaExiste(boolean personaExiste) {
		this.personaExiste = personaExiste;
	}

	public void inicializarFormularioUsuario() {
		usuarioSeleccionado = new Usuario();
		tipoDocumentoSeleccionado = null;
		numDocumentoSeleccionado = null;
		rolSeleccionado = null;
		personaExiste = false;
	}

	public String getEstadoSeleccionado() {
		return estadoSeleccionado;
	}

	public void setEstadoSeleccionado(String estadoSeleccionado) {
		this.estadoSeleccionado = estadoSeleccionado;
	}

	public List<TipoEstado> getEstadosUsuario() {
		return estadosUsuario;
	}

	public void setEstadosUsuario(List<TipoEstado> estadosUsuario) {
		this.estadosUsuario = estadosUsuario;
	}

	public boolean esTipoDocumentoDNI() {
		if (tipoDocumentoSeleccionado != null
				&& tipoDocumentoSeleccionado.equals(TipoDocumento.DNI
						.getCodigoBduc()))
			return true;
		else
			return false;
	}

	public int obtenerDocumentoLength() {
		return TipoDocumento.obtenerLength(tipoDocumentoSeleccionado);
	}

	public String obtenerDocumentoValidatorMessage() {
		return "El "
				+ TipoDocumento
						.tipoDocumentoBducLetras(tipoDocumentoSeleccionado)
				+ " debe  tener "
				+ TipoDocumento.obtenerLength(tipoDocumentoSeleccionado)
				+ " dígitos";
	}

	public String obtenerDocumentoRequiredMessage() {
		return "Ingrese un número de "
				+ TipoDocumento
						.tipoDocumentoBducLetras(tipoDocumentoSeleccionado);
	}

}
