package pe.bn.com.sate.ope.transversal.util.enums;

public enum TipoTarjetaMC {
	TITULAR("T", "Titular"), ADICIONAL("A", "Adicional");

	String tipo;
	String descripcion;

	TipoTarjetaMC(String tipo, String descripcion) {
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	public static String enLetras(String tipo) {
		if (tipo != null)
			for (TipoTarjetaMC tipoTarjetaMC : TipoTarjetaMC.values()) {
				if (tipo.equals(tipoTarjetaMC.getTipo()))
					return tipoTarjetaMC.getDescripcion();
			}
		return "";
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
