package pe.bn.com.sate.ope.transversal.configuration;

import org.springframework.context.annotation.Configuration;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.SingletonCaptchaFactory;

@Configuration
public class CaptchaConfig {

	public CaptchaConfig() {
		SingletonCaptchaFactory.init();
	}
}
