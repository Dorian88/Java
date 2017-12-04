/*
 * Juego para adivinar un numero
 * 
 */
package primerospasos;

import java.util.*;

public class Adivina_Numero {

    public void adivinaNumero() {
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada = new Scanner(System.in);
        int numero = 0, intentos = 0;
        
        while(numero != aleatorio){
            intentos++;
            System.out.print("Introduce un número, por favor: ");
            numero = entrada.nextInt();
            
            if (aleatorio < numero){
                System.out.println("Más bajo");
            }else if (aleatorio > numero){
                System.out.println("Más alto");
            }
        }
        System.out.println("Eso es correcto!!");
        System.out.println("Lo has conseguido en: " + intentos + " intentos");
    }
    
}
