package interfaces_graficas;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class G22CampoPassword {

	public static void main(String[] args) {
		
		MarcoPassword miMarco = new MarcoPassword();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		
		setBounds(400, 300, 550, 400);
		
		LaminaPassword miLamina = new LaminaPassword();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaPassword extends JPanel{
	
	public LaminaPassword(){
		
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		
		laminaSuperior.setLayout(new GridLayout(2, 2));
		
		add(laminaSuperior, BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario");
		JLabel etiqueta2 = new JLabel("Password");
		
		JTextField c_usuario = new JTextField(15);
		c_contra = new JPasswordField(15);
		CompruebaPass miEvento = new CompruebaPass();
		
		c_contra.getDocument().addDocumentListener(miEvento);
		
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(c_usuario);
		laminaSuperior.add(etiqueta2);
		laminaSuperior.add(c_contra);
		
		JButton enviar = new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
		
	}
	
	private class CompruebaPass implements DocumentListener{

		public void insertUpdate(DocumentEvent e){
			
			char [] contra;
			
			contra = c_contra.getPassword();
			
			if (contra.length < 8 || contra.length > 12) {
				
				c_contra.setBackground(Color.RED);
				
			}else {
				
				c_contra.setBackground(Color.WHITE);
				
			}
		}

		public void removeUpdate(DocumentEvent e){
			
			char [] contra;
			
			contra = c_contra.getPassword();
			
			if (contra.length < 8 || contra.length > 12) {
				
				c_contra.setBackground(Color.RED);
				
			}else {
				
				c_contra.setBackground(Color.WHITE);
				
			}
		}

		public void changedUpdate(DocumentEvent e) {			
		}
				
	}
	
	private JPasswordField c_contra = new JPasswordField(15);
	
}