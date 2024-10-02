/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha;

import java.net.URL;

/**
 * Clase Singleton de la Fabrica de Captcha.
 *
 * @author rcastillejo
 * @see CaptchaFactory
 */
public class SingletonCaptchaFactory {

    private static CaptchaFactory factory;

    /**
     * Inicializa la fabrica de captcha.
     * @see CaptchaFactory#CaptchaFactory()
     */
    public static void init() {
        factory = new CaptchaFactory();
    }

    /**
     * Inicializa la fabrica de captcha mediante unn archivo de configuracion definida.
     * @param configFile Nombre del archivo de la configuracion
     * @see CaptchaFactory#CaptchaFactory(java.lang.String configFile)
     */
    public static void init(String configFile) {
        factory = new CaptchaFactory(configFile);
    }

    /**
     * Inicializa la fabrica de captcha mediante unn archivo de configuracion definida URL.
     * @param configURL URL del archivo de la configuracion
     * @see CaptchaFactory#CaptchaFactory(java.io.InputStream configFile)
     */
    public static void init(URL configURL) {
        factory = new CaptchaFactory(configURL);
    }
 
    /**
     * Devuelve la fabrica de captcha.
     * @return {@linkplain CaptchaFactory}
     * @see CaptchaFactory#CaptchaFactory()
     */
    public static CaptchaFactory getInstance() {
        return factory;
    }

    
    /**
     * Finaliza la fabrica de captcha.
     * @see CaptchaFactory#destroy()
     */
    public static void destroy() {
        if (factory != null) {
            factory.destroy();
        }
    }
}
