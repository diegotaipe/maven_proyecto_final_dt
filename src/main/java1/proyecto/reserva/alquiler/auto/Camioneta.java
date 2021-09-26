package proyecto.reserva.alquiler.auto;

public class Camioneta {
	protected String pesoSoportado;

	public String getPesoSoportado() {
		return pesoSoportado;
	}

	public void setPesoSoportado(String pesoSoportado) {
		this.pesoSoportado = pesoSoportado;
	}

	@Override
	public String toString() {
		return "Camioneta [pesoSoportado=" + pesoSoportado + "]";
	}


	
}
