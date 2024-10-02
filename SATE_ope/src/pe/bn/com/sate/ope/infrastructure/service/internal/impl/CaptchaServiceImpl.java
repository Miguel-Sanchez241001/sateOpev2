package pe.bn.com.sate.ope.infrastructure.service.internal.impl;

import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.Captcha;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.SingletonCaptchaFactory;
import pe.bn.com.sate.ope.infrastructure.service.internal.CaptchaService;

@Service
public class CaptchaServiceImpl implements CaptchaService {

	@Override
	public boolean validarCaptcha(Captcha captcha, String captchaTexto) {
		try {
			if (captcha.isCorrect(captchaTexto))
				return true;
			else
				return false;
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public Captcha generarCaptcha() {
		try {
			return SingletonCaptchaFactory.getInstance().create();
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

}
