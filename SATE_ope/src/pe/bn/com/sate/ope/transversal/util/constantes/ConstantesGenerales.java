package pe.bn.com.sate.ope.transversal.util.constantes;

public class ConstantesGenerales {

	public static final int TIEMPO_MAXIMO_INACTIVIDAD = 1000 * 60 * 10;

	public static final String MENSAJE_SESION_EXPIRADA = "Estimado Usuario, su tiempo de sesión ha expirado";

	public static final String WS_SIN_CONEXION = "No se puede conectar al servicio web de autentica";

	public static final String DESC_VERSIONES = "Versiones";
	public static final String DESC_MENSAJES = "Mensajes";
	public static final String PORCENTAJE_EFECTIVO = "10000"; // 2 decimales

	/**
	 * Constantes para los mensajes de validacion, operacion exitosa
	 */
	public static final int SEVERITY_INFO = 1;
	public static final int SEVERITY_WARN = 2;
	public static final int SEVERITY_ERROR = 3;
	public static final int SEVERITY_FATAL = 4;

	public static final String TITULO_MENSAJE = "Mensaje";

	// Constantes servicio web autentica
	public static String WS_CLAVES_OPERACION_EXISTOSA = "00";
	public static int LONGITUD_USUARIO = 4;
	public static int LONGITUD_CLAVE = 8;
	public static int WS_CLAVES_NUMERO_CARACTERES_PASSWORD = 8;
	public static String WS_CLAVES_CONSTID = "00";
	public static String WS_CLAVES_APP = "SATE";
	public static int WS_CLAVES_POSICION_STATUS = 0;
	public static int WS_CLAVES_POSICION_MENSAJE_FALLO_STATUS = 1;
	public static int WS_CLAVES_POSICION_CODIGO_AREA = 1;
	public static int WS_CLAVES_POSICION_CODIGO_EMPLEADO = 3;
	public static int WS_CLAVES_POSICION_PERMISOS = 4;
	public static int WS_CLAVES_POSICION_NOMBRES = 5;
	public static int WS_CLAVES_POSICION_AREA = 6;
	public static int WS_CLAVES_POSICION_CARGO = 11;
	public static int WS_CLAVES_POSICION_DNI = 9;

	// Constantes para los segmentos de nombre completo
	public static int WS_CLAVES_NOMBRE = 2;
	public static int WS_CLAVES_APPATERNO = 1;
	public static int WS_CLAVES_APMATERNO = 0;

	// Constantes de parametros
	public static final String TITULO_ERROR_AGREGAR_PARAMETRO = "ERROR AGREGAR PARAMETRO";
	public static final String TITULO_ERROR_EDITAR_PARAMETRO = "ERROR EDITAR PARAMETRO";
	public static final String TITULO_ERROR_OBTENER_PARAMETRO = "ERROR AL OBTENER PARAMETROS";

	public static final String ERROR_NEGOCIO_AFILIAR_EMPRESA = "Error al afiliar una empresa o unidad ejecutora en el negocio";
	public static final String ERROR_NEGOCIO_OBTENER_EMPRESA = "Error al obtener una empresa o unidad ejecutora en el negocio";

	public static final String ERROR_NEGOCIO_LOGICA_GENERAL = "Error de logica general en el negocio";

	// Constantes de resumenes
	public static final String TITULO_ERROR_OBTENER_RESUMEN = "ERROR AL OBTENER RESUMENES";

	// Mensaje validacion fechas
	public static final String ERROR_FECHA_ANTES = "La fecha inicial debe estar antes";

	// Ambientes
	public static final String AMBIENTE_DESA = "desa";
	public static final String AMBIENTE_CERT = "cert";
	public static final String AMBIENTE_PROD = "prod";

	public static final String USO_EXTRANJERO = "SI";
	public static final String USO_NACIONAL = "NO";

	public static final String BIM_CORPORATE = "530927";
	public static final String BIM_BLACK = "531013";
	
	public static final String ENTREGA_AGENCIA_BN = "4";
	public static final String ENTREGA_UNIDAD_EJECUTORA = "3";

	public static final String USER_SYSTEM = "RRB6";

	public static final String SIMBOLO_VACIO = "- -";

	// HOST
	/* CODIGOS RETORNO */

	public final static String LONGITUD_DEFECTO = "9999";
	public final static String SEG_LOGIN_TRAN = "WS56";

	public final static String ERROR_NULO_OUTPUT = "9989";

	public final static String ERROR_INTERFASE = "9984";
	public final static String ERROR_HOST = "9985";

	// PARAMETRO COMP
	public static final String SISTEMA = "SATE";
	public static final String CUENTA = "USERSATE";
	public static final String SEMILLA = "semillaSATE";
	public static final String IDUSUARIO = "USERSATE";

