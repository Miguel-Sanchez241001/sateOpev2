package pe.bn.com.sate.ope.transversal.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import pe.bn.com.sate.ope.transversal.dto.sate.Cliente;
import pe.bn.com.sate.ope.transversal.dto.sate.Tarjeta;

public class SAXParserJavaToTxt {

	public static String parseListJavaToTxt111(Cliente cliente,
			Tarjeta tarjeta, String outPutPath, String archiveName)
			throws IOException {
		FileWriter fileWriter = new FileWriter(outPutPath + "/" + archiveName
				+ ".txt");
		
		DateFormat df = new SimpleDateFormat("aaaaMMdd");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(
				//DATA 1-74
				completeStringWithSpaces("B", 1, 0)+ //Tipo de Registro "B"
				completeStringWithSpaces("0302", 4, 0)+ //Mensaje 0302/0312, de acuerdo a su especificación
				completeStringWithSpaces("0000000000000000",16, 0)+ //Bit map de campos 
				completeStringWithSpaces("16",2, 0)+ //long DE02 = "16" 
				completeStringWithSpaces("0000000000000000",19, 0)+ //DE02 - Numero de Cuenta: "0000000000000000"
				completeStringWithSpaces("",10, 0)+ //DE07 - Hora
				completeStringWithSpaces("",6, 0)+ //DE11 - Trace
				completeStringWithSpaces("1",2, 0)+ //long DE33 valor = "1"
				completeStringWithSpaces("0",11, 0)+ //DE33 valor = "0"
				completeStringWithSpaces("772",3, 0)+ //long DE48 valor = "772"
				
				//Estructura DE48
				completeStringWithSpaces("0001",4, 0)+ //Transaccion-type = "0001"
				completeStringWithSpaces("0",1, 0)+ //Data compres = "0"
				completeStringWithSpaces("0000",4, 0)+ //Data sequent = "0000"
				completeStringWithSpaces("0",1, 0)+ //more data = "0"
				completeStringWithSpaces(cliente.getApPaterno().concat(""+cliente.getApMaterno()),30, 0)+ //Apellidos del cliente (funcionario)
				completeStringWithSpaces(cliente.getNombres(),30, 0)+ //Nombre del cliente (funcionario)
				completeStringWithSpaces(cliente.getTipoDocumento(),1, 0)+ //Tipo de documento 
				completeStringWithSpaces(cliente.getNroDocumento(),12, 0)+ //Numero de documento
				completeStringWithSpaces(df.format(cliente.getFechaNacimiento()),8, 0)+//fecha de nacimiento = 'AAAAMMDD'
				completeStringWithSpaces(cliente.getSexo(),1, 0)+ //sexo = 'M' o 'F'
				completeStringWithSpaces(cliente.getEstadoCivil(),1, 0)+ //estado civil = 'S', 'C', 'V', 'D', 'O'
				
				//Direccion(dividir en tramas)
				completeStringWithSpaces(tarjeta.getEntregaDireccion(),107, 0)+ //
				
				
				completeStringWithSpaces(tarjeta.getEntregaUbigeo(),9, 0)+//codigo de ubigeo(domicilio)
				completeStringWithSpaces(tarjeta.getEntregaReferencia(),55, 0)+ //referencia(domicilio)
				completeStringWithSpaces(cliente.getTelefonoCasa(),10, 0)+ //telefono de casa
				completeStringWithSpaces(tarjeta.getNumeroCelular(),10, 0)+  //numero de celular 
				completeStringWithSpaces(tarjeta.getEmail(),30, 0)+ //correo electronico
				completeStringWithSpaces("000000000",9, 0)+   //codigo unico de cliente = '000000000'
				completeStringWithSpaces("razon social",30, 0)+  //Nombre de trabajo(UE)
				completeStringWithSpaces("xxxxxxxxxxx",11, 0)+	//RUC de trabajo(UE)
				completeStringWithSpaces("",5, 0)+ //tipo de via(UE)
				completeStringWithSpaces("via",30, 0)+ //nombre de via(UE)
				completeStringWithSpaces("numero",6, 0)+ //numero(UE)
				completeStringWithSpaces("departamento", 6, 0)+//departamento(UE)
				completeStringWithSpaces("oficina", 5, 0)+//oficina(UE)
				completeStringWithSpaces("piso", 3, 0)+//oficina(UE)
				completeStringWithSpaces("manzana", 3, 0)+//manzana(UE)
				completeStringWithSpaces("lote", 3, 0)+//lote(UE)
				completeStringWithSpaces("interior", 3, 0)+//interior(UE)
				completeStringWithSpaces("sector", 3, 0)+//sector(UE)
				completeStringWithSpaces("kilonetro", 5, 0)+//kilometro(UE)
				completeStringWithSpaces("zona", 5, 0)+//zona(UE)
				completeStringWithSpaces("nombrezona", 30, 0)+//nombre de zona(UE)
				completeStringWithSpaces("codigoubigeoUE", 9, 0)+//codigo de ubigeo trabajo(UE)
				completeStringWithSpaces("referenciaUE", 55, 0)+//referencia trabajo(UE)
				completeStringWithSpaces("telefonoUE", 10, 0)+//telefono de trabajo(UE)
				completeStringWithSpaces("indicador", 1, 0)+//Indicador = '3', '4' (envio de tarjeta)
				completeStringWithSpaces("indicador", 5, 0)+//Codigo de Agencia o UE (envio de tarjeta)
				completeStringWithSpaces("tipovia", 5, 0)+//tipo de via(envio de tarjeta)
				completeStringWithSpaces("nombrevia", 30, 0)+//nombre de via(envio de tarjeta)
				completeStringWithSpaces("numero", 6, 0)+//numero(envio de tarjeta)
				completeStringWithSpaces("departamento", 6, 0)+//departamento(envio de tarjeta)
				completeStringWithSpaces("oficina", 5, 0)+//oficina(envio de tarjeta)
				completeStringWithSpaces("piso", 3, 0)+//piso(envio de tarjeta)
				completeStringWithSpaces("manzana", 3, 0)+//manzana(envio de tarjeta)
				completeStringWithSpaces("lote", 3, 0)+//lote(envio de tarjeta)
				completeStringWithSpaces("interior", 3, 0)+//interior(envio de tarjeta)
				completeStringWithSpaces("sector", 3, 0)+//sector(envio de tarjeta)
				completeStringWithSpaces("kilometro", 5, 0)+//kilometro(envio de tarjeta)
				completeStringWithSpaces("zona", 5, 0)+//zona(envio de tarjeta)
				completeStringWithSpaces("nombreZona", 30, 0)+//nombre de zona(envio de tarjeta)
				completeStringWithSpaces("codigoUbigeo", 9, 0)+//codigo de ubigeo(envio de tarjeta)
				completeStringWithSpaces("referencia", 55, 0)+//referencia(envio de tarjeta)
				completeStringWithSpaces("604", 3, 0)+//moneda de la cuenta = '604' o '840'
				completeStringWithSpaces("31", 2, 0)+//ciclo de facturacion = '31' ciclo no exitente 
				completeStringWithSpaces("000000", 6, 0)+//Bin al que pertenecera la cuenta
				completeStringWithSpaces("000", 3, 0)+//codigo de grupo (PCT)
				completeStringWithSpaces("0", 1, 0)+//Indicador de envio de correspondencia
				completeStringWithSpaces("0", 1, 0)+//Indicador de cargo automatico
				completeStringWithSpaces("A", 1, 0)+//tipo de cuenta cargo = 'A' o 'C'
				completeStringWithSpaces("cuentaCargo", 17, 0)+//cuenta de cargo 
				completeStringWithSpaces("00000", 5, 0)+//codigo de funcionario
				completeStringWithSpaces("00000", 5, 0)+//Agencia de apertura
				completeStringWithSpaces(tarjeta.getDisposicionEfectivo(), 1, 0)+//indicador de limite para disposicion de efectivo
				completeStringWithSpaces("", 1, 0)+//indicador de cobro de cargos del servicio
				completeStringWithSpaces("", 1, 0)+//indicador de cobro de intereses
				completeStringWithSpaces("", 1, 0)+//indicador de cobro de membresia
				completeStringWithSpaces("", 1, 0)+//indicador de cobro de comision por exceso de linea
				completeStringWithSpaces("", 1, 0)+//indicador de cobro por morosidad
				completeStringWithSpaces("0", 154, 0)//Deben ser espacios en blanco
				); 

		printWriter.close();

		return outPutPath + "/" + archiveName + ".txt";
	}

	public static String completeStringWithSpaces(String value, int size,
			int position) {
		if (value == null)
			value = completeStringWithSpaces("", size, position);
		if (value.length() > size)
			value = value.substring(0, size);
		String result = "";
		if (position == 0) {
			for (int i = 0; i < size - value.length(); i++) {
				result += " ";
			}
			result += value;
		} else {
			result += value;
			for (int i = 0; i < size - value.length(); i++) {
				result += " ";
			}

		}
		return result;
	}
}
