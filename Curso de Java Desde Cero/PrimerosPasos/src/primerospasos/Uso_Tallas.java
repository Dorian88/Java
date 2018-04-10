
package primerospasos;

import java.util.*;

public class Uso_Tallas {
       
    //Una forma de declarar un tipo enumeroado
    //enum talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};
    
    //Otra Forma de hacerlo
    enum Talla{
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }
        
        public String dameAbreviatura(){
            return abreviatura;
        }
        
        private String abreviatura;
        
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe una talla, MINI, MEDIANO, GRANDE, MUY_GRANDE: ");
        
        String entradaDatos = entrada.next().toUpperCase();
        Talla talla = Enum.valueOf(Talla.class, entradaDatos);
        
        System.out.println("Talla = " + talla);
        System.out.println("Abreviatura = " + talla.dameAbreviatura());
    }
}
