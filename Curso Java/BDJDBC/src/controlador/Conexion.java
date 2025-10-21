package controlador;

import java.sql.*;

public class Conexion {
	
	public Connection miConexion = null;
	
	public Conexion() {
		
	}
	
	public Connection dameConexion() {
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
		
		}catch(Exception e) {
		
		}
		
		return miConexion;
		
	}

}
