package mx.com.cuh;

//Implementamos la interfaz Trabajador
public class Constructor implements Trabajador{
	

	@Override
    public void checarEntrada() {
        System.out.println("El constructor ha registrado su entrada");
    }

    @Override
    public void trabajar() {
        System.out.println("Leyendo planos y organizando las tareas");
    }

    @Override
    public void horaComida() {
        System.out.println("Es hora de comida para el constructor.");
    }

    @Override
    public void cobrar() {
        System.out.println("El constructor ha recibido su pago");
    }

    @Override
    public void checarSalida() {
        System.out.println("El constructor ha registrado su salida");
    }

}
