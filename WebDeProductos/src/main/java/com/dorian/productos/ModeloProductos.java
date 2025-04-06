package com.dorian.productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModeloProductos {

	private javax.sql.DataSource origenDatos;

	public ModeloProductos(javax.sql.DataSource origenDatos) {

		this.origenDatos = origenDatos;

	}

	public List<Productos> getProductos() throws Exception{

		List<Productos> productos = new ArrayList<>();

		Connection miConexion = null;
		Statement miStatement = null;
		ResultSet miResultSet = null;

		try {

			//Establecer la conexion
			miConexion = origenDatos.getConnection();

			//Crear sentencia sql y Statement
			String instruccionSql = "SELECT * FROM PRODUCTOS";
			miStatement = miConexion.createStatement();

			//Ejecutar sql
			miResultSet = miStatement.executeQuery(instruccionSql);

			//Recorrer el ResultSet obtenido
			while(miResultSet.next()) {

				String cArt = miResultSet.getString("CÓDIGOARTÍCULO");
				String seccion = miResultSet.getString("SECCIÓN");
				String nArt = miResultSet.getString("NOMBREARTÍCULO");
				String precio = miResultSet.getString("PRECIO");
				String fecha = miResultSet.getString("FECHA");
				String importado = miResultSet.getString("IMPORTADO");
				String pOrig = miResultSet.getString("PAÍSDEORIGEN");

				Productos temProd = new Productos(cArt, seccion, nArt, precio, fecha, importado, pOrig);
				productos.add(temProd);
			}

		}catch(Exception e) {

			e.printStackTrace();

		}
		return productos;
	}

	public void agregarElNuevoProducto(Productos nuevoProducto) throws Exception{
		
		Connection miConexion = null;
		PreparedStatement miStatement = null;
		 
		//Obtener la conexion con la BD
		try {
			
			miConexion = origenDatos.getConnection();
			
		//Crear la instruccion sql. Crear la consulta preparada (Statement)
		String sql = "INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN)" + 
						"VALUES(?,?,?,?,?,?,?)";
		miStatement = miConexion.prepareStatement(sql);
		
		//Establecer parametros del producto
		miStatement.setString(1, nuevoProducto.getcArt());
		miStatement.setString(2, nuevoProducto.getSeccion());
		miStatement.setString(3, nuevoProducto.getnArt());
		miStatement.setString(4, nuevoProducto.getPrecio());
		miStatement.setString(5, nuevoProducto.getFecha());
		miStatement.setString(6, nuevoProducto.getImportado());
		miStatement.setString(7, nuevoProducto.getpOrigen());
		
		//ejecutar la instruccion sql
		miStatement.execute();
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			
			miStatement.close();
			miConexion.close();
		}
		
	}

	public Productos getProducto(String codigoArticulo) {
		
		Productos elProducto = null;
		Connection miConexion = null;
		PreparedStatement miStatement = null;
		ResultSet miResultset = null;
		String cArticulo = codigoArticulo;
		
		try {
			
			//Establecer la conexion con la BD
			miConexion = origenDatos.getConnection();
		
			//Crear el SQL que busque el producto
			String sql = "SELECT * FROM PRODUCTOS WHERE CÓDIGOARTÍCULO=?";
		
			//Crear la consulta preparada
			miStatement = miConexion.prepareStatement(sql);
		
			//Establecer los parametros
			miStatement.setString(1, cArticulo);
		
			//Ejecutar la consulta
			miResultset = miStatement.executeQuery();
		
			//Obtener los datos de respuesta
			if(miResultset.next()) {
				
				String cArt = miResultset.getString("CÓDIGOARTÍCULO");
				String seccion = miResultset.getString("SECCIÓN");
				String nArt = miResultset.getString("NOMBREARTÍCULO");
				String precio = miResultset.getString("PRECIO");
				String fecha = miResultset.getString("FECHA");
				String importado = miResultset.getString("IMPORTADO");
				String pOrig = miResultset.getString("PAÍSDEORIGEN");
				
				elProducto = new Productos(cArt, seccion, nArt, precio, fecha, importado, pOrig);
				
			}else {
				
				throw new Exception("No se ha encontrado con código artículo " + cArticulo);
			}
			
			}catch(Exception e) {
			
				e.printStackTrace();
			
			}
		
		return elProducto;
	}

	public void actualizarProducto(Productos productoActualizado) throws Exception{
		
		Connection miConexion = null;
		PreparedStatement miStatement = null;
				
		//Establecer la conexion con la BD
		try {
			miConexion = origenDatos.getConnection();
		
			//Crear el SQL que busque el producto
			String sql = "UPDATE PRODUCTOS SET SECCIÓN=?, NOMBREARTÍCULO=?, PRECIO=?, FECHA=?, IMPORTADO=?, PAÍSDEORIGEN=? WHERE CÓDIGOARTÍCULO=?";
		
			//Crear la consulta preparada
			miStatement = miConexion.prepareStatement(sql);
		
			//Establecer los parametros
			miStatement.setString(1, productoActualizado.getSeccion());
			miStatement.setString(2, productoActualizado.getnArt());
			miStatement.setString(3, productoActualizado.getPrecio());
			miStatement.setString(4, productoActualizado.getFecha());
			miStatement.setString(5, productoActualizado.getImportado());
			miStatement.setString(6, productoActualizado.getpOrigen());
			miStatement.setString(7, productoActualizado.getcArt());
		
			//Ejecutar la consulta
			miStatement.execute();
			}finally {
				
				miStatement.close();
				miConexion.close();
			}
		
	}

	public void eliminarProducto(String codArticulo) throws Exception{
		
		Connection miConexion = null;
		PreparedStatement miStatement = null;
				
		//Establecer la conexion con la BD
		try {
			miConexion = origenDatos.getConnection();
		
			//Crear instruccion SQL de eliminacion
			String sql = "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO=?";
		
			//Preparar la consulta
			miStatement = miConexion.prepareStatement(sql);
		
			//establecer parametros de la consulta
			miStatement.setString(1, codArticulo);
		
			//ejecutar la sentencia SQL
			miStatement.execute();
			
		}finally {
			
			miStatement.close();
			miConexion.close();
		}
	}

}
