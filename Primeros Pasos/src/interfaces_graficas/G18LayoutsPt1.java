package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G18LayoutsPt1 {

	public static void main(String[] args) {
		
		MarcoLayout marco = new MarcoLayout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		
		setTitle("Prueba Layouts");
		setBounds(600, 350, 600, 300);
		panelLayout lamina = new panelLayout();
		/*FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		lamina.setLayout(disposicion);*/
		//lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
		PanelLayout2 lamina2 = new PanelLayout2();
		add(lamina, BorderLayout.NORTH);
		add(lamina2, BorderLayout.SOUTH);
	}
}

class panelLayout extends JPanel{
	
	public panelLayout() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
				
		/*add(new JButton ("Amarillo"));
		add(new JButton ("Azul"));
		add(new JButton ("Rojo"));*/
		
		add(new JButton ("Amarillo"));
		add(new JButton ("Azul"));
	}
}

class PanelLayout2 extends JPanel{
	
	public PanelLayout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton ("Rojo"), BorderLayout.WEST);
		add(new JButton ("Verde"), BorderLayout.EAST);
		add(new JButton ("Negro"), BorderLayout.CENTER);
	}
}