package mx.com.cuh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos nuestros objetos para mandar a llamar cada metodo
		Panadero panadero = new Panadero ();
		Soldado soldado = new Soldado();
		Constructor constructor = new Constructor();
		Jardinero jardinero = new Jardinero();
		Comerciante comerciante = new Comerciante();
		
		
		// Llamamos a cada uno de los métodos de la interfaz Trabajador con los objetos que hemos creado
		System.out.println("~~~~Registro de Entrada de los Trabajadores~~~~");
		panadero.checarEntrada();
		soldado.checarEntrada();
		constructor.checarEntrada();
		jardinero.checarEntrada();
		comerciante.checarEntrada();
		System.out.println();
		
		
		System.out.println("~~~~Tareas de los Trabajadores~~~~");
	    panadero.trabajar();
	    soldado.trabajar();
	    constructor.trabajar();
	    jardinero.trabajar();
	    comerciante.trabajar();
	    System.out.println();
	    
	    
	    System.out.println("~~~~Hora de Comida de los Trabajadores~~~~");
	    panadero.horaComida();
	    soldado.horaComida();
	    constructor.horaComida();
	    jardinero.horaComida();
	    comerciante.horaComida();
	    System.out.println();
	    
	    
	    System.out.println("~~~~Pago a los Trabajadores~~~~");
	    panadero.cobrar();
	    soldado.cobrar();
	    constructor.cobrar();
	    jardinero.cobrar();
	    comerciante.cobrar();
	    System.out.println();
	    
	    
	    
	    System.out.println("~~~~Registro de Salida de los Trabajadores~~~~");
	    panadero.checarSalida();
	    soldado.checarSalida();
	    constructor.checarSalida();
	    jardinero.checarSalida();
	    comerciante.checarSalida();
		
		
	}

}
