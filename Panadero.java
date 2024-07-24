package mx.com.cuh;

//Implementamos la interfaz Trabajador
public class Panadero implements Trabajador {
	
	@Override
	public void checarEntrada() {
		System.out.println("El panadero ha registrado la entrada");
	}
	
	@Override
	public void trabajar() {
		System.out.println("Preparando masa y hornenado pan");
	}
	
	@Override
	public void horaComida() {
		System.out.println("El panadero ha ido a comer");
	}
	
	@Override
	public void cobrar() {
		System.out.println("El panadero ha recibido su pago");
	}
	
	@Override
	public void checarSalida() {
		System.out.println("El panadero ha registrado la salida");
	}
	

}
