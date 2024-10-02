package pe.bn.com.sate.ope.transversal.util.constantes;

import java.util.HashMap;
import java.util.Map;

public class ConstantesWS {
		
	public static final String COD_EMISOR          = "[COD_EMISOR]";          // Dinamico/Fijo => DESARROLLO
	public static final String COD_USUARIO         = "[COD_USUARIO]";         // Dinamico/Fijo => DESARROLLO
	public static final String NUM_TERMINAL        = "[NUM_TERMINAL]";        // Dinamico/Fijo => DESARROLLO
	public static final String NUM_REFERENCIA      = "[NUM_REFERENCIA]";      // Dinamico => Autoincremental
	public static final String ORGANIZACION        = "[ORGANIZACION]";        // Dinamico => Frontend/Sistema
	public static final String NUM_TARJETA         = "[NUM_TARJETA]";         // Dinamico => Frontend/Sistema
	public static final String FECHA_EXPIRACION    = "[FECHA_EXPIRACION]";    // Dinamico => Frontend/Sistema
	public static final String CODIGO_BLOQUEO      = "[CODIGO_BLOQUEO]";      // Dinamico => Frontend/Sistema
	public static final String MOTIVO_BLOQUEO      = "[MOTIVO_BLOQUEO]";      // Dinamico => Frontend/Sistema
	public static final String COMERCIO            = "[COMERCIO]";            // Dinamico/Fijo => DESARROLLO
	public static final String FECHA_TXN_TERMINAL  = "[FECHA_TXN_TERMINAL]";  // Dinamico => Frontend/Sistema YYYYMMDD
	public static final String HORA_TXN_TERMINAL   = "[HORA_TXN_TERMINAL]";   // Dinamico => Frontend/Sistema HHMMSS
	public static final String WS_USUARIO          = "[WS_USUARIO]";          // Fijo => Parametros Comp
	public static final String WS_CLAVE            = "[WS_CLAVE]";            // Fijo => Parametros Comp
	public static final String RESERVADO           = "[RESERVADO]";           // Fijo => vacio
	public static final String MONEDA              = "[MONEDA]";              // Fijo => 604:Soles
	public static final String NRO_DOCUMENTO       = "[NRO_DOCUMENTO]";       // Dinamico => Frontend/Sistema
	public static final String CORREO_ELECTRONICO  = "[CORREO_ELECTRONICO]";  // Dinamico => Frontend/Sistema
	public static final String NRO_CELULAR         = "[NRO_CELULAR]";         // Dinamico => Frontend/Sistema
	public static final String COD_MONEDA = "1";
	
	
	public static final String NUM_TARJETA_MONEDERO="[NUM_TARJETA_MONEDERO]"; 
	public static final String MONEDA_PRODUCTO="[MONEDA_PRODUCTO]"; 
	public static final String NUM_CUENTA="[NUM_CUENTA]"; 
		
	public static final String TITULAR_APELLIDOS="[TITULAR_APELLIDOS]";
	public static final String TITULAR_NOMBRE="[TITULAR_NOMBRE]";
	public static final String TITULAR_NUM_CELULAR="[TITULAR_NUM_CELULAR]";
	public static final String TITULAR_TELEFONO_DOMICILIO="[TITULAR_TELEFONO_DOMICILIO]";
	public static final String TITULAR_EMAIL="[TITULAR_EMAIL]";		
	public static final String NUM_DEPENDIENTE="[NUM_DEPENDIENTE]";
	public static final String TITULAR_PROFESION="[TITULAR_PROFESION]";
	
	public static final String TIPO_DOCUMENTO="[TIPO_DOCUMENTO]";
	public static final String NUM_DOCUMENTO="[NUM_DOCUMENTO]";


	
	
