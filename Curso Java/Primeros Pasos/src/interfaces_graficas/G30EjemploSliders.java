package interfaces_graficas;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class G30EjemploSliders {

	public static void main(String[] args) {
		
		FrameSliders1 miMarco = new FrameSliders1();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSliders1 extends JFrame{
	
	public FrameSliders1() {
		setBounds(550, 200, 550, 350);
		
		LaminaSliders1 miLamina = new LaminaSliders1();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaSliders1 extends JPanel{
	
	public LaminaSliders1() {
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de La Mancha cuyo nombre...");
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8, 50, 12);
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Verdana", Font.ITALIC, 10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaSlider = new JPanel();
		laminaSlider.add(control);
		add(laminaSlider, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener{

		public void stateChanged(ChangeEvent e) {
			
			rotulo.setFont(new Font("Verdana", Font.PLAIN, control.getValue()));
		}
		
	}
	private JLabel rotulo;
	private JSlider control;
}