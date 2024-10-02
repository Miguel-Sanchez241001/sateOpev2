package pe.bn.com.sate.ope.transversal.dto.tablas;

public class Ubigeo {
	private Long id;
	private String codDepartamento;
	private String codProvincia;
	private String codDistrito;
	private String descripcion;

	public String getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getCodProvincia() {
		return codProvincia;
	}

	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getCodDistrito() {
		return codDistrito;
	}

	public void setCodDistrito(String codDistrito) {
		this.codDistrito = codDistrito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Ubigeo [id=" + id + ", codDepartamento=" + codDepartamento
				+ ", codProvincia=" + codProvincia + ", codDistrito="
				+ codDistrito + "]";
	}

}
