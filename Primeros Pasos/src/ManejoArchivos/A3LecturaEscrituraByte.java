package ManejoArchivos;

import java.io.*;

public class A3LecturaEscrituraByte {

	public static void main(String[] args) {
		
		int contador = 0;
		int datosEntrada[] = new int[8535];
		
		try {
			
			FileInputStream archivoLectura = new FileInputStream("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Graficos\\Nacional.jpg");
			boolean finalArchivo = false;
			
			while(!finalArchivo) {
				
				int byteEntrada = archivoLectura.read();
				
				if(byteEntrada != -1) {
					
					datosEntrada[contador] = byteEntrada;
					
				}else {
					
					finalArchivo = true;
					
				}
				
				System.out.println(datosEntrada[contador]);
				
				contador++;
				
			}
			
			archivoLectura.close();
			
		}catch(IOException e) {
			
			System.out.println("No se encuentra el archivo");
			
		}
		
		System.out.println(contador);
		
		creaArchivo(datosEntrada);

	}
	
	static void creaArchivo(int datosNuevoArchivo[]) {
		
		try {
			
			FileOutputStream archivoNuevo = new FileOutputStream("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Archivos\\Nacional.jpg");
			
			for(int i = 0; i < datosNuevoArchivo.length; i++) {
				
				archivoNuevo.write(datosNuevoArchivo[i]);
				
			}
			
			archivoNuevo.close();
			
		}catch (IOException e) {
			
			System.out.println("Error al crear el archivo");
			
		}
	}

}
