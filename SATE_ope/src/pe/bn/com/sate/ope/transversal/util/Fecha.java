package pe.bn.com.sate.ope.transversal.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import pe.bn.com.sate.ope.transversal.util.enums.Mes;

public class Fecha {
	private static final Logger logger = Logger.getLogger(Fecha.class);

	/**
	 * Metodo que sirve para obtener la fecha en el formato "dd/MM/yy".
	 * 
	 * @param fecha
	 * @return
	 */
	public static String formatearFechaReporte(Date fecha) {
		DateFormat fechaFormato = new SimpleDateFormat("dd.MM.yy");
		return fechaFormato.format(fecha);
	}

	/**
	 * Metodo que sirve para obtener la fecha en el formato "dd/MM/yy".
	 * 
	 * @param fecha
	 * @return
	 */
	public static String transformarString(Date fecha) {
		DateFormat fechaFormato = new SimpleDateFormat("dd/MM/yy");
		return fechaFormato.format(fecha);
	}

	public static Date transformarADate(String fecha) {
		SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yy");
		try {
			return fechaFormato.parse(fecha);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
		}
		return null;
	}

	public static Date transformarADateMC(String fecha) {
		SimpleDateFormat fechaFormato = new SimpleDateFormat("yyyyMMdd");
		try {
			return fechaFormato.parse(fecha);
		} catch (ParseException e) {
			logger.info(e.getMessage());
		}
		return null;
	}

	public static Date sumarFechas(Date fecha, int dias) {
		Calendar fechaResultado = new GregorianCalendar();
		fechaResultado.setTime(fecha);
		fechaResultado.add(Calendar.DAY_OF_YEAR, dias);
		return fechaResultado.getTime();
	}

	/**
	 * Metodo que sirve para obtener la fecha en el formato "dd/MM/yyyy hh:mm a"
	 * .
	 * 
	 * @param fecha
	 */
	public static String transformarStringHora(Date fecha) {
		DateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		return fechaFormato.format(fecha);
	}