 	// Constante para Modificacion_Tarjetas
		public static final String MODIFICACION_TARJETA_XML = "<![CDATA[\n"
			    + "<Modificacion_Tarjeta>\n"
			    + "  <CodEmisor>[COD_EMISOR]</CodEmisor>\n"
			    + "  <CodUsuario>[COD_USUARIO]</CodUsuario>\n"
			    + "  <NumTerminal>[NUM_TERMINAL]</NumTerminal>\n"
			    + "  <NumReferencia>[NUM_REFERENCIA]</NumReferencia>\n"
			    + "  <MonedaProducto>[MONEDA_PRODUCTO]</MonedaProducto>\n"
			    + "  <CodigoProducto></CodigoProducto>\n"
			    + "  <NumCuentaAsociada></NumCuentaAsociada>\n"
			    + "  <IndAutGenCodCliente></IndAutGenCodCliente>\n"
			    + "  <NumTarjetaMonedero>[NUM_TARJETA_MONEDERO]</NumTarjetaMonedero>\n"
			    + "  <TipoTarjeta></TipoTarjeta>\n"
			    + "  <SecuenciaTarjeta></SecuenciaTarjeta>\n"
			    + "  <TipoEmisionTarjeta></TipoEmisionTarjeta>\n"
			    + "  <NombrePlasticoLinea1></NombrePlasticoLinea1>\n"
			    + "  <NombrePlasticoLinea2></NombrePlasticoLinea2>\n"
			    + "  <CodigoBloqueo>[CODIGO_BLOQUEO]</CodigoBloqueo>\n"
			    + "  <MotivoBloqueo>[MOTIVO_BLOQUEO]</MotivoBloqueo>\n"
			    + "  <DireccionEnvioTipoVia></DireccionEnvioTipoVia>\n"
			    + "  <DireccionEnvioNombreVia></DireccionEnvioNombreVia>\n"
			    + "  <DireccionEnvioNum></DireccionEnvioNum>\n"
			    + "  <DireccionEnvioNumDpto></DireccionEnvioNumDpto>\n"
			    + "  <DireccionEnvioOficina></DireccionEnvioOficina>\n"
			    + "  <DireccionEnvioPiso></DireccionEnvioPiso>\n"
			    + "  <DireccionEnvioManzana></DireccionEnvioManzana>\n"
			    + "  <DireccionEnvioLote></DireccionEnvioLote>\n"
			    + "  <DireccionEnvioNumInterior></DireccionEnvioNumInterior>\n"
			    + "  <DireccionEnvioSector></DireccionEnvioSector>\n"
			    + "  <DireccionEnvioKilometro></DireccionEnvioKilometro>\n"
			    + "  <DireccionEnvioTipoZona></DireccionEnvioTipoZona>\n"
			    + "  <DireccionEnvioNombreZona></DireccionEnvioNombreZona>\n"
			    + "  <DireccionEnvioReferencia></DireccionEnvioReferencia>\n"
			    + "  <DireccionEnvioUbigeo></DireccionEnvioUbigeo>\n"
			    + "  <IndTipoDireccion></IndTipoDireccion>\n"
			    + "  <SucursalOriginal></SucursalOriginal>\n"
			    + "  <Mandatorio1></Mandatorio1>\n"
			    + "  <Mandatorio2></Mandatorio2>\n"
			    + "  <SucursalActual></SucursalActual>\n"
			    + "  <CodigoPromocion></CodigoPromocion>\n"
			    + "  <FechaTxnTerminal>[FECHA_TXN_TERMINAL]</FechaTxnTerminal>\n"
			    + "  <HoraTxnTerminal>[HORA_TXN_TERMINAL]</HoraTxnTerminal>\n"
			    + "  <WSUsuario>[WS_USUARIO]</WSUsuario>\n"
			    + "  <WSClave>[WS_CLAVE]</WSClave>\n"
			    + "  <Reservado>[RESERVADO]</Reservado>\n"
			    + "</Modificacion_Tarjeta>]]>";

	// Constante para Informacion_Tarjeta
	public static final String Consulta_Datos_Tarjeta_XML = "<![CDATA[\n"
		    + "<Consulta_Datos_Tarjeta>\n"
		    + "  <CodEmisor>[COD_EMISOR]</CodEmisor>\n"
		    + "  <CodUsuario>[COD_USUARIO]</CodUsuario>\n"
		    + "  <NumTerminal>[NUM_TERMINAL]</NumTerminal>\n"
		    + "  <NumReferencia>[NUM_REFERENCIA]</NumReferencia>\n"
		    + "  <NumTarjeta>[NUM_TARJETA]</NumTarjeta>\n"
		    + "  <FechaExpiracion>[FECHA_EXPIRACION]</FechaExpiracion>\n"
		    + "  <Comercio>[COMERCIO]</Comercio>\n"
		    + "  <FechaTxnTerminal>[FECHA_TXN_TERMINAL]</FechaTxnTerminal>\n"
		    + "  <HoraTxnTerminal>[HORA_TXN_TERMINAL]</HoraTxnTerminal>\n"
		    + "  <WSUsuario>[WS_USUARIO]</WSUsuario>\n"
		    + "  <WSClave>[WS_CLAVE]</WSClave>\n"
		    + "  <Reservado>[RESERVADO]</Reservado>\n"
		    + "</Consulta_Datos_Tarjeta>]]>";


	// Constante para Consulta_Movimientos_Expediente
	public static final String CONSULTA_MOVIMIENTOS_EXPEDIENTE_XML = "<![CDATA[\n"
			+ "<Consulta_Movimientos_Expediente>\n"
			+ "  <CodEmisor>[COD_EMISOR]</CodEmisor>\n"
			+ "  <CodUsuario>[COD_USUARIO]</CodUsuario>\n"
			+ "  <NumTerminal>[NUM_TERMINAL]</NumTerminal>\n"
			+ "  <NumReferencia>[NUM_REFERENCIA]</NumReferencia>\n"	
			+ "  <NumCuenta>[NUM_CUENTA]</NumCuenta>\n"
			+ "  <FechaExpiracion>[FECHA_EXPIRACION]</FechaExpiracion>\n"
			+ "  <Comercio>[COMERCIO]</Comercio>\n"
			+ "  <Moneda>[MONEDA]</Moneda>\n"
			+ "  <FechaTxnTerminal>[FECHA_TXN_TERMINAL]</FechaTxnTerminal>\n"
			+ "  <HoraTxnTerminal>[HORA_TXN_TERMINAL]</HoraTxnTerminal>\n"
			+ "  <WSUsuario>[WS_USUARIO]</WSUsuario>\n"
			+ "  <WSClave>[WS_CLAVE]</WSClave>\n"
			+ "  <Reservado>[RESERVADO]</Reservado>\n"
			+ "</Consulta_Movimientos_Expediente>]]>";

