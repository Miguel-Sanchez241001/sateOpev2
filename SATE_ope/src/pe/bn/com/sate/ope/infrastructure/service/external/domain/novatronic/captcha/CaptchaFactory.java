package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha;

import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background.BackgroundProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.background.ResourceBackgroundProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception.CaptchaException;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception.InvalidCaptchaParameterException;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.exception.NullCaptchaParameterException;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text.ColoredWordRenderer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text.DefaultTextProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text.TextProducer;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.text.WordRenderer;

/**
 *
 * @author rcastillejo
 */
public class CaptchaFactory {

    private static final String DEFAULT_CONFIG = "captcha-config.properties";
    private Properties configProp;
    private TextProducer dtp;
    private BackgroundProducer rbp;
    private WordRenderer wr;
    /**
     * background.jpg : Archivo donde se escribira el valor del captcha
     * CAPTCHA_IMG : Ruta donde se guarda el archivo background.jpg
     */
    private String background;

    /**
     * captchafont.ttf : Tipo de fuente (se puede utilizar otro tipo de fuente)
     * CAPTCHA_FONT : Ruta donde se guarda el archivo captchafont.ttf
     */
    private String font;

    /**
     * Atributos de la fuente del codigo Captcha
     */
    private  Map fontAttributes;

    /**
     * Indica si es sensible a mayusculas y minusculas
     */
    private boolean caseSensitive;

    /**
     * Longitud de background.jpg
     */
    private int width;

    /**
     * Altura de background.jpg
     */
    private int height;

    /**
     * Numero de caracteres del captcha
     */
    private int length;

    /**
     * Separacion entre caracteres
     */
    private float horizMargin;

    /**
     * Rango de rotacion o inclinacion de un caracter
     */
    private double rangeDegree;

    /**
     * Carga la configuracion por defecto. Para ello, se debe tener el archivo
     * {@linkplain  #DEFAULT_CONFIG DEFAULT_CONFIG} en el claspath
     *
     */
    public CaptchaFactory() {
        this(DEFAULT_CONFIG);
    }

    /**
     * Carga la configuracion indicada.
     *
     * @param contextPath {@linkplain  URL} Referencia del path de configuracion a cargar
     *
     */
    public CaptchaFactory(URL contextPath) {
        readProp(DEFAULT_CONFIG);
        validateConfig();
        configure();
        init(contextPath.getPath());
    }

    
    /**
     * Carga la configuracion indicada.
     *
     * @param configURL {@linkplain  URL} Referencia del path de configuracion a
     * cargar
     * @param config
     *
     */
    public CaptchaFactory(URL configURL, String config) {
        readProp(configURL, config);
        validateConfig();
        configure();
        init(configURL.getPath());
    }
    
    /**
     * Carga la configuracion indicada. Para ello, se debe tener el archivo
     * indicado en el claspath.
     *
     * @param configFile Archivo de configuracion a cargar
     *
     */
    public CaptchaFactory(String configFile) {
        readProp(configFile);
        validateConfig();
        configure();
        init();
    }

    
    private void readProp(URL configURL, String config) {
        readProp(loadResource(configURL.getPath(), config));
    }

    private void readProp(String configFile) {
        readProp(loadResource(configFile));
    }

