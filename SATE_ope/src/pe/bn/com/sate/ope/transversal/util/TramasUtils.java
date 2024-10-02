package pe.bn.com.sate.ope.transversal.util;

public class TramasUtils {

	public static String enmascararTramaEnvio(String value) {
		if (value == null)
			return null;

		// value = value.replaceAll("ñ", "#");
		// value = value.replaceAll("Ñ", "#");
		value = value.replaceAll("/", "Ñ");
		value = value.replaceAll("Á", "A");
		value = value.replaceAll("á", "A");
		value = value.replaceAll("Ä", "A");
		value = value.replaceAll("ä", "A");
		value = value.replaceAll("É", "E");
		value = value.replaceAll("é", "E");
		value = value.replaceAll("Ë", "E");
		value = value.replaceAll("ë", "E");
		value = value.replaceAll("Í", "I");
		value = value.replaceAll("í", "I");
		value = value.replaceAll("Ï", "I");
		value = value.replaceAll("ï", "I");
		value = value.replaceAll("Ó", "O");
		value = value.replaceAll("ó", "O");
		value = value.replaceAll("Ö", "O");
		value = value.replaceAll("ö", "O");
		value = value.replaceAll("Ú", "U");
		value = value.replaceAll("ú", "U");
		value = value.replaceAll("Ü", "U");
		value = value.replaceAll("ü", "U");

		return value;
	}

	public static String enmascararTramaRecepcion(String value) {
		if (value == null)
			return null;

		value = value.replaceAll("#", "Ñ");
		// value = value.replaceAll("/", "Ñ");

		return value;
	}

	public static String repeat(String s, int n) {
		if (s == null) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
	
	
}
