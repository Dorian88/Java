package Programacion_Generica;

public class PG6Empleado {
	
	public PG6Empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		
	}
	
	public String dameDatos() {
		
		return "El empleado se llama " + nombre + ". Tiene " + edad + " años" + ". Y un salario de " + salario + ".";
	}
	
	private String nombre;
	private int edad;
	private double salario;

}
