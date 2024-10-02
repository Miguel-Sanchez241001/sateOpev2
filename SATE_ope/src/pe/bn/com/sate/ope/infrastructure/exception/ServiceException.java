package pe.bn.com.sate.ope.infrastructure.exception;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ServiceException(String msg) {
		super(msg);
	}

	public ServiceException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}
