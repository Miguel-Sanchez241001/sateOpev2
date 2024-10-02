package pe.bn.com.sate.ope.transversal.util.enums;

public enum TipoMontoMC {

	CREDITO("C", "Crédito"), DEBITO("D", "Débito");

	String tipo;
	String descripcion;

	TipoMontoMC(String tipo, String descripcion) {
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	public static String enLetras(String tipo) {
		if (tipo != null)
			for (TipoMontoMC tipoMontoMC : TipoMontoMC.values()) {
				if (tipo.equals(tipoMontoMC.getTipo()))
					return tipoMontoMC.getDescripcion();
			}
		return "-";
	}

	public String getTipo() {
		return tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}