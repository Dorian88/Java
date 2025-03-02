package modelo;

import java.sql.*;
import controlador.*;

public class EjecutaConsultas {
	
	public EjecutaConsultas() {
		
		miConexion = new Conexion();
		
	}
	
	public ResultSet filtraBD(String seccion, String pais) {
		
		Connection conecta = miConexion.dameConexion();
		
		rs = null;
		try {
			
		
			if(!seccion.equals("Todos") && pais.equals("Todos")) {
			
				enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);
				enviaConsultaSeccion.setString(1, seccion);
				
				rs = enviaConsultaSeccion.executeQuery();
				
			}else if(seccion.equals("Todos") && !pais.equals("Todos")) {
			
				enviaConsultaPais = conecta.prepareStatement(consultaPais);
				enviaConsultaPais.setString(1, pais);
				
				rs = enviaConsultaPais.executeQuery();
			
			}else {
			
				enviaConsultaTodos = conecta.prepareStatement(consultaTodos);
				enviaConsultaTodos.setString(1, seccion);
				enviaConsultaTodos.setString(2, pais);
				
				rs = enviaConsultaSeccion.executeQuery();
			
			}
		}catch(Exception e) {
			
		}
		
		return rs;
		
		
		
	}
	
	//private String pruebas;
	private Conexion miConexion;
	private ResultSet rs;
	private PreparedStatement enviaConsultaSeccion, enviaConsultaPais, enviaConsultaTodos;
	private final String consultaSeccion = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN = ?";
	private final String consultaPais = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE PAÍSDEORIGEN = ?";
	private final String consultaTodos = "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN = ? AND PAÍSDEORIGEN = ?";

}
