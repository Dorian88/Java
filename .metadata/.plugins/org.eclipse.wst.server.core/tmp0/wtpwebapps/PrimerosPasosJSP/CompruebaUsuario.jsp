<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ page import = "java.sql.*" %>
			
			<%
			
			String usuario = request.getParameter("usuario");
			String contra = request.getParameter("contra");
						
			Class.forName("com.mysql.jdbc.Driver");
			
			try{
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojsp", "root", "");
				
				PreparedStatement preparada = miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=? AND CONTRASENA=?");
				
				preparada.setString(1, usuario);
				preparada.setString(2, contra);
				
				ResultSet miResultset= preparada.executeQuery();
				
				if(miResultset.next()){
					
					out.println("Usuario autorizado");
				}else{
					out.println("No hay usuarios con esos datos");
				}

			}catch(Exception e){
				
				out.println("Ha habido un error");
				
				e.printStackTrace();
				
			}
			
			
			%>
</body>
</html>