	// Constante para Consulta_Datos_Expediente
	public static final String CONSULTA_DATOS_EXPEDIENTE_XML = "<![CDATA[\n"
			+ "<Consulta_Datos_Expediente>\n"
			+ "  <CodEmisor>[COD_EMISOR]</CodEmisor>\n"
			+ "  <CodUsuario>[COD_USUARIO]</CodUsuario>\n"
			+ "  <NumTerminal>[NUM_TERMINAL]</NumTerminal>\n"
			+ "  <NumReferencia>[NUM_REFERENCIA]</NumReferencia>\n"		
			+ "  <NumCuenta>[NUM_CUENTA]</NumCuenta>\n"			
			+ "  <FechaExpiracion>[FECHA_EXPIRACION]</FechaExpiracion>\n"
			+ "  <Comercio>[COMERCIO]</Comercio>\n"			
			+ "  <Moneda>[MONEDA]</Moneda>\n"			
			+ "  <FechaTxnTerminal>[FECHA_TXN_TERMINAL]</FechaTxnTerminal>\n"
			+ "  <HoraTxnTerminal>[HORA_TXN_TERMINAL]</HoraTxnTerminal>\n"
			+ "  <WSUsuario>[WS_USUARIO]</WSUsuario>\n"
			+ "  <WSClave>[WS_CLAVE]</WSClave>\n"
			+ "  <Reservado>[RESERVADO]</Reservado>\n"
			+ "</Consulta_Datos_Expediente>]]>";

	// Constante para Actualizacion_Datos
	public static final String MODIFICACION_CLIENTE_XML = "<![CDATA[\n"
		    + "<Modificacion_Cliente>\n"
		    + "  <CodEmisor>[COD_EMISOR]</CodEmisor>\n"
		    + "  <CodUsuario>[COD_USUARIO]</CodUsuario>\n"
		    + "  <NumTerminal>[NUM_TERMINAL]</NumTerminal>\n"
		    + "  <NumReferencia>[NUM_REFERENCIA]</NumReferencia>\n"
		    
		    + "  <MonedaProducto>[MONEDA_PRODUCTO]</MonedaProducto>\n"
		    + "  <TitularApellidos>[TITULAR_APELLIDOS]</TitularApellidos>\n"
		    + "  <TitularNombre>[TITULAR_NOMBRE]</TitularNombre>\n"
		    
		    + "  <TitularGenero>[TITULAR_GENERO]</TitularGenero>\n"
		    + "  <TitularEstadoCivil>[TITULAR_ESTADO_CIVIL]</TitularEstadoCivil>\n"
		    
