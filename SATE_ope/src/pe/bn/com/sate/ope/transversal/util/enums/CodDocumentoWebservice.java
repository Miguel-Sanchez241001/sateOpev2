package pe.bn.com.sate.ope.transversal.util.enums;


public enum CodDocumentoWebservice {
	DNI("1", "DNI"), 
	CARNET_EXTRANJERIA("4", "Carnet de Extranjeria");
	//PASAPORTE("5", "Pasaporte");

	private String codigo;
	private String descripcion;

	private CodDocumentoWebservice(String codigo, String descripcion) {
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
	
	public static String descripcionCodDocumentoWebservice(String codigo){
		String descripcion = "Ninguno";
		for(CodDocumentoWebservice codDocumentoWebservice:values()){
			if(codigo.equals(codDocumentoWebservice.getCodigo())){
				descripcion = codDocumentoWebservice.getDescripcion();
			}
		}
		return descripcion;
	}

}
