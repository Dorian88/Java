<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h1 style="text-align=center">Agencia de Viajes</h1>
		
		<%
			//Valor por defecto
			String ciudadFavorita = "Medellin";
			
			//Lee la cookie de la peticion del navegador
			Cookie[] lasCookies = request.getCookies();
			
			//Buscar las preferencias. La ciudad favorita
			if(lasCookies!=null){
				
				for(Cookie cookieTemporal: lasCookies){
					
					if("AgenciaViajes.ciudadFavorita".equals(cookieTemporal.getName())){
						
						ciudadFavorita = cookieTemporal.getValue();
						break;
					}
					
				}
				
			}
					
		%>
		
		<h3>Vuelos a <%=ciudadFavorita %></h3>
		
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed imperdiet ligula massa,
		   quis convallis elit euismod ut. Nam egestas, velit et cursus lacinia, tellus tellus
		   laoreet neque, pharetra aliquam dolor.</p>
		   
		<h3>Hoteles en <%=ciudadFavorita %></h3>
		
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed imperdiet ligula massa,
		   quis convallis elit euismod ut. Nam egestas, velit et cursus lacinia, tellus tellus
		   laoreet neque, pharetra aliquam dolor.</p>
		
		<h3>Descuentos en restaurantes de <%=ciudadFavorita %></h3>
		
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed imperdiet ligula massa,
		   quis convallis elit euismod ut. Nam egestas, velit et cursus lacinia, tellus tellus
		   laoreet neque, pharetra aliquam dolor.</p>
	</body>
</html>