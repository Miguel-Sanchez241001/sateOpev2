package pe.bn.com.sate.ope.persistence.mapper.internal;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import pe.bn.com.sate.ope.transversal.dto.sate.Asignacion;

import java.util.List;
 
public interface AsignacionMapper {

    @Select("SELECT ASI.B04_ID_CAS, ASI.B05_ID_TAR, ASI.B04_CODIGO_ASIGNACION, " +
            "ASI.B04_FECHA_INICIO_LINEA, ASI.B04_FECHA_FIN_LINEA, ASI.B04_FECHA_REGISTRO, " +
            "ASI.B04_LINEA, ASI.B04_CUENTA_EXPEDIENTE " +
            "FROM BN_SATE.BNSATE04_ASIGNACION ASI " +
            "JOIN BN_SATE.BNSATE05_TARJETA TAR ON ASI.B05_ID_TAR = TAR.B05_ID_TAR " +
            "JOIN BN_SATE.BNSATE06_CLIENTE CLIENTE ON TAR.B06_ID_CLI = CLIENTE.B06_ID_CLI " +
            "WHERE CLIENTE.B06_TIPO_DOCUMENTO = #{tipoDocumento} " +
            "AND CLIENTE.B06_NUM_DOCUMENTO = #{numDocumento}")
    @ResultMap("mapAsignacion")
    public List<Asignacion> obtenerAsignacionesPorDocumento(
            @Param("tipoDocumento") String tipoDocumento,
            @Param("numDocumento") String numDocumento);
    
    @Select("SELECT ASI.B04_ID_CAS, ASI.B05_ID_TAR, ASI.B04_CODIGO_ASIGNACION, " +
            "ASI.B04_FECHA_INICIO_LINEA, ASI.B04_FECHA_FIN_LINEA, ASI.B04_FECHA_REGISTRO, " +
            "ASI.B04_LINEA, ASI.B04_CUENTA_EXPEDIENTE " +
            "FROM BN_SATE.BNSATE04_ASIGNACION ASI " +
            "WHERE B05_ID_TAR = (SELECT TAR.B05_ID_TAR " +
            "FROM BN_SATE.BNSATE05_TARJETA TAR WHERE TAR.B05_NUM_TARJETA = #{numTarjeta})")
    @ResultMap("mapAsignacion")
    public List<Asignacion> obtenerAsignacionesPorTarjeta(@Param("numTarjeta") String numTarjeta);
}
