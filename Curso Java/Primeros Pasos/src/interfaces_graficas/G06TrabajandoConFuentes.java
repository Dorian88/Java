package interfaces_graficas;

import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;

public class G06TrabajandoConFuentes {

	public static void main(String[] args) {
		
		MarcoConFuentes miMarco = new MarcoConFuentes();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con fuentes");
		setSize(400, 400);
		LaminaConFuentes miLamina = new LaminaConFuentes();
		add(miLamina);
		miLamina.setForeground((Color.GREEN.darker()));
	}
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Font miFuente = new Font("Arial", Font.BOLD, 26);
		g2.setFont(miFuente);
		//g2.setColor(Color.GREEN.darker());
		g2.drawString("Dorian", 100, 100);
		
		g2.setFont(new Font("Verdana", Font.ITALIC, 24));
		//g2.setColor(new Color(128, 90, 50));
		g2.drawString("Alexander", 100, 200);
	}
}