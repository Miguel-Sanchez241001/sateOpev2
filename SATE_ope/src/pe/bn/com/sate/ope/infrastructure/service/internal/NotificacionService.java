package pe.bn.com.sate.ope.infrastructure.service.internal;

import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;

public interface NotificacionService {
	public void enviarMailUsuarioClave(Usuario usuario, String clave);
}
