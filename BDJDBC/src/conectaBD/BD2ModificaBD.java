package conectaBD;

import java.sql.*;

public class BD2ModificaBD {

	public static void main(String[] args) {
		
		try {
			
			//1. Crear conexión
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			
			//2. Crear objeto statement
			Statement miStatement = miConexion.createStatement();
			
			//Inserta un nuevo artículo
			String instSql1 = "INSERT INTO PRODUCTOS(CÓDIGOARTÍCULO, NOMBREARTÍCULO, PRECIO) VALUES('AR77', 'PANTALÓN', 25.35)";
			miStatement.executeUpdate(instSql1);
			
			//Actualiza informacion
			String instSql2 = "UPDATE PRODUCTOS SET PRECIO = PRECIO*2 WHERE CÓDIGOARTÍCULO =  'AR77'";
			miStatement.executeUpdate(instSql2);
			
			//Elimina información
			String instSql3 = "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO = 'AR77'";
			miStatement.executeUpdate(instSql3);
			
			System.out.println("Datos insertados correctamente");
			System.out.println("Datos actualizados correctamente");
			System.out.println("Datos borrados correctamente");
			
		}catch(Exception e){
			
			System.out.println("NO CONECTA!!");
			e.printStackTrace();
		
		}

	}

}
