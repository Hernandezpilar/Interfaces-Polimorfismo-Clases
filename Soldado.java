package mx.com.cuh;

//Implementamos la interfaz Trabajador
public class Soldado implements Trabajador {
	

	@Override
	public void checarEntrada() {
		System.out.println("El soldado ha registrado la entrada");
	}
	
	@Override
	public void trabajar() {
		System.out.println("Realizando tareas militares");
	}
	
	@Override
	public void horaComida() {
		System.out.println("El soldado ha ido a comer");
	}
	
	@Override
	public void cobrar() {
		System.out.println("El soldado ha recibido su pago");
	}
	
	@Override
	public void checarSalida() {
		System.out.println("El soldado ha registrado la salida");
	}
	
	

}
