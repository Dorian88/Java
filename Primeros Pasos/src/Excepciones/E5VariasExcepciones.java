package Excepciones;

import javax.swing.*;

public class E5VariasExcepciones {

	public static void main(String[] args) {
		
		try {
			
			division();
			
		}catch(ArithmeticException e) {
			
			System.out.println("No se permite dividir por cero.");
			System.out.println("Se ha generado un error de este tipo " + e.getClass().getName());
			
		}catch(NumberFormatException e) {
			
			System.out.println("No Has introducido un número entero.");
			System.out.println(e.getMessage());
			System.out.println("Se ha generado un error de este tipo " + e.getClass().getName());
			
		}

	}
	
	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultados es: " + num1/num2);
	}

}
