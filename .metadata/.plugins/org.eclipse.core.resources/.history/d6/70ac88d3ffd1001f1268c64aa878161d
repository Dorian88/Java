package Excepciones;

import java.util.*;

public class E3EntradaDatos {

	public static void main(String[] args) {
		
		System.out.println("¿Qué deseas hacer?");
		System.out.print("1. Introducir datos. " + "\n");
		System.out.print("2. Salir del programa. " + "\n");
		
		Scanner entrada = new Scanner(System.in);
		
		int decision = entrada.nextInt();
		
		if(decision == 1) {
			
			try {
				pedirDatos();
			}catch(InputMismatchException e){
				
				System.out.println("En la edad debes introducir un número." + "\n");
				
			}
			
		}else {
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();

	}
	
	static void pedirDatos() throws InputMismatchException{
		
		Scanner entrada = new Scanner(System.in);
		String nombreUsuario;
		int edad;
		System.out.print("Introduce tu nombre: ");
		nombreUsuario = entrada.nextLine();
			
		System.out.print("\n" + "Introduce tu edad: ");
		edad = entrada.nextInt();
			
		System.out.println("\n" + "Hola " + nombreUsuario + " El año que viene tendrás " + (edad + 1) + " años" + "\n");
			
		entrada.close();
				
		System.out.println("Hemos terminado");
	}

}