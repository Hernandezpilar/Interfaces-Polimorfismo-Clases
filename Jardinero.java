package mx.com.cuh;

//Implementamos la interfaz Trabajador
public class Jardinero implements Trabajador{


	public void checarEntrada() {
		System.out.println("El jardinero ha registrado su entrada");
	}
	
	public void trabajar() {
		System.out.println("Cortando pasto y regando plantas");
	}
	
	public void horaComida() {
		System.out.println("El jardinero ha ido a comer");	
	}
	
	public void cobrar() {
		System.out.println("El jardinero ha recibido su pago");
	}
	
	public void checarSalida() {
		System.out.println("El jardinero ha registrado su salida");
	}
	
}
