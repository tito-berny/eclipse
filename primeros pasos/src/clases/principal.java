package clases;

public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empleado empleado1 = new empleado ("Berny", 3000);
		empleado empleado2 = new empleado ("empleado2", 2000);
		empleado empleado3 = new empleado ("empleado3", 1000);
		
		System.out.println("Empleat "+ empleado1.getNom() + " te un sou de "+ empleado1.getSou());
		
		empleado1.subir_sueldo(10);
		
		System.out.println("Empleat "+ empleado1.getNom() + " despres de augmentar en un 10% el seu sou queda en: "+ empleado1.getSou());
	}

}
