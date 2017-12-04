/*
 * Cálculos usando
 * la clase Math
 */
package primerospasos;

public class Calculos_conMath {

    public void calculoMath() {
        System.out.println("Usando la funcion sqrt");
        System.out.println("Para calcular la raiz cuadrada de un numero");
        double raiz = Math.sqrt(9); //Calculando la raiz cuadrada
        System.out.println("La raiz cuadrada de 9 es: " + raiz + "\n");
        
        System.out.println("Usando la funcion round");
        System.out.println("Para redondear un numero");
        double num1 = 5.85;
        int resultado = (int)Math.round(num1); //Se hace un casting para convertir un tipo de variable a otro
        System.out.println("El valor ingresado es " + num1 + " y el valor redondeado es: : " + resultado + "\n");
        
        System.out.println("Usando la funcion pow");
        System.out.println("Para usar la potenciacion");
        double base = 5, exponente = 3;
        int potencia = (int)Math.pow(base, exponente);
        System.out.println("El resultado de " + base + " Elevado a " + exponente  + " es: " + potencia + "\n");
    }
    
}
