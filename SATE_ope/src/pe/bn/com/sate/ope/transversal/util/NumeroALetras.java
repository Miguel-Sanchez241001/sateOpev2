package pe.bn.com.sate.ope.transversal.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class NumeroALetras {
	private static final Logger logger = Logger.getLogger(NumeroALetras.class);
	private final static String[] unidades = { "", "uno ", "dos ", "tres ",
			"cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve " };
	private static final String[] decenas = { "diez ", "once ", "doce ",
			"trece ", "catorce ", "quince ", "dieciseis ", "diecisiete ",
			"dieciocho ", "diecinueve ", "veinte ", "treinta ", "cuarenta ",
			"cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa " };
	private static final String[] centenas = { "", "ciento ", "doscientos ",
			"trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ",
			"setecientos ", "ochocientos ", "novecientos " };

	public static String convertir(Double numero, boolean mayusculas) {
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(2);
		return convertir(df.format(numero), mayusculas);
	}

	public static String convertir(long numero, boolean mayusculas) {
		return convertir(String.valueOf(numero), mayusculas);
	}

	public static String formatoNumero(long numero, int nroDig) {
		String num = String.valueOf(numero);
		String numFormat = "";
		if (numero > 0 && num.length() < nroDig) {
			for (int i = 0; i < nroDig - num.length(); i++)
				numFormat += "0";
			numFormat += num;
		} else {
			numFormat = num;
		}
		return numFormat;
	}
	
	public static String formatoNumero(String numero, int nroDig) {
		String numFormat = "";
		if (numero.length() < nroDig) {
			for (int i = 0; i < nroDig - numero.length(); i++)
				numFormat += "0";
			numFormat += numero;
		} else {
			numFormat = numero;
		}
		return numFormat;
	}
	
	public static String porcentajeFormateado(double numero) {
		DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
		simbolo.setDecimalSeparator('.');
		DecimalFormat formato = new DecimalFormat("##.##",simbolo);
		
		String numFormateado = formato.format(numero);
		
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(2);
		
		int cantDec = df.format(numero-(int)numero).length()-1;
		
		int MAX_DECIMAL=2;
			numFormateado+=(cantDec==0?".":"")+repeatString("0", MAX_DECIMAL-cantDec)+" %";
		return numFormateado;
	}
	
	public static String formatoNumeroInvertido(String numero, int nroDig){
		String numFormat = "";
		for(int i =numero.length();i<nroDig;i++){
			numFormat+="0";
		}
		numero=numFormat+numero;
		return numero;
	}

	/**
	 * Convierte a texto un numero decimal
	 * 
	 * @param numero
	 *            El importe en texto
	 * @param mayusculas
	 *            true, se devuelve en mayusculas
	 * @return el valor en letras del importe
	 */
	public static String convertir(String numero, boolean mayusculas) {
		logger.info("NUMERO ORIGINAL : " + numero);
		String literal = "";
		String parte_decimal;
		// logger.info("numero 1:"+numero);
		numero = numero.replace(".", ",");

		if (numero.indexOf(",") == -1) {
			numero = numero + ",00";
		}

		// numeros desde 0.00 hasta 999999999.99
		if (Pattern.matches("\\d{1,9},\\d{1,2}", numero)) {
			// separa la parte decimal de la entera
			String num[] = numero.split(",");
			if (num[1].equals("0")) {
				parte_decimal = "con 00/100";
			} else {
				if (num[1].equals("1") || num[1].equals("2")
						|| num[1].equals("3") || num[1].equals("4")
						|| num[1].equals("5") || num[1].equals("6")
						|| num[1].equals("7") || num[1].equals("8")
						|| num[1].equals("9")) {
					parte_decimal = "con " + num[1] + "0/100";
				} else {
					parte_decimal = "con " + num[1] + "/100";
				}
			}
			// selecciona el tipo de transformacion a realizar
			// segun la cantidad numerica
			if (Integer.parseInt(num[0]) == 0) {
				literal = "cero";
			} else if (Integer.parseInt(num[0]) > 999999) {
				logger.info("numero 1:" + num[0]);
				literal = getMillones(num[0]); // millones
			} else if (Integer.parseInt(num[0]) > 999) {
				literal = getMiles(num[0]); // miles
			} else if (Integer.parseInt(num[0]) > 99) {
				literal = getCentenas(num[0]); // centenas

			} else if (Integer.parseInt(num[0]) > 20
					&& Integer.parseInt(num[0]) < 30) {
				literal = getVeintes(num[0]); // veintenas

			} else if (Integer.parseInt(num[0]) > 9) {
				literal = getDecenas(num[0]); // decenas
			} else {
				literal = getUnidades(num[0]); // unidades
			}

			// si la variable es true se devuelve en mayusculas
			// si la variable es false se devuelve en minusculas
			if (mayusculas) {
				return (literal + parte_decimal).toUpperCase();
			} else {
				return (literal + parte_decimal);
			}
		} else {
			return literal = null;
		}
	}

	// Trasforma las "veintenas"
	private static String getVeintes(String numero) {
		String num = numero.substring(numero.length() - 1);
		return "veinti" + unidades[Integer.parseInt(num)];
	}

	// transforma las unidades
	private static String getUnidades(String numero) {
		String num = numero.substring(numero.length() - 1);
		return unidades[Integer.parseInt(num)];
	}

	// transforma las decenas
	private static String getDecenas(String num) {
		int n = Integer.parseInt(num);
		if (n < 10) {
			return getUnidades(num);

		} else if (n > 20 && n < 30) {
			String u = getVeintes(num);
			return u;

		} else if (n > 19) {
			String u = getUnidades(num);
			if (u.equals("")) {
				return decenas[Integer.parseInt(num.substring(0, 1)) + 8];
			} else {
				return decenas[Integer.parseInt(num.substring(0, 1)) + 8]
						+ "y " + u;
			}
		} else {
			return decenas[n - 10];
		}
	}

	// transforma las centenas
	private static String getCentenas(String num) {
		if (Integer.parseInt(num) > 99) {
			if (Integer.parseInt(num) == 100) {
				return "cien ";
			} else {
				return centenas[Integer.parseInt(num.substring(0, 1))]
						+ getDecenas(num.substring(1));
			}
		} else {
			return getDecenas(Integer.parseInt(num) + "");
		}
	}

	// transforma los miles
	private static String getMiles(String num) {
		String c = num.substring(num.length() - 3);
		String m = num.substring(0, num.length() - 3);
		String n = "";

		if (Integer.parseInt(m) > 0) {
			n = getCentenas(m);

			if (n.equals("uno ")) {
				n = "";
			}

			n = n.replace("veintiuno", "veintiun");
			n = n.replace("y uno", "y un");
			n = n.replace("uno", "un");

			return n + "mil " + getCentenas(c);
		} else {
			return "" + getCentenas(c);
		}
	}

	// transforma los millones
	private static String getMillones(String num) {
		String miles = num.substring(num.length() - 6);
		String millon = num.substring(0, num.length() - 6);
		String n = "";
		logger.info("num:" + num + " //miles:" + miles + " //millon:"
				+ millon.length());
		if (millon.length() > 1) {
			n = getCentenas(millon) + "millones ";
		} else {
			if (millon.equals("1")) {
				n = "un millon ";
			} else {
				n = getUnidades(millon) + "millones ";
				// n=millon+"un millon ";
			}
			// n=getUnidades(millon)+"millon ";

		}
		logger.info("n:" + n);
		n = n.replace("uno millones", "un millones");

		return n + getMiles(miles);
	}

	public static String numeroFormateado(Double numero) {
		DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
		simbolo.setDecimalSeparator('.');
		simbolo.setGroupingSeparator(',');
		DecimalFormat formato = new DecimalFormat("###,###,###.##",simbolo);
		
		String numFormateado = formato.format(numero);
		
		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(2);
		
		int cantDec = df.format(numero-numero.intValue()).length()-1;
		
		int MAX_DECIMAL=2;
			numFormateado+=(cantDec==0?".":"")+repeatString("0", MAX_DECIMAL-cantDec);
		return numFormateado;
	}
	public static String repeatString(String s,int count){
	    StringBuilder r = new StringBuilder();
	    for (int i = 0; i < count; i++) {
	        r.append(s);
	    }
	    return r.toString();
	}
	
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public static String numeroTarjetaFormateado(String nroTarjeta){
		return nroTarjeta.substring(0,4)+"-****-****-"+nroTarjeta.substring(12);
	}
	
	public static String importeFormateado(String simbolo,String importe){
		return simbolo+(importe==null||importe.isEmpty()?"0.00":importe);
	}
	
	public static String llenarCerosAlaIzquierda(String text, int longitud){
		
		 String formatted = String.format("%0" + longitud + "d", Long.valueOf(text));
		
		return formatted;
	}
}
