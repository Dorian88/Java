package transacciones;

import java.sql.*;

public class InsertaClientesPedidos {

	public static void main(String[] args) {
		
		Connection miConexion = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			miConexion.setAutoCommit(false);
			
			Statement miStatement = miConexion.createStatement();
			
			String instruccionSQL1 = "INSERT INTO CLIENTES (CÓDIGOCLIENTE, EMPRESA, DIRECCIÓN) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
			String instruccionSQL2 = "INSERT INTO PEDIDOS (NÚMERODEPEDIDO, CÓDIGOCLIENTE, FECHADEPEDIDO) VALUES ('82', 'CT84', '11/03/2000')";
			
			miStatement.executeUpdate(instruccionSQL1);
			miStatement.executeUpdate(instruccionSQL2);
			
			miConexion.commit();
			
			System.out.println("Datos insertados correctamente");

		}catch(Exception e) {
			
			System.out.println("Error en la inserción de datos");
			
			try {
				
				miConexion.rollback();
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
				
			}
			
			e.printStackTrace();
					
		}

	}

}
