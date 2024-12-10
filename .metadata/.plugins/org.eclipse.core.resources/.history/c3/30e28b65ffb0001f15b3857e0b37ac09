package interfaces_graficas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class G27EjemploRadio {

	public static void main(String[] args) {
		
		MarcoRadio1 miMarco = new MarcoRadio1();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadio1 extends JFrame{
	
	public MarcoRadio1() {
		setBounds(550, 300, 500, 350);
		
		LaminaRadio1 miLamina = new LaminaRadio1();
		
		setVisible(true);
		
		add(miLamina);
	}
}

class LaminaRadio1 extends JPanel{
	
	public LaminaRadio1(){
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		add(texto, BorderLayout.CENTER);
		
		laminaBotones = new JPanel();
		miGrupo = new ButtonGroup();
		
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy Grande", false, 26);
		
		add(laminaBotones, BorderLayout.SOUTH);

	}
	
	public void colocarBotones(String nombre, boolean seleccionado, final int tamano) {
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		miGrupo.add(boton);
		laminaBotones.add(boton);
		
		ActionListener evento = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
				
			}
			
		};
		
		boton.addActionListener(evento);
		
		
		
		
	}
	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	private ButtonGroup miGrupo;
	private JPanel laminaBotones;
}