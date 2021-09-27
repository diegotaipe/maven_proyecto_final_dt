package proyecto.reserva.alquiler.auto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Auto {
	protected String estado;
	protected String placa;
	protected String modelo;
	protected String marca;
	protected String anioFabricacion;
	protected String paisFabricacion;
	protected String cilindraje;
	protected String avaluo;
	protected LocalDate fechaReserva;
	protected LocalDate fechaEntrega;
	protected Usuario cedula;
	protected Automovil automovil;
	protected Camioneta camioneta;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPaisFabricacion() {
		return paisFabricacion;
	}
	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(String avaluo) {
		this.avaluo = avaluo;
	}
	public LocalDate getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva= fechaReserva;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
	public Usuario getCedula() {
		return cedula;
	}
	public void setCedula(Usuario cedula) {
		this.cedula = cedula;
	}
	public Automovil getAutomovil() {
		return automovil;
	}
	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}
	
	public Camioneta getCamioneta() {
		return camioneta;
	}
	public void setCamioneta(Camioneta camioneta) {
		this.camioneta = camioneta;
	}
	@Override
	public String toString() {
		return "Auto Estado: " + estado + " - Placa: " + placa + " - Modelo: " + modelo + " - Marca: " + marca
				+ " - Año Fabricacion: " + anioFabricacion + " - Pais Fabricacion: " + paisFabricacion + " - Cilindraje: "
				+ cilindraje + " - Avaluo: " + avaluo + " - Fecha Reserva: " + fechaReserva + " - Fecha Entrega: "
				+ fechaEntrega + " - Usuario: " + cedula + " - automovil: " + automovil + " - Camioneta: " + camioneta;
	}


	
}
