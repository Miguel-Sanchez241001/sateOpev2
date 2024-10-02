package pe.bn.com.sate.ope.transversal.dto.sate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.Identidad2;
import pe.bn.com.sate.ope.transversal.util.enums.EstadoCivil;
import pe.bn.com.sate.ope.transversal.util.enums.Sexo;

public class Cliente {

	private Long id;
	private String nombres;
	private String apPaterno;
	private String apMaterno; //null
	private String tipoDocumento;
	private String nroDocumento;
	private Date fechaNacimiento;
	private String estadoCivil;
	private String sexo;
	private String telefonoCasa;
	private String direccion;//null
	private String ubigeo;//null
	private String referencia;//null

	public Cliente() {
		
	}

	public Cliente(Identidad2 vIdentidad2, String tipoDocumento) {
		this.nombres = vIdentidad2.getNombres().trim();
		this.apPaterno = vIdentidad2.getApellidoPaterno().trim();
		this.apMaterno = vIdentidad2.getApellidoMaterno().trim();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = vIdentidad2.getNumDoc().trim();
		this.direccion = vIdentidad2.getDireccion().trim();
		this.ubigeo = vIdentidad2.getDomicDptoCod().concat(
				vIdentidad2.getDomicProvCod().concat(
						vIdentidad2.getDomicDistCod()));
		this.estadoCivil = EstadoCivil.obtenerCodigoTrama(vIdentidad2
				.getEstadoCivilCod());
		this.sexo = Sexo.obtenerCodigoTrama(vIdentidad2.getSexoCod());
		try {
			this.fechaNacimiento = new SimpleDateFormat("yyyyMMdd")
					.parse(vIdentidad2.getFechaNacimiento());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", apPaterno="
				+ apPaterno + ", apMaterno=" + apMaterno + ", tipoDocumento="
				+ tipoDocumento + ", nroDocumento=" + nroDocumento
				+ ", fechaNacimiento=" + fechaNacimiento + ", estadoCivil="
				+ estadoCivil + ", sexo=" + sexo + ", telefonoCasa="
				+ telefonoCasa + ", direccion=" + direccion + ", ubigeo="
				+ ubigeo + ", referencia=" + referencia + "]";
	}

}