		    + "  <TitularNumCelular>[TITULAR_NUM_CELULAR]</TitularNumCelular>\n"
		    + "  <TitularTelefonoDomicilio>[TITULAR_TELEFONO_DOMICILIO]</TitularTelefonoDomicilio>\n"
		    + "  <TitularEmail>[TITULAR_EMAIL]</TitularEmail>\n"
		    + "  <TitularTipoDocumento>[TITULAR_TIPO_DOCUMENTO]</TitularTipoDocumento>\n"
		    + "  <TitularNumDocumento>[TITULAR_NUM_DOCUMENTO]</TitularNumDocumento>\n"
		    + "  <TipoDireccionEntrega>[TIPO_DIRECCION_ENTREGA]</TipoDireccionEntrega>\n"
		    + "  <NumDependiente>[NUM_DEPENDIENTE]</NumDependiente>\n"
		    + "  <TitularNombreTrabajo>[TITULAR_NOMBRE_TRABAJO]</TitularNombreTrabajo>\n"
		    + "  <TitularTelefonoTrabajo>[TITULAR_TELEFONO_TRABAJO]</TitularTelefonoTrabajo>\n"
		    + "  <TitularAnexoTrabajo>[TITULAR_ANEXO_TRABAJO]</TitularAnexoTrabajo>\n"
		    + "  <CodUnicoEmisor>[COD_UNICO_EMISOR]</CodUnicoEmisor>\n"
		    + "  <TitularProfesion>[TITULAR_PROFESION]</TitularProfesion>\n"		    
		    + "  <Memo1>[MEMO1]</Memo1>\n"
		    + "  <Memo2>[MEMO2]</Memo2>\n"		    
		    + "  <ConyugeNombre>[CONYUGE_NOMBRE]</ConyugeNombre>\n"
		    + "  <ConyugeNumDocumento>[CONYUGE_NUM_DOCUMENTO]</ConyugeNumDocumento>\n"
		    + "  <ConyugeTelefonoDomicilio>[CONYUGE_TELEFONO_DOMICILIO]</ConyugeTelefonoDomicilio>\n"
		    + "  <ConyugeNombreTrabajo>[CONYUGE_NOMBRE_TRABAJO]</ConyugeNombreTrabajo>\n"
		    + "  <ConyugeTelefonoTrabajo>[CONYUGE_TELEFONO_TRABAJO]</ConyugeTelefonoTrabajo>\n"
		    + "  <ConyugeAnexoTrabajo>[CONYUGE_ANEXO_TRABAJO]</ConyugeAnexoTrabajo>\n"
		    + "  <DomicilioTipoVia>[DOMICILIO_TIPO_VIA]</DomicilioTipoVia>\n"
		    + "  <DomicilioNombreVia>[DOMICILIO_NOMBRE_VIA]</DomicilioNombreVia>\n"
		    + "  <DomicilioNum>[DOMICILIO_NUM]</DomicilioNum>\n"
		    + "  <DomicilioNumDpto>[DOMICILIO_NUM_DPTO]</DomicilioNumDpto>\n"
		    + "  <DomicilioOficina>[DOMICILIO_OFICINA]</DomicilioOficina>\n"
		    + "  <DomicilioPiso>[DOMICILIO_PISO]</DomicilioPiso>\n"
		    + "  <DomicilioManzana>[DOMICILIO_MANZANA]</DomicilioManzana>\n"
		    + "  <DomicilioLote>[DOMICILIO_LOTE]</DomicilioLote>\n"
		    + "  <DomicilioNumInterior>[DOMICILIO_NUM_INTERIOR]</DomicilioNumInterior>\n"
		    + "  <DomicilioSector>[DOMICILIO_SECTOR]</DomicilioSector>\n"
		    + "  <DomicilioKilometro>[DOMICILIO_KILOMETRO]</DomicilioKilometro>\n"
		    + "  <DomicilioTipoZona>[DOMICILIO_TIPO_ZONA]</DomicilioTipoZona>\n"
		    + "  <DomicilioNombreZona>[DOMICILIO_NOMBRE_ZONA]</DomicilioNombreZona>\n"
		    + "  <DomicilioReferencia>[DOMICILIO_REFERENCIA]</DomicilioReferencia>\n"
		    + "  <DomicilioUbigeo>[DOMICILIO_UBIGEO]</DomicilioUbigeo>\n"		    
		    + "  <TrabajoTipoVia>[TRABAJO_TIPO_VIA]</TrabajoTipoVia>\n"
		    + "  <TrabajoNombreVia>[TRABAJO_NOMBRE_VIA]</TrabajoNombreVia>\n"
		    + "  <TrabajoNum>[TRABAJO_NUM]</TrabajoNum>\n"
		    + "  <TrabajoNumDpto>[TRABAJO_NUM_DPTO]</TrabajoNumDpto>\n"
		    + "  <TrabajoOficina>[TRABAJO_OFICINA]</TrabajoOficina>\n"
		    + "  <TrabajoPiso>[TRABAJO_PISO]</TrabajoPiso>\n"
		    + "  <TrabajoManzana>[TRABAJO_MANZANA]</TrabajoManzana>\n"
		    + "  <TrabajoLote>[TRABAJO_LOTE]</TrabajoLote>\n"
		    + "  <TrabajoNumInterior>[TRABAJO_NUM_INTERIOR]</TrabajoNumInterior>\n"
		    + "  <TrabajoSector>[TRABAJO_SECTOR]</TrabajoSector>\n"
		    + "  <TrabajoKilometro>[TRABAJO_KILOMETRO]</TrabajoKilometro>\n"
		    + "  <TrabajoTipoZona>[TRABAJO_TIPO_ZONA]</TrabajoTipoZona>\n"
		    + "  <TrabajoNombreZona>[TRABAJO_NOMBRE_ZONA]</TrabajoNombreZona>\n"
		    + "  <TrabajoReferencia>[TRABAJO_REFERENCIA]</TrabajoReferencia>\n"
		    + "  <TrabajoUbigeo>[TRABAJO_UBIGEO]</TrabajoUbigeo>\n"		    
		    + "  <IndAutGenCodCliente>[IND_AUT_GEN_COD_CLIENTE]</IndAutGenCodCliente>\n"
		    + "  <NumTarjetaMonedero>[NUM_TARJETA_MONEDERO]</NumTarjetaMonedero>\n"
		    + "  <FechaTxnTerminal>[FECHA_TXN_TERMINAL]</FechaTxnTerminal>\n"
		    + "  <HoraTxnTerminal>[HORA_TXN_TERMINAL]</HoraTxnTerminal>\n"
		    + "  <WSUsuario>[WS_USUARIO]</WSUsuario>\n"
		    + "  <WSClave>[WS_CLAVE]</WSClave>\n"
		    + "  <Reservado>[RESERVADO]</Reservado>\n"
		    + "</Modificacion_Cliente>]]>";
	
	// Constante para Consulta_Datas_Cliente
			public static final String CONSULTA_DATOS_CLIENTE_XML = "<![CDATA[\n"
					+ "<Consulta_Datos_Cliente>\n"					
					+ "	<CodEmisor>[COD_EMISOR]</CodEmisor>\n"
				    + " <CodUsuario>[COD_USUARIO]</CodUsuario>\n"
				    + " <NumTerminal>[NUM_TERMINAL]</NumTerminal>\n"
				    + " <NumReferencia>[NUM_REFERENCIA]</NumReferencia>\n"					
					+ "	<TipoDocumento>[TIPO_DOCUMENTO]</TipoDocumento>\n"
					+ "	<NumDocumento>[NUM_DOCUMENTO]</NumDocumento>\n"					
					+ " <FechaTxnTerminal>[FECHA_TXN_TERMINAL]</FechaTxnTerminal>\n"
					+ " <HoraTxnTerminal>[HORA_TXN_TERMINAL]</HoraTxnTerminal>\n"
					+ " <WSUsuario>[WS_USUARIO]</WSUsuario>\n"
					+ " <WSClave>[WS_CLAVE]</WSClave>\n"
					+ " <Reservado>[RESERVADO]</Reservado>\n"					
					+ "</Consulta_Datos_Cliente>]]>";

