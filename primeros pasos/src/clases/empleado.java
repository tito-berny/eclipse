package clases;

import java.util.Date;
import java.util.GregorianCalendar;

public class empleado {

	/**
	 * @param args
	 */

	protected String dni;
	protected String nom;
	protected String cognom;
	protected String seccio;
	protected double sou;
	protected Date altaContrato;

	public empleado() {
	}

	public empleado(String nom, double sou) {

		this.nom = nom;
		
		this.sou = sou;

		this.seccio = "administracio";
		
		
	}

	public empleado(String dni, String nom, String cognom, String seccio, double sou){
		this.dni = dni;
		this.nom = nom;
		this.cognom = cognom;
		this.seccio = seccio;
		this.sou = sou;
	}
	
	

	
	public empleado(String dni, String nom, String cognom, String seccio,
			double sou, int any, int mes, int dia) {
	
		this.dni = dni;
		this.nom = nom;
		this.cognom = cognom;
		this.seccio = seccio;
		this.sou = sou;
		
		GregorianCalendar calendario = new GregorianCalendar(any, mes - 1, dia);
		
		
		this.altaContrato = calendario.getTime();
		
	}
	
	

	public double getSou() {
		return sou;
	}

	public void setSou(double sou) {
		this.sou = sou;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getSeccio() {
		return seccio;
	}

	public void setSeccio(String seccio) {
		this.seccio = seccio;
	}
	
	public void subir_sueldo(double percentage){
		double incremento;
		
		incremento = percentage/100 * sou;
		sou = sou + incremento;
	}
	
	

}
