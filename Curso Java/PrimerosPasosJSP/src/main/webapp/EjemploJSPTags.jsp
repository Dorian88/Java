<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%

	String alumnos[] = {"Antonio", "Sandra", "Maria", "Pacho"};
	
	pageContext.setAttribute("losAlumnos", alumnos);

%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Usando JSTL</title>
	</head>
	
	<body>
		
		<c:forEach var="tempAlumnos" items="${losAlumnos }">
		
			${tempAlumnos} <br>
		
		</c:forEach>
		
	</body>
</html>