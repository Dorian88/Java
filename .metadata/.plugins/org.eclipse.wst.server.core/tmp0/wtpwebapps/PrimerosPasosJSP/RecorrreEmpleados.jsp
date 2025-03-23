<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, java.sql.*, dorian.com.jsptags.Empleado" %>

<%

	ArrayList<Empleado> datos = new ArrayList<>();

	Class.forName("com.mysql.jdbc.Driver");
	
	try{
		
		Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojsp", "root", " ");
		
		Statement miStatement = miConexion.createStatement();
		
		String instruccionSql = "SELECT * FROM EMPLEADOS";
		
		ResultSet rs = miStatement.executeQuery(instruccionSql);
		
		while(rs.next()){
			
			datos.add(new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
			
		}
		
		rs.close();
		miConexion.close();
		
	}catch(Exception e){
		
		out.println("Ha habido un error");
	}
	
	pageContext.setAttribute("losEmpleados", datos);

%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
		
			.cabecera{
			
				font-weight:bold;
				
			}
		
		</style>
	</head>
	
	<body>
		
		<table border="1">
			
			<tr class="cabecera"><td>Nombre</td><td>Apellido</td><td>Puesto</td><td>Salario</td></tr>
			<c:forEach var= "empTemp" items="${losEmpleados}">
				
				<tr>
					
					<td>${EmpTem.nombre}</td><td> ${EmpTem.apellido}</td><td> ${EmpTem.puesto}</td><td> 
						<!--<c:if test="${EmpTem.salario}<40000">${EmpTem.salario+5000}
						
						</c:if>
						<c:if test="${EmpTem.salario}>=40000">${EmpTem.salario}
						
						</c:if>-->
						
						<c:choose>
						
							<c:when test="${EmpTem.salario}<40000">
							
								${EmpTem.salario+5000}
							
							</c:when>
							
							<c:when test="${EmpTem.salario>40000 && $EmpTem.salario<=50000}">
							
								${EmpTem.salario+2000}
							
							</c:when>
							<c:otherwise>
							
								${EmpTem.salario}
							
							</c:otherwise>
						
						</c:choose>
						</td><br>
					
				</tr>
			
			</c:forEach>
		</table>
	</body>
</html>