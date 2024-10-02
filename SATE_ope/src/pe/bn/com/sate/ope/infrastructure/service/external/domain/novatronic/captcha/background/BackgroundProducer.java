/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background;

import java.awt.image.BufferedImage;

/**
 *
 * @author rcastillejo
 */
public interface BackgroundProducer {

    /**
     * Crea la imagen de fondo de acuerdo a las dimensiones de la imagen en
     * memoria proporcionada.
     *
     * @param paramBufferedImage Imagen recibida para las dimensiones del fondo
     * @return Imagen de fondo ({@link BufferedImage})
     * @see #getBackground(int, int) getBackground(width, height)
     */
    public BufferedImage getBackground(BufferedImage paramBufferedImage);

    /**
     * Crea la imagen de fondo de acuerdo a las dimensiones proporcionadas
     *
     * @param paramInt1 Dimension del ancho para el fondo
     * @param paramInt2 Dimension del alto para el fondo
     * @return Imagen de fondo ({@link BufferedImage})
     */
    public BufferedImage getBackground(int paramInt1, int paramInt2);
}