	public static String generarXml(String template, Map<String, String> valores) {
		String xml = template;
		for (Map.Entry<String, String> entry : valores.entrySet()) {
			xml = xml.replace(entry.getKey(), entry.getValue());
		}
		return xml;
	}

	/**
	 * Retorna un `Map` que contiene todos los `Map` específicos para cada
	 * operación. La clave del `Map` externo es el nombre de la operación y el
	 * valor es el `Map` que contiene las claves y valores asociados a esa
	 * operación.
	 * 
	 * Las operaciones incluyen: - Informacion_Tarjeta - Bloqueo_Tarjeta -
	 * Consulta_Movimientos_Expediente - Consulta_Datos_Expediente -
	 * Actualizacion_Datos
	 * 
	 * @return un `Map` con todos los `Map` específicos para cada operación.
	 */
	public static Map<String, Map<String, String>> getAllOperationsMaps() {
		Map<String, Map<String, String>> allOperations = new HashMap<String, Map<String, String>>();

		// Agregar cada operación con su correspondiente Map
		allOperations.put("Consulta_Datos_Tarjeta", getConsultaDatosTarjetaMap());
		allOperations.put("Modificacion_Tarjetas", getModificacionTarjetaMap());
		allOperations.put("Consulta_Movimientos_Expediente",
				getConsultaMovimientosExpedienteMap());
		allOperations.put("Consulta_Datos_Expediente",
				getConsultaDatosExpedienteMap());
		allOperations.put("Modificacion_Cliente", getModificacionClienteMap());
		
		allOperations.put("Consulta_Datos_Cliente",	getConsultaDatosClienteMap());

		
		return allOperations;
	}

	/**
	 * Retorna un `Map` con los valores predeterminados para la operación
	 * `Informacion_Tarjeta`.
	 * 
	 * Claves incluidas: - COD_EMISOR: "971" - COD_USUARIO: "TW9999" -
	 * NUM_TERMINAL: "11010101" - NUM_REFERENCIA: "AC2020000322" - NUM_TARJETA:
	 * "000000009" - FECHA_EXPIRACION: "2701" - COMERCIO: "9999999" -
	 * FECHA_TXN_TERMINAL: "20160224" - HORA_TXN_TERMINAL: "172020" -
	 * WS_USUARIO: "prueba1234" - WS_CLAVE: "prueba1234567890" - RESERVADO: ""
	 * 
	 * @return un `Map` con las claves y valores para `Informacion_Tarjeta`.
	 */
	public static Map<String, String> getConsultaDatosTarjetaMap() {
		Map<String, String> informacionTarjetaMap = new HashMap<String, String>();
		informacionTarjetaMap.put(COD_EMISOR, "971");
		informacionTarjetaMap.put(COD_USUARIO, "TW9999");
		informacionTarjetaMap.put(NUM_TERMINAL, "11010101");
		informacionTarjetaMap.put(NUM_REFERENCIA, "AC2020000322");
		informacionTarjetaMap.put(NUM_TARJETA, "000000009");
		informacionTarjetaMap.put(FECHA_EXPIRACION, "2701");
		informacionTarjetaMap.put(COMERCIO, "9999999");
		informacionTarjetaMap.put(FECHA_TXN_TERMINAL, "20160224");
		informacionTarjetaMap.put(HORA_TXN_TERMINAL, "172020");
		informacionTarjetaMap.put(WS_USUARIO, "prueba1234");
		informacionTarjetaMap.put(WS_CLAVE, "prueba1234567890");
		informacionTarjetaMap.put(RESERVADO, "");
		return informacionTarjetaMap;
	}

	/**
	 * Retorna un `Map` con los valores predeterminados para la operación
	 * `Bloqueo_Tarjeta`.
	 * 
	 * Claves incluidas: - COD_EMISOR: "971" - COD_USUARIO: "TW9999" -
	 * NUM_TERMINAL: "11010101" - NUM_REFERENCIA: "AC2020000322" - ORGANIZACION:
	 * "941" - NUM_TARJETA: "000000009" - FECHA_EXPIRACION: "2701" -
	 * CODIGO_BLOQUEO: "A3" - MOTIVO_BLOQUEO: "Robo" - COMERCIO: "9999999" -
	 * FECHA_TXN_TERMINAL: "20160224" - HORA_TXN_TERMINAL: "172020" -
	 * WS_USUARIO: "prueba1234" - WS_CLAVE: "prueba1234567890" - RESERVADO: ""
	 * 
	 * @return un `Map` con las claves y valores para `Bloqueo_Tarjeta`.
	 */
	public static Map<String, String> getModificacionTarjetaMap() {
	    Map<String, String> bloqueoTarjetaMap = new HashMap<String, String>();
	    bloqueoTarjetaMap.put(COD_EMISOR, "971");
	    bloqueoTarjetaMap.put(COD_USUARIO, "TW9999");
	    bloqueoTarjetaMap.put(NUM_TERMINAL, "11010101");
	    bloqueoTarjetaMap.put(NUM_REFERENCIA, "AC2020000322");
	    bloqueoTarjetaMap.put(ORGANIZACION, "941");
	    bloqueoTarjetaMap.put(NUM_TARJETA, "000000009");
	    bloqueoTarjetaMap.put(FECHA_EXPIRACION, "2701");
	    bloqueoTarjetaMap.put(CODIGO_BLOQUEO, "A3");
	    bloqueoTarjetaMap.put(MOTIVO_BLOQUEO, "Robo");
	    bloqueoTarjetaMap.put(COMERCIO, "9999999");
	    bloqueoTarjetaMap.put(FECHA_TXN_TERMINAL, "20160224");
	    bloqueoTarjetaMap.put(HORA_TXN_TERMINAL, "172020");
	    bloqueoTarjetaMap.put(WS_USUARIO, "prueba1234");
	    bloqueoTarjetaMap.put(WS_CLAVE, "prueba1234567890");
	    bloqueoTarjetaMap.put(RESERVADO, "");
	    bloqueoTarjetaMap.put(MONEDA, "1"); // Agregado para MonedaProducto
	    return bloqueoTarjetaMap;
	}


