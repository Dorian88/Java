package interfaces_graficas;

import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;

public class G05TrabajandoColores {

	public static void main(String[] args) {
		
		MarcoConColor miMarco = new MarcoConColor();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}


class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		setTitle("Prueba con colores");
		setSize(400, 400);
		LaminaConColor miLamina = new LaminaConColor();
		add(miLamina);
		miLamina.setBackground(Color.BLACK);
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Dibujo de rectángulo
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.GREEN.darker());
		g2.fill(rectangulo);
		
		//Dibujo elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		Color miColor = new Color(108, 20, 19);
		g2.setPaint(miColor.brighter().brighter());
		g2.fill(elipse);
	}
}