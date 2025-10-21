package Excepciones;

//Clausula throw, Creación de propia excepción

import javax.swing.*;

public class E4ComprobarMail {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Introduce tu email");
		
		try {
			
			examinaMail(email);
			
		}catch(Exception e){
			
			System.out.println("La dirección del email no es correcto");
			
			e.printStackTrace();
			
		}

	}
	
	static void examinaMail(String mail) throws LongitudMailErronea{
		
		int arroba = 0;
		boolean punto = false;
		
		if(mail.length() <= 3) {
			
			//ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
			
			//throw new ArrayIndexOutOfBoundsException();
			
			throw new LongitudMailErronea("El mail no puede tener menos de tres caracteres");
			
		}
		for (int i = 0; i < mail.length(); i++) {
			
			if(mail.charAt(i) == '@') {
				
				arroba++;
				
			}
			
			if(mail.charAt(i) == '.') {
				
				punto = true;
				
			}
		}
		
		if(arroba == 1 && punto == true) {
			
			System.out.println("Es correcto");
			
		}else {
			
			System.out.println("No es correcto");
		}
	}
}

class LongitudMailErronea extends Exception{
	
	public LongitudMailErronea() {
		
	}
	
	public LongitudMailErronea(String msjError) {
		
		super (msjError);
		
	}
}