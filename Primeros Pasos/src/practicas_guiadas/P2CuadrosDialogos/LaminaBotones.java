package practicas_guiadas.P2CuadrosDialogos;

import javax.swing.*;

public class LaminaBotones extends JPanel{
	
	public LaminaBotones(String titulo, String [] opciones){
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		grupo = new ButtonGroup();
		
		for (int i = 0; i < opciones.length; i++) {
			
			JRadioButton bot = new JRadioButton(opciones[i]);
			
			bot.setActionCommand(opciones[i]);
			
			add(bot);
			grupo.add(bot);
			bot.setSelected(i == 0);
		}
	}
	
	public String dameSeleccion(){
		
		ButtonModel miBoton = grupo.getSelection();
		String s = miBoton.getActionCommand();
		
		return s;
		
	}
	
	ButtonGroup grupo;
}