	/**
	 * Metodo que sirve para obtener la fecha del INICIO/FIN de semana del mes
	 * actual.
	 * 
	 * @param tipo
	 *            : 1=Fecha inicio de semana ,2=Fecha de fin de semana
	 */
	public static Date obtenerFechaSemana(int tipo) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.add(Calendar.WEEK_OF_YEAR, 0);
		cal.set(Calendar.DAY_OF_WEEK, (tipo == 1 ? Calendar.MONDAY
				: Calendar.SUNDAY));
		return new Date(cal.getTimeInMillis());
	}

	public static Date obtenerFechaMasReciente(List<Date> listaFechas) {
		for (int i = 0; i < listaFechas.size(); i++) {
			for (int j = i + 1; j < listaFechas.size(); j++) {
				if (listaFechas.get(i).before(listaFechas.get(j))) {
					Date aux = listaFechas.get(i);
					listaFechas.set(i, listaFechas.get(j));
					listaFechas.set(j, aux);
				}
			}
		}
		return listaFechas.get(listaFechas.size() - 1);
	}

	/**
	 * Metodo para comparar fecha con el formato dd/MM/yyyy
	 * 
	 * @return 0: fecha1 menor a fecha2 , 1: fecha1 igual fecha2 y 2 : fecha1
	 *         mayor fecha2
	 */
	public static int compararFechas(Date fecha1, Date fecha2) {
		Date primeraFecha = transformarADate(transformarString(fecha1));
		Date segundaFecha = transformarADate(transformarString(fecha2));
		if (primeraFecha.before(segundaFecha))
			return 0;
		else if (segundaFecha.before(primeraFecha))
			return 2;
		else
			return 1;
	}

	public static String obtenerHoraConFormato(Date fecha) {
		Calendar fechaRegistroCdc = new GregorianCalendar();
		fechaRegistroCdc.setTime(fecha);
		String horaConFormato = (fechaRegistroCdc.get(Calendar.HOUR_OF_DAY) <= 9 ? "0"
				+ fechaRegistroCdc.get(Calendar.HOUR_OF_DAY)
				: fechaRegistroCdc.get(Calendar.HOUR_OF_DAY))
				+ ":"
				+ (fechaRegistroCdc.get(Calendar.MINUTE) <= 9 ? "0"
						+ fechaRegistroCdc.get(Calendar.MINUTE)
						: fechaRegistroCdc.get(Calendar.MINUTE));
		return horaConFormato;
	}

	public static String obtenerFechaConFormato(Date fecha) {
		Calendar fechaRegistroCdc = new GregorianCalendar();
		fechaRegistroCdc.setTime(fecha);
		String fechaConFormato = fechaRegistroCdc.get(Calendar.DAY_OF_MONTH)
				+ " de "
				+ Mes.obtenerMes(fechaRegistroCdc.get(Calendar.MONTH) + 1)
						.getNombre() + " del "
				+ (fechaRegistroCdc.get(Calendar.YEAR));
		return fechaConFormato;
	}

	/**
	 * @param fecha
	 * @return La fecha con el formato año_mes_dia
	 */
	public static String obtenerFechaConFormatoOracleFinancial(Date fecha) {
		Calendar fechaRegistroCdc = new GregorianCalendar();
		fechaRegistroCdc.setTime(fecha);
		String fechaConFormato = fechaRegistroCdc.get(Calendar.YEAR)
				+ ""
				+ NumeroALetras.formatoNumero(
						(fechaRegistroCdc.get(Calendar.MONTH) + 1), 2)
				+ ""
				+ NumeroALetras.formatoNumero(
						fechaRegistroCdc.get(Calendar.DAY_OF_MONTH), 2);
		return fechaConFormato;
	}

	public static String obtenerPeriodoFecha(Date fecha) {
		Calendar fechaRegistroCdc = new GregorianCalendar();
		fechaRegistroCdc.setTime(fecha);
		String periodoConFormato = Mes
				.obtenerAbreviaturaMesFecha(fechaRegistroCdc
						.get(Calendar.MONTH) + 1)
				+ "-"
				+ NumeroALetras.formatoNumero(
						fechaRegistroCdc.get(Calendar.YEAR), 2).substring(2, 4);
		return periodoConFormato;
	}

	public static String formatearFechaEnEspaniol(Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MMM-yyyy",
				new Locale("ES"));
		return formateador.format(fecha);

	}

	public static String formatearFechaAfiliacion(String fechaAfiliacion) {
		return fechaAfiliacion.substring(0, 2) + "/"
				+ fechaAfiliacion.substring(2, 4) + "/"
				+ fechaAfiliacion.substring(4);
	}

	public static List<String> inicializarListaFechaCorte() {
		List<String> listaFechaCorteAnteriores = new ArrayList<String>();
		DateTime fechaActual = new DateTime(new Date());
		int diaActual = fechaActual.getDayOfMonth();

		DateTime primerDatePrevio, segundoDatePrevio;

		if (diaActual >= 28) {
			primerDatePrevio = new DateTime(fechaActual.getYear(),
					fechaActual.getMonthOfYear(), 28, 0, 0);
			segundoDatePrevio = new DateTime(fechaActual.getYear(),
					fechaActual.getMonthOfYear(), 15, 0, 0);
		} else if (diaActual >= 15) {
			primerDatePrevio = new DateTime(fechaActual.getYear(),
					fechaActual.getMonthOfYear(), 15, 0, 0);
			segundoDatePrevio = new DateTime(fechaActual.minusMonths(1)
					.getYear(), fechaActual.minusMonths(1).getMonthOfYear(),
					28, 0, 0);
		} else {
			primerDatePrevio = new DateTime(fechaActual.minusMonths(1)
					.getYear(), fechaActual.minusMonths(1).getMonthOfYear(),
					28, 0, 0);
			segundoDatePrevio = new DateTime(fechaActual.minusMonths(1)
					.getYear(), fechaActual.minusMonths(1).getMonthOfYear(),
					15, 0, 0);
		}

		listaFechaCorteAnteriores.add(DateFormaterUtil
				.formatoFechaBD(primerDatePrevio.toDate()));
		listaFechaCorteAnteriores.add(DateFormaterUtil
				.formatoFechaBD(segundoDatePrevio.toDate()));

		for (int i = 1; i <= 4; i++) {
			listaFechaCorteAnteriores.add(DateFormaterUtil
					.formatoFechaBD(primerDatePrevio.minusMonths(i).toDate()));
			listaFechaCorteAnteriores.add(DateFormaterUtil
					.formatoFechaBD(segundoDatePrevio.minusMonths(i).toDate()));
		}

		return listaFechaCorteAnteriores;

	}

	public static Date dateAntes(Date date, int dias) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -dias);
		return cal.getTime();
	}

	public static void main(String... args) {
		inicializarListaFechaCorte();
	}

}
