package pe.bn.com.sate.ope.persistence.mapper.internal;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.bn.com.sate.ope.transversal.dto.sate.Cliente;

public interface ClienteMapper {
	
	
	@Insert("INSERT INTO BN_SATE.BNSATE06_CLIENTE (" +
			"B06_NOMBRES," +
			"B06_APPATERNO," +
			"B06_APMATERNO," +
			"B06_TIPO_DOCUMENTO," +
			"B06_NUM_DOCUMENTO," +
			"B06_FEC_NACIMIENTO," +
			"B06_EST_CIVIL," +
			"B06_SEXO," +
			"B06_TELEF_CASA," +
			"B06_DIRECCION," +
			"B06_UBIGEO," +
			"B06_REFERENCIA)" +
			" VALUES (" +
			"#{nombres}," +
			"#{apPaterno}," +
			"#{apMaterno}," +
			"#{tipoDocumento}," +
			"#{nroDocumento}," +
			"#{fechaNacimiento}," +
			"#{estadoCivil}," +
			"#{sexo}," +
			"#{telefonoCasa}," +
			"#{direccion}," +
			"#{ubigeo}," +
			"#{referencia})")
	//@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "B06_ID_CLI")
	public void registrarCliente(Cliente cliente);
	
	@Update("UPDATE BN_SATE.BNSATE06_CLIENTE SET B06_TELEF_CASA=#{telefonoCasa} WHERE B06_ID_CLI = #{id}")
	public void actualizarCliente(Cliente cliente);
	
	@Select("SELECT * FROM BN_SATE.BNSATE06_CLIENTE WHERE " +
			"B06_TIPO_DOCUMENTO = #{tipoDocumento} AND B06_NUM_DOCUMENTO = #{numDocumento}")
	@ResultMap("mapCliente")
	public Cliente buscarCliente(@Param("tipoDocumento")String tipoDocumento,@Param("numDocumento")String numDocumento);
	
	
	@Select("SELECT BN06.* FROM BNSATE06_CLIENTE BN06 INNER JOIN BNSATE05_TARJETA BN05 ON BN06.B06_ID_CLI = BN05.B06_ID_CLI WHERE BN05.B05_NUM_TARJETA =#{numTarjeta}")
	@ResultMap("mapCliente")
	public Cliente buscarClientePorNumTajeta(@Param("numTarjeta") String numTarjeta);
}
