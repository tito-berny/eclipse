package clases;

import java.util.ArrayList;

public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empleado empleado0 = new empleado ("Berny", 3000);
		empleado empleado1 = new empleado ("empleado2", 2000);
		empleado empleado2 = new empleado ("empleado3", 1000);
		
		ArrayList<empleado> lista = new ArrayList <empleado>();
		
		for (int i = 0; i < args.length; i++) {
			lista.add(empleado0);
			empleado0= new empleado("empleado "+i,543*i);
		}
		
		
		System.out.println("Empleat "+ empleado1.getNom() + " te un sou de "+ empleado1.getSou());
		
		empleado1.subir_sueldo(10);
		
		System.out.println("Empleat "+ empleado1.getNom() + " despres de augmentar en un 10% el seu sou queda en: "+ empleado1.getSou());
	
		empleado empleado3 = new empleado( "7896945H", "Manolo", "Perez", "Comercial", 432, 2017, 10, 10);
		
		System.out.println("Empleat "+ empleado3.getNom() +" "+ empleado1.getSou() + " " + empleado3.altaContrato.toString());
		
	}


	// La clase Arrays tiene un metodo llamado sort (oblica a implementar una interface) implementa interfaz Compareto.
	//Buscar informacion Pildoras Informaticas. 
}
