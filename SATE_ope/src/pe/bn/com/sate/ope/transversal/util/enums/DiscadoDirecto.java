package pe.bn.com.sate.ope.transversal.util.enums;

public enum DiscadoDirecto {

	ABANCAY("Abancay", "83"), AMAZONAS("Amazonas", "41"), ANCASH("Ancash", "43"), AREQUIPA(
			"Arequipa", "54"), AYACUCHO("Ayacucho", "66"), CAJAMARCA(
			"Cajamarca", "76"), CERRO_DE_PASCO("Cerro de Pasco", "63"), CUZCO(
			"Cuzco", "84"), CHICLAYO("Chiclayo", "74"), CHIMBOTE("Chimbote",
			"43"), CHINCHA("Chincha", "56"), HUANCAYO("Huancayo", "64"), HUANCAVELICA(
			"Huancavelica", "67"), HUANUCO("Huanuco", "62"), HUARAZ("Huaraz",
			"43"), ICA("Ica", "56"), ILO("Ilo", "53"), IQUITOS("IQUITOS", "65"), JULIACA(
			"Juliaca", "51"), JUNIN("Junín", "64"), LA_LIBERTAD("La Libertad",
			"44"), LAMBAYEQUE("Lambayeque", "74"), LIMA("Lima", "1"), MOLLENDO(
			"Mollendo", "54"), PACASMAYO("Pacasmayo", "53"), PIURA("Piura",
			"44"), PUCALLPA("Pucallpa", "73"), PUNO("Puno", "51"), TACNA(
			"Tacna", "52"), TALARA("Talara", "72"), TARAPOTO("Tarapoto", "42"), TRUJILLO(
			"Trujillo", "44"), TUMBES("Tumbes", "72");

	private String nombre;
	private String codigo;

	private DiscadoDirecto(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
