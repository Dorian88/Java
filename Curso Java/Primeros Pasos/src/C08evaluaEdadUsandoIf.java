import java.util.*;

public class C08evaluaEdadUsandoIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.print("Introduce tu edad: ");
		edad = entrada.nextInt();
		System.out.print("\n");
		
		/*if(edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}
		else {
			System.out.println("Eres menor de edad.");
		}*/
		
		System.out.print("Otro ejemplo usando else if.\n");
		
		if(edad < 18) {
			System.out.println("Eres un adolescente.");
		}
		else if (edad < 40){
			System.out.println("Eres joven.");
		}else if (edad < 65){
			System.out.println("Eres maduro.");
		}else{
			System.out.println("Ya eres un anciano.");
		}
	}

}
