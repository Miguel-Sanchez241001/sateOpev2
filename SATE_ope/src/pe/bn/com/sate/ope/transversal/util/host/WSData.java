package pe.bn.com.sate.ope.transversal.util.host;

import java.io.Serializable;

import pe.bn.com.sate.ope.transversal.util.TramasUtils;
//import Util.LoggerPTIV;
//import Util.clsUtilidades;



public class WSData{
	
	//private static LoggerPTIV log3 = LoggerPTIV.getInstance(WSData.class.getName());
	
	public  Campo[] campos;
	
	public static final int SIN_ERROR = 100;
	public static final int ERROR_GENERICO = -999;
	public static final int ERROR_EXCEPCION = -998;
	
	public static final class Campo implements Serializable{
		
		public static final int CHARACTER = 0;
		public static final int NUMBER = 1;
		
		int Codigo;
		String Descripcion;
		String Valor;
		int TipoDato;
		int Tamano;
		int Inicio;
		int Decimales = 0;
		
		public Campo(String Descripcion, int TipoDato, int Tamano) throws Exception {
			this.Descripcion = Descripcion;
			this.Valor = "";
			this.TipoDato = TipoDato;
			this.Tamano = Tamano;
		}
		
		public int setString(String valor) throws Exception{
			
			String msgError = "";

			if(valor==null){
				msgError = "ERROR: Campo NULL [" + this.Descripcion + "] =" + this.Tamano + " Valor Insertado:" + valor;
				throw new Exception(msgError);
			}
			
			valor = enmascararTrama(valor);
			
			int NumError = ERROR_GENERICO;
			try{
				if(valor.trim().length()>this.Tamano){
					msgError = "ERROR: Tamaño del campo [" + this.Descripcion + "] =" + this.Tamano + " Valor Insertado:" + valor;
					throw new Exception(msgError);
				}else{
					switch(TipoDato){
					case CHARACTER:
						if(valor.trim().equals("")){
							this.Valor = "";
						}else{
							this.Valor = valor;
						}
						ajustarLeft(CHARACTER);
						break;
					default:
						if(valor.trim().equals("")){
							this.Valor = "0";
						}else{
							this.Valor = valor;
						}
						ajustarRight(NUMBER);
					}
					NumError = SIN_ERROR;
				}
					
			}catch(Exception e){
				NumError = ERROR_EXCEPCION;
				throw e;
			}
			return NumError;
		}


		private void ajustarRight(int tipoDato){
			String result = "";
			String valor = this.Valor.trim().toUpperCase();
			for(int i=0;i<(Tamano-valor.length());i++){
				char c = (tipoDato == CHARACTER)?' ':'0';
				result = ((tipoDato != CHARACTER)?(String.valueOf(c)):"") + result + ((tipoDato == CHARACTER)?(String.valueOf(c)):"");					
			}
			result = result+ valor;
			this.Valor = result;
		}

		private void ajustarLeft(int tipoDato){
			String result = "";
			String valor = this.Valor.trim().toUpperCase();
			for(int i=0;i<Tamano;i++){
				char c = (tipoDato == CHARACTER)?' ':'0';
				if(valor.length()>i){
					c = valor.charAt(i);
					result += c;
				}else{
					result = ((tipoDato != CHARACTER)?(String.valueOf(c)):"") + result + ((tipoDato == CHARACTER)?(String.valueOf(c)):"");
				}
			}			
			this.Valor = result;			
		}
		
	
		public String get(){
			return this.Valor;
		}
		
		public String toString() {
			return Valor;
		}
		
		public static String lpad(String valueToPad, String filler, int size) {   
	        while (valueToPad.length() < size) {   
	            valueToPad = filler + valueToPad;   
	        }   
	        return valueToPad;   
	    }   
	       
	    public static String rpad(String valueToPad, String filler, int size) {   
	        while (valueToPad.length() < size) {   
	            valueToPad = valueToPad+filler;   
	        }   
	        return valueToPad;   
	    }  		
		
	}//Fin Clase Campo

	
	protected void init(){
		
	}
	
	protected WSData() {
		init();
	}

	public String getByIndex(int index){
		if(campos!=null){
			if(index<campos.length){
				return campos[index].get();
			}
		}
		return null;
	}
	
	
	public String toString(){
		
    	StringBuffer sb = new StringBuffer("");
		if(campos!=null){ 
				for(int c=0; c<campos.length; c++){
				sb.append(campos[c].Valor);
			}
		}
		return sb.toString();
	}

	public String toShowData(){
		
    	StringBuffer sb = new StringBuffer("");
		sb.append("\n*********** [ENVIO TRAMA] - " + this.getClass() + " ***********\n");
 		
		if(campos!=null){ 
				for(int c=0; c<campos.length; c++){
				String temp = (campos[c].Descripcion.length()<20)? campos[c].Descripcion+ TramasUtils.repeat(" ", 20-campos[c].Descripcion.length()):campos[c].Descripcion.substring(0,20);
				sb.append(temp + ":\t" + campos[c].Tamano + "\t" + "[" + campos[c].Valor  + "]\t\n");
			}
		}
		return sb.toString();
	}

	
	public int LongitudTrama(){
	
		int num = 0;
		if(campos!=null){
			for(int c=0; c<campos.length; c++){
				num = num + campos[c].Tamano ;
			}
		}
		return num;
	}
	
	public Campo getCampoByIndex(int index){
		if(campos!=null){
			if(index<campos.length){
				return campos[index];
			}
		}
		return null;
	}

	public String getByTag(String desc){
		if(campos!=null){
			for(int i=0;i<campos.length;i++){
				if(campos[i].Descripcion.equals(desc.trim())){
					return campos[i].get();
				}
			}
		}
		return null;
	}

	

	
	public int getCampoLength(){
		if(campos!=null){
				return campos.length;
		}
		return 0;
	}
	
	public void showPositions(){

		if(campos!=null){
			for(int c=0; c<campos.length; c++){
				
				String desc = campos[c].Descripcion;
				String val = campos[c].Valor;
				for (int f=0;f<30-campos[c].Descripcion.length();f++){
					desc += " ";
				}
				for (int f=0;f<100-campos[c].Valor.length();f++){
					val += " ";
				}
				
			}
		}
		
	}
	
	public void FillBoby(String bodyOutPut) throws Exception {

		if(this.campos!=null){
			int inicio = 1;
			for(int i=0;i<campos.length;i++){
				campos[i].Valor = enmascararTrama( bodyOutPut.substring((inicio-1), (inicio-1) + campos[i].Tamano) );
				inicio+= campos[i].Tamano;
				
			}
		}
	}
	
	public static boolean ValidarCampo(boolean campo1, int campo2){
	
		boolean result = false;
		if (campo1 && (campo2 == SIN_ERROR)){
			result = true;
		}
		
		return result;
	
	}
	
	public void setByTag(String desc, String val) throws Exception{
		if(campos!=null){
			for(int i=0;i<campos.length;i++){
				if(campos[i].Descripcion.equals(desc.trim())){
					campos[i].setString(val);
				}
			}
		}
	}

	
	public static String enmascararTrama(String value){
		if(value==null) return null;
		
		value = value.replaceAll("ñ", "#");
		value = value.replaceAll("Ñ", "#");
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
		//value = value.replaceAll("#", "Ñ");
		return value;
	}
	
}
