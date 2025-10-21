package interfaces_graficas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class G37DisposicionMuelle {

	public static void main(String[] args) {
		
		MarcoMuelle miMarco = new MarcoMuelle();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoMuelle extends JFrame{
	
	public MarcoMuelle() {
		
		setBounds(200, 300, 1000, 350);
		
		laminaMuelle miLamina = new laminaMuelle();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class laminaMuelle extends JPanel{
	
	public laminaMuelle() {
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		
		SpringLayout miLayout = new SpringLayout();
		
		setLayout(miLayout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring miMuelle = Spring.constant(0, 10, 100);
		Spring muelleRigido = Spring.constant(80);
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, miMuelle, SpringLayout.WEST, this);
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
		miLayout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, boton3);
	}
}