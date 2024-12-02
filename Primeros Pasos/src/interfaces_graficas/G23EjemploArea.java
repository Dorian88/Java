package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class G23EjemploArea {

	public static void main(String[] args){
				
		MarcoArea miMarco = new MarcoArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setBounds(500, 300, 500, 350);
		
		LaminaArea miLamina = new LaminaArea();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		miArea = new JTextArea(8, 20);
		
		JScrollPane laminaBarra = new JScrollPane(miArea);
		
		//miArea.setLineWrap(true);
		
		add(laminaBarra);
		
		JButton miBoton = new JButton("Dale");
		
		miBoton.addActionListener(new GestionaArea());
		
		add(miBoton);
	}
	
	private class GestionaArea implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			System.out.println(miArea.getText());
			
		}
	}
	
	private JTextArea miArea;
}