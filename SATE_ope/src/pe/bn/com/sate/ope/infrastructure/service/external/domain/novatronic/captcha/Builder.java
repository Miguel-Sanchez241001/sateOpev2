package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Date;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background.BackgroundProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background.TransparentBackgroundProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text.TextProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text.WordRenderer;

/**
 * Clase permite la generacion de Imagen final para un codigo captcha.
 *
 * @author rcastillejo
 */
public class Builder implements Serializable {

    private final StringBuilder answer;
    private BufferedImage img;
    private BufferedImage bg;
    private Date timeStamp;

    /**
     * Inicializa la configuracion.
     *
     * @param width Ancho para la imagen del captcha (Pixels)
     * @param height Alto para la imagen del captcha (Pixels)
     */
    public Builder(int width, int height) {
        this.img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        this.answer = new StringBuilder();
    }

    /**
     * Obtiene la imagen de fondo, esta es redimencionada de acuerdo a la
     * dimension configurada en el constructor.
     *
     * @param bgProd Imagen de fondo (Ver {@linkplain BackgroundProducer})
     * @see BackgroundProducer
     * @see Builder
     */
    public void addBackground(BackgroundProducer bgProd) {
        this.bg = bgProd.getBackground(this.img.getWidth(), this.img.getHeight());
    }

    /**
     * Obtiene el codigo y crea la imagen preliminar del captcha.
     *
     * @param tProducer Elemento generador del codigo captcha
     * ({@linkplain TextProducer})
     * @param wRenderer Elemento renderizador para la generacion de la imagen
     * ({@linkplain WordRenderer})
     * @see TextProducer
     * @see WordRenderer
     */
    public void addText(TextProducer tProducer, WordRenderer wRenderer) {
        addText(tProducer.getText().toUpperCase(), wRenderer);
    }

    /**
     * Agrega el codigo y crea la imagen preliminar del captcha.
     *
     * @param text Codigo del captcha
     * @param wRenderer Elemento renderizador para la generacion de la imagen
     * ({@linkplain WordRenderer})
     * @see WordRenderer
     */
    public void addText(String text, WordRenderer wRenderer) {
        this.answer.append(text);
        wRenderer.render(getAnswer().toUpperCase(), this.img);
    }

    /**
     * Construye la imagen del codigo captcha.
     *
     */
    public void build() {
        if (this.bg == null) {
            this.bg = new TransparentBackgroundProducer().getBackground(this.img.getWidth(), this.img.getHeight());
        }

        Graphics2D g = this.bg.createGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();

        this.img = this.bg;

        this.timeStamp = new Date();
    }

    /**
     * Limpia el buffer de memoria utilizada para la generacion de la imagen del
     * captcha.
     */
    public void clearBuffer() {
        this.img = null;
        this.bg = null;
    }

    /**
     * Obtiene el buffer de memoria de la imagen construida para el codigo
     * captcha
     *
     * @return {@linkplain  BufferedImage} Buffer de memoria del Captcha
     */
    public BufferedImage getImg() {
        return img;
    }

    public String getAnswer() {
        return answer.toString();
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

}
