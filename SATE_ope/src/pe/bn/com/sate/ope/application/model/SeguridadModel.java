package pe.bn.com.sate.ope.application.model;

import java.io.Serializable;

import pe.bn.com.sate.ope.transversal.configuration.security.UsuarioSeguridad;

public class SeguridadModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private UsuarioSeguridad usuario;

	public SeguridadModel(UsuarioSeguridad usuario){
		this.usuario = usuario;
	}

	public UsuarioSeguridad getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioSeguridad usuario) {
		this.usuario = usuario;
	}

	
	
}
