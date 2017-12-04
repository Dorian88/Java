/*
 * Programa para acceder a una aplicacion con contraseña
 * 
 */
package primerospasos;

import javax.swing.*;

public class Acesso_aplicacion {

    public void accesoAplicacion() {
        String clave = "Dorian", pass = "";
        
        while (clave.equals(pass)==false){
            pass = JOptionPane.showInputDialog("Ingrese el password, por favor");
            if (clave.equals(pass)==false){
                System.out.println("La contraseña es incorrecta");
            }
        }
        
        System.out.println("La contraseña es correcta, acceso permitido");
    }
    
}
