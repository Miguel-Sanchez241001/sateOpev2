package pe.bn.com.sate.ope.transversal.configuration.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import pe.bn.com.sate.ope.transversal.dto.sate.Permiso;

public class UsuarioSeguridad extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String apPaterno;
	private String apMaterno;
	private String nombres;
	private String tipoDocumento;
	private String numDocumento;
	private List<Permiso> permisos;
	private String rol;
	private String ruc;
	private String flagCambioClave;

	public UsuarioSeguridad(String username, String password,
			Collection<? extends GrantedAuthority> authorities, Long id,
			String apPaterno, String apMaterno, String nombres,
			String tipoDocumento, String numDocumento, String ruc,
			List<Permiso> permisos, String rol, String flagCambioClave) {
		super(username, password, authorities);
		this.id = id;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombres = nombres;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.permisos = permisos;
		this.ruc = ruc;
		this.rol = rol;
		this.flagCambioClave = flagCambioClave;
	}

	public String nombreCompleto() {
		return this.nombres + " " + this.apPaterno + " " + this.apMaterno;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getFlagCambioClave() {
		return flagCambioClave;
	}

	public void setFlagCambioClave(String flagCambioClave) {
		this.flagCambioClave = flagCambioClave;
	}

}
