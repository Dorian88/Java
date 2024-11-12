package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G08EventosI {

	public static void main(String[] args) {
		
		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		
		botonAmarillo.addActionListener(this);
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
		
		if(botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		}else if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}else {
			setBackground(Color.RED);
		}
		
		
	}
}