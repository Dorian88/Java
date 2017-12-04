/*
 * Usando entradas con la clase JOptionPane
 */
package primerospasos;

import javax.swing.*;

public class Entrada_ejemplo2 {

    public void entradaEjemplo2() {
        
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
        String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
        
        int edadUsuario = Integer.parseInt(edad);
        edadUsuario++;
        
        System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + (edadUsuario) + " años");
        
        System.out.println("\n----------Entrada de numeros con formato----------");
        
        String num1 = JOptionPane.showInputDialog("Ingrese un numero");
        double num2 = Double.parseDouble(num1);
        System.out.print("La raiz de " + num1 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
    
}
