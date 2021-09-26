package proyecto.reserva.alquiler.auto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class MainAuto extends Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectorString = new Scanner(System.in);
//		Scanner lectorInt = new Scanner(System.in);
		String opcionMenu;
		String opcionMenuCliente;
		String opcionMenuEmpleado;
		String opcion2;
		String opcion;
		
		
		LocalDate diaHoy = LocalDate.now();
		diaHoy.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
		System.out.println(diaHoy.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
	
		System.out.println(diaHoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		
		int posicion = 0;
		Auto listadoAutos[] = new Auto[0];

		do {
			System.out.println();
			System.out.println("------------------------");
			System.out.println("1. Clientes ");
			System.out.println("2. Empleado ");
			System.out.println("3. SALIR ");
			System.out.println("------------------------");
			opcionMenu = lectorString.nextLine();

			if (opcionMenu.equals("1")) {
				// inicio cliente
				do {
					System.out.println();
					System.out.println("a. Consultar autos");
					System.out.println("b. Reservar auto");
					opcionMenuCliente = lectorString.nextLine();
					if (opcionMenuCliente.equals("a")) {
						// Cliente: Consultar auto
						System.out.println("Ingrese Modelo: ");
						String busquedaModelo = lectorString.nextLine();
						System.out.println("Ingrese Marca: ");
						String busquedaMarca = lectorString.nextLine();

						for (int i = 0; i < listadoAutos.length; i++) {
							Auto busquedaAuto = listadoAutos[i];
							boolean encontrar = busquedaAuto.getModelo().equals(busquedaModelo);
							boolean encontrar2 = busquedaAuto.getMarca().equals(busquedaMarca);
							if (encontrar == true || encontrar2 == true) {
								System.out.println(listadoAutos[i]);
							}

						}
					} else if (opcionMenuCliente.equals("b")) {
						// Cliente: Reservar auto
						System.out.println("--- Reserva de autos ---");
						System.out.println("Ingrese placa: ");
						String busquedaPlaca = lectorString.nextLine();
						System.out.println("Ingrese cedula: ");
						String cedula = lectorString.nextLine();

						for (int i = 0; i < listadoAutos.length; i++) {
							Auto busquedaAuto = listadoAutos[i];
							boolean encontrar = busquedaAuto.getPlaca().equals(busquedaPlaca);
							if (encontrar == true) {
								if (busquedaAuto.getEstado().equals("Disponible")) {
									busquedaAuto.setEstado("Reservado");
//									diaHoy.format(DateTimeFormatter.ISO_DATE);
									busquedaAuto.setFechaReserva(diaHoy);

//									busquedaAuto.getFechaReserva().format(DateTimeFormatter.ofPattern("dd/MM/aaaa"));

									Usuario cedula1 = new Usuario();
									cedula1.setCedula(cedula);
									Auto cedula11 = listadoAutos[i];
									cedula11.setUsuario(cedula1);
									busquedaAuto.setFechaEntrega(diaHoy.plusDays(2));
									System.out.println("El auto ha sido correctamente [Reservado]");
									System.out.println("Por favor, debe pasarlo a retirar en el patio de autos");
									System.out.print(listadoAutos[i]);
								} else {
									System.out.println("El auto no est� disponible");
									// Impresion solo de fecha del arreglo
									System.out.println("Estar� disponible el: " + listadoAutos[i].getFechaEntrega());

								}

							}
//						System.out.println(listadoAutos[i]);
						}
					}

				} while (opcionMenuCliente.equals("a") || opcionMenuCliente.equals("b"));

			} else if (opcionMenu.equals("2")) {
				// Inicio Empleado
				do {
					System.out.println();
					System.out.println("a. Ingresar un auto");
					System.out.println("b. Alquilar un auto");
					System.out.println("c. Aplazar fecha de entrega");
					opcionMenuEmpleado = lectorString.nextLine();
					if (opcionMenuEmpleado.equals("a")) {
						// Empleado: Ingresar un auto
						// se crea array/vector temporal, con tamano +1 del original
						Auto listadoTemporal[] = new Auto[listadoAutos.length + 1];
						// se establece el mismo tamano del temporal con el original
						for (int i = 0; i < listadoAutos.length; i++) {
							listadoTemporal[i] = listadoAutos[i];
						}
						System.out.println("***** Ingresar auto *****");
						System.out.print("Placa: ");
						String placa = lectorString.nextLine();
						System.out.print("Modelo: ");
						String modelo = lectorString.nextLine();
						System.out.print("Marca: ");
						String marca = lectorString.nextLine();
						System.out.print("A�o de fabricaci�n: ");
						String anioFabricacion = lectorString.nextLine();
						System.out.print("Pa�s de Fabricaci�n: ");
						String paisFabricacion = lectorString.nextLine();
						System.out.print("Cilindraje: ");
						String cilindraje = lectorString.nextLine();
						System.out.print("Aval�o (precio del auto): ");
						String avaluo = lectorString.nextLine();
						String numeroPuertas = null;
						String pesoSoportado = null;
						do {
							System.out.println("Elija el tipo de auto que es");
							System.out.println("1. Autom�vil");
							System.out.println("2. Camioneta");
							opcion2 = lectorString.nextLine();
							if (opcion2.equals("1")) {
								System.out.println("Ingrese n�mero de puertas");
								numeroPuertas = lectorString.nextLine();

							} else if (opcion2.equals("2")) {
								System.out.println("Ingrese peso soportado");
								pesoSoportado = lectorString.nextLine();

							}

						} while (opcion2.equals("1") && opcion2.equals("2"));

						Auto autoIngreso = new Auto();
						autoIngreso.setEstado("Disponible");
						autoIngreso.setPlaca(placa);
						autoIngreso.setModelo(modelo);
						autoIngreso.setMarca(marca);
						autoIngreso.setAnioFabricacion(anioFabricacion);
						autoIngreso.setPaisFabricacion(paisFabricacion);
						autoIngreso.setCilindraje(cilindraje);
						autoIngreso.setAvaluo(avaluo);
						//rellenando ul objeto automovil y camioneta
						Automovil automovil1 = new Automovil();
						automovil1.setNumeroPuertas(numeroPuertas);
						autoIngreso.setAutomovil(automovil1);
						Camioneta camioneta1 = new Camioneta();
						camioneta1.setPesoSoportado(pesoSoportado);
						autoIngreso.setCamioneta(camioneta1);

						// rellenado del vector temporal
						listadoTemporal[posicion] = autoIngreso;
						// los valores del temporal van al original
						listadoAutos = listadoTemporal;
						posicion++;
						System.out.println("El auto fue guardado exitosamente");
						System.out.println(Arrays.toString(listadoAutos));

					} else if (opcionMenuEmpleado.equals("b")) {
						// Empleado: Alquilar un auto
						System.out.print("Ingrese placa del auto: ");
						String busquedaPlaca = lectorString.nextLine();

						for (int i = 0; i < listadoAutos.length; i++) {
							Auto busquedaAuto = listadoAutos[i];
							boolean encontrar = busquedaAuto.getPlaca().equals(busquedaPlaca);
							if (encontrar == true && busquedaAuto.getEstado().equals("Reservado")) {
								System.out.println("Placa: " + listadoAutos[i].getPlaca() + " - Modelo: "
										+ listadoAutos[i].getModelo() + " - Estado: " + listadoAutos[i].getEstado()
										+ " - Fecha Entrega: " + listadoAutos[i].getFechaEntrega()
										+ " - Reservado por: " + listadoAutos[i].getUsuario());
								do {
									System.out.println("1. Alquilar");
									System.out.println("2. No Alquilar");
									opcion = lectorString.nextLine();
									switch (opcion) {

									case "1":
										System.out.print("placa: " + listadoAutos[i].getPlaca());
										System.out.println("Entregar el auto el: " + listadoAutos[i].getFechaEntrega());
										break;
									case "2":
										System.out.println("No alquilar");
										
										break;

									default:
										System.out.println("No ha elegido ninguna opci�n v�lida");
										break;
									}
									opcion="0";
								} while (opcion.equals("1")||opcion.equals("2"));

							} else {
								System.out.println("El auto no est� disponible o no fue reservado");
							}
						}

					} else if (opcionMenuEmpleado.equals("c")) {
						// Empleado: Aplazar fecha de entrega
						System.out.print("Ingrese la placa: ");
						String busquedaPlaca = lectorString.nextLine();
						System.out.print("Ingrese la cedula del cliente: ");
						String cedulaCliente = lectorString.nextLine();
						
						for (int i = 0; i < listadoAutos.length; i++) {
							Auto busquedaAuto = listadoAutos[i];
							Usuario cedula1 = new Usuario();
							cedula1.setCedula(cedulaCliente);
							boolean encontrar3 = busquedaAuto.getPlaca().equals(busquedaPlaca);
							boolean encontrar4=busquedaAuto.getUsuario().equals(""cedula1);
						
//						Auto cedula11 = listadoAutos[i];
							if (encontrar3 == true && encontrar4 == true) {
								System.out.println("Placa: " + listadoAutos[i].getPlaca() + " - Modelo: "
										+ listadoAutos[i].getModelo() + " - Estado: " + listadoAutos[i].getEstado()
										+ " - Fecha Entrega: " + listadoAutos[i].getFechaEntrega()
										+ " - Alquilado por: " + listadoAutos[i].getUsuario());
								do {
									System.out.println("1. Aplazar");
									System.out.println("2. No Aplazar");
									opcion = lectorString.nextLine();
									switch (opcion) {

									case "1":
																		
										System.out.print("placa: " + listadoAutos[i].getPlaca());
																		
										
										System.out.println("Entregar el auto el: "
												+ listadoAutos[i].getFechaEntrega().plusDays(3));//ERROR
//										listadoAutos[i];
										break;
									case "2":
										System.out.println("No Aplazar");
										break;

									default:
										System.out.println("No ha elegido ninguna opci�n v�lida");
										break;
									}
								} while (!opcion.equals("2"));

							} else {
								System.out.println("Auto no encontrado, Datos err�neos");
							}
						}
					}

				} while (opcionMenuEmpleado.equals("a") || opcionMenuEmpleado.equals("b")
						|| opcionMenuEmpleado.equals("c"));
			}

		} while (!opcionMenu.equals("3"));

	}

}