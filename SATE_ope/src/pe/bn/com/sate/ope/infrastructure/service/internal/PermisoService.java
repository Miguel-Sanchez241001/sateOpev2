package pe.bn.com.sate.ope.infrastructure.service.internal;

import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Permiso;

public interface PermisoService {

	public List<Permiso> buscarPermisosPorRole(Long idRol);
}
