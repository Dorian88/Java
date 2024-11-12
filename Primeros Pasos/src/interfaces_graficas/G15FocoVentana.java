package interfaces_graficas;

import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class G15FocoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		
		G15FocoVentana miV = new G15FocoVentana();
		
		miV.iniciar();
	}
	
	public void iniciar(){
		
		marco1 =  new G15FocoVentana();
		marco2 = new G15FocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(50, 100, 600, 350);
		marco2.setBounds(700, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		
	}

	public void windowGainedFocus(WindowEvent e) {
		
		if(e.getSource() == marco1) {
			
			marco1.setTitle("Tengo el foco");
			
		}else {
			
			marco2.setTitle("Tengo el foco");
			
		}
	}

	public void windowLostFocus(WindowEvent e) {
		
if(e.getSource() == marco1) {
			
			marco1.setTitle("");
			
		}else {
			
			marco2.setTitle("");
			
		}
	}
	
	private G15FocoVentana marco1;
	private G15FocoVentana marco2;

}
