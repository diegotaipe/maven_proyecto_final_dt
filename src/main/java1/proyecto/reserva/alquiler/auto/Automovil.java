package proyecto.reserva.alquiler.auto;

public class Automovil {
	public String numeroPuertas;

	public String getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Automovil [numeroPuertas=" + numeroPuertas + "]";
	}
	
}
