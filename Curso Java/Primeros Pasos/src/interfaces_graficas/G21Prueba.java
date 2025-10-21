package interfaces_graficas;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class G21Prueba {

	public static void main(String[] args) {
		
		MarcoPrueba miMarco = new MarcoPrueba();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setBounds(500, 300, 500, 350);
		
		LaminaPrueba miLamina = new LaminaPrueba();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		JTextField miCampo = new JTextField(20);
		EscuchaTexto elEvento = new EscuchaTexto();
		
		Document miDoc = miCampo.getDocument();
		miDoc.addDocumentListener(elEvento);
		
		add(miCampo);
	}
	
	private class EscuchaTexto implements DocumentListener{

		public void insertUpdate(DocumentEvent e) {
			
			System.out.println("Haz insertado texto");
			
		}

		public void removeUpdate(DocumentEvent e) {
			
			System.out.println("Haz borrado texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}