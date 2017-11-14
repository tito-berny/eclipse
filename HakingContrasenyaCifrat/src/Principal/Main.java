package Principal;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		
		boolean num = true;
		int clau = 0;
			
		//Programa
		
		System.out.println("Dona'm el numero clau (0 - 99) :");
		do {
			try {
			
				num = false;
				
				Scanner scn = new Scanner(System.in);
				clau =+ Integer.parseInt(scn.nextLine());
				
					
				
			} catch (NumberFormatException e) {
				System.out.println("nomes numeros de 0 a 99 !");
				num = true;
			}
			
			if (clau < 0 || clau > 99) {
				num = true;
				System.out.println("nomes numeros de 0 a 99 !!!!");
			}
		
		} while ( num );
		
		System.out.println(clau);

	}

}
