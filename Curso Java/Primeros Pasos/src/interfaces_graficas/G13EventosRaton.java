package interfaces_graficas;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

public class G13EventosRaton {

	public static void main(String[] args) {
		
		MarcoRaton miMarco = new MarcoRaton();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(600, 200, 500, 450);
		
		EventosDeRaton eventoRaton = new EventosDeRaton();
		
		//addMouseListener(eventoRaton);
		
		addMouseMotionListener(eventoRaton);
		
	}
}

/*class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Has hecho click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("Acabas de presionar");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		System.out.println("Acabas de levantar");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("Acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		System.out.println("Acabas de salir");
		
	}
	
}*/

/*class EventosDeRaton extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Has hecho click");
		
		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		
		System.out.println(e.getClickCount());
		
	}
	
	public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("Has pulsado el botón izquierdo");
			
		}else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Has pulsado la rueda del mouse");
			
		}else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Has pulsado el botón derecho");
			
		}
		
	}
	
}*/

class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estas arrastrendo");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

		System.out.println("Estas moviendo");
		
	}
	
}