import javax.swing.*;
import java.util.*;

public class C09AreasUsandoSwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int figura = entrada.nextInt();
		int lado, base, altura, pot, area_cuadrado, area_rec, area_tri;
		
		System.out.println("Elige una opción: \n1. Cuadrado \n2. Rectángulo \n3. Triángulo \n4. Círculo\n");
		
		switch(figura) {
			case 1:
				lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				area_cuadrado = (int)Math.pow(lado, 2);
				System.out.println("El area de cuadrado es: " + area_cuadrado);
				break;
			case 2:
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				area_rec = base*altura;
				System.out.println("El area del rectángulo es: " + area_rec);
				break;
			case 3:
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				area_rec = (base*altura)/2;
				System.out.println("El area del triángulo es: " + area_rec);
				break;
			case 4:
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
				System.out.print("El área del circulo es: ");
				System.out.printf("%1.2f", Math.pow(radio, 2));
				break;
			default:
				System.out.println("La opción no es correcta ");
		}

	}

}
