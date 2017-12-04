/*
 * Usando los datos de tipo array
 */
package primerospasos;

import javax.swing.*;
public class Uso_Array {
    
    public void usoArray(){
        //int [] mi_vector = new int [5];
        int [] mi_vector = {5, 38, -15,92, 71};
        String [] paises = new String [8];
        
        for(int i = 0; i < mi_vector.length; i++){
            System.out.println("valor de indice " + i + " es " + mi_vector[i]);
        }
        
        for(int i = 0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce Pais " + (i+1));
        }
        
        for (String elemento:paises){
            System.out.println(elemento);
        }
        
        int [] aleatorios = new int [150];
        
        for (int k = 0; k < aleatorios.length; k++){
            aleatorios[k] = (int) Math.round(Math.random()*100);
        }
        
        for (int numero:aleatorios){
            System.out.print(numero + " ");
        }
    }
}