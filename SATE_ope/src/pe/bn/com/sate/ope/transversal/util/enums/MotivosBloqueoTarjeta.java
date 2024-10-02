package pe.bn.com.sate.ope.transversal.util.enums;


public enum MotivosBloqueoTarjeta {

	NORMAL("N","Activar"),
	PERDIDA("E", "Perdida"),
	FRAUDE("F", "Perdida"),
	MAL_REALCE("Q","Mal realce"),
	ALERTA("T","Alerta"),
	ROBO("X","Robo");
	
//	NORMAL("N","Activar"),
//	NO_RECLAMADA("R", "No reclamada"),
//	PERDIDA("E", "Perdida"),
//	MAL_REALCE("Q","Mal realce"),
//	CANCELACION_TARJETA("U","Cancelación tarjeta"),
//	ROBO("X","Robo");

	private String id;
	private String descripcion;

	private MotivosBloqueoTarjeta(String id, String descripcion) {
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

	public static String descripcionMotivoBloqueoTarjeta(String codigo){
		String descripcion = "Ninguno";
		for(MotivosBloqueoTarjeta motivosBloqueoTarjeta:values()){
			if(codigo.equals(motivosBloqueoTarjeta.getId())){
				descripcion = motivosBloqueoTarjeta.getDescripcion();
			}
		}
		return descripcion;
	}
	
	public static MotivosBloqueoTarjeta[] motivosBloqueoPorIdMotivo(String id){
		MotivosBloqueoTarjeta motivos[] = null;
		if(id.equals(TipoEstadoTarjeta.TARJETA_ACTIVADA.getCod())){
			motivos =new MotivosBloqueoTarjeta[5];
			motivos[0] = MotivosBloqueoTarjeta.FRAUDE;
			motivos[1] = MotivosBloqueoTarjeta.PERDIDA;
			motivos[2] = MotivosBloqueoTarjeta.MAL_REALCE;
			motivos[3] = MotivosBloqueoTarjeta.ALERTA;
			motivos[4] = MotivosBloqueoTarjeta.ROBO;		
			
		}else if(id.equals(TipoEstadoTarjeta.TARJETA_BLOQUEADA.getCod())){
			motivos =new MotivosBloqueoTarjeta[1];
			motivos[0] = MotivosBloqueoTarjeta.NORMAL;
		}
		
		return motivos;
	}
}