	/**
	 * Retorna un `Map` con los valores predeterminados para la operación
	 * `Consulta_Movimientos_Expediente`.
	 * 
	 * Claves incluidas: - COD_EMISOR: "941" - COD_USUARIO: "CS00000001" -
	 * NUM_TERMINAL: "12345678" - NUM_REFERENCIA: "ORD20160224" - ORGANIZACION:
	 * "941" - NUM_TARJETA: "526983659" - FECHA_EXPIRACION: "" - COMERCIO:
	 * "2999994" - MONEDA: "604" - FECHA_TXN_TERMINAL: "20160224" -
	 * HORA_TXN_TERMINAL: "172020" - WS_USUARIO: "0944006748" - WS_CLAVE:
	 * "dRUch4hupAvuduBE" - RESERVADO: ""
	 * 
	 * @return un `Map` con las claves y valores para
	 *         `Consulta_Movimientos_Expediente`.
	 */
	public static Map<String, String> getConsultaMovimientosExpedienteMap() {
		Map<String, String> consultaMovimientosExpedienteMap = new HashMap<String, String>();
		consultaMovimientosExpedienteMap.put(COD_EMISOR, "941");
		consultaMovimientosExpedienteMap.put(COD_USUARIO, "CS00000001");
		consultaMovimientosExpedienteMap.put(NUM_TERMINAL, "12345678");
		consultaMovimientosExpedienteMap.put(NUM_REFERENCIA, "ORD20160224");
		consultaMovimientosExpedienteMap.put(ORGANIZACION, "941");
		consultaMovimientosExpedienteMap.put(NUM_TARJETA, "526983659");
		consultaMovimientosExpedienteMap.put(FECHA_EXPIRACION, "");
		consultaMovimientosExpedienteMap.put(COMERCIO, "2999994");
		consultaMovimientosExpedienteMap.put(MONEDA, "604");
		consultaMovimientosExpedienteMap.put(FECHA_TXN_TERMINAL, "20160224");
		consultaMovimientosExpedienteMap.put(HORA_TXN_TERMINAL, "172020");
		consultaMovimientosExpedienteMap.put(WS_USUARIO, "0944006748");
		consultaMovimientosExpedienteMap.put(WS_CLAVE, "dRUch4hupAvuduBE");
		consultaMovimientosExpedienteMap.put(RESERVADO, "");
		return consultaMovimientosExpedienteMap;
	}

	/**
	 * Retorna un `Map` con los valores predeterminados para la operación
	 * `Consulta_Datos_Expediente`.
	 * 
	 * Claves incluidas: - COD_EMISOR: "971" - COD_USUARIO: "TW9999" -
	 * NUM_TERMINAL: "11010101" - NUM_REFERENCIA: "AC2020000322" - ORGANIZACION:
	 * "941" - NUM_TARJETA: "000000009" - FECHA_EXPIRACION: "2701" - COMERCIO:
	 * "9999999" - FECHA_TXN_TERMINAL: "20160224" - HORA_TXN_TERMINAL: "172020"
	 * - WS_USUARIO: "prueba1234" - WS_CLAVE: "prueba1234567890" - RESERVADO: ""
	 * 
	 * @return un `Map` con las claves y valores para
	 *         `Consulta_Datos_Expediente`.
	 */
	public static Map<String, String> getConsultaDatosExpedienteMap() {
		Map<String, String> consultaDatosExpedienteMap = new HashMap<String, String>();
		consultaDatosExpedienteMap.put(COD_EMISOR, "971");
		consultaDatosExpedienteMap.put(COD_USUARIO, "TW9999");
		consultaDatosExpedienteMap.put(NUM_TERMINAL, "11010101");
		consultaDatosExpedienteMap.put(NUM_REFERENCIA, "AC2020000322");
		consultaDatosExpedienteMap.put(ORGANIZACION, "941");
		consultaDatosExpedienteMap.put(NUM_TARJETA, "000000009");
		consultaDatosExpedienteMap.put(FECHA_EXPIRACION, "2701");
		consultaDatosExpedienteMap.put(COMERCIO, "9999999");
		consultaDatosExpedienteMap.put(FECHA_TXN_TERMINAL, "20160224");
		consultaDatosExpedienteMap.put(HORA_TXN_TERMINAL, "172020");
		consultaDatosExpedienteMap.put(WS_USUARIO, "prueba1234");
		consultaDatosExpedienteMap.put(WS_CLAVE, "prueba1234567890");
		consultaDatosExpedienteMap.put(RESERVADO, "");
		return consultaDatosExpedienteMap;
	}