    private void readProp(InputStream is) {
        try {
            configProp = null;
            configProp = new Properties();
            configProp.load(is);
        } catch (IOException e) {
            throw new CaptchaException("Error al cargar configuracion", e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    private void validateConfig() {
        if (!configProp.containsKey(CaptchaParam.WIDTH)) {
            throw new NullCaptchaParameterException(CaptchaParam.WIDTH);
        }
        if (!configProp.containsKey(CaptchaParam.HEIGHT)) {
            throw new NullCaptchaParameterException(CaptchaParam.HEIGHT);
        }
        if (!configProp.containsKey(CaptchaParam.LENGTH)) {
            throw new NullCaptchaParameterException(CaptchaParam.LENGTH);
        }
        if (!configProp.containsKey(CaptchaParam.MARGIN)) {
            throw new NullCaptchaParameterException(CaptchaParam.MARGIN);
        }
        if (!configProp.containsKey(CaptchaParam.RANGE_DEGREE)) {
            throw new NullCaptchaParameterException(CaptchaParam.RANGE_DEGREE);
        }
    }

    private void configure() { 
        background = configProp.getProperty(CaptchaParam.BACKGROUND);
        font = configProp.getProperty(CaptchaParam.FONT);
        
        caseSensitive = Boolean.parseBoolean(configProp.getProperty(CaptchaParam.CASE_SENSITIVE));

        try {
            height = Integer.parseInt(configProp.getProperty(CaptchaParam.HEIGHT));
        } catch (NumberFormatException e) {
            throw new InvalidCaptchaParameterException(CaptchaParam.HEIGHT, e);
        }
        try {
            width = Integer.parseInt(configProp.getProperty(CaptchaParam.WIDTH));
        } catch (NumberFormatException e) {
            throw new InvalidCaptchaParameterException(CaptchaParam.WIDTH, e);
        }

        try {
            length = Integer.parseInt(configProp.getProperty(CaptchaParam.LENGTH));
        } catch (NumberFormatException e) {
            throw new InvalidCaptchaParameterException(CaptchaParam.LENGTH, e);
        }
        try {
            horizMargin = Float.parseFloat(configProp.getProperty(CaptchaParam.MARGIN));
        } catch (NumberFormatException e) {
            throw new InvalidCaptchaParameterException(CaptchaParam.MARGIN, e);
        }

        try {
            rangeDegree = Double.parseDouble(configProp.getProperty(CaptchaParam.RANGE_DEGREE));
        } catch (NumberFormatException e) {
            throw new InvalidCaptchaParameterException(CaptchaParam.RANGE_DEGREE, e);
        }
        
        configureFont();

    }

    private void configureFont(){        
        float fontSize;
        String fontStyle;

        fontStyle = configProp.getProperty(CaptchaParam.FONT_ATTRIBUTES);
        fontAttributes = new HashMap(Font.decode(fontStyle).getAttributes());
        
        if(configProp.containsKey(CaptchaParam.FONT_SIZE)){
            try {
                fontSize = Float.parseFloat(configProp.getProperty(CaptchaParam.FONT_SIZE));
                fontAttributes.put(TextAttribute.SIZE, fontSize);
            } catch (NumberFormatException e) {}
        }       
    }
    
    private void init(String path) {
        InputStream backgroundIS;
        Font fontLoaded;
        backgroundIS = null;
        try {
            fontLoaded = loadResourceFont(path, font);
            backgroundIS = loadResource(path, background);
            dtp = new DefaultTextProducer(length);
            rbp = new ResourceBackgroundProducer(backgroundIS);
            wr = new ColoredWordRenderer(horizMargin, rangeDegree, fontLoaded.deriveFont(fontAttributes));
        } catch (Exception e) {
            throw new CaptchaException("Error al crear captcha", e);
        } finally {
            if (backgroundIS != null) {
                try {
                    backgroundIS.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    private void init() {
        Font fontLoaded;
        try {
            fontLoaded = loadResourceFont(font);
            dtp = new DefaultTextProducer(length);
            dtp = new DefaultTextProducer(length);
            rbp = new ResourceBackgroundProducer(background);
            wr = new ColoredWordRenderer(horizMargin, rangeDegree, fontLoaded.deriveFont(fontAttributes));
        } catch (Exception e) {
            throw new CaptchaException("Error al crear captcha", e);
        }
    }

    /**
     * Crea la clase captcha de acuerdo a la configuracion cargada.
     *
     * @return {@linkplain Captcha}
     */
    public Captcha create() {
        Captcha captcha;
        Builder builder = new Builder(width, height);
        builder.addBackground(rbp);
        builder.addText(dtp, wr);
        builder.build();
        captcha = new Captcha(builder);
        captcha.setSensitive(caseSensitive);
        return captcha;
    }

    private Font loadResourceFont(String fontFile) throws Exception {
        InputStream fontIs;

        fontIs = null;
        try {
            fontIs = loadResource(fontFile);
            return Font.createFont(Font.TRUETYPE_FONT, fontIs);
        } finally {
            if (fontIs != null) {
                try {
                    fontIs.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    private Font loadResourceFont(String path, String fontFile) throws Exception {
        InputStream fontIs;

        fontIs = null;
        try {
            fontIs = loadResource(path, fontFile);

            return Font.createFont(Font.TRUETYPE_FONT, fontIs);
        } finally {
            if (fontIs != null) {
                try {
                    fontIs.close();
                } catch (IOException ex) {
                }
            }
        }
    }

    private InputStream loadResource(String resource) {
        return CaptchaFactory.class.getClassLoader().getResourceAsStream(resource);
    }

    private InputStream loadResource(String path, String resource) {
        try {
            return new FileInputStream(new File(path + resource));
        } catch (FileNotFoundException e) {
            throw new CaptchaException("Error al cargar configuracion:" + path + resource, e);
        }
    }

    /**
     * Libera los recursos cargados.
     */
    public void destroy() {
        configProp.clear();        
    }
}
