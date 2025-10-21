package transacciones;

import java.sql.*;

import javax.swing.JOptionPane;

public class TransaccionProductos {

	public static void main(String[] args) {
		
		Connection miConexion = null;
		
		try {
			
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
			miConexion.setAutoCommit(false);
			
			Statement miStatement = miConexion.createStatement();
			
			String instruccionSQL1 = "DELETE FROM PRODUCTOS WHERE PAÍSDEORIGEN = 'ITALIA'";
			String instruccionSQL2 = "DELETE FROM PRODUCTOS WHERE PRECIO > 300";
			String instruccionSQL3 = "UPDATE PRODUCTOS SET PRECIO = PRECIO * 1.15";
			
			boolean ejecutar = ejecutarTransaccion();
			
			if(ejecutar) {
				
				miStatement.executeUpdate(instruccionSQL1);
				miStatement.executeUpdate(instruccionSQL2);
				miStatement.executeUpdate(instruccionSQL3);
				
				miConexion.commit();
				
				System.out.println("Se ejecutó la transacción correctamente");
			}else {
				
				System.out.println("No se realizó ningun cambio en la base de datos");
			}
		}catch(Exception e) {
			
			try {
				
				miConexion.rollback();
				
				System.out.println("Algo salió mal y no se realizó ningun cambio en la base de datos");
				
			}catch (SQLException e1) {
				
				e1.printStackTrace();
				
			}
			e.printStackTrace();
					
		}

	}
	
	static boolean ejecutarTransaccion() {
		
		String ejecucion = JOptionPane.showInputDialog("¿Ejecutamos transacción?");
		
		if(ejecucion.equals("Si") || ejecucion.equals("si")) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}

}
