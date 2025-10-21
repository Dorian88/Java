package interfaces_graficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class G28PruebaCombo {

	public static void main(String[] args) {
		MarcoCombo miMarco = new MarcoCombo();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		setVisible(true);
		
		setBounds(550, 300, 550, 400);
		
		LaminaCombo miLamina = new LaminaCombo();
		
		add(miLamina);
	}
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		
		JPanel laminaNorte = new JPanel();
		
		miCombo = new JComboBox();
		miCombo.setEditable(true);
		miCombo.addItem("Serif");
		miCombo.addItem("SansSerif");
		miCombo.addItem("Calibri");
		miCombo.addItem("Dialog");
		
		EventoCombo miEvento = new EventoCombo();
		
		miCombo.addActionListener(miEvento);
		
		laminaNorte.add(miCombo);
		
		add(laminaNorte, BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN, 18));
			
		}
		
	}
	
	private JLabel texto;
	private JComboBox miCombo;
}