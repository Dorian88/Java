package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G17VariosOyentes {

	public static void main(String[] args) {
		
		MarcoPricipal miMarco = new MarcoPricipal();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}


class MarcoPricipal extends JFrame{
	
	public MarcoPricipal() {
		
		setTitle("Prueba Varios");
		setBounds(1000, 100, 300, 200);
		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
	}
}

class LaminaPrincipal extends JPanel{
	
	public LaminaPrincipal() {
		
		JButton botonNuevo  = new JButton("Nuevo");
		botonCerrar  = new JButton("Cerrar Todo");
		
		add(botonNuevo);
		add(botonCerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		
		botonNuevo.addActionListener(miOyente);
	}
	
	private class OyenteNuevo implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			
			marco.setVisible(true);
		}
		
	}
	
	JButton botonCerrar;
}

class MarcoEmergente extends JFrame{
	
	public MarcoEmergente(JButton botonPrincipal) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		
		botonPrincipal.addActionListener(oyenteCerrar);
		
	}
	
	private class CierraTodos implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
		}
		
	}
	
	private static int contador = 0;
}