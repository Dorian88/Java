package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G09EventosII {

	public static void main(String[] args) {
		
		MarcoBotones1 miMarco = new MarcoBotones1();
		
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones1 extends JFrame{
	
	public MarcoBotones1() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones1 miLamina = new LaminaBotones1();
		add(miLamina);
	}
}

class LaminaBotones1 extends JPanel{
	
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones1() {
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo rojo = new ColorFondo(Color.RED);
		
		botonAmarillo.addActionListener(amarillo);
		botonAzul.addActionListener(azul);
		botonRojo.addActionListener(rojo);
	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
		
	}
}