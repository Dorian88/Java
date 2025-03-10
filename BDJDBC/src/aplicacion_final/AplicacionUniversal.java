package aplicacion_final;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AplicacionUniversal {

	public static void main(String[] args) {
		
		MarcoBD miMarco = new MarcoBD();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoBD extends JFrame{
	
	public MarcoBD() {
		
		setBounds(300, 200, 500, 500);
		
		LaminaBD miLamina = new LaminaBD();
		
		add(miLamina);
	}
}

class LaminaBD extends JPanel{
	
	public LaminaBD() {
		
		setLayout(new BorderLayout());
		comboTablas = new JComboBox();
		areaInformacion = new JTextArea();
		
		add(areaInformacion, BorderLayout.CENTER);
		add(comboTablas, BorderLayout.NORTH);
		
		conectarBD();
		obtenerTablas();
		
		comboTablas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String nombreTabla = (String) comboTablas.getSelectedItem();
				
				mostrarInfoTabla(nombreTabla);
				
			}
			
		});
		
	}
	
	public void conectarBD() {
		
		miConexion = null;
		
		String datos[] = new String[3];
		
		try {
			
			entrada = new FileReader("C:\\Users\\USUARIO\\Documents\\Curso Java\\BDJDBC\\src\\Archivos\\datos_config.txt");
			
			}catch(IOException e) {
				
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
			    
			    chooser.setFileFilter(filter);
			    
			    int returnVal = chooser.showOpenDialog(this);
			    
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			    	
			    	try {
			    		
						entrada = new FileReader(chooser.getSelectedFile().getAbsolutePath());
					
			    	} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					
			    	}
			    }

			}
		
			try {
				
				BufferedReader miBuffer = new BufferedReader(entrada);
			
				for(int i = 0; i <=2; i++) {
				
					datos[i] = miBuffer.readLine();
				
				}
			
				miConexion = DriverManager.getConnection(datos[0], datos[1], datos[2]);
			
				entrada.close();
			}catch(Exception e) {
			
				e.printStackTrace();
			
			}
			
	}
	
	public void obtenerTablas() {
		
		ResultSet miResultSet = null;
		
		try {
			
			DatabaseMetaData datosBD = miConexion.getMetaData();
			
			miResultSet = datosBD.getTables("pruebas", null, null, null);
			
			while(miResultSet.next()) {
				
				comboTablas.addItem(miResultSet.getString("TABLE_NAME"));
				
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	public void mostrarInfoTabla(String tabla) {
		
		ArrayList<String> campos = new ArrayList<String>();
		String consulta = "SELECT * FROM " + tabla;
		
		try {
			
			areaInformacion.setText("");
			
			Statement miStatement = miConexion.createStatement();
			ResultSet miResultSet = miStatement.executeQuery(consulta);
			ResultSetMetaData rsBD = miResultSet.getMetaData();
			
			for(int i = 1; i <= rsBD.getColumnCount(); i++) {
				
				campos.add(rsBD.getColumnLabel(i));
				
			}
			
			while (miResultSet.next()) {
				
				for (String nombreCampo : campos) {
					
					areaInformacion.append(miResultSet.getString(nombreCampo) + " ");
					
				}
				
				areaInformacion.append("\n");
			}
			
		}catch(Exception e) {
			
			e.getStackTrace();
			
		}
	}
	private JComboBox comboTablas;
	private JTextArea areaInformacion;
	private Connection miConexion;
	private FileReader entrada;
}