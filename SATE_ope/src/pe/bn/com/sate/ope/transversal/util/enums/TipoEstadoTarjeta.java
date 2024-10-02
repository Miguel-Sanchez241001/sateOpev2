package pe.bn.com.sate.ope.transversal.util.enums;

public enum TipoEstadoTarjeta {

	SOLICITUD_TARJETA_REGISTRADA("1", "Solicitud tarjeta creada"), SOLICITUD_TARJETA_AUTORIZADA(
			"2", "Solicitud tarjeta autorizada"), SOLICITUD_TARJETA_ENVIADA(
			"3", "Solicitud tarjeta enviada"), SOLICITUD_TARJETA_CANCELADA("4",
			"Solicitud tarjeta cancelada"), TARJETA_ACTIVADA("5",
			"Tarjeta activada"), TARJETA_BLOQUEADA("6", "Tarjeta bloqueada"), TARJETA_CANCELADA(
			"7", "Tarjeta cancelada");

	private String cod;
	private String descripcion;

	private TipoEstadoTarjeta(String cod, String descripcion) {
		this.cod = cod;
		this.descripcion = descripcion;
	}
	
	public static String enLetras(String estado) {
		if (estado != null)
			for (TipoEstadoTarjeta tipoEstadoTarjetaEnum : TipoEstadoTarjeta.values()) {
				if (estado.equals(tipoEstadoTarjetaEnum.getCod()))
					return tipoEstadoTarjetaEnum.getDescripcion();
			}
		return "";
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static String descripcionTipoEstadoTarjeta(String codigo) {
		String descripcion = "Ninguno";
		for (TipoEstadoTarjeta tipoEstadoTarjeta : values()) {
			if (codigo.equals(tipoEstadoTarjeta.getCod())) {
				descripcion = tipoEstadoTarjeta.getDescripcion();
			}
		}
		return descripcion;
	}

	public static boolean esEstadoTarjetaParaActualizarDatosContacto(
			String codigo) {
		return codigo.equals(TipoEstadoTarjeta.TARJETA_ACTIVADA.getCod());
	}

	public static boolean esEstadoTarjetaCancelarTarjeta(String codigo) {
		return codigo.equals(TipoEstadoTarjeta.SOLICITUD_TARJETA_REGISTRADA
				.getCod());
	}
}
