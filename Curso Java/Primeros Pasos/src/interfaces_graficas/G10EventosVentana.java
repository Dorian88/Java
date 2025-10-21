package interfaces_graficas;

import javax.swing.*;
import java.awt.event.*;

public class G10EventosVentana {

	public static void main(String[] args) {
		
		MarcoVentana miMarco = new MarcoVentana();
		MarcoVentana miMarco2 = new MarcoVentana();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("Ventana 1");
		miMarco2.setTitle("Ventana 2");
		
		miMarco.setBounds(200, 300, 500, 350);
		miMarco2.setBounds(700, 300, 500, 350);
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		/*setTitle("Respondiendo");
		setBounds(300, 300, 500, 350);*/
		setVisible(true);
		
		/*M_Ventana oyenteVentana = new M_Ventana();
		
		addWindowListener(oyenteVentana);*/
		
		addWindowListener(new M_Ventana());
	}
}

/*class M_Ventana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana Activada");
	}
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando Ventana");
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana Desactivada");
	}
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana Minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana Abierta");
	}
}*/

class M_Ventana extends WindowAdapter{
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana Minimizada");
	}
}