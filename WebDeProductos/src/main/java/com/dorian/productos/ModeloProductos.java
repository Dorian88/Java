package com.dorian.productos;

import java.sql.Connection;
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

}
