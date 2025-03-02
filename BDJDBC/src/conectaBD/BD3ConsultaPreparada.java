package conectaBD;

import java.sql.*;

public class BD3ConsultaPreparada {

	public static void main(String[] args) {
		
try {
			
			//Crear conexión
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//Preparar consulta
			PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTÍCULO, SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS" + 
			 " WHERE SECCIÓN=? AND PAÍSDEORIGEN=?");
			
			//Establecer parametros de consulta
			miSentencia.setString(1, "DEPORTES");
			miSentencia.setString(2, "USA");
			
			//Ejecutar la consulta
			ResultSet rs = miSentencia.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			rs.close();
			
			//Reutilizacion de consulta SQL
			System.out.println("\nEJECUCIÓN SEGUNDA CONSULTA\n");
			
			miSentencia.setString(1, "CERAMICA");
			miSentencia.setString(2, "CHINA");
			
			//Ejecutar la consulta
			rs = miSentencia.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			rs.close();
			
			
		}catch(Exception e){
			
			System.out.println("NO CONECTA!!");
			e.printStackTrace();
		
		}

	}

}
