package Archivos_Directorios;

import java.io.*;

public class AD2AccesoArchivo {

	public static void main(String[] args) {
		
		File ruta = new File("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombresArchivos = ruta.list();
		
		for(int i = 0; i < nombresArchivos.length; i++) {
			
			System.out.println(nombresArchivos[i]);
			
			File f = new File(ruta.getAbsolutePath(), nombresArchivos[i]);
			
			if(f.isDirectory()) {
				
				String[] archivosSubcarpetas = f.list();
				
				for(int j = 0; j < archivosSubcarpetas.length; j++) {
					
					System.out.println(archivosSubcarpetas[j]);
					
				}
			}
		}

	}

}
