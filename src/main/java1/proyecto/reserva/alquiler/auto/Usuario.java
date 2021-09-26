package proyecto.reserva.alquiler.auto;

public class Usuario {
	private String cedula;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + "]";
	}
	
	
}
