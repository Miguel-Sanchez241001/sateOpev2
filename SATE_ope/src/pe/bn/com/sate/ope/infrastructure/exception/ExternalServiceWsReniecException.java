package pe.bn.com.sate.ope.infrastructure.exception;

public class ExternalServiceWsReniecException extends ServiceException{
	
	private static final long serialVersionUID = 1L;

	public ExternalServiceWsReniecException(String msg) {
		super(msg);
	}
	
	public ExternalServiceWsReniecException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}