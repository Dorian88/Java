package Programacion_Generica;

import java.io.*;

public class PG3UsoArrayList {

	public static void main(String[] args) {
		
		PG2ArrayList archivos = new PG2ArrayList(4);
		String nombrePersona;
		File nombrePersona1;
		
		archivos.add("Dorian");
		archivos.add("Diana");
		archivos.add("Alexander");
		archivos.add("Luisa");
		archivos.add(new File("Archivo.txt"));
		
		nombrePersona = (String)archivos.get(4);
		
		archivos.add(new File("Archivo.txt"));
		
		nombrePersona1 = (File)archivos.get(0);
		
		System.out.println(nombrePersona);
		System.out.println(nombrePersona1);

	}

}
