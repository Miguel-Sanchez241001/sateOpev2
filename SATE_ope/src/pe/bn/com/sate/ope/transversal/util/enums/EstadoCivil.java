package pe.bn.com.sate.ope.transversal.util.enums;

public enum EstadoCivil {

	SOLTERO("S","1","Soltero"),
	CASADO("C","2","Casado"),
	DIVORCIADO("D","3","Divorciado"),
	VIUDO("V","4","Viudo");
	
	private String codigoTrama;
	private String codigoReniec;
	private String descripcion;
	
	
	private EstadoCivil(String codigoTrama, String codigoReniec,
			String descripcion) {
		this.codigoTrama = codigoTrama;
		this.codigoReniec = codigoReniec;
		this.descripcion = descripcion;
	}


	public String getCodigoTrama() {
		return codigoTrama;
	}


	public void setCodigoTrama(String codigoTrama) {
		this.codigoTrama = codigoTrama;
	}


	public String getCodigoReniec() {
		return codigoReniec;
	}


	public void setCodigoReniec(String codigoReniec) {
		this.codigoReniec = codigoReniec;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public static String obtenerCodigoTrama(String codigoReniec){
		for(EstadoCivil estadoCivil:values()){
			if(estadoCivil.getCodigoReniec().equals(codigoReniec))
				return estadoCivil.getCodigoTrama();
		}
		return null;
	}
}
