/*
 * Usando entradas con la clase Scanner
 */

package primerospasos;

import java.util.Scanner;

public class Entrada_ejemplo1 {

    public void entradaEjemplo1() {
        
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        
        System.out.println("Ingrese tu nombre. ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingrese tu edad. ");
        edad = entrada.nextInt();
        
        System.out.println("Hola " + nombreUsuario + ". El proximo año cumpliras " + (edad+1) + " años");
    }
    
}
