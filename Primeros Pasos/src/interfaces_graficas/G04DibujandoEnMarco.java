package interfaces_graficas;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class G04DibujandoEnMarco {

	public static void main(String[] args) {
		
		MarcoConDibujos miMarco = new MarcoConDibujos();
		
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		
		setTitle("Dibujando en un Marco");
		setSize(400, 400);
		
		add(miLamina);
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*g.drawRect(50, 50, 200, 200);
		g.drawLine(100, 100, 300, 200);
		g.drawArc(50, 100, 100, 200, 120, 150);*/
		
		//Dibujando un rectángulo
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		
		//Dibujando una elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
		//Dibujando una linea
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		//Dibujando círculo
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX + radio, centroY + radio);
		g2.draw(circulo);
	}
}