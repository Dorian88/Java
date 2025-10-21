package interfaces_graficas;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class G31EjemploSpinner {

	public static void main(String[] args) {
		
		FrameSpinner1 miMarco = new FrameSpinner1();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class FrameSpinner1 extends JFrame{
	
	public FrameSpinner1() {
		
		setBounds(550, 350, 550, 350);
		setVisible(true);
		add(new LaminaSpinner1());
	}
	
}

class LaminaSpinner1 extends JPanel{
	
	public LaminaSpinner1() {
		
		Dimension dim = new Dimension(200, 20);
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {//Clase Interna Anonima
			public Object getNextValue() {
				
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
			}
		});
				
		control.setPreferredSize(dim);
		add(control);
	}
	
	/*private class MiModeloJspinner extends SpinnerNumberModel{
		
		public MiModeloJspinner() {
			
			super(5, 0, 10, 1);
			
		}
		
		public Object getNextValue() {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
	}*/
}