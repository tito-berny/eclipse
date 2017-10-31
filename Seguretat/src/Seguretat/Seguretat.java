package Seguretat;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Seguretat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VARIABLES
		int num ;
		String frase = "";
		String fraseencriptada = "";
		String abc = " abcdefghijklmnñopqrstuvwyz";
		
		
		Scanner scn = new Scanner(System.in);
		
		//PROGRAMA
		
		System.out.println("METODE CESAR");
		System.out.println("-------------");
		System.out.println("");
		System.out.println("Dona'm un numero de cifrat");
		num = scn.nextInt();
		
		System.out.println("Dona'm una frase a cifrar");
		frase = scn.next();
		
		
		frase = frase.toLowerCase();
		
		char arrayfrase[] = frase.toCharArray();
		char abecedario[] = abc.toCharArray();
		
		
		for(int i=0;i<arrayfrase.length;i++){
			
			for (int j = 0; j < abecedario.length; j++) {
				
				if(arrayfrase[i] == abecedario[j]){
					
					j = j +num;
					arrayfrase[i] = abecedario[j];
				}
				
			}
			
		    System.out.println("Data at ["+i+"]="+arrayfrase[i]);
		}
		for(int i=0;i<abecedario.length;i++){
			
		    System.out.println("Data at ["+i+"]="+abecedario[i]);
		}
		
		System.out.println();
		
		fraseencriptada = String.valueOf(arrayfrase);
		System.out.println("Frase encriptada : " + fraseencriptada);
		
		System.out.println();
		System.out.println(frase);
		
		
		

	}

}
