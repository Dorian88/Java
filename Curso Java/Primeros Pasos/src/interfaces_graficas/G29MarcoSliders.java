package interfaces_graficas;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class G29MarcoSliders {

	public static void main(String[] args) {
		
		FrameSliders miMarco = new FrameSliders();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSliders extends JFrame{
	
	public FrameSliders() {
		setBounds(550, 200, 550, 350);
		
		LaminaSliders miLamina = new LaminaSliders();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaSliders extends JPanel{
	
	public LaminaSliders() {
		JSlider control  = new JSlider(0, 100, 50);
		
		control.setMajorTickSpacing(50);
		control.setMinorTickSpacing(25);
		
		control.setPaintTicks(true);
		control.setFont(new Font("Verdana", Font.ITALIC, 12));
		control.setPaintLabels(true);
		//control.setSnapToTicks(true);
		add(control);
	}
}