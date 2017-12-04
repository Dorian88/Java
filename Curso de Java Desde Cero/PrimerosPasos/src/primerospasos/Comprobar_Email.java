/*
 * Programa que comprueba la dirección de un correo eleéctronico
 */
package primerospasos;

import javax.swing.*;

public class Comprobar_Email {
    
    public void comprobarEmail(){
        int arroba = 0;
        boolean punto = false;
        String correo = JOptionPane.showInputDialog("Introduce un correo electrónico");
        
        for(int i = 0; i < correo.length(); i++){
            if(correo.charAt(i) == '@'){
                arroba++;
            }
            
            if(correo.charAt(i) == '.'){
                punto = true;
            }
        }
        
        if (arroba == 1 && punto == true){
            System.out.println("El correo es correcto");
        }else{
            System.out.println("El correo es incorrecto");
        }
    }
    
}