	/**
	 * Retorna un `Map` con los valores predeterminados para la operación
	 * `Actualizacion_Datos`.
	 * 
	 * Claves incluidas: - COD_EMISOR: "971" - COD_USUARIO: "TW9999" -
	 * NUM_TERMINAL: "11010101" - NUM_REFERENCIA: "AC2020000322" - ORGANIZACION:
	 * "941" - NRO_DOCUMENTO: "74851254" - CORREO_ELECTRONICO:
	 * "prueba@hotmail.com" - NRO_CELULAR: "965845214" - FECHA_EXPIRACION:
	 * "2701" - COMERCIO: "9999999" - FECHA_TXN_TERMINAL: "20160224" -
	 * HORA_TXN_TERMINAL: "172020" - WS_USUARIO: "prueba1234" - WS_CLAVE:
	 * "prueba1234567890" - RESERVADO: ""
	 * 
	 * @return un `Map` con las claves y valores para `Actualizacion_Datos`.
	 */
	public static Map<String, String> getModificacionClienteMap() {
	    Map<String, String> modificacionClienteMap = new HashMap<String, String>();
	    modificacionClienteMap.put(COD_EMISOR, "941");
	    modificacionClienteMap.put(COD_USUARIO, "CS00000001");
	    modificacionClienteMap.put(NUM_TERMINAL, "12345678");
	    modificacionClienteMap.put(NUM_REFERENCIA, "ORD000123456789");
	    modificacionClienteMap.put(MONEDA_PRODUCTO, "1");
	    modificacionClienteMap.put(TITULAR_APELLIDOS, "Gutierrez Solis");
	    modificacionClienteMap.put(TITULAR_NOMBRE, "Marianela");
	    modificacionClienteMap.put("[TITULAR_GENERO]", "");
	    modificacionClienteMap.put("[TITULAR_ESTADO_CIVIL]", "");
	    modificacionClienteMap.put(TITULAR_NUM_CELULAR, "975426854");
	    modificacionClienteMap.put(TITULAR_TELEFONO_DOMICILIO, "2131600");
	    modificacionClienteMap.put(TITULAR_EMAIL, "MarianelaGS@miempresa.com.pe");
	    modificacionClienteMap.put("[TITULAR_TIPO_DOCUMENTO]", "");
	    modificacionClienteMap.put("[TITULAR_NUM_DOCUMENTO]", "");
	    modificacionClienteMap.put("[TIPO_DIRECCION_ENTREGA]", "");
	    modificacionClienteMap.put(NUM_DEPENDIENTE, "3");
	    modificacionClienteMap.put("[TITULAR_NOMBRE_TRABAJO]", "");
	    modificacionClienteMap.put("[TITULAR_TELEFONO_TRABAJO]", "");
	    modificacionClienteMap.put("[TITULAR_ANEXO_TRABAJO]", "");
	    modificacionClienteMap.put("[COD_UNICO_EMISOR]", "");
	    modificacionClienteMap.put(TITULAR_PROFESION, "16779");
	    modificacionClienteMap.put("[MEMO1]", "");
	    modificacionClienteMap.put("[MEMO2]", "");
	    modificacionClienteMap.put("[CONYUGE_NOMBRE]", "");
	    modificacionClienteMap.put("[CONYUGE_NUM_DOCUMENTO]", "");
	    modificacionClienteMap.put("[CONYUGE_TELEFONO_DOMICILIO]", "");
	    modificacionClienteMap.put("[CONYUGE_NOMBRE_TRABAJO]", "");
	    modificacionClienteMap.put("[CONYUGE_TELEFONO_TRABAJO]", "");
	    modificacionClienteMap.put("[CONYUGE_ANEXO_TRABAJO]", "");
	    modificacionClienteMap.put("[DOMICILIO_TIPO_VIA]", "");
	    modificacionClienteMap.put("[DOMICILIO_NOMBRE_VIA]", "");
	    modificacionClienteMap.put("[DOMICILIO_NUM]", "");
	    modificacionClienteMap.put("[DOMICILIO_NUM_DPTO]", "");
	    modificacionClienteMap.put("[DOMICILIO_OFICINA]", "");
	    modificacionClienteMap.put("[DOMICILIO_PISO]", "");
	    modificacionClienteMap.put("[DOMICILIO_MANZANA]", "");
	    modificacionClienteMap.put("[DOMICILIO_LOTE]", "");
	    modificacionClienteMap.put("[DOMICILIO_NUM_INTERIOR]", "");
	    modificacionClienteMap.put("[DOMICILIO_SECTOR]", "");
	    modificacionClienteMap.put("[DOMICILIO_KILOMETRO]", "");
	    modificacionClienteMap.put("[DOMICILIO_TIPO_ZONA]", "");
	    modificacionClienteMap.put("[DOMICILIO_NOMBRE_ZONA]", "");
	    modificacionClienteMap.put("[DOMICILIO_REFERENCIA]", "");
	    modificacionClienteMap.put("[DOMICILIO_UBIGEO]", "");
	    modificacionClienteMap.put("[TRABAJO_TIPO_VIA]", "");
	    modificacionClienteMap.put("[TRABAJO_NOMBRE_VIA]", "");
	    modificacionClienteMap.put("[TRABAJO_NUM]", "");
	    modificacionClienteMap.put("[TRABAJO_NUM_DPTO]", "");
	    modificacionClienteMap.put("[TRABAJO_OFICINA]", "");
	    modificacionClienteMap.put("[TRABAJO_PISO]", "");
	    modificacionClienteMap.put("[TRABAJO_MANZANA]", "");
	    modificacionClienteMap.put("[TRABAJO_LOTE]", "");
	    modificacionClienteMap.put("[TRABAJO_NUM_INTERIOR]", "");
	    modificacionClienteMap.put("[TRABAJO_SECTOR]", "");
	    modificacionClienteMap.put("[TRABAJO_KILOMETRO]", "");
	    modificacionClienteMap.put("[TRABAJO_TIPO_ZONA]", "");
	    modificacionClienteMap.put("[TRABAJO_NOMBRE_ZONA]", "");
	    modificacionClienteMap.put("[TRABAJO_REFERENCIA]", "");
	    modificacionClienteMap.put("[TRABAJO_UBIGEO]", "");
	    modificacionClienteMap.put("[IND_AUT_GEN_COD_CLIENTE]", "");
	    modificacionClienteMap.put("[NUM_TARJETA_MONEDERO]", "");
	    modificacionClienteMap.put(FECHA_TXN_TERMINAL, "20160224");
	    modificacionClienteMap.put(HORA_TXN_TERMINAL, "172020");
	    modificacionClienteMap.put(WS_USUARIO, "0944006748");
	    modificacionClienteMap.put(WS_CLAVE, "dRUch4hupAvuduBE");
	    modificacionClienteMap.put(RESERVADO, "OA09123456");
    
	    return modificacionClienteMap;
	}
	
	
	
