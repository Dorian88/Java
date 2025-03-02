package modelo;

public class Productos {
	
	private String nArticulo, seccion, precio, pOrigen;
	
	public Productos() {
		
		nArticulo = "";
		seccion = "";
		precio = "";
		pOrigen = "";
	}
	
	//Métodos Getters
	public String getnArticulo() {
		
		return nArticulo;
	
	}
	
	public String getSeccion() {
	
		return seccion;
	
	}
	
	public String getPrecio() {
		
		return precio;
	
	}
	
	public String getpOrigen() {
		
		return pOrigen;
	
	}
	
	//Métodos Setters
	public void setnArticulo(String nArticulo) {
		
		this.nArticulo = nArticulo;
	
	}

	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
	
	}

	public void setPrecio(String precio) {
		
		this.precio = precio;
	
	}

	public void setpOrigen(String pOrigen) {
		this.pOrigen = pOrigen;
	}

}
