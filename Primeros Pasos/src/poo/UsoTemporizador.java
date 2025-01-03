package poo;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class UsoTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora();
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showInternalMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.exit(0);

	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}