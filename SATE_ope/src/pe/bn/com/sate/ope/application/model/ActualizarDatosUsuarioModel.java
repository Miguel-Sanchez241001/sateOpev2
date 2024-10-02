package pe.bn.com.sate.ope.application.model;

import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.componentes.Teclado;
import pe.bn.com.sate.ope.transversal.util.enums.CodDocumentoWebservice;

public class ActualizarDatosUsuarioModel {
	private Usuario usuario;
	private String perfilLetras;

	private Teclado tecladoActual;
	private Teclado tecladoNueva;
	private Teclado tecladoConfirmar;

	public boolean sonClavesIguales() {
		if (tecladoNueva.getClave().equals(tecladoConfirmar.getClave()))
			return true;
		else
			return false;
	}

	public boolean esClaveNuevaDiferente() {
		if (tecladoActual.getClave().equals(tecladoNueva.getClave()))
			return false;
		else
			return true;
	}

	public ActualizarDatosUsuarioModel() {
		usuario = new Usuario();
		tecladoActual = new Teclado();
		tecladoNueva = new Teclado();
		tecladoConfirmar = new Teclado();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String descripcionTipoDocumento(String codigo) {
		return CodDocumentoWebservice.descripcionCodDocumentoWebservice(codigo);
	}

	public Teclado getTecladoActual() {
		return tecladoActual;
	}

	public void setTecladoActual(Teclado tecladoActual) {
		this.tecladoActual = tecladoActual;
	}

	public Teclado getTecladoNueva() {
		return tecladoNueva;
	}

	public void setTecladoNueva(Teclado tecladoNueva) {
		this.tecladoNueva = tecladoNueva;
	}

	public Teclado getTecladoConfirmar() {
		return tecladoConfirmar;
	}

	public void setTecladoConfirmar(Teclado tecladoConfirmar) {
		this.tecladoConfirmar = tecladoConfirmar;
	}

	public String getPerfilLetras() {
		return perfilLetras;
	}

	public void setPerfilLetras(String perfilLetras) {
		this.perfilLetras = perfilLetras;
	}

	public void limpiarFormulario() {
		tecladoActual.limpiar();
		tecladoNueva.limpiar();
		tecladoConfirmar.limpiar();
	}

}
