package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Permite generar imagenes de fondo transperentes a partir de las dimensiones
 * de otra imagen proporcionada.
 *
 * @author rcastillejo
 */
public class TransparentBackgroundProducer implements BackgroundProducer {

    /**
     * {@inheritDoc }
     *
     * @param image {@inheritDoc }
     */
    public BufferedImage getBackground(BufferedImage image) {
        return getBackground(image.getWidth(), image.getHeight());
    }

    /**
     * {@inheritDoc }
     *
     * @param width {@inheritDoc }
     * @param height {@inheritDoc }
     */
    public BufferedImage getBackground(int width, int height) {
        BufferedImage bg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);
        Graphics2D g = bg.createGraphics();

        g.setComposite(AlphaComposite.getInstance(1, 0.0F));
        g.fillRect(0, 0, width, height);

        return bg;
    }

}
