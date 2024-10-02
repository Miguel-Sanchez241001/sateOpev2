package pe.bn.com.sate.ope.persistence.mapper.external;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.sate.ope.transversal.dto.tablas.Agencia;

public interface AgenciaMapper {

/*	@Select("select distinct f01.F01_COFICINA as B09_CODIGO, f01.F01_AOFICINA as B09_DESCRIPCION, "
			+ "f02.F02_CUBIGEO_DP as B09_COD_DEPARTAMENTO, "
			+ "f02.F02_CUBIGEO_PV as B09_COD_PROVINCIA, "
			+ "f02.F02_CUBIGEO_DT as B09_COD_DISTRITO, "
			+ "f01.F01_TOFICINA,f02.F02_DLOCAL as B09_DIRECCION "
			+ "from [BN_Tablas].[dbo].[BNMAF01] f01 "
			+ "inner join [BN_Tablas].[dbo].[BNMAF02] f02 on f01.F01_COFICINA = f02.F02_COFICINA "
			+ "where f01.F01_BOFICINA = '0' and f01.F01_COFICINA !='0000' "
			+ "and f02.F02_CUBIGEO_DP=#{codDepartamento} and f02.F02_CUBIGEO_PV=#{codProvincia} and f02.F02_CUBIGEO_DT=#{codDistrito}")
	@ResultMap("mapAgencia")
	public List<Agencia> buscarAgenciasPorUbigeo(
			@Param("codDepartamento") String codDepartamento,
			@Param("codProvincia") String codProvincia,
			@Param("codDistrito") String codDistrito);*/

	@Select("SELECT " +
	        "f01.F01_COFICINA AS B09_CODIGO, " +
	        "MAX(f01.F01_AOFICINA) AS B09_DESCRIPCION, " +
	        "MAX(f02.F02_CUBIGEO_DP) AS B09_COD_DEPARTAMENTO, " +
	        "MAX(f02.F02_CUBIGEO_PV) AS B09_COD_PROVINCIA, " +
	        "MAX(f02.F02_CUBIGEO_DT) AS B09_COD_DISTRITO, " +
	        "MAX(f01.F01_TOFICINA) AS F01_TOFICINA, " +
	        "MAX(f02.F02_DLOCAL) AS B09_DIRECCION " +
	        "FROM [BN_Tablas].[dbo].[BNMAF01] f01 " +
	        "INNER JOIN [BN_Tablas].[dbo].[BNMAF02] f02 ON f01.F01_COFICINA = f02.F02_COFICINA " +
	        "WHERE f01.F01_BOFICINA = '0' " +
	        "AND f01.F01_COFICINA != '0000' " +
	        "AND f02.F02_CUBIGEO_DP = #{codDepartamento} " +
	        "AND f02.F02_CUBIGEO_PV = #{codProvincia} " +
	        "AND f02.F02_CUBIGEO_DT = #{codDistrito} " +
	        "GROUP BY f01.F01_COFICINA")
	@ResultMap("mapAgencia")
	public List<Agencia> buscarAgenciasPorUbigeo(
	        @Param("codDepartamento") String codDepartamento,
	        @Param("codProvincia") String codProvincia,
	        @Param("codDistrito") String codDistrito);

	
	@Select("select distinct f01.F01_COFICINA as B09_CODIGO,f02.F02_DLOCAL as B09_DIRECCION, f01.F01_AOFICINA as B09_DESCRIPCION, "
			+ "f02.F02_CUBIGEO_DT as B09_COD_DEPARTAMENTO,f02.F02_CUBIGEO_PV as B09_COD_PROVINCIA, "
			+ "f02.F02_CUBIGEO_DT as B09_COD_DISTRITO "
			+ "from [BN_Tablas].[dbo].[BNMAF01] f01 "
			+ "inner join [BN_Tablas].[dbo].[BNMAF02] f02 on f01.F01_COFICINA = f02.F02_COFICINA "
			+ "where f01.F01_BOFICINA = '0' and f01.F01_COFICINA =#{codAgencia}")
	@ResultMap("mapAgencia")
	public List<Agencia> buscarAgenciaPorCodAgencia(
			@Param("codAgencia") String codAgencia);
}
