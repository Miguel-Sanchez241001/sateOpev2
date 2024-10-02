package pe.bn.com.sate.ope.persistence.mapper.internal;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.sate.ope.transversal.dto.sate.Cargo;

public interface CargoMapper {

	@Select("SELECT * from BN_SATE.BNSATE15_CARGO_HIS WHERE B15_CUENTA_CARGO = #{cuentaCorriente} TRUNC(B15_FEC_PROCESO) BETWEEN TRUNC(To_Date(#{fechaInicio},'dd/mm/yy')) AND TRUNC(To_Date(#{fechaFin},'dd/mm/yy'))")
	@ResultMap("mapCargo")
	public List<Cargo> obtenerlistaCargos(
			@Param("cuentaCorriente") String cuentaCorriente,
			@Param("fechaInicio") String fechaInicio,
			@Param("fechaFin") String fechaFin);

}
