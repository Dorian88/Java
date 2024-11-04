package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		Persona [] lasPersonas = new Persona [2];
		
		lasPersonas[0]= new Empleado2 ("Dorian Jaramillo", 50000, 2009, 02, 25);
		lasPersonas[1]= new Alumno ("Ana López", "Biologia");
		
		for(Persona p:lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}
	}

}

abstract class Persona{
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	private String nombre;
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int anio, int mes, int dia) {
		super(nom);
		
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id = idSiguiente;
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id = " + id + " con un sueldo = " + sueldo;
	}
	
	//Métodos Getters
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//Métodos Setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
}

class Alumno extends Persona{
	
	public Alumno (String nom, String car) {
		super(nom);
		
		carrera = car;
	}
	
	public String dameDescripcion() {
		
		return "Este alumno está estudiando la carrera de: " + carrera;
	}
	
	private String carrera;
}