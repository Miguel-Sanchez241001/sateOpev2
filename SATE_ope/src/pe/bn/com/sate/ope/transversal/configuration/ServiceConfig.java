package pe.bn.com.sate.ope.transversal.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"pe.bn.com.sate.ope.infrastructure.service.external.impl",
		"pe.bn.com.sate.ope.infrastructure.service.internal.impl",
		"pe.bn.com.sate.ope.infrastructure.facade"})
public class ServiceConfig {

}