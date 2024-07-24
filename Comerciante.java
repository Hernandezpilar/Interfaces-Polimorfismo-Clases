package mx.com.cuh;

//Implementamos la interfaz Trabajador
public class Comerciante implements Trabajador {
	

	@Override
	public void checarEntrada() {
		System.out.println("El comerciante ha registrado la entrada");
	}
	
	@Override
	public void trabajar() {
		System.out.println("Atendiendo clientes y acomodando productos");
	}
	
	@Override
	public void horaComida() {
		System.out.println("El comenrciante ha ido a comer");
	}
	
	@Override
	public void cobrar() {
		System.out.println("El comerciante ha recibido su pago");
	}
	
	@Override
	public void checarSalida() {
		System.out.println("El comerciante ha registrado la salida");
	}

}
