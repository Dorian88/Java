package com.dorian.Servlest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistrosUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter salida=response.getWriter();
		
		salida.println("<html><body>");
		salida.println("Nombre: " + request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido: " + request.getParameter("apellido"));
		salida.println("<br><br>");
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/* Para el caso de que se use el post
		 * 
		 * reponse.setContentType("text/html")
		 * salida.println("<html><body>");
		 * salida.println("Nombre: " + request.getParameter("nombre"));
		 * salida.println("<br><br>");
		 * salida.println("Apellido: " + request.getParameter("apellido"));
		 * salida.println("<br><br>");
		 * salida.println("</body></html>");
		 */
	}

}
