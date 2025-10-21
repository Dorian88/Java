package procAlmacenado;

import java.sql.*;
import javax.swing.*;

public class ActualizaProductos {

	public static void main(String[] args) {
		
		int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio"));
		String nArticulo = JOptionPane.showInputDialog("Introduce el nombre del artículo");
		
		try {
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			CallableStatement miSentencia = miConexion.prepareCall("{call ACTUALIZA_PROD(?, ?)}");
			
			miSentencia.setInt(1, nPrecio);
			miSentencia.setString(2, nArticulo);
			
			miSentencia.execute();
			
			System.out.println("Actualizacion OK");
						
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
