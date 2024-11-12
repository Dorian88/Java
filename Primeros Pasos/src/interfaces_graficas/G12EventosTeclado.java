package interfaces_graficas;

import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

public class G12EventosTeclado {

	public static void main(String[] args) {
		
		MarcoConTeclas miMarco = new MarcoConTeclas();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas(){
		
		setVisible(true);
		setBounds(600, 200, 500, 350);
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
	}
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
		char letra = e.getKeyChar();
		
		System.out.println(letra);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//int codigo = e.getKeyCode();
		
		//System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}