package pe.bn.com.sate.ope.persistence.mapper.internal;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.sate.ope.transversal.dto.sate.Permiso;

public interface PermisosMapper {

	
	@Select("SELECT * FROM BN_SATE.BNSATE10_PER_PERMISOS WHERE B11_ID_ROL = #{idRol}")
	@ResultMap("mapPermiso")
	public List<Permiso> buscarPermisosPorRol(@Param("idRol")Long idRol);
}
