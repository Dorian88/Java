package Programacion_Generica.PG1ArrayList;

import java.util.*;

public class PG1UsoEmpleado {
	
public static void main(String[] args) {
		
		/*Empleado listaEmpleados0[] = new Empleado[3];
		
		listaEmpleados0[0] = new Empleado("Dorian", 41, 2500);
		listaEmpleados0[1] = new Empleado("Diana", 36, 2000);
		listaEmpleados0[2] = new Empleado("Luisa", 38, 2600);*/
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(); //Crea un ArrayList con un máximo de 10 elementos.
		
		//listaEmpleados.ensureCapacity(11); //Para cuantos elementos se usaran en el ArrayList
		
		listaEmpleados.add(new Empleado("Dorian", 41, 2500));
		listaEmpleados.add(new Empleado("Diana", 36, 2000));
		listaEmpleados.add(new Empleado("Luisa", 38, 2600));
		listaEmpleados.add(new Empleado("Alexander", 34, 2200));
		
		/*listaEmpleados.trimToSize(); //Corta el exceso de memoria.
		
		listaEmpleados.set(1, new Empleado("Edwin", 52, 2700));
		
		System.out.println(listaEmpleados.get(3).dameDatos());
		
		System.out.println(listaEmpleados.size());
		
		//Usando un foreach para impirmir el ArrayList
		for(Empleado e: listaEmpleados) {
			
			System.out.println(e.dameDatos());
		}*/
		
		//Usando un iterador
		Iterator<Empleado> miIterador = listaEmpleados.iterator();
		
		while(miIterador.hasNext()) {
			
			System.out.println(miIterador.next().dameDatos());
		}
		
		//Usando un for convencional para impirmir el ArrayList
		
		/*for(int i = 0; i < listaEmpleados.size(); i++) {
			
			Empleado e = listaEmpleados.get(i);
			
			System.out.println(e.dameDatos());
			
		}*/
		
		//Pasar los elementos de un ArrayList a un array convencional
		/*Empleado arrayEmpleado[] = new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleado);
		
		for(int j = 0; j < arrayEmpleado.length; j++) {
			
			System.out.println(arrayEmpleado[j].dameDatos());
			
		}*/

	}
}

class Empleado{
	
	public Empleado(String nombre, int edad, double salario) {
		
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