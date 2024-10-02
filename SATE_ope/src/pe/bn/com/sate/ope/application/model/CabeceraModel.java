package pe.bn.com.sate.ope.application.model;

import pe.bn.com.sate.ope.transversal.configuration.security.UsuarioSeguridad;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEmpresa;

public class CabeceraModel {

	private String fecha;
	private String razonSocial;
	private String tipoEmpresa;
	private UsuarioSeguridad usuario;
	
	public CabeceraModel() {
	}

	public String getFecha() {
		return fecha;
	}

	public UsuarioSeguridad getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioSeguridad usuario) {
		this.usuario = usuario;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public String tipoEmpresaLetras(String tipoEmpresa) {
		return TipoEmpresa.tipoEmpresaLetras(tipoEmpresa);
	}

}
