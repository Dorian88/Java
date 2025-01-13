package practicas_guiadas.P2CuadrosDialogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Date;

public class MarcoDialogos extends JFrame{
	
	public MarcoDialogos() {
		
		setTitle("Cuadros de Dialogos");
		
		setBounds(500, 300, 600, 450);
		
		JPanel laminaCuadricula = new JPanel();
		
		laminaCuadricula.setLayout(new GridLayout(2, 3));
		
		String primero[] = {"Mensaje", "Confirmar", "Opción", "Entrada"};
		
		laminaTipo = new LaminaBotones("Tipo", primero);
		laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje", new String[] {
				"ERROR_MESSAGE",
				"INFORMATION_MESSAGE",
				"WARNING_MESSAGE",
				"QUESTION_MESSAGE",
				"PLAIN_MESSAGE"
		});
		laminaMensaje = new LaminaBotones("Mensaje", new String[] {
				"Cadena",
				"Icono",
				"Componente",
				"Otros",
				"Object[]"
		});
		laminaTipoOpcion = new LaminaBotones("Confirmar", new String[] {
				"DEFAULT_OPTION",
				"YES_NO_OPTION",
				"YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"
		});
		laminaOpciones = new LaminaBotones("Opcion", new String[] {
				"String[]",
				"Icon[]",
				"Object[]"
		});
		laminaEntrada = new LaminaBotones("Entrada", new String[] {
				"Campo de Texto",
				"Combo"
		});
		
		//Lamina Inferior
		JPanel laminaMostrar = new JPanel();
		JButton botonMostrar = new JButton("Mostrar");
		laminaMostrar.add(botonMostrar);
				
		setLayout(new BorderLayout());
		
		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensaje);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaTipoOpcion);
		laminaCuadricula.add(laminaOpciones);
		laminaCuadricula.add(laminaEntrada);
		
		botonMostrar.addActionListener(new AccionMostrar());
		
		add(laminaMostrar, BorderLayout.SOUTH);
		add(laminaCuadricula, BorderLayout.CENTER);
	}
	
	//--------------------------------------------PROPORCIONA EL MENSAJE------------------------------------------------------------
	public Object dameMensaje() {
		
		String s = laminaMensaje.dameSeleccion();
		
		if(s.equals("Cadena")) {
			
			return cadenaMensaje;
			
		}else if(s.equals("Icono")) {
			
			return iconoMensaje;
			
		}else if(s.equals("Componente")) {
			
			return compoMensaje;
			
		}else if(s.equals("Otros")) {
			
			return objetoMensaje;
			
		}else if(s.equals("Object[]")) {
			
			return new Object[] {
					cadenaMensaje,
					iconoMensaje,
					compoMensaje,
					objetoMensaje
			};
		}else {
			
			return null;
		}
	}
	
	//--------------------------------------------DEVUELVE TIPO DE ICONO Y BOTONES RN CONFIRMAR-------------------------------------
	public int dameTipo(LaminaBotones lamina) {
		
		String s = lamina.dameSeleccion();
		
		if(s.contentEquals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
			
			return 0;
			
		}else if(s.contentEquals("INFORMATION_MESSAGE")|| s.equals("YES_NO_CANCEL_OPTION")) {
			
			return 1;
		}else if(s.contentEquals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
			
			return 2;
		}else if(s.contentEquals("QUESTION_MESSAGE")) {
			
			return 3;
		}else if(s.contentEquals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
			
			return -1;
		}else {
			
			return 0;
		}
	}
	
	//--------------------------------------------DA OPCIONES A LA LAMINA OPCIÓN----------------------------------------------------------------
	
	public Object[] dameOpciones(LaminaBotones lamina) {
		
		String s = lamina.dameSeleccion();
		
		if(s.equals("String[]")) {
			
			return new String[] {"Amarillo", "Azul", "Rojo"};
			
		}else if(s.equals("Icon[]")) {
			
			return new Object[] {
					new ImageIcon("src\\Graficos\\Amarillo.gif"),
					new ImageIcon("src\\Graficos\\Azul.gif"),
					new ImageIcon("src\\Graficos\\Rojo.gif")};
			
		}else if(s.equals("Object[]")) {
			
			return new Object[] {
							cadenaMensaje,
							iconoMensaje,
							compoMensaje,
							objetoMensaje
			};
			
		}else {
			return null;
		}
	}
	
	//--------------------------------------------GESTIÓN DE EVENTOS----------------------------------------------------------------
	
	private class AccionMostrar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(laminaTipo.dameSeleccion());
			
			if(laminaTipo.dameSeleccion().equals("Mensaje")) {
				
				JOptionPane.showMessageDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoMensaje));
				
			}else if(laminaTipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoOpcion), dameTipo(laminaTipoMensaje));
			}else if(laminaTipo.dameSeleccion().equals("Entrada")) {
				if(laminaEntrada.dameSeleccion().equals("Campo de Texto")) {
					
					JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoMensaje));
					
				}else {
					
					JOptionPane.showInputDialog(MarcoDialogos.this, dameMensaje(), "Título", dameTipo(laminaTipoMensaje), null,
							new String[] {"Amarillo", "Azul", "Rojo"}, "Amarillo");
				}
				
			}else if(laminaTipo.dameSeleccion().equals("Opción")) {
				JOptionPane.showOptionDialog(MarcoDialogos.this, dameMensaje(), "Título", 1, dameTipo(laminaTipoMensaje), null, dameOpciones(laminaOpciones), null);
			}
			
		}
		
		
	}
	
	private LaminaBotones laminaTipo, laminaTipoMensaje, laminaMensaje, laminaTipoOpcion, laminaOpciones, laminaEntrada;
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("src\\Graficos\\Azul.gif");
	private Object objetoMensaje = new Date();
	private Component compoMensaje = new LaminaEjemplo();
}

class LaminaEjemplo extends JPanel{
	
	public LaminaEjemplo() {
		setBackground(Color.YELLOW);
	}
	
	/*public void PaintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		
		g2.setPaint(Color.YELLOW);
		
		g2.fill(rectangulo);
	}*/
}