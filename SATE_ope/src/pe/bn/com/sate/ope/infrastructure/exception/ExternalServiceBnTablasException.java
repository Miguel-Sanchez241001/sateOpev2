package pe.bn.com.sate.ope.infrastructure.exception;

public class ExternalServiceBnTablasException extends ServiceException{
	
	private static final long serialVersionUID = 1L;

	public ExternalServiceBnTablasException(String msg) {
		super(msg);
	}
	
	public ExternalServiceBnTablasException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}