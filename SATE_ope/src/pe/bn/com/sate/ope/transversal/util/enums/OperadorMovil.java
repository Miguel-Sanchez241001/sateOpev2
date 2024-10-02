package pe.bn.com.sate.ope.transversal.util.enums;

public enum OperadorMovil {

	MOVISTAR("M", "Movistar"),
	CLARO("C", "Claro"),
	ENTEL("E", "Entel"), 
	BITEL("B", "Bitel");

	private String id;
	private String descripcion;

	private OperadorMovil(String id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
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

	public static String obtenerDescripcionProveedor(String id) {
		for (OperadorMovil operadorMovil : values()) {
			if (operadorMovil.getId().equals(id))
				return operadorMovil.getDescripcion();
		}
		return null;
	}

}
