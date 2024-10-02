package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 * Clase que almacena la imagen del codigo captcha y controla la valiacion del
 * mismo.
 *
 * @author rcastillejo
 */
public class Captcha {

    private final Builder builder;
    private boolean sensitive;
    
    
    /**
     * Inicializa la configuracion del Captcha. Por defecto la validacion
     * considera mayusculas y minusculas.
     *
     * @param builder Constructor del condigo Captcha (Ver
     * {@linkplain Builder Builder})
     */
    public Captcha(Builder builder) {
        this.builder = builder;
        this.sensitive = Boolean.FALSE;
    }

    /**
     * Inicializa la configuracion del Captcha. Permite desactivar la validacion
     * de mayusculas y minusculas.
     *
     * @param builder Constructor del condigo Captcha (Ver
     * {@linkplain Builder Builder})
     * @param sensitive Flag para realizar la validacion respetando mayusculas y
     * minusculas
     */
    public Captcha(Builder builder, boolean sensitive) {
        this.builder = builder;
        this.sensitive = sensitive;
    }

    /**
     * Obtiene el buffer de memoria de la imagen del codigo captcha.
     *
     * @return {@linkplain  BufferedImage} Buffer de memoria del Captcha
     */
    public BufferedImage getImage() {
        return this.builder.getImg();
    }

    public String getAnswer() {
        return this.builder.getAnswer();
    }

    /**
     * Evalua si la respuesta corresponde al captcha generado
     *
     * @param answer Cadena de la Respuesta
     * @return Si es corresponde al captcha
     */
    public boolean isCorrect(String answer) {
        boolean result;
        if (sensitive) {
        
            result = answer.equals(this.builder.getAnswer());
       } else {
    	  
            result = answer.equalsIgnoreCase(this.builder.getAnswer());
        }
        return result;
    }

    /**
     * Limpia el buffer de memoria para la imagen del codigo captcha construido
     */
    public void clearBuffer() {
        this.builder.clearBuffer();
    }

    public Date getTimeStamp() {
        return new Date(this.builder.getTimeStamp().getTime());
    }

    public boolean isSensitive() {
        return sensitive;
    }

    public void setSensitive(boolean sensitive) {
        this.sensitive = sensitive;
    }
}
