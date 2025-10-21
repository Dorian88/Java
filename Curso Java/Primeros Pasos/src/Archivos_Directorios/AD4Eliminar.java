package Archivos_Directorios;

import java.io.*;

public class AD4Eliminar {

	public static void main(String[] args) {
		
		File ruta = new File("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Nueva Carpeta\\Nuevo documento de texto.txt");
		
		ruta.delete(); //Elimina un archivo o carpeta.

	}

}
