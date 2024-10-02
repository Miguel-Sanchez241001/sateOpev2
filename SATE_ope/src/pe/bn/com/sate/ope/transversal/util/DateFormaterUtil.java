package pe.bn.com.sate.ope.transversal.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateFormaterUtil {

	private static final DateTimeFormatter formatterFechaCompleta = DateTimeFormat
			.forPattern("dd/MM/yyyy");
	private static final DateTimeFormatter formatterHora24Completa = DateTimeFormat
			.forPattern("HH:mm:ss");
	private static final DateTimeFormatter formatterFechaHora24Completa = DateTimeFormat
			.forPattern("dd/MM/yyyy HH:mm:ss");
	private static final DateTimeFormatter formatterFechaHoraCompleta = DateTimeFormat
			.forPattern("dd/MM/yyyy hh:mm:ss");
	private static final DateTimeFormatter formatterTimestamp = DateTimeFormat
			.forPattern("yyyy-mm-dd hh:mm:ss");
	private static final DateTimeFormatter formatterHora = DateTimeFormat
			.forPattern("hh");
	private static final DateTimeFormatter formatterHora24 = DateTimeFormat
			.forPattern("HH");
	private static final DateTimeFormatter formatterMinutos = DateTimeFormat
			.forPattern("m");
	private static final DateTimeFormatter formatterFechaBD = DateTimeFormat
			.forPattern("dd/MM/yy");
	private static final DateTimeFormatter formatterFechaConstancia = DateTimeFormat
			.forPattern("dd/MM/yyyy HH:mm:ss");

	public static String fechaHoraCompleta(Date date) {
		if (date == null)
			return null;
		return formatterFechaConstancia.print(DateTime.now().withMillis(
				date.getTime()));
	}

	public static String fechaHoy() {
		return formatterFechaCompleta.print(DateTime.now());
	}

	public static String fechaHora24CompletaFormateada(Timestamp fechaHora) {
		if (fechaHora == null) {
			return null;
		}
		return formatterFechaHora24Completa.print(fechaHora.getTime());
	}

	public static String fechaHoraCompletaFormateada(Timestamp fechaHora) {
		if (fechaHora == null) {
			return null;
		}
		return formatterFechaHoraCompleta.print(fechaHora.getTime());
	}

	public static String fechaCompletaFormateada(Timestamp fecha) {
		if (fecha == null) {
			return null;
		}
		return formatterFechaCompleta.print(DateTime.now().withMillis(
				fecha.getTime()));
	}

	public static String horaCompletaFormateada(Timestamp hora) {
		if (hora == null) {
			return null;
		}
		return formatterHora24Completa.print(DateTime.now().withMillis(
				hora.getTime()));
	}

	public static DateTime toDateTime(Date fecha) {
		DateTime dateTime = null;
		if (fecha != null) {
			dateTime = new DateTime(fecha);
		}
		return dateTime;
	}

	public static String fechaCompletaFormateada(Date fecha) {
		if (fecha == null) {
			return null;
		}
		return formatterFechaCompleta.print(DateTime.now().withMillis(
				fecha.getTime()));
	}

	public static String horaFechaFormateada(Timestamp fecha, Timestamp hora) {
		if (fecha == null || hora == null) {
			return null;
		}
		return fechaCompletaFormateada(fecha) + " "
				+ horaCompletaFormateada(hora);
	}

	public static Timestamp horaFechaTimestamp(Timestamp fecha, Timestamp hora) {
		if (fecha == null || hora == null) {
			return null;
		}
		DateTime dateTime = formatterFechaHora24Completa
				.parseDateTime(horaFechaFormateada(fecha, hora));
		return convertirTimestamp(formatoTimestamp(dateTime));
	}

	public static String formatoTimestamp(DateTime dateTime) {
		if (dateTime == null) {
			return null;
		}
		return formatterTimestamp.print(dateTime.getMillis());
	}

	public static Timestamp convertirTimestamp(String timestampFormat) {
		if (timestampFormat == null) {
			return null;
		}
		return Timestamp.valueOf(timestampFormat);
	}

	public static Timestamp convertirTimestamp(DateTime dateTime) {
		if (dateTime == null) {
			return null;
		}
		return Timestamp.valueOf(formatoTimestamp(dateTime));
	}

	public static Timestamp convertirTimestamp(Date date) {
		if (date == null) {
			return null;
		}
		return Timestamp.valueOf(formatoTimestamp(new DateTime(date)));
	}

	public static String formatoHora(Timestamp timestamp) {
		if (timestamp == null) {
			return null;
		}
		return formatterHora.print(timestamp.getTime());
	}

	public static String formatoHora24(Timestamp timestamp) {
		if (timestamp == null) {
			return null;
		}
		return formatterHora24.print(timestamp.getTime());
	}

	public static String formatoMinuto(Timestamp timestamp) {
		if (timestamp == null) {
			return null;
		}
		return formatterMinutos.print(timestamp.getTime());
	}

	public static String formatoFechaBD(Date date) {
		if (date == null)
			return null;
		return formatterFechaBD.print(date.getTime());
	}


	public static final String getTimeStamp() {
		Calendar fecha = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat(
				"yyyy-MM-dd-HH.mm.ss.SSSSSS");
		return formato.format(fecha.getTime());
	}
	
}