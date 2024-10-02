package pe.bn.com.sate.ope.transversal.configuration.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;

/**
 * CustomAuthenticationSuccessHandler maneja las acciones a realizar 
 * cuando la autenticación es exitosa.
 */
@Component
public class CustomSuccessLoginHandler implements AuthenticationSuccessHandler {
	private final Logger logger = Logger
			.getLogger(CustomSuccessLoginHandler.class);
	 /**
     * Método invocado cuando la autenticación es exitosa.
     * Redirige al usuario a la página principal.
     *
     * @param request        el HttpServletRequest
     * @param response       el HttpServletResponse
     * @param authentication el Authentication
     * @throws IOException      si ocurre un error de entrada/salida
     * @throws ServletException si ocurre un error en el servlet
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        logger.info("Autenticación exitosa para el usuario: " + authentication.getName());
        logger.info("Redireccionando a la página principal.");
        UsefulWebApplication.redireccionar("/principal.jsf");
    }
}