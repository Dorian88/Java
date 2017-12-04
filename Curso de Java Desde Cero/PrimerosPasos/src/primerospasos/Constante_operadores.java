/*
 * Declaración de constantes y utilización de operadores
 */
package primerospasos;

public class Constante_operadores {

    public void constanteOperadores() {
        int a = 5, d = 8;
        double cm = 6;
        int b, f;
        double g, resultado; 
        b = 7;
        
        System.out.println("Suma");
        int c = a + b; //Utilización de la suma
        System.out.println("c = a + b y el resultado es: " + c);
        
        System.out.println("Incremento usando el operador ++");
        c++; //Incrementa el valor de c en 1
        System.out.println("c++ que incrementa el valor de c en 1 y el resultado es: " + c);
        
        System.out.println("Incremento usando el operador += para el valor");
        c+=6; //Incrementa el valor de c en 6
        System.out.println("c+=6 que incrementa el valor de c en 6 y el resultado es: " + c);
        
        System.out.println("Resta");
        int e = c - d; //Utilización de la resta
        System.out.println("e = c - d y el resultado es: " + e);
        
        System.out.println("Decremento usando el operador --");
        e--; //Decrementa el valor de e en 1
        System.out.println("e-- que decrementa el valor de e en 1 y el resultado es: " + e);
        
        System.out.println("Decremento usando el operador -=");
        e-=3; //Decrementa el valor de e en 3
        System.out.println("e-=3 que decrementa el valor de e en 3 y el resultado es: " + e);
        
        System.out.println("Multiplicación");
        f = e * c; //Utilización de la multiplicación
        System.out.println("f = e * c y el resultado es: " + f);
        
        System.out.println("División");
        g = c / e; //Utilización de la división
        System.out.println("g = c / e y el resultado es: " + g);
        
        System.out.println("--------Constantes--------");
        
        final double apulgada = 2.54; //Declaración e inicialización de una constante
        
        resultado = cm / apulgada;
        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
    }
    
}
