import java.util.*;

public class C06EntradaScannerEjemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombreUsuario;
		int edad;
		
		System.out.print("Ingresa tu nombre: ");
		nombreUsuario = entrada.nextLine();
		System.out.println("\n");
		
		System.out.println("Ingresa tu edad: ");
		edad = entrada.nextInt();
		System.out.println("\n");
		
		System.out.println("Hola " + nombreUsuario + " El año que viene tendrás " + (edad + 1) + " años.\n");

	}

}
