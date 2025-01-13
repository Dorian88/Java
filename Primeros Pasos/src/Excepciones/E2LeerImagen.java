package Excepciones;

import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;

public class E2LeerImagen {

	public static void main(String[] args) {
		
		MarcoImagen miMarco = new MarcoImagen();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco con Imagen");
		
		setBounds(750, 300, 300, 200);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		
		add(miLamina);
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
		//Error comprobado: se obliga a usar el tray-catch
		try {
			
			imagen = ImageIO.read(new File("src\\Graficos\\cursiva.gif"));
		
		}catch(IOException e) {
			
			System.out.println("La imagen no se encuentra");
			
		}
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//Error no comprobado: el programador puede solucionar las excepciones
		if(imagen == null) {
			
			g.drawString("No se puede cargar la imagen", 10, 10);
			
		}else {
			int anchuraImagen = imagen.getWidth(this);
			int alturaImagen = imagen.getHeight(this);
			
			g.drawImage(imagen, 0, 0, null);
			
			for(int i = 0; i < 300; i++) {
				for(int j = 0; j < 300; j++) {
					
					if(i+j > 0) {
						
						g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
					}
					
				}
			}
		}
		
	}
	
	private Image imagen;
}