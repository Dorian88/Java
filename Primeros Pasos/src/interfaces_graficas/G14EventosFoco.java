package interfaces_graficas;

import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class G14EventosFoco {

	public static void main(String[] args) {
		
		MarcoFoco miMarco = new MarcoFoco();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		
		setBounds(200, 200, 500, 350);
		
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150,20);
		cuadro2.setBounds(120, 50, 150,20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elFoco = new LanzaFocos();
		
		cuadro1.addFocusListener(elFoco);
	}
	
	private class LanzaFocos implements FocusListener{

		public void focusGained(FocusEvent e) {
			
			//System.out.println("Has ganado el foco");
			
		}

		public void focusLost(FocusEvent e) {
			
			String email = cuadro1.getText();
			boolean comprobacion = false;
			
			for(int i = 0; i < email.length(); i++) {
				
				if(email.charAt(i) == '@') {
					comprobacion = true;
				}
			}
			
			if(comprobacion) {
				 
				System.out.println("El email es correcto");
				
			}else {
				
				System.out.println("El email es no correcto");
				
			}
			
		}
		
	}
	
	private JTextField cuadro1;
	private JTextField cuadro2;
}