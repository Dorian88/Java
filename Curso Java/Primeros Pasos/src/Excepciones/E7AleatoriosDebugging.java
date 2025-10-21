package Excepciones;

import javax.swing.*;

public class E7AleatoriosDebugging {

	public static void main(String[] args) {
		
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos elementos debe tener la matriz"));
		int numAleatorio []= new int[elementos];
		
		for(int i = 0; i < numAleatorio.length; i++) {
			
			numAleatorio[i] = (int)( Math.random()*100);
			
		}
		
		for(int elem: numAleatorio) {
			
			System.out.println(elem);
			
		}

	}

}
