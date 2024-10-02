package pe.bn.com.sate.ope.transversal.dto.sate;

public class Permiso {

	private Long id;
	private Long idRol;
	private String codFuncionalidad;
	private String descripcion;
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getCodFuncionalidad() {
		return codFuncionalidad;
	}

	public void setCodFuncionalidad(String codFuncionalidad) {
		this.codFuncionalidad = codFuncionalidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
