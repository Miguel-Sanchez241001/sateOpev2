package pe.bn.com.sate.ope.infrastructure.service.internal;

import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Rol;

public interface RolService {

	public List<Rol> buscarRoles();
	
	public Rol buscarRolPorId(long id);
}
