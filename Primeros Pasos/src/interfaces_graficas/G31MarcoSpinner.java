package interfaces_graficas;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class G31MarcoSpinner {

	public static void main(String[] args) {
		
		FrameSpinner miMarco = new FrameSpinner();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		
		setBounds(550, 350, 550, 350);
		setVisible(true);
		add(new LaminaSpinner());
	}
	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		
		/*String lista [] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		String lista [] = {"Enero", "Febrero", "Marzo", "Abril"};*/
		Dimension dim = new Dimension(200, 20);
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));
		/*JSpinner control = new JSpinner(new SpinnerDateModel()); 
		JSpinner control = new JSpinner(new SpinnerListModel(lista));*/
		
		control.setPreferredSize(dim);
		add(control);
	}
}