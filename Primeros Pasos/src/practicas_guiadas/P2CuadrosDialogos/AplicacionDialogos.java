//Programa que muestra diferentes tipos de mensaje mediante cuadros de dialogo

package practicas_guiadas.P2CuadrosDialogos;

import javax.swing.*;

public class AplicacionDialogos {

	public static void main(String[] args) {
		
		MarcoDialogos miMarco = new MarcoDialogos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}
