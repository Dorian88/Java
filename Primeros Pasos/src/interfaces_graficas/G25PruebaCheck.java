package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class G25PruebaCheck {

	public static void main(String[] args) {
		
		MarcoCheck miMarco = new MarcoCheck();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setBounds(550, 300, 550, 350);
		
		LaminaCheck miLamina = new LaminaCheck();
		
		setVisible(true);
		
		add(miLamina);
	}
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		
		Font miLetra = new Font("Arial", Font.PLAIN, 24);
		
		texto = new JLabel("En algun lugar de La Mancha de cuyo nombre...");
		
		texto.setFont(miLetra);
		
		JPanel laminaTexto = new JPanel();
		
		laminaTexto.add(texto);
		
		add(laminaTexto, BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminaChecks = new JPanel();
		
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		
		add(laminaChecks, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int tipo = 0;
			
			if(check1.isSelected()) tipo +=Font.BOLD;
			if(check2.isSelected()) tipo +=Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipo, 24));
		}
		
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;
}