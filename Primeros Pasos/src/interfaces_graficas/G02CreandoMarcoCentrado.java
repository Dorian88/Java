package interfaces_graficas;

import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

public class G02CreandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado () {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamPantalla.height;
		int anchoPantalla = tamPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("Marco Centrado");
		Image miIcono = miPantalla.getImage("src\\Graficos\\icono.gif");
		setIconImage(miIcono);
	}
}