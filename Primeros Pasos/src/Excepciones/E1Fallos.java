package Excepciones;

import javax.swing.*;

public class E1Fallos {

	public static void main(String[] args) {
		
		int[] miMatriz = new int[5];
		
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = 15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
		//miMatriz[5] = 85; //Genera una Excepción
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Posición " + (i + 1) + " = " + miMatriz[i]);
		}
		
		//Petición de datos personales
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años " + "el programa terminó su ejecución");

	}

}
