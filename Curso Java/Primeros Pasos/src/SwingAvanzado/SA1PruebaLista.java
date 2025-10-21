package SwingAvanzado;

import java.awt.BorderLayout;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

public class SA1PruebaLista {

	public static void main(String[] args) {
		
		JFrame miMarco = new MarcoDeLista();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoDeLista extends JFrame{
	
	public MarcoDeLista() {
		
		setTitle("Prueba de lista");
		
		setBounds(400, 300, 400, 300);
		
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
						   "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		listaDeMeses = new JList<String> (meses);
		
		listaDeMeses.setVisibleRowCount(4);
		
		JScrollPane laminaDeDesplazamiento = new JScrollPane(listaDeMeses);
		
		listaDeMeses.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				
				List<String> valores = listaDeMeses.getSelectedValuesList();
				StringBuilder texto = new StringBuilder("Mes selecionado: ");
				
				for (String elemento : valores) {
					
					String palabra = elemento;
					
					texto.append(palabra);
					texto.append(" ");
				}
				
				rotulo.setText(texto.toString());
				
			}
			
			
		});
		
		laminaDeLista = new JPanel();
		laminaDeLista.add(laminaDeDesplazamiento);
		
		laminaDeTexto = new JPanel();
		rotulo = new JLabel("Mes seleccionado: ");
		laminaDeTexto.add(rotulo);
		
		add(laminaDeLista, BorderLayout.NORTH);
		add(laminaDeTexto, BorderLayout.SOUTH);
	}
	
	private JList<String> listaDeMeses;
	private JPanel laminaDeLista, laminaDeTexto;
	private JLabel rotulo;
}