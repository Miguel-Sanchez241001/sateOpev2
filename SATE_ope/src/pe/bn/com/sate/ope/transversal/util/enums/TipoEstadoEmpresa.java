package pe.bn.com.sate.ope.transversal.util.enums;

public enum TipoEstadoEmpresa {

	ACTIVO("A", "Activo"), INACTIVO("I", "Inactivo");

	private String codigo;
	private String descripcion;

	private TipoEstadoEmpresa(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
