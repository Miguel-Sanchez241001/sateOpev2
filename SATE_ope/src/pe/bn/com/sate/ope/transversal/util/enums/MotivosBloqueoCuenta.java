package pe.bn.com.sate.ope.transversal.util.enums;

public enum MotivosBloqueoCuenta {

	NORMAL("N", "Activar Cuenta"), 
	TEMPORAL("K", "Bloqueo Temporal de Cuenta");

	private String id;
	private String descripcion;

	private MotivosBloqueoCuenta(String id, String descripcion) {
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

	public static String descripcionMotivoBloqueoTarjeta(String codigo) {
		String descripcion = "Ninguno";
		for (MotivosBloqueoCuenta motivosBloqueoTarjeta : values()) {
			if (codigo.equals(motivosBloqueoTarjeta.getId())) {
				descripcion = motivosBloqueoTarjeta.getDescripcion();
			}
		}
		return descripcion;
	}

	public static MotivosBloqueoCuenta[] motivosBloqueoPorIdMotivo(String id) {
		MotivosBloqueoCuenta motivos[] = null;
		if (id.equals(MotivosBloqueoCuenta.NORMAL.getId())) {
			motivos = new MotivosBloqueoCuenta[1];
			motivos[0] = MotivosBloqueoCuenta.TEMPORAL;
		} else {
			motivos = new MotivosBloqueoCuenta[1];
			motivos[0] = MotivosBloqueoCuenta.NORMAL;
		}

		return motivos;
	}
}
