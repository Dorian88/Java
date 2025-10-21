package SwingAvanzado;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;

public class SA5TablaProductos {

	public static void main(String[] args) {
		
		JFrame miMarco = new MarcoProductos();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoProductos extends JFrame{
	
	public MarcoProductos() {
		
		setTitle("Tabla Personalizada");
		
		setBounds(500, 300, 800, 400);
		
		JPanel superior = new JPanel();
		
		nombresDeTablas = new JComboBox();
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			datosBD = miConexion.getMetaData();
			
			rs = datosBD.getTables("pruebas", null, null, null);
			
			while(rs.next()) {
				
				nombresDeTablas.addItem(rs.getString("TABLE_NAME"));
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		nombresDeTablas.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String tablaSeleccionada = (String) nombresDeTablas.getSelectedItem();
				
				String consulta = "SELECT * FROM " + tablaSeleccionada;
				
				try {
					
					sentencia = miConexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					rs = sentencia.executeQuery(consulta);
					
					/*while(rs.next()) {
						
						System.out.println(rs.getString("NOMBREARTÍCULO") + " " + rs.getString("CÓDIGOARTÍCULO"));
					}*/
					
					modelo = new ResultsetModeloTabla(rs);
					
					JTable tabla = new JTable(modelo);
					
					add(new JScrollPane(tabla), BorderLayout.CENTER);
					
					validate();
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				
				}
				
			}
			
		});
		
		superior.add(nombresDeTablas);
		
		add(superior, BorderLayout.NORTH);
	}
	
	private JComboBox nombresDeTablas;
	private DatabaseMetaData datosBD;
	private ResultSet rs;
	private Connection miConexion;
	private Statement sentencia;
	private ResultsetModeloTabla modelo;
}

class ResultsetModeloTabla extends AbstractTableModel{
	
	public ResultsetModeloTabla(ResultSet unResulset) {
		
		rsRegistros = unResulset;
		try {
			
			resmd = rsRegistros.getMetaData();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
		
		
	}

	public int getRowCount() {
		
		try {
			rsRegistros.last();
			
			return rsRegistros.getRow();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
		
		
	}

	public int getColumnCount() {
		
		try {
			
			return resmd.getColumnCount();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return 0;
		
		}
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		try {
			
			rsRegistros.absolute(rowIndex + 1);
			
			return rsRegistros.getObject(columnIndex + 1);
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public String getColumnName(int c) {
		
		try {
			
			return resmd.getColumnName(c+1);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	private ResultSet rsRegistros;
	private ResultSetMetaData resmd;
	
}