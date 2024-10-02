package pe.bn.com.sate.ope.transversal.dto.sate;

import java.util.List;

public class DatosTarjetaCliente {

	private Cliente cliente;
	private Tarjeta tarjeta;
	private EstadoTarjeta estadoTarjeta;

	private List<Tarjeta> tarjetas;

	public DatosTarjetaCliente() {
		cliente = new Cliente();
		tarjeta = new Tarjeta();
		estadoTarjeta = new EstadoTarjeta();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public EstadoTarjeta getEstadoTarjeta() {
		return estadoTarjeta;
	}

	public void setEstadoTarjeta(EstadoTarjeta estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}

	@Override
	public String toString() {
		return "DatosTarjetaCliente [cliente=" + cliente + ", tarjeta="
				+ tarjeta + ", estadoTarjeta=" + estadoTarjeta + ", tarjetas="
				+ tarjetas + "]";
	}
	
	

}
