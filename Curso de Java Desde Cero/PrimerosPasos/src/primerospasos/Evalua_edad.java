/*
 * Programa para identificar si una persona es mayor de edad o no
 * usando la instrucción condicional if/else y elseif
 */
package primerospasos;

import java.util.*;

public class Evalua_edad {

    public void evaluaEdad() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese tu edad por favor: ");
        int edad = entrada.nextInt();
        
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        System.out.println("\n----------Uso del condicional else if----------");
        
        if (edad < 18){
            System.out.println("Eres un adolescente");
        }else if(edad < 40){
            System.out.println("Eres joven");
        }else if(edad < 65){
            System.out.println("Eres maduro");
        }else{
            System.out.println("Cuidate");
        }
    }
    
}
