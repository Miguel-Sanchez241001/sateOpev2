package pe.bn.com.sate.ope.transversal.util.excepciones;

public class InternalExcepcion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InternalExcepcion() {
		super();
		
	}

	public InternalExcepcion(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InternalExcepcion(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InternalExcepcion(String message) {
		super(message);
		
	}

	public InternalExcepcion(Throwable cause) {
		super(cause);
 	}

}
