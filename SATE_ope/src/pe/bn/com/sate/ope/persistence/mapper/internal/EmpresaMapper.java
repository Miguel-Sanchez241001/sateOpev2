package pe.bn.com.sate.ope.persistence.mapper.internal;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;

public interface EmpresaMapper {

	@Select("SELECT * FROM BN_SATE.BNSATE00_EMPRESA WHERE B00_NUM_RUC =#{ruc}")
	@ResultMap("mapEmpresa")
	public Empresa buscarEmpresaPorRUC(@Param("ruc") String ruc);

	@Select("SELECT * FROM BN_SATE.BNSATE01_EST_EMPRESA est JOIN BN_SATE.BNSATE00_EMPRESA emp ON emp.B00_ID_EMP = est.B00_Id_EMP WHERE est.B01_ID_EST = (SELECT MAX(BN01.B01_ID_EST)"
			+ " FROM BN_SATE.BNSATE01_EST_EMPRESA BN01 WHERE BN01.B00_ID_EMP = (SELECT BN00.B00_ID_EMP FROM BN_SATE.BNSATE00_EMPRESA BN00 WHERE BN00.B00_NUM_RUC = #{ruc})) AND est.b01_fec_desafiliacion IS NULL")
	@ResultMap("mapEmpresa")
	public Empresa buscarEmpresaAfiliada(@Param("ruc") String ruc);
}
