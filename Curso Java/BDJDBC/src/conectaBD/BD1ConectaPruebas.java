package conectaBD;

import java.sql.*;

public class BD1ConectaPruebas {

	public static void main(String[] args) {
		
		try {
			
			//1. Crear conexión
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//2. Crear objeto statement
			Statement miStatement = miConexion.createStatement();
			
			//3. Ejecutar SQL
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			
			//4. Leer el resultset
			while(miResultSet.next()) {
				
				System.out.println(miResultSet.getString("NOMBREARTÍCULO") + " " + miResultSet.getString("CÓDIGOARTÍCULO") + " " + miResultSet.getString("PRECIO"));
			
			}
			
		}catch(Exception e){
			
			System.out.println("NO CONECTA!!");
			e.printStackTrace();
		
		}

	}

}
