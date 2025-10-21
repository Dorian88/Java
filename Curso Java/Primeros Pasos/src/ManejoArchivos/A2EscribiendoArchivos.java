package ManejoArchivos;

import java.io.*;

public class A2EscribiendoArchivos {

	public static void main(String[] args) {
		
		Escribiendo accedeEscritura = new Escribiendo();
		
		accedeEscritura.escribir();

	}

}

class Escribiendo{
	
	public void escribir(){
		
		String frase = "Esto es una prueba de escritura";
		
		try {
			FileWriter escritura = new FileWriter("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Archivos\\escribir.txt");
			
			for(int i = 0; i < frase.length(); i++) {
				
				escritura.write(frase.charAt(i));
				
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}