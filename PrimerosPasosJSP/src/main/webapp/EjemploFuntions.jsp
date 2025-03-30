<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
	
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		
		<c: set var="datos" values="Diana, Betancur, Directora, 75000"/>
		
			<c: set var="datosArray" value="${fn:split(datos,',') }"/>
		
		<input type="text" value="${datosArry[0]}"><br>
		<input type="text" value="${datosArry[1]}"><br>
		<input type="text" value="${datosArry[3]}"><br>
		<input type="text" value="${datosArry[4]}">
		
		
	</body>
</html>