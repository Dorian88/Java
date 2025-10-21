<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.net.URLEncoder" %>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<%
			//Leyendo datos del formulario
			String ciudadFavorita = request.getParameter("ciudadFavorita");
			
			// Codificar el valor de la cookie para evitar caracteres no permitidos
	    	String ciudadCodificada = URLEncoder.encode(ciudadFavorita, "UTF-8");
			
			//Crear la cookie
			Cookie laCookie = new Cookie("AgenciaViajes.ciudadFavorita", ciudadCodificada);
			
			//Tiempo de vida de la cookie
			laCookie.setMaxAge(31536000); //Un año
			
			//Enviar a usuario
			response.addCookie(laCookie);
		
		%>
		
		Gracias por enviar tus preferencias
		
		<a href="AgenciaViajes.jsp">Ir a la agencia de viajes</a>
	</body>
</html>