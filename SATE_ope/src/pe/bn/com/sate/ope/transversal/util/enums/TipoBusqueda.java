package pe.bn.com.sate.ope.transversal.util.enums;

public enum TipoBusqueda {

/*	NUM_TARJETA("N", "NÚMERO DE TARJETA", 16), DNI("1", "DNI", 8), CARNET_EXTRANJERIA(
			"4", "CARNET DE EXTRANJERÍA", 12), CARNET_POLICIA_NACIONAL("2",
			"CARNET DE POLICÍA NACIONAL", 9), PASAPORTTE("5", "PASAPORTE", 12);*/
	// TODO ENUM tipo busquedas
	NUM_TARJETA("N", "NÚMERO DE TARJETA", 19), DNI("1", "DNI", 8), CARNET_EXTRANJERIA(
			"4", "CARNET DE EXTRANJERÍA", 12)   ;
	private String id;
	private String descripcion;
	private int length;

	private TipoBusqueda(String id, String descripcion, int length) {
		this.id = id;
		this.descripcion = descripcion;
		this.length = length;
	}

	public static String tipoBusquedaLetras(String tipoBusqueda) {
		if (tipoBusqueda != null)
			for (TipoBusqueda tipoBusquedaEnum : TipoBusqueda.values()) {
				if (tipoBusqueda.equals(tipoBusquedaEnum.getId()))
					return tipoBusquedaEnum.getDescripcion();
			}
		return "";
	}

	public static int obtenerLength(String tipoBusqueda) {
		if (tipoBusqueda != null)
			for (TipoBusqueda tipoBusquedaEnum : TipoBusqueda.values()) {
				if (tipoBusqueda.equals(tipoBusquedaEnum.getId()))
					return tipoBusquedaEnum.getLength();
			}
		return 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
