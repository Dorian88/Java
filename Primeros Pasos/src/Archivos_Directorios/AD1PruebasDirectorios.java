package Archivos_Directorios;

import java.io.*;

public class AD1PruebasDirectorios {

	public static void main(String[] args) {
		
		File archivo = new File("bin");
		
		System.out.println(archivo.getAbsolutePath()); //Da la ruta del archivo o carpeta
		System.out.println(archivo.exists()); //Verifica si existe o no el archivo o carpeta

	}

}
