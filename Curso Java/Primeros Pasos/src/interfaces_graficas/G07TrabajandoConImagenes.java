package interfaces_graficas;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class G07TrabajandoConImagenes {

	public static void main(String[] args) {
		
		MarcoConImagen miMarco = new MarcoConImagen();
		
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConImagen extends JFrame{
	
	public MarcoConImagen() {
		
		setTitle("Marco con Imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen(){
		try {
			//imagen = ImageIO.read(new File("src\\Graficos\\Homero.jpg"));
			imagen = ImageIO.read(new File("src\\Graficos\\Valhalla.gif"));
		}
		catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//File miImagen = new File("src\\Graficos\\Homero.jpg");
		
		int anchImagen = imagen.getWidth(this);
		int altImagen = imagen.getHeight(this);
		
		//g.drawImage(imagen, 5, 5, null);
		g.drawImage(imagen, 0, 0, null);
		
		for(int i = 0; i<300; i++) {
			for(int j = 0; j < 200; j++) {
				if(i + j > 0) {
					g.copyArea(0, 0, anchImagen, altImagen, i*anchImagen, j*altImagen);
				}
			}
		}
	}
	
	private Image imagen; 
}