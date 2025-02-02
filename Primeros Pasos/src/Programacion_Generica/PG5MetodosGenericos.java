package Programacion_Generica;

import java.io.*;
import java.util.*;

public class PG5MetodosGenericos {

	public static void main(String[] args) {
		
		String nombres[] = {"Dorian", "Diana", "Alexander"};
		PG6Empleado listaEmpleados[] = {new PG6Empleado("Luisa", 38, 2500),
				new PG6Empleado("Edwin", 48, 2500),
				new PG6Empleado("Jennifer", 36, 2500),
				new PG6Empleado("Mario", 45, 2500),
				new PG6Empleado("Marly", 39, 2500)
		};
		GregorianCalendar fechas[] = {new GregorianCalendar(2015, 07, 12),
				new GregorianCalendar(2015, 05, 12),
				new GregorianCalendar(2015, 04, 12),
				};
		
		String elementos = MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		System.out.println(MisMatrices.getMenor(nombres));
		System.out.println(MisMatrices.getMenor(fechas));
		

	}

}

class MisMatrices{
	
	//Metodo generico
	public static <T> String getElementos(T[]a) {
		
		return "El array tiene " + a.length + " elementos";
	}
	
	public static <T extends Comparable> T getMenor(T[]a) {
		
		T elementoMenor = a[0];
		
		if (a == null || a.length == 0) {
			
			return null;
			
		}
		
		for (int i = 1; i < a.length; i++) {
			
			if(elementoMenor.compareTo(a[i]) > 0) {
				
				elementoMenor = a[i];
			}
		}
		
		return elementoMenor;
		
	}
}