package pe.bn.com.sate.ope.persistence.mapper.internal;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.sate.ope.transversal.dto.sate.Transaccion;

public interface TransaccionMapper {

	@Select("SELECT * from BN_SATE.BNSATE14_TRANSACCION_HIS WHERE B14_CUENTA_CARGO = #{cuentaCorriente} TRUNC(B14_FEC_OPERACION) BETWEEN TRUNC(To_Date(#{fechaInicio},'dd/mm/yy')) AND TRUNC(To_Date(#{fechaFin},'dd/mm/yy'))")
	@ResultMap("mapTransaccion")
	public List<Transaccion> obtenerlistaTransacciones(
			@Param("cuentaCorriente") String cuentaCorriente,
			@Param("fechaInicio") String fechaInicio,
			@Param("fechaFin") String fechaFin);

}