	public static Map<String, String> getConsultaDatosClienteMap() {
		Map<String, String> consultaDatosClienteMap = new HashMap<String, String>();
		consultaDatosClienteMap.put(COD_EMISOR, "191");
		consultaDatosClienteMap.put(COD_USUARIO, "TT9999");
		consultaDatosClienteMap.put(NUM_TERMINAL, "11010101");
		consultaDatosClienteMap.put(NUM_REFERENCIA, "AC2023000187");
		
		consultaDatosClienteMap.put(TIPO_DOCUMENTO, "1");
		consultaDatosClienteMap.put(NUM_DOCUMENTO, "000016727214");		
		
		consultaDatosClienteMap.put(FECHA_TXN_TERMINAL, "20160224");
		consultaDatosClienteMap.put(HORA_TXN_TERMINAL, "172020");
		consultaDatosClienteMap.put(WS_USUARIO, "4858643428");
		consultaDatosClienteMap.put(WS_CLAVE, "aza877azutht98b8");
		consultaDatosClienteMap.put(RESERVADO, "");
		return consultaDatosClienteMap;
		
	}


	public static void main(String[] args) {
	    // Obtener el Map de todas las operaciones
	    Map<String, Map<String, String>> allOperationsMaps = getAllOperationsMaps();

	    // Recorrer todas las operaciones y generar e imprimir sus respectivos XMLs
	    for (Map.Entry<String, Map<String, String>> entry : allOperationsMaps.entrySet()) {
	        String operation = entry.getKey();
	        Map<String, String> operationMap = entry.getValue();

	        String xmlTemplate = "";
	        switch (operation) {
	            case SOACTION_Consulta_Datos_Tarjeta:
	                xmlTemplate = Consulta_Datos_Tarjeta_XML;
	                break;
	            case SOACTION_BLOQUEO_TARJETA:
	                xmlTemplate = MODIFICACION_TARJETA_XML;
	                break;
	            case SOACTION_CONSULTA_MOVIMIENTOS_EXPEDIENTE:
	                xmlTemplate = CONSULTA_MOVIMIENTOS_EXPEDIENTE_XML;
	                break;
	            case SOACTION_CONSULTA_DATOS_EXPEDIENTE:
	                xmlTemplate = CONSULTA_DATOS_EXPEDIENTE_XML;
	                break;
	            case SOACTION_MODIFICACION_CLIENTE:
	                xmlTemplate = MODIFICACION_CLIENTE_XML;
	                break;
	            case SOACTION_CONSULTA_DATOS_CLIENTE:
	                xmlTemplate = CONSULTA_DATOS_CLIENTE_XML;
	                break;
	        }

	        // Generar el XML usando el Map correspondiente
	        String xml = generarXml(xmlTemplate, operationMap);

	        // Imprimir el XML generado en la consola
	        System.out.println("XML para operación: " + operation);
	        System.out.println(xml);
	        System.out.println("--------------------------------------------------");
	    }
	}
	
	 	public static final String SOACTION_Consulta_Datos_Tarjeta = "Consulta_Datos_Tarjeta";	 	
	 	public static final String SOACTION_BLOQUEO_TARJETA = "Modificacion_Tarjetas"; 
	 	public static final String SOACTION_MODIFICACION_TARJETA = "Modificacion_Tarjeta"; 
	    public static final String SOACTION_CONSULTA_MOVIMIENTOS_EXPEDIENTE = "Consulta_Movimientos_Expediente";
	    public static final String SOACTION_CONSULTA_DATOS_EXPEDIENTE = "Consulta_Datos_Expediente"; 
	    public static final String SOACTION_CONSULTA_DATOS_CLIENTE = "Consulta_Datos_Cliente";  	
	    public static final String SOACTION_MODIFICACION_CLIENTE = "Modificacion_Cliente";
	    public static final String SOACTION_MODIFICACION_CLIENTES = "Modificacion_Clientes";
	    
	    
	    public static final String TIPO_MONEDA = "1";
	
	    
}
