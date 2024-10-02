package pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.internet.actionforms.actions;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.multiaction.ParameterMethodNameResolver;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.Captcha;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.SingletonCaptchaFactory;

public class CaptchaController extends MultiActionController{
//	LoggerMVPE log3=LoggerMVPE.getInstance(SolicitudController.class.getName());
	
	public CaptchaController(){
		ParameterMethodNameResolver resolver = new ParameterMethodNameResolver();
		resolver.setParamName("method");
		resolver.setDefaultMethodName("execute");
		setMethodNameResolver(resolver);
	}
	public ModelAndView execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
//		 Configurar el response
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Max-Age", 0);
        response.setContentType("image/jpeg");

        /**
         * Implementado rcastillejo
         */
        BufferedImage image;
        //Se genera el captcha
        Captcha captcha = SingletonCaptchaFactory.getInstance().create();
        //Se obtiene la imagen generada
        image = captcha.getImage();

        /**
         * Se renderiza la imagen del captcha con los caracteres previamente
         * configurados. Archivo de configuracion: captcha-config.properties
         */
        OutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, "jpeg", outputStream);
        outputStream.close();
        captcha.clearBuffer();

        //Se guarda en la sesión el captcha generado. Ver Clase Captcha
        HttpSession session = request.getSession();
        session.setAttribute("captcha", captcha);
		return null;
	}
}

