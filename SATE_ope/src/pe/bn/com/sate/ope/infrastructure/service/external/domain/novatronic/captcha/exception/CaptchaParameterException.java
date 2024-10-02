package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception;

/**
 *
 * @author rcastillejo
 */
public class CaptchaParameterException extends CaptchaException{
    

    public CaptchaParameterException() {
    }

    public CaptchaParameterException(String message, String parameter) {
        super(message + parameter);
    }

    public CaptchaParameterException(String message, String parameter, Throwable cause) {
        super(message + parameter, cause);
    }

    public CaptchaParameterException(Throwable cause) {
        super(cause);
    }
    
}
