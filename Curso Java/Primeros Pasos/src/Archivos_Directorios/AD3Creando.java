package Archivos_Directorios;

import java.io.*;

public class AD3Creando {

	public static void main(String[] args) {
		
		File ruta1 = new File("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Nueva Carpeta");
		File ruta2 = new File("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Nueva Carpeta\\Prueba Texto.txt");
		String archivoDestino = ruta2.getAbsolutePath();
		
		ruta1.mkdir(); //Crea una nueva carpeta
		
		try {
			
			ruta2.createNewFile(); //Crea un nuevo archivo
			
		}catch(IOException e) {
			
			e.fillInStackTrace();
			
		}
		 
		Escribiendo accedeEs = new Escribiendo();
		
		accedeEs.escribir(archivoDestino);

	}

}

class Escribiendo{
	
	public void escribir(String rutaArchivo) {
		
		String frase = "Escribiendo en el archivo";
		
		try {
			
			FileWriter escritura = new FileWriter(rutaArchivo);
			
			for(int i = 0; i < frase.length(); i++) {
				
				escritura.write(frase.charAt(i));
				
			}
			
			escritura.close();
			
		}catch(IOException e) {}
	}
}