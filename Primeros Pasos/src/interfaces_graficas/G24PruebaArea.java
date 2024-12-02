package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class G24PruebaArea {

	public static void main(String[] args) {
		
		MarcoPruebaArea miMarco = new MarcoPruebaArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Área de Texto");
		
		setBounds(500, 300, 500, 350);
		
		setLayout(new BorderLayout());
		
		laminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonSaltoLinea = new JButton("Salto de Linea");
		areaTexto = new JTextArea(8, 20);
		laminaConBarras = new JScrollPane(areaTexto);
		
		botonInsertar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
				
			}
			
		});
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				boolean saltar =!areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(saltar);
				
				/*if(saltar) {
					botonSaltoLinea.setText("Quitar salto");
				}else {
					botonSaltoLinea.setText("Salto de linea");
				}*/
				
				botonSaltoLinea.setText(saltar ? "Quitar Salto" : "Salto Línea"); //?: Operador ternario
			}
			
		});
		
		
		
		laminaBotones.add(botonInsertar);
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}