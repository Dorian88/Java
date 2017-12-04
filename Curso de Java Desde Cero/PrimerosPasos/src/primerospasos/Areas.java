/*
 * Programa para calcular el área de figuras geométricas
 * (Cuadrado, Rectángulo, Triángulo y Círculo)
 */
package primerospasos;

import java.util.*;
import javax.swing.*;

public class Areas {

    public void area() {
        Scanner entrada = new Scanner(System.in);
        int figura;
        
        System.out.println("Elige una opción: \n1. Cuadradado\n2. Rectángulo\n3. Triángulo\n4. Círculo");
        
        figura = entrada.nextInt();
        
        switch(figura){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El lado del cuadrado es: " + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El del rectángulo es: " + base*altura);
                break;
            case 3:
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del triángulo es: " + (base*altura)/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo"));
                System.out.print("El área del círculo es: ");
                System.out.printf("%1.3f", Math.PI*Math.pow(radio, 2));
                break;
            default:
                System.out.println("La opción no es correcta");
                break;
        }
    }
    
}
