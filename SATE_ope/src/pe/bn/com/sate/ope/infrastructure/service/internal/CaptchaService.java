package pe.bn.com.sate.ope.infrastructure.service.internal;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.Captcha;

public interface CaptchaService {
	
	public boolean validarCaptcha(Captcha captcha, String captchaTexto);
	
	public Captcha generarCaptcha();
}
