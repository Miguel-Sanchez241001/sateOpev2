package pe.bn.com.sate.ope.transversal.util.excepciones;

public class ResultadoVacioExcepcion extends Exception{
	public ResultadoVacioExcepcion() {
		
	}

	public ResultadoVacioExcepcion(String message) {
		super(message);
		
	}

	public ResultadoVacioExcepcion(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
