package com.dorian.productos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPruebas
 */
@WebServlet("/ServletPruebas")
public class ServletPruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//Establecer el DataResource
	@Resource(name="jdbc/Productos")
	private javax.sql.DataSource miPool;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPruebas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		//Crear el objeto PrintWriter
		PrintWriter salida = response.getWriter();
		response.setContentType("text/plain");

		//Crear Conexión con la base de datos
		Connection miConexion = null;
		Statement miStatement = null;
		ResultSet miResultSet = null;

		try {

			miConexion = miPool.getConnection();

			String miSql = "SELECT * FROM PRODUCTOS";

			miStatement = miConexion.createStatement();
			miResultSet = miStatement.executeQuery(miSql);

			while(miResultSet.next()) {

				String nombreArticulo = miResultSet.getString(3);

				salida.println(nombreArticulo);
			}
		}catch(Exception e){

			e.getStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
