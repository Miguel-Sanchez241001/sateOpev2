package pe.bn.com.sate.ope.transversal.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.joda.time.DateTime;
import org.primefaces.context.RequestContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.security.core.context.SecurityContextHolder;

import pe.bn.com.sate.ope.transversal.configuration.security.UsuarioSeguridad;

public class UsefulWebApplication {

	/**
	 * Este metodo publica un mensaje en la vista JSF
	 * 
	 * @param severidad
	 *            : INFO=1, WARN=2, ERROR=3, FATAL=4.
	 * @param titulo
	 *            : nombre del mensaje.
	 * @param descripcion
	 *            : cuerpo del mensaje.
	 */
	public static void mostrarMensajeJSF(int severidad, String titulo, String descripcion) {
		FacesMessage facesMessage = null;
		switch (severidad) {
		case 1:
			facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, descripcion);
			break;
		case 2:
			facesMessage = new FacesMessage(FacesMessage.SEVERITY_WARN, titulo, descripcion);
			break;
		case 3:
			facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, titulo, descripcion);
			break;
		case 4:
			facesMessage = new FacesMessage(FacesMessage.SEVERITY_FATAL, titulo, descripcion);
			break;
		default:
			break;
		}
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

	/**
	 * Este metodo permite ejecutar una instrucción Primefaces
	 * 
	 * @param sentencia
	 *            : es la instrucción a ejecutar. Ejemplo=
	 *            "PF('dialogoWidget').show()"
	 */
	public static void ejecutar(String sentencia) {
		RequestContext.getCurrentInstance().execute(sentencia);
	}

	/**
	 * Este metodo permite generar un dialogo
	 * 
	 * @param dialogo
	 *            : nombre del dialogo. Ejemplo= "PF('dialogoWidget').show()"
	 */
	public static void generarDialogo(String dialogo) {
		RequestContext.getCurrentInstance().execute("PF('" + dialogo + "')");
	}

	/**
	 * Este metodo permite redirigir hacia otra pagina de la aplicación.
	 * 
	 * @param pagina
	 *            : es una pagina, dentro de un directorio. Ejemplo=
	 *            "/acceso/iniciarSesion.jsf",
	 *            "consulta/consultarAccionistas.jsf"
	 */
	public static void redireccionar(String pagina) throws IOException {
		ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
		String ctxPath = ((ServletContext) ctx.getContext()).getContextPath();
		pagina = (pagina.startsWith("/") ? pagina : "/" + pagina);
		ctx.redirect(ctxPath + pagina);
	}

	/**
	 * Este metodo permite actualizar un componente o control en la Vista de
	 * JSF.
	 * 
	 * @param id
	 *            : es el valor del componente a actualizar en la vista.
	 *            Ejemplo= "actualizarComponente("form:control");"
	 */
	public static void actualizarComponente(String id) {
		RequestContext.getCurrentInstance().update(id);
	}

	/**
	 * Se obtiene una fecha de haces n meses-> fecha = fecha actual - n meses
	 * 
	 * @param fecha
	 */
	public static Date obtenerFecha(int meses) {

		Date fecha;

		Calendar calDesde = Calendar.getInstance();
		calDesde.add(Calendar.MONTH, -meses);

		fecha = calDesde.getTime();
		return fecha;
	}

	/**
	 * Modificar las horas, minutos y segundos de una fecha Ejm: YY/MM/AA
	 * 00:00:00
	 */
	@SuppressWarnings("deprecation")
	public static Date modificarFecha(Date fecha, int horas, int minutos, int segundos) {

		fecha.setHours(horas);
		fecha.setMinutes(minutos);
		fecha.setSeconds(segundos);
		return fecha;
	}

	public static StreamedContent convertirAStreamed(byte[] archivo, String nombreArchivo) {
		StreamedContent streamedContent = null;
		if (archivo != null) {
			InputStream is = new ByteArrayInputStream(archivo);
			streamedContent = new DefaultStreamedContent(is, null, nombreArchivo);
		}
		return streamedContent;
	}

	/**
	 * Obtener la cadena fecha de una Fecha "X"<br>
	 * Ejm: 01/04/2015 06:45:12 -> Resultado: 01/04/2015<br>
	 * 
	 * @param fecha
	 * @param patronFormato
	 *            : Patron de formato para la fecha Ejm: "dd/MM/yyyy" o
	 *            "yyyyMMdd"
	 * @return
	 */
	public static String obtenerCadenaFecha(Date fecha, String patronFormato) {

		DateTime f = new DateTime(fecha);
		String fFormateada = f.toString(patronFormato);
		return fFormateada;

	}

	/**
	 * 
	 * Obtiene el proximo número que sigue, para generar el codigo unico que
	 * representa a un proceso como OA,OP,OV, Liquidacion de Pago y Venta
	 * 
	 * @param codigoCadena
	 *            : Ultimo codigo generado
	 * @param tamPrefijo
	 *            : tamanio del prefijo inicial ejm: "OAC" (tam = 3) o
	 *            "OVNC"(tam = 4)
	 * 
	 * @return
	 */

	/**
	 * Se genera un codigo consecutivo generado para las 03 Ordenes: Pago,
	 * Anotacion y Venta
	 * 
	 * @param prefijo
	 *            : Es un String de 3,4,5 caracteres
	 * @param anio
	 *            : Es un Integer que representa el año, debe ser mayor a 1900
	 *            y menor a 9999
	 * @param siguienteSecuencia
	 *            : Es un Integer con el numero a concatenar.
	 */

	/**
	 * Obtiene el codigo autogenerado, segun un prefijo previamente definido<br>
	 * y el ultimo codigo generado.<br>
	 * <br>
	 * El codigo autogenerado esta conformado por : PREFIJO DEL CODIGO + AÑO
	 * ACTUAL + 5 DIGITOS
	 * 
	 * @param ultimoCodigoGenerado
	 *            : Este codigo se obtiene con una consulta a la BD
	 * @param prefijoCodigo
	 *            : es el prefijo que antepone al codigo autogenerado<br>
	 *            ejm: RDL, OAC, OANC, RUG, OVC, etc.
	 * @return
	 */

	public static String obtenerNombreDeArchivo(String rutaConNombre) {
		String nombreArchivo = null;
		if (rutaConNombre != null) {
			int indiceDelUltimoSlash = rutaConNombre.lastIndexOf("\\");
			nombreArchivo = rutaConNombre.substring(indiceDelUltimoSlash + 1, rutaConNombre.length());
		}
		return nombreArchivo;
	}

	/**
	 * Convierte una cantidad de dolares a soles, segun un tipo de cambio
	 * 
	 * @param tipoCambio
	 * @param cantidadSol
	 * @return
	 */
	public static BigDecimal convertirASolCantidadDol(BigDecimal tipoCambio, BigDecimal cantidadSol) {
		BigDecimal cantidadDol = BigDecimal.ZERO;
		if (tipoCambio == null) {
			tipoCambio = BigDecimal.ZERO;
		}
		cantidadDol = tipoCambio.multiply(cantidadSol).setScale(2, RoundingMode.HALF_UP);
		return cantidadDol;
	}

	/**
	 * Convierte una cantidad de soles a dolares, segun un tipo de cambio
	 * 
	 * @param tipoCambio
	 * @param cantidadDol
	 * @return
	 */
	public static BigDecimal convertirADolCantidadSol(BigDecimal tipoCambio, BigDecimal cantidadDol) {
		BigDecimal cantidadSol = BigDecimal.ZERO;

		if (tipoCambio == null) {
			return BigDecimal.ZERO;
		}
		cantidadSol = cantidadDol.divide(tipoCambio, 2, RoundingMode.HALF_UP);

		return cantidadSol;
	}	

	public static String obtenerRutaReportes() {
		return FacesContext.getCurrentInstance().getExternalContext().getRealPath("/resources/reportes/");
	}
	
	
	public static UsuarioSeguridad obtenerUsuario() {
		if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
			return (UsuarioSeguridad) SecurityContextHolder.getContext().getAuthentication().getDetails();
		} else {
			return null;
		}
	}
	
	
	public static String formatoNumTarjeta(String numeroTarjeta){
		return (numeroTarjeta==null || numeroTarjeta.isEmpty() )?"Sin nro.tarjeta":numeroTarjeta;
	}

}