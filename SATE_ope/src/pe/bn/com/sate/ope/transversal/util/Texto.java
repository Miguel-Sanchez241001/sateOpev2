package pe.bn.com.sate.ope.transversal.util;

import org.apache.log4j.Logger;

public class Texto {
	private static final Logger logger = Logger.getLogger(Texto.class);

	public static String textoFormatoPersonalizado(String texto, int maxLetras) {
		String textresult = "";
		int cont = 0;
		for (int i = 0; i < texto.length(); i++) {

			textresult += texto.charAt(i);
			cont++;
			if (cont == maxLetras && i != texto.length() - 1) {
				// logger.info(textresult);
				cont = 0;
				int j = i + 1;
				if (texto.charAt(j) == ' ') {
					textresult += "\n";
					i++;
				} else {
					boolean flag = true;

					for (; j < texto.length() && flag; j++) {
						if (texto.charAt(j) != ' ') {
							textresult += texto.charAt(j);
						} else {
							flag = false;
						}
					}
					i = j - 1;
					if (i != texto.length() - 1) {
						textresult += "\n";
					}
				}
			}
		}
		return textresult;
	}

	public static String aumentarCaracteres(String pass, int num) {
		int l = pass.length();
		for (int i = 0; i < num - l; i++) {
			pass = pass + " ";
		}
		return pass;
	}

	public static int countLines(String str) {
		// String[] lines = str.split("\r\n|\r|\n");
		String[] lines = str.split("\n");
		return lines.length;
	}

	public static int cantidadLineasTextoFormato(String texto) {
		int cantCaracteres = 0;
		String[] lines = texto.split("\n");
		for (int i = 0; i < lines.length; i++) {
			logger.info("***" + lines[i]);
			if (lines[i].length() < 77) {
				cantCaracteres += 1;
			} else {
				int cd = lines[i].length() / 76;
				if (lines[i].length() % 76 != 0) {
					cd++;
				}
				cantCaracteres += cd;
			}
		}
		return cantCaracteres;
	}

	public static String concantenarMensajes(String msj1, String msj2) {
		return msj1 + msj2;
	}

}
