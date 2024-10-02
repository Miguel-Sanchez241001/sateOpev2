package pe.bn.com.sate.ope.transversal.util.enums;

public enum DisposicionEfectivo {

	SI("T", "SI"), NO("N", "NO");

	private String codigo;
	private String descripcion;

	private DisposicionEfectivo(String codigo, String descripcion) {
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

	public static String descripcionDisposicionEfectivo(String codigo){
		for(DisposicionEfectivo disposicionEfectivo:values()){
			if(disposicionEfectivo.getCodigo().equals(codigo))
				return disposicionEfectivo.getDescripcion();
		}
		
		return "Ninguno";
	}
}
