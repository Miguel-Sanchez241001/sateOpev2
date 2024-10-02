package pe.bn.com.sate.ope.persistence.mapper.internal;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;

public interface UsuarioMapper {

	@Select("SELECT * FROM BN_SATE.BNSATE02_USUARIO WHERE B02_TIPO_DOCUMENTO= #{tipoDocumento} AND B02_NUM_DOCUMENTO =#{numDocumento} ")
	@ResultMap("mapUsuario")
	public Usuario buscarUsuario(@Param("tipoDocumento") String tipoDocumento,
			@Param("numDocumento") String numDocumento);

	@Select("SELECT * FROM BN_SATE.BNSATE02_USUARIO WHERE B02_TIPO_DOCUMENTO= #{tipoDocumento} AND B02_NUM_DOCUMENTO =#{numDocumento}  AND b02_perfil_usuario != '1'")
	@ResultMap("mapUsuario")
	public Usuario buscarUsuarioSinRepresentante(
			@Param("tipoDocumento") String tipoDocumento,
			@Param("numDocumento") String numDocumento);

	@Insert("INSERT INTO BN_SATE.BNSATE02_USUARIO(" +
			"B02_TIPO_DOCUMENTO," +
			"B02_NUM_DOCUMENTO," +
			"B02_NOMBRES," +
			"B02_APPATERNO," +
			"B02_APMATERNO," +
			"B02_CORREO," +
			"B02_TELEFONO_MOVIL," +
			"B02_PERFIL_USUARIO," +
			"B02_REP_CREADOR," +
			"B02_ESTADO," +
			"B02_FLAG_CAMBIO_CLAVE) "
			+ "VALUES (" +
			"#{tipoDocumento}," +
			"#{numeroDocumento}," +
			"#{nombres}," +
			"#{apPaterno}," +
			"#{apMaterno}," +
			"#{correoLaboral}," +
			"#{telefonoMovil}," +
			"#{usuarioPerfil}," +
			"#{representanteCreador}," +
			"#{estado}," +
			"#{flagCambioClave})")
	//@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "B02_REP")
	public void registrarUsuario(Usuario usuario);

	@Select("SELECT * FROM BN_SATE.BNSATE02_USUARIO usu " +
			"JOIN " +
			"BN_SATE.BNSATE03_REP_EMP rem " +
			"ON " +
			"usu.B02_REP_CREADOR = rem.b02_rep " +
			"JOIN BN_SATE.bnsate00_empresa emp " +
			"ON rem.b00_id_emp = emp.b00_id_emp " +
			"WHERE " +
			"emp.b00_num_ruc = #{ruc} AND usu.b02_num_documento = #{numeroDocumento}")
	@ResultMap("mapUsuario")
	public Usuario existeUsuarioEmpresa(
			@Param("numeroDocumento") String numDocumento,
			@Param("ruc") String ruc);

	@Select("SELECT * FROM BN_SATE.BNSATE00_EMPRESA emp JOIN BN_SATE.BNSATE02_USUARIO rep ON emp.b02_rep = rep.b02_rep WHERE emp.B00_NUM_RUC =#{ruc} AND rep.b02_num_documento = #{numeroDocumento}")
	@ResultMap("mapUsuario")
	public Usuario existeRepresentanteEmpresa(
			@Param("numeroDocumento") String numDocumento,
			@Param("ruc") String ruc);

	@Update("UPDATE BN_SATE.BNSATE02_USUARIO SET B02_ESTADO=#{estado}, B02_PERFIL_USUARIO=#{usuarioPerfil}, B02_FLAG_CAMBIO_CLAVE=#{flagCambioClave}, B02_CORREO = #{correoLaboral}, B02_TELEFONO_MOVIL = #{telefonoMovil} WHERE B02_REP=#{id}")
	public void actualizarUsuario(Usuario usuario);

}
