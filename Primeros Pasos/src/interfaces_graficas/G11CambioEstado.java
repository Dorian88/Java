package interfaces_graficas;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

public class G11CambioEstado {

	public static void main(String[] args) {
		
		MarcoEstado miMarco = new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		
		setBounds(200, 200, 400, 250);
		
		CambiaEstado nuevoEstado = new CambiaEstado();
		
		addWindowStateListener(nuevoEstado);
	}
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana esta en pantalla completa");
			
		}else if(e.getNewState() == Frame.NORMAL){
			
			System.out.println("La ventana esta normal");
			
		}else if(e.getNewState() == Frame.ICONIFIED){
			
			System.out.println("La ventana esta minimizada");
			
		}
	}
}