package proyecto.reserva.alquiler.auto;

public class Usuario {
	protected String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return cedula;
	}
	
	
}
