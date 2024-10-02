package pe.bn.com.sate.ope.transversal.configuration.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class SecurityContextFacade
{
  

    public static boolean hasAuthenticatedUserRole(String role)
    {
        for (GrantedAuthority authority : getAuthenticatedUser().getAuthorities())
        {
            if (authority.getAuthority().equals(role.toString()))
            {
                return true;
            }
        }
        return false;
    }

    public static UsuarioSeguridad getAuthenticatedUser()
    {
        Authentication aut = SecurityContextHolder.getContext().getAuthentication();
        if (aut == null)
        {
            return null;
        } else
        {
            return (UsuarioSeguridad) SecurityContextHolder.getContext().getAuthentication().getDetails();
        }
    }

    public static String obtenerIpCliente()
    {
        Object details = SecurityContextHolder.getContext().getAuthentication().getDetails();
        if (details instanceof WebAuthenticationDetails)
        {
            String ipAddress = ((WebAuthenticationDetails) details).getRemoteAddress();
            return ipAddress;
        }
        return "0.0.0.0";
    }
}