package pe.bn.com.sate.ope.transversal.dto.tablas;

public class Agencia {

	private Long id;
	private String codAgencia;
	private String descripcion;
	private String codDepartamento;
	private String codProvincia;
	private String codDistrito;
	private String direccion;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(String codAgencia) {
		this.codAgencia = codAgencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

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

	@Override
	public String toString() {
		return "Agencia [id=" + id + ", codAgencia=" + codAgencia
				+ ", descripcion=" + descripcion + ", codDepartamento="
				+ codDepartamento + ", codProvincia=" + codProvincia
				+ ", codDistrito=" + codDistrito + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codAgencia == null) ? 0 : codAgencia.hashCode());
		result = prime * result
				+ ((codDepartamento == null) ? 0 : codDepartamento.hashCode());
		result = prime * result
				+ ((codDistrito == null) ? 0 : codDistrito.hashCode());
		result = prime * result
				+ ((codProvincia == null) ? 0 : codProvincia.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		if (codAgencia == null) {
			if (other.codAgencia != null)
				return false;
		} else if (!codAgencia.equals(other.codAgencia))
			return false;
		if (codDepartamento == null) {
			if (other.codDepartamento != null)
				return false;
		} else if (!codDepartamento.equals(other.codDepartamento))
			return false;
		if (codDistrito == null) {
			if (other.codDistrito != null)
				return false;
		} else if (!codDistrito.equals(other.codDistrito))
			return false;
		if (codProvincia == null) {
			if (other.codProvincia != null)
				return false;
		} else if (!codProvincia.equals(other.codProvincia))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
