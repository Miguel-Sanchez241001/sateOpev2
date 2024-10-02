package pe.bn.com.sate.ope.transversal.configuration.security;

import java.util.Arrays;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class CustomAuthenticationToken extends
		UsernamePasswordAuthenticationToken {
	private static final long serialVersionUID = 1L;
	private final String ruc;
	private final String tipoDocumento;

	public CustomAuthenticationToken(Object principal, Object credentials,
			String ruc, String tipoDocumento, GrantedAuthority[] authorities) {
		super(principal, credentials, Arrays.asList(authorities));
		this.ruc = ruc;
		this.tipoDocumento = tipoDocumento;
	}

	public CustomAuthenticationToken(Object principal, Object credentials,
			String ruc, String tipoDocumento) {
		super(principal, credentials);
		this.ruc = ruc;
		this.tipoDocumento = tipoDocumento;
	}

	public String getRuc() {
		return ruc;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
}
