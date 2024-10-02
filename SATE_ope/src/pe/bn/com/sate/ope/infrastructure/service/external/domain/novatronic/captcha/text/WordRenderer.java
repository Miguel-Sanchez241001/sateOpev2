package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text;

import java.awt.image.BufferedImage;

/**
 *
 * @author rcastillejo
 */
public interface WordRenderer {
    
    public void render(String word, BufferedImage image);
}