	// GRUPO RENIEC
	public final static String GRUPO_CONEXION_RENIEC = "CONEXION_RENIEC";
	public final static String PARAM_CONSULTRENIEC = "CONSULTARENIEC";
	public final static String PARAM_SISTEMARENIEC = "SISTEMARENIEC";
	public final static String PARAM_USER1RENIEC = "USER1RENIEC";
	public final static String PARAM_USERRENIEC = "USERRENIEC";

	// GRUPO MC
	public final static String GRUPO_CONEXION_MC = "CONEXION_MC";
	public final static String PARAM_CODIGOEMISOR = "CODIGOEMISORMC";
	public final static String PARAM_CODIGOUSUARIO = "CODIGOUSUARIOMC";
	public final static String PARAM_NUMTERMINAL = "NUMTERMINALMC";
	public final static String PARAM_PREFIJONUMREFERENCIA = "PREFIJONUMREFERENCIAMC";
	public final static String PARAM_WSUSUARIOMC = "WSUSUARIOMC";
	public final static String PARAM_WSCLAVEMC = "WSCLAVEMC";
	public static final String PARAM_WSURLSOAPMC = "WSURLSOAPMC";
	public final static String PARAM_COMERCIO = "COMERCIO";


	// GRUPO TIEMPO
	public final static String GRUPO_TIEMPO = "TIEMPO";
	public final static String PARAM_SESIONEXPIRADATIEMPO = "SESIONEXPIRADATIEMPO";
	public final static String PARAM_CONEXIONTIEMPO = "CONEXIONTIEMPO";
	public final static String PARAM_RESPUESTATIEMPO = "RESPUESTATIEMPO";

	// TODO MODIFICAR =========> RUTA CLAVE SEGURA SATE OPE
	public static final String RUTA_CLAVE_SEGURA = "C://opt//software//key//sate//clavesegurades.key";
	 //public static final String RUTA_CLAVE_SEGURA = "//opt//software//key//sate//clavesegurades.key";


	// HOST TIPO OPERACION
	public static String GENERAR_CLAVE = "01";
	public static String VERIFICAR_CLAVE = "02";
	public static String CAMBIAR_CLAVE = "03";
	public static String CAMBIAR_CLAVE_OLVIDO = "04";

	// CONSTANTES CODIGO_REQUERIMIENTO ENVIO SMS Y CORREO
	public static Integer COD_REQUERIMIENTO_ENVIO_SMS = 52;
	//public static Integer COD_REQUERIMIENTO_ENVIO_CORREO = 97;
	public static Integer COD_REQUERIMIENTO_ENVIO_CORREO = 34;
	public static String CONST_RespSoN_S = "S";

	public static String ESTADO_EMPRESA_ACTIVO = "A";
	public static String ESTADO_EMPRESA_INACTIVO = "I";

	public static String ESTADO_USUARIO_ACTIVO = "A";
	public static String ESTADO_USUARIO_INACTIVO = "I";

	public static String ESTADO_SERVICIO_ACTIVO = "A";
	public static String ESTADO_SERVICIO_INACTIVO = "I";

	public static String ESTADO_DETSERV_ACTIVO = "A";
	public static String ESTADO_DETSERV_INACTIVO = "I";

	public static String ESTADO_CLAVE_ACTIVO = "A";
	public static String ESTADO_CLAVE_INACTIVO = "I";

	public static String ESTADO_TOKEN_ACTIVO = "A";
	public static String ESTADO_TOKEN_BLOQUEADO = "B";

	public static String ESTADO_TOKEN_DESBLOQUEADO = " ";

	public static String PERFIL_FIRMANTE = "F";
	public static String PERFIL_OPERADOR = "O";

	public static String CONST_TOKEN_DISPONIBLE = "D";
	public static String CONST_TOKEN_NODISPONIBLE = "N";

	public static String CONST_ACCION_INSERT = "I";
	public static String CONST_ACCION_UPDATE = "U";
	public static String CONST_ACCION_DELETE = "D";

	// ROL NUEVO
	public static long ROL_NUEVO = 0;

	public static String ERROR_PERSISTENCE_GENERAL = "Error en la BD, consulte con el administrador.";
	public static String ERROR_PERSISTENCE_INTERNAL = "Error en la BDSATE, consulte con el administrador.";
	public static String ERROR_PERSISTENCE_EXTERNAL_BN_TABLAS = "Error en la BDSATE, consulte con el administrador.";
	public static String ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_SIMM = "Error con WS Correos, consulte con el administrador.";
	public static String ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_IGF = "Error con WS InterfaceGatewayFacade, consulte con el administrador.";
	public static String ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_MC = "Error con WS MC, consulte con el administrador.";
	public static String ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_RENIEC = "Error con WS RENIEC, consulte con el administrador.";

	
	/*MGL*/
	public static final String certificadoIzipay = "D:/certificado/certificadoIzipay.crt";

}
