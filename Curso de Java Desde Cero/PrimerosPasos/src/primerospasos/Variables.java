/*
 * Utilización de variables
 * 
 */
package primerospasos;

public class Variables {

    public void manejoVariables() {
        //Declaración de variables
        byte edad; //El tipo byte va desde -128 hasta 127
        short edad1; //El tipo short va desde -32768 hasta 32767
        int edad2; //El tipo int va desde -2147483648 hasta 2147483647
        double edad3 = 38; //Declaración y asignación en una sola línea
        
        //Asignación de valores de una variable
        edad = 35;
        edad1 = 36;
        edad2 = 37;
        
        //Imprimir la información de las variables
        System.out.println("La variable edad es de tipo byte y tiene el valor de :" + edad);
        System.out.println("La variable edad1 es de tipo short y tiene el valor de :" + edad1);
        System.out.println("La variable edad2 es de tipo int y tiene el valor de :" + edad2);
        System.out.println("La variable edad3 es de tipo double y tiene el valor de :" + edad3);
    }
    
}
