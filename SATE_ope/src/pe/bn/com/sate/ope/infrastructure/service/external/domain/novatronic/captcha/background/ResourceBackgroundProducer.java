package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Permite crear y redimensionar la imagen de fondo a partir de las dimensiones
 * u otra imagen proporcionada.
 *
 * @author rcastillejo
 */
public class ResourceBackgroundProducer implements BackgroundProducer {

    private BufferedImage bgLoaded;

    /**
     * Constructor de la clase, el cual solicita el Archivo de la imagen para la
     * lectura y el almacenamiento en el buffer de imagen bgLoaded.
     *
     * @param resourceFile - Archivo de la imagen
     * @throws IOException
     */
    public ResourceBackgroundProducer(File resourceFile) throws IOException {
        bgLoaded = ImageIO.read(resourceFile);
    }

    /**
     * Constructor de la clase, el cual solicita la URL de la imagen para la
     * lectura y el almacenamiento en el buffer de imagen bgLoaded.
     *
     * @param resourceURL - URL de la imagen
     * @throws IOException
     */
    public ResourceBackgroundProducer(URL resourceURL) throws IOException {
        bgLoaded = ImageIO.read(resourceURL);
    }

    /**
     * Constructor de la clase, el cual solicita el flujo de bytes en memoria de
     * la imagen para la lectura y el almacenamiento en el buffer de imagen
     * bgLoaded.
     *
     * @param resourceIS - flujo de bytes en memoria de la imagen
     * @throws IOException
     */
    public ResourceBackgroundProducer(InputStream resourceIS) throws IOException {
        bgLoaded = ImageIO.read(resourceIS);
    }

    /**
     * Constructor de la clase, el cual solicita el Nombre del archivo de la
     * imagen para la lectura y el almacenamiento en el buffer de imagen
     * bgLoaded.
     *
     * @param resourceName - Nombre del archivo de la imagen
     * @throws IOException
     */
    public ResourceBackgroundProducer(String resourceName) throws IOException {
        URL resourceURL = ResourceBackgroundProducer.class.getClassLoader().getResource(resourceName);
        bgLoaded = ImageIO.read(resourceURL);
    }

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
        BufferedImage bg = new BufferedImage(width, height, bgLoaded.getType());
        Graphics2D g = bg.createGraphics();

        g.drawImage(bgLoaded, 0, 0, null);
        return bg;
    }

}
