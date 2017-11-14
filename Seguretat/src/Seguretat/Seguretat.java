package Seguretat;

import java.lang.reflect.Array;
import java.util.GregorianCalendar;
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
		String desencriptar = "";
		String abc = "abcdefghijklmnñopqrstuvwyz";
		
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
					
					j = j + num;
					
					if (j>24) {
						
						j = j - 24;
						
					}
					arrayfrase[i] = abecedario[j];
				}	
			}	
		}
		
		for(int i=0;i<arrayfrase.length;i++){
			
		    System.out.println("Data at ["+i+"]="+arrayfrase[i]);
		}
		
		System.out.println();
		
		fraseencriptada = String.valueOf(arrayfrase);
		System.out.println("Frase encriptada : " + fraseencriptada);
		
		System.out.println("Vol desencriptar la frase ? ( si o no )");
		desencriptar = scn.next();
		
		switch (desencriptar) {
		case "si":
			
			for(int i=0;i<arrayfrase.length;i++){
				
				for (int j = 0; j < abecedario.length; j++) {
					
					if(arrayfrase[i] == abecedario[j]){
						
						j = j - num;
						arrayfrase[i] = abecedario[j];
					}	
				}
			}
			break;

		case "no":
			System.exit(0);
			break;
			
		default:
			
			break;
		}
				
				
		fraseencriptada = String.valueOf(arrayfrase);
			
		System.out.println();
		System.out.println("Frase desencriptada : " + fraseencriptada);
	
		
	}
}
