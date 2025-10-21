package interfaces_graficas;

import javax.swing.*;
import java.awt.*;

public class G03EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto miMarco = new MarcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer Texto");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Voy a dibujar", 100, 100);
	}
}