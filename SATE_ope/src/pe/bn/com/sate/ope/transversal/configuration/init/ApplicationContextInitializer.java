package pe.bn.com.sate.ope.transversal.configuration.init;

import org.springframework.context.annotation.ComponentScan;	
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"pe.bn.com.sate.ope.transversal.configuration",
		"pe.bn.com.sate.ope.transversal.util.anotaciones"})
public class ApplicationContextInitializer {

}

