package pe.bn.com.sate.ope.transversal.util.enums;

import java.util.Calendar;
import java.util.Date;

public enum Mes {
	ENERO(1, "enero","ENE"),
	FEBRERO(2, "febrero","FEB"),
	MARZO(3, "marzo","MAR"),
	ABRIL(4, "abril","ABR"),
	MAYO(5, "mayo","MAY"),
	JUNIO(6,"junio","JUN"),
	JULIO(7, "julio","JUL"),
	AGOSTO(8, "agosto","AGO"),
	SEPTIEMBRE(9, "septiembre","SEP"),
	OCTUBRE(10, "octubre","OCT"), 
	NOVIEMBRE(11,"noviembre","NOV"),
	DICIEMBRE(12, "diciembre","DIC");

	int id;
	String nombre;
	String abr;

	private Mes(int id, String nombre,String abr) {
		this.id = id;
		this.nombre = nombre;
		this.abr =abr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getAbr() {
		return abr;
	}

	public void setAbr(String abr) {
		this.abr = abr;
	}

	public static Mes obtenerMes(int id) {
		for (Mes mes : values()) {
			if (mes.getId() == id) {
				return mes;
			}
		}

		return null;
	}
	
	public static Date getPrimerDiaDelMes() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
				cal.getActualMinimum(Calendar.DAY_OF_MONTH),
				cal.getMinimum(Calendar.HOUR_OF_DAY),
				cal.getMinimum(Calendar.MINUTE),
				cal.getMinimum(Calendar.SECOND));
		return cal.getTime();
	}

	public static Date getUltimoDiaDelMes() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH),
				cal.getActualMaximum(Calendar.DAY_OF_MONTH),
				cal.getMaximum(Calendar.HOUR_OF_DAY),
				cal.getMaximum(Calendar.MINUTE),
				cal.getMaximum(Calendar.SECOND));
		return cal.getTime();
	}
	
	public static String obtenerAbreviaturaMesFecha(int mesFecha){
		for (Mes mes : Mes.values()) {
			if(mes.getId()==mesFecha){
				return mes.getAbr();
			}
		}
		return null;
	}

}
