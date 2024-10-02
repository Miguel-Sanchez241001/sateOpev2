package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 * Esta clase permite aplicar los estilos necesarios al texto en consulta.
 *
 * @author rcastillejo
 */
public class ColoredWordRenderer implements WordRenderer {

    private static final String DEFAULT_FONT_NAME = "arial";
    private static final int DEFAULT_FONT_SIZE = 25;

    private static final int MIN_COLOR_RGB = 60;
    private static final int MAX_COLOR_RGB = 90;

    private static final double ALPHA_ROTATION = 0.5;

    private Font font;
    private final float horizMargin;
    private final double rotationRangeRadiants;
    private final int minRGB;
    private final int maxRGB;

    /**
     * Carga la configuracion del renderizador del texto.
     *
     *
     * @param horizMargin Margen de separacion (Pixeles)
     * @param rotationRange Angulo de inclinacion (Grados)
     */
    public ColoredWordRenderer(float horizMargin, double rotationRange) {
        this(horizMargin, rotationRange, new Font(DEFAULT_FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE));
    }

    /**
     * Carga la configuracion del renderizador del texto.
     *
     *
     * @param horizMargin Margen de separacion (Pixeles)
     * @param rotationRange Angulo de inclinacion (Grados)
     * @param font Fuente
     */
    public ColoredWordRenderer(float horizMargin, double rotationRange, Font font) {
        this(horizMargin, rotationRange, font, MIN_COLOR_RGB, MAX_COLOR_RGB);
    }

    /**
     * Carga la configuracion del renderizador del texto.
     *
     * @param horizMargin Margen de separacion (Pixeles)
     * @param rotationRange Angulo de inclinacion (Grados)
     * @param font Fuente
     * @param minRGB Rango inferior RGB
     * @param maxRGB Rango superior RGB
     */
    public ColoredWordRenderer(float horizMargin, double rotationRange, Font font, int minRGB, int maxRGB) {
        this.horizMargin = horizMargin;
        this.rotationRangeRadiants = Math.toRadians(rotationRange);
        this.font = font;
        this.minRGB = minRGB;
        this.maxRGB = maxRGB;
    }

    /**
     * Renderizado del texto aplicando la configuracion cargada.
     *
     * @param word Texto a renderizar
     * @param image Imagen del texto renderizado
     */
    public void render(String word, BufferedImage image) {
        Graphics2D graphics2D;
        FontMetrics fontMetrics;

        int length = word.getBytes().length;
        /**
         * Obtiene el espacio del texto respetando el margen asignado respecto
         * al tamanio de la imagen.
         */
        float spaceForLetters = -horizMargin * 2 + image.getWidth();
        /**
         * Obtiene el espacio entre cada caracter.
         */
        float spacePerChar = spaceForLetters / (length > 1 ? length - 1 : length);

        graphics2D = image.createGraphics();
        fontMetrics = graphics2D.getFontMetrics(font);
        int maxAdvance = fontMetrics.getMaxAdvance();
        int fontHeight = fontMetrics.getHeight();
        int charDim = (int) Math.hypot(maxAdvance, fontHeight);
        int halfCharDim = (charDim / 2);
        int y = ((image.getHeight() - charDim) / 2);
        int charY = (fontMetrics.getAscent() + (charDim - (fontMetrics.getAscent() + fontMetrics.getDescent())) / 2);

        /**
         * Se agrega efecto al texto del captcha: - Separacion entre los
         * caracteres - Inclinacion de cada caracter
         *
         */
        char[] allChars = word.toCharArray();
        for (int i = 0; i < allChars.length; i++) {
            char charToPrint = allChars[i];

            int charWidth = fontMetrics.charWidth(charToPrint);
            double angle = getRandomAngle();
            int x = (int) (horizMargin + spacePerChar * (i) - charDim / 2);
            int charX = (int) (0.5 * charDim - 0.5 * charWidth);
            BufferedImage charImage = new BufferedImage(charDim, charDim, BufferedImage.TYPE_INT_ARGB);
            Graphics2D charGraphics = charImage.createGraphics();
            charGraphics.translate(halfCharDim, halfCharDim);
            charGraphics.transform(AffineTransform.getRotateInstance(angle));
            charGraphics.translate(-halfCharDim, -halfCharDim);
            charGraphics.setColor(getRandomColorRGB());
            charGraphics.setFont(font);
            charGraphics.drawString("" + charToPrint, charX, charY);
            graphics2D.drawImage(charImage, x, y, charDim, charDim, null, null);
            charGraphics.dispose();
        }

        graphics2D.dispose();
    }

    /**
     * Obtiene aleatoriamente un valor para la rotacion +/-, dentro del rango
     * definido en radianes.
     *
     * @return Angulo de rotacion aleatorio en radianes entre los rangos
     * -{@code  rotationRangeRadiants} y +{@code  rotationRangeRadiants}.
     */
    private double getRandomAngle() {
        return (Math.random() - ALPHA_ROTATION) * rotationRangeRadiants;
    }

    /**
     * Obtiene el color aleatoriamente entre los valores por defecto
     * {@value #MIN_COLOR_RGB} y {@value #MAX_COLOR_RGB}
     *
     * @return {@linkplain Color} aleatorio.
     */
    private Color getRandomColorRGB() {
        int charColor = random(minRGB, maxRGB);
        return new Color(charColor, charColor, charColor);
    }

    /**
     * Obtiene un numero aleatorio entre los rangos definidos
     * @param min minimo
     * @param max maximo
     * @return Aleatorio
     */
    private int random(int min, int max) {
        return min + (int) (Math.random() * max);
    }

}
