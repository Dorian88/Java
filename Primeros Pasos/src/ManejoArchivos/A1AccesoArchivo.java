package ManejoArchivos;

import java.io.*;

public class A1AccesoArchivo {

	public static void main(String[] args) {
		
		LeerArchivo accediendo = new LeerArchivo();
		
		accediendo.lee();

	}

}

class LeerArchivo{
	
	public void lee() {
		
		try {
			
			entrada = new FileReader("C:\\Users\\USUARIO\\Documents\\Curso Java\\Primeros Pasos\\src\\Archivos\\ejemplo.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			//int c = 0;
			String linea = " ";
			
			while(linea != null) {
				
				/*c= entrada.read();
				
				char letra = (char)c;*/
				
				linea = miBuffer.readLine();
				
				if(linea != null) {
					
					System.out.println(linea);
					
				}
			}
			
			//entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo");
			
		}finally {
			
			try {
				
				entrada.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	FileReader entrada;
}
