package pe.bn.com.sate.ope.transversal.configuration.security;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import pe.bn.com.sate.ope.transversal.util.StringsUtils;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ExceptionConstants;
import pe.bn.com.sate.ope.transversal.util.constantes.FormatConstants;
import pe.bn.com.sate.ope.transversal.util.excepciones.LoginException;

@Component
public class CustomFailureLoginHandler extends
		SimpleUrlAuthenticationFailureHandler {

	// @Override
	// public void onAuthenticationFailure(HttpServletRequest request,
	// HttpServletResponse response,
	// AuthenticationException exception) throws IOException, ServletException {
	// String mensajeExcepcion = "";
	//
	// if(exception.getClass().isAssignableFrom(UsernameNotFoundException.class)){
	// mensajeExcepcion = exception.getMessage();
	// }
	// if (exception.getClass().isAssignableFrom(LoginException.class)) {
	// mensajeExcepcion = exception.getMessage();
	// }
	// if
	// (exception.getClass().isAssignableFrom(InternalAuthenticationServiceException.class))
	// {
	// mensajeExcepcion = exception.getMessage();
	// }
	// if (exception.getClass().isAssignableFrom(Exception.class)) {
	// mensajeExcepcion = ExceptionConstants.UNKNOWN_ERROR;
	// }
	// System.out.println("gg:"+mensajeExcepcion);
	//
	// getRedirectStrategy().sendRedirect(request, response,
	// StringsUtils.concatenarCadena(
	// "/index.jsf?error=true&exception_message=",
	// URLEncoder.encode(mensajeExcepcion, FormatConstants.UTF_8)));
	// }

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		super.onAuthenticationFailure(request, response, exception);
		if (exception.getClass().isAssignableFrom(
				UsernameNotFoundException.class)) {

		}
	}
}