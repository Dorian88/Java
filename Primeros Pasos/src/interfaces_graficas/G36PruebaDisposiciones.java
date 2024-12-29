package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G36PruebaDisposiciones {

	public static void main(String[] args) {
		
		MarcoCaja miMarco = new MarcoCaja();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoCaja extends JFrame{
	
	public MarcoCaja() {
		setTitle("Marco en la Caja");
		
		setBounds(600, 350, 200, 200);
		
		JLabel rotulo1 = new JLabel("Nombre");
		JLabel rotulo2 = new JLabel("Contraseña");
		
		JTextField texto1 = new JTextField(10);
		JTextField texto2 = new JTextField(10);
		
		JButton boton1 = new JButton("Enviar");
		JButton boton2 = new JButton("Cancelar");
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		Box cajaH2 = Box.createHorizontalBox();
		Box cajaH3 = Box.createHorizontalBox();
		Box cajaVertical = Box.createVerticalBox();
		
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));
		cajaH1.add(texto1);
		
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());
		cajaH3.add(boton2);
		
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
		
		add(cajaVertical, BorderLayout.CENTER);
	}
}