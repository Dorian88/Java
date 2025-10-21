package modelo;

import java.sql.*;
import controlador.*;

public class CargaMenus {
	
	public CargaMenus() {
		
		miConexion = new Conexion();
		
	}
	
	public String ejecutaConsultas() {
		
		Productos miProducto = null;
		
		Connection accesoBD = miConexion.dameConexion();
		
		try{
			
			Statement secciones = accesoBD.createStatement();
			Statement paises = accesoBD.createStatement();
			
			rs = secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");
			rs2 = paises.executeQuery("SELECT DISTINCTROW PAÍSDEORIGEN FROM PRODUCTOS");
			
			miProducto = new Productos();
			miProducto.setSeccion(rs.getString(1));
			miProducto.setpOrigen(rs2.getString(1));
						
			rs.close();
			rs2.close();
			accesoBD.close();
			
		}catch(Exception e) {
			
		}
		
		return miProducto.getSeccion();
	}
	
	Conexion miConexion;
	public ResultSet rs, rs2;

}
