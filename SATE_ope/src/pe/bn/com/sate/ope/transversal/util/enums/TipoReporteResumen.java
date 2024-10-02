package pe.bn.com.sate.ope.transversal.util.enums;

public enum TipoReporteResumen {

	LISTADO_TARJETAS(1, "Listado de Tarjetas bloqueadas/anuladas/activas."), LISTADO_TRANSACCIONES(
			2, "Listado de Transacciones por periodo."), LISTADO_CARGOS(3,
			"Listado de Cargos en cuenta garantía por periodo.");

	private int id;
	private String descripcion;

	private TipoReporteResumen(int id, String descripcion) {
		this.descripcion = descripcion;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
