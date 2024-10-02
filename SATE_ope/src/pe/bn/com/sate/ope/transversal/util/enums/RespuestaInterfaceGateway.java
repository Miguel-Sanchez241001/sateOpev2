package pe.bn.com.sate.ope.transversal.util.enums;

public enum RespuestaInterfaceGateway {

	EXITO("0000"), ERROR("0001");

	private String codigo;

	private RespuestaInterfaceGateway(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public static boolean esOperacionExistosa(String codigo){
		for(RespuestaInterfaceGateway gateway : values()){
			if(gateway.getCodigo().equals(codigo)) return true;
		}
		return false;
	}

}
