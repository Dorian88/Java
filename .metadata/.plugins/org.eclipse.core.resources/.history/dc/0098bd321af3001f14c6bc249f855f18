package controlador;

import java.awt.event.*;
import modelo.*;
import vista.*;

public class ControladorCargaMenus extends WindowAdapter{
	
	public ControladorCargaMenus(MarcoAplicacion2 elMarco) {
		
		this.elMarco = elMarco;
		
	}
	public void windowOpened(WindowEvent e) {
		
		obj.ejecutaConsultas();
		
		try {
			
			while(obj.rs.next()) {
				
				elMarco.secciones.addItem(obj.rs.getString(1));
				
			}
			
			while(obj.rs2.next()) {
				
				elMarco.paises.addItem(obj.rs2.getString(1));
				
			}
			
		}catch(Exception e2) {
			
			e2.printStackTrace();
		}
	}
	
	CargaMenus obj = new CargaMenus();
	private MarcoAplicacion2 elMarco;

}
