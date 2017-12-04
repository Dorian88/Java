/*
 * Averigua el peso ideal de una mujer y un hombre
 * 
 */
package primerospasos;

import javax.swing.*;

public class Peso_ideal {

    public void pesoIdeal() {
        String genero = "";
        int altura, pesoIdeal = 0;
        
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        }while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        
        if (genero.equalsIgnoreCase("H")){
            pesoIdeal = altura - 110;
        }else if (genero.equalsIgnoreCase("M")){
            pesoIdeal = altura - 120;
        }
        
        System.out.println("Tu peso ideal es: " + pesoIdeal + " kg");
    }
    
}
