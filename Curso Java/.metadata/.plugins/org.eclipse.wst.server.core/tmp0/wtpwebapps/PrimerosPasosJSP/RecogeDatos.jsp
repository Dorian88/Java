<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
	<html>

		<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
		</head>
		
		<body>
			
			<%@ page import = "java.sql.*" %>
			
			<%
			
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String usuario = request.getParameter("usuario");
			String contra = request.getParameter("contra");
			String pais = request.getParameter("pais");
			String tecno = request.getParameter("tecnologias");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			try{
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojsp", "root", "");
				
				Statement miStatement = miConexion.createStatement();
				
				String instruccionSQL = "INSERT INTO USUARIOS (Nombre, Apellido, Usuario, Contrasena, Pais, Tecnologia) VALUES ('" + nombre + "','" + apellido + "','" + usuario + "','" + contra + "','" + pais + "','" + tecno + "')";
				
				miStatement.executeLargeUpdate(instruccionSQL);
				
				out.println("Registrado con éxtio");
			}catch(Exception e){
				
				out.println("Ha habido un error");
				
				e.printStackTrace();
				
			}
			
			
			%>
			
		</body>
	</html>