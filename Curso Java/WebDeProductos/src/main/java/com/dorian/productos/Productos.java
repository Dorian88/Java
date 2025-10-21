package com.dorian.productos;

import java.util.Date;

public class Productos {


	public Productos(String cArt, String seccion, String nArt, String precio, String fecha, String importado, String pOrigen) {

		this.cArt = cArt;
		this.seccion = seccion;
		this.nArt = nArt;
		this.importado = importado;
		this.pOrigen = pOrigen;
		this.precio = precio;
		this.fecha = fecha;

	}

	public Productos(String seccion, String nArt, String precio, String fecha, String importado, String pOrigen) {

		this.seccion = seccion;
		this.nArt = nArt;
		this.importado = importado;
		this.pOrigen = pOrigen;
		this.precio = precio;
		this.fecha = fecha;

	}

	//Métodos Getters
	public String getcArt() {
		return cArt;
	}

	public String getSeccion() {
		return seccion;
	}

	public String getnArt() {
		return nArt;
	}

	public String getImportado() {
		return importado;
	}

	public String getpOrigen() {
		return pOrigen;
	}

	public String getPrecio() {
		return precio;
	}

	public String getFecha() {
		return fecha;
	}

	//Métodos Setters
	public void setcArt(String cArt) {
		this.cArt = cArt;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public void setnArt(String nArt) {
		this.nArt = nArt;
	}

	public void setImportado(String importado) {
		this.importado = importado;
	}

	public void setpOrigen(String pOrigen) {
		this.pOrigen = pOrigen;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Productos [cArt=" + cArt + ", seccion=" + seccion + ", nArt=" + nArt + ", importado=" + importado
				+ ", pOrigen=" + pOrigen + ", precio=" + precio + ", fecha=" + fecha + "]";
	}



	private String cArt, seccion, nArt, precio, fecha, importado, pOrigen;

}
