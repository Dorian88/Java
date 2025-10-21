package SwingAvanzado;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SA3UsoJTable {

	public static void main(String[] args) {
		
		JFrame miMarco = new MarcoTabla();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);


	}

}

class MarcoTabla extends JFrame{
	
	public MarcoTabla() {
		
		setTitle("Los Planetas");
		
		setBounds(300, 300, 400, 200);
		
		JTable tablaPlanetas = new JTable(datosFilas, nombresColumnas);
		
		add(new JScrollPane(tablaPlanetas), BorderLayout.CENTER);
		
		JButton botonImprimir = new JButton("Imprimir Tabla");
		
		botonImprimir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					
					tablaPlanetas.print();
					
				}catch(Exception e2) {
					
					e2.printStackTrace();
					
				}
				
			}
			
		});
		
		JPanel laminaBoton = new JPanel();
		laminaBoton.add(botonImprimir);
		add(laminaBoton, BorderLayout.SOUTH);
	}
	
	private String [] nombresColumnas = {"Nombre", "Radio", "Lunas", "Gaseoso"};
	private Object [][] datosFilas = {
			
			{"Mercurio", 2440.0, 0, false},
			{"Venus", 6052.0, 0, false},
			{"Tierra", 6378.0, 1, false},
			{"Marte", 3397.0, 2, false},
			{"Jupiter", 71492.0, 16, true},
			{"Saturno", 60268.0, 18, true},
			{"Urano", 25559.0, 17, true},
			{"Neptuno", 24766.0, 8, true},
			{"Plutón", 1137.0, 1, false}
	};
}