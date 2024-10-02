package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception;

/**
 *
 * @author rcastillejo
 */
public class InvalidCaptchaParameterException extends CaptchaParameterException{
    private static final String MESSAGE = "Parametro invalido:";

    public InvalidCaptchaParameterException() {
    }

    public InvalidCaptchaParameterException(String parameter) {
        super(MESSAGE, parameter);
    }

    public InvalidCaptchaParameterException(String parameter, Throwable cause) {
        super(MESSAGE, parameter, cause);
    }

    public InvalidCaptchaParameterException(Throwable cause) {
        super(cause);
    }
    
}
