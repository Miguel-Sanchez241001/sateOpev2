package pe.bn.com.sate.ope.transversal.util.enums;


public enum TipoEmpresa {

	EMPRESA("0", "Empresa"), UNIDAD_EJECUTORA("1", "Unidad Ejecutora");

	private String codigo;
	private String descripcion;

	private TipoEmpresa(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public static String tipoEmpresaLetras(String tipoEmpresa) {
		if (tipoEmpresa != null)
			for (TipoEmpresa tipoEmpresaEnum : TipoEmpresa.values()) {
				if (tipoEmpresa.equals(tipoEmpresaEnum.getCodigo()))
					return tipoEmpresaEnum.getDescripcion();
			}
		return "";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
