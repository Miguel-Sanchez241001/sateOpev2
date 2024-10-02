package pe.bn.com.sate.ope.transversal.util.enums;

public enum Sexo {
	FEMENINO("F", "2", "Femenino"), 
	MASCULINO("M", "1", "Masculino");

	private String codigoTrama;
	private String codigoReniec;
	private String descripcion;

	private Sexo(String codigoTrama, String codigoReniec, String descripcion) {
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
		for(Sexo sexo:values()){
			if(sexo.getCodigoReniec().equals(codigoReniec))
				return sexo.getCodigoTrama();
		}
		
		return null;
	}

}
