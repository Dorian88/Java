import java.util.*;

public class C11JuegoAdivinaNumero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100), num = 0, intentos = 0;
		Scanner entrada = new Scanner (System.in);
		
		while(num != aleatorio) {
			intentos++;
			
			System.out.println("Introduce un número, por favor");
			num = entrada.nextInt();
			
			if(aleatorio < num) {
				System.out.println("Más bajo");
			}else if(aleatorio > num) {
				System.out.println("Más alto");
			}
		}
		
		System.out.println("Felicitaciones!!!! Haz acertado en " + intentos + " intentos");

	}

}
