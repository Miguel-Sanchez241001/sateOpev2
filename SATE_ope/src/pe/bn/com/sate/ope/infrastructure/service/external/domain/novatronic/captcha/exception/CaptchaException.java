package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception;

/**
 *
 * @author rcastillejo
 */
public class CaptchaException extends RuntimeException{

    public CaptchaException() {
    }

    public CaptchaException(String message) {
        super(message);
    }

    public CaptchaException(String message, Throwable cause) {
        super(message, cause);
    }

    public CaptchaException(Throwable cause) {
        super(cause);
    }
    
}
