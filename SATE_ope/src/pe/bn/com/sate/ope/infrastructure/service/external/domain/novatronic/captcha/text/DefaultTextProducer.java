package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text;

import java.util.Random;

/**
 * Esta clase permite generar un codigo aleatorio alfanumerico ([a-z], [A-Z] y/o [0-9])
 * para una determinada longitud.
 *
 * @author rcastillejo
 */
public class DefaultTextProducer implements TextProducer {

    private static final String allowableChars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
    private static final int allowableCharsLength = allowableChars.length();
    private final int length;

    /**
     * Constructor de la clase, el cual solicita la longitud del codigo a
     * generar.
     *
     * @param length Longitud del codigo
     */
    public DefaultTextProducer(int length) {
        this.length = length;
    }

    /**
     * Devuelve el codigo autogenerado de acuerdo a lo configurado.
     *
     * @return Codigo autogenerado
     */
    public String getText() {
        Random r = new Random();
        StringBuilder text = new StringBuilder();
        int c = 0;
        while (c < length) {
            text.append(allowableChars.charAt(r.nextInt(allowableCharsLength)));
            c++;
        }
        return text.toString();
    }
}
