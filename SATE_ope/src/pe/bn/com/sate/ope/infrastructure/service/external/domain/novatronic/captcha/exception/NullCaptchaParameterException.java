package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception;

/**
 *
 * @author rcastillejo
 */
public class NullCaptchaParameterException extends CaptchaParameterException{
    private static final String MESSAGE = "Parametro no configurado:";

    public NullCaptchaParameterException() {
    }

    public NullCaptchaParameterException(String parameter) {
        super(MESSAGE, parameter);
    }

    public NullCaptchaParameterException(String parameter, Throwable cause) {
        super(MESSAGE, parameter, cause);
    }

    public NullCaptchaParameterException(Throwable cause) {
        super(cause);
    }
    
}
