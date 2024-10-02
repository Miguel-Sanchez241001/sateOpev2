package pe.bn.com.sate.ope.infrastructure.exception;

public class InternalServiceException extends ServiceException {
	
	private static final long serialVersionUID = 1L;

	public InternalServiceException(String msg) {
		super(msg);
	}
	
	public InternalServiceException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}