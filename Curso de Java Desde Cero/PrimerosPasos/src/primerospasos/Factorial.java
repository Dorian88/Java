/*
 * Programa para calcular el factorial de un número
 */
package primerospasos;

import javax.swing.*;

public class Factorial {
    
    public void factorial(){
        double resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un número"));
        
        for (int i = numero; i > 0; i--){
            resultado = resultado * i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
    
}
