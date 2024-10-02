package pe.bn.com.sate.ope.transversal.util.enums;

import java.util.ArrayList;
import java.util.List;

import pe.bn.com.sate.ope.transversal.dto.sate.Permiso;

public enum Funcionalidad {
	OPERACIONES_MENU("01", ""),

	OPERACIONES_SOLICITAR_TARJETA("02", "Solicitar tarjeta"), OPERACIONES_CAMBIAR_ESTADO_TARJETA(
			"03", "Cambiar estado de tarjeta"), OPERACIONES_AUTORIZAR_TARJETA(
			"04", "Autorizar tarjeta"), OPERACIONES_BUSCAR_TARJETA("05",
			"Buscar tarjeta"),

	CONSULTAS_MENU("06", ""),

	CONSULTAS_MOVIMIENTOS_POR_TARJETA("07", "Movimientos por tarjeta"), CONSULTAS_RENDICION_DE_CUENTAS_POR_TARJETA(
			"08", "Rendicion de cuentas por tarjeta"),

	REPORTE_MENU("09", ""),

	REPORTE_TARJETA_EMPRESARIAL("10", "Reporte tarjeta empresarial"),

	CUENTAS_MENU("11", ""),

	CUENTAS_CREAR_CUENTA_USUARIO("11", "Crear cuenta de usuario"), CUENTAS_MODIFICAR_CUENTA_USUARIO(
			"12", "Modificar cuenta de usuario");

	private String id;
	private String descripcion;

	private Funcionalidad(String id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static List<Permiso> buscarTodos() {
		List<Permiso> permisos = new ArrayList<Permiso>();
		for (Funcionalidad funcionalidad : values()) {
			if (!funcionalidad.getId().equals("01")
					&& !funcionalidad.getId().equals("06")
					&& !funcionalidad.getId().equals("09")
					&& !funcionalidad.getId().equals("11")) {
				Permiso permiso = new Permiso();
				permiso.setCodFuncionalidad(funcionalidad.getId());
				permiso.setDescripcion(funcionalidad.getDescripcion());
				permiso.setEstado("N");
				permisos.add(permiso);
			}
		}
		return permisos;
	}
}
