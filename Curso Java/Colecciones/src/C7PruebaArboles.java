import java.util.*;

public class C7PruebaArboles {

	public static void main(String[] args) {
		
		TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		System.out.println("1. Ordena personas");
		
		for (String s : ordenaPersonas) {
			
			System.out.println(s);
		}
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(200, "Segundo Articulo");
		Articulo tercero = new Articulo(3, "Tercer Articulo");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		System.out.println("\n2. Ordena Articulos por numero");
		
		for (Articulo art : ordenaArticulos) {
			
			System.out.println(art.getDescripcion());
		}
		
		/*Articulo comparadorArticulos = new Articulo();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);
		
		ComparadorArticulos comparaArt = new ComparadorArticulos();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparaArt);*/
		
		//Con una clase anonima
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
			
			public int compare(Articulo o1, Articulo o2) {
				
				String desc1 = o1.getDescripcion();
				String descr2 = o2.getDescripcion();
				
				return desc1.compareTo(descr2);
			}
		});
		 
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		System.out.println("\n3. Ordena Articulos alfabeticamente");
		
		for (Articulo articulo : ordenaArticulos2) {
			
			System.out.println(articulo.getDescripcion());
		}
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
	}
}

class Articulo implements Comparable<Articulo> {//Comparator<Articulo> 
	
	/*public Articulo() {
		
	}*/
	
	public Articulo(int num, String desc) {
		
		numeroArticulo = num;
		descripcion = desc;
		
	}

	public int compareTo(Articulo o) {
		
		return numeroArticulo - o.numeroArticulo;
		
	}
	
	/*public int compare(Articulo o1, Articulo o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
		
	}*/
	
	public String getDescripcion(){
		
		return descripcion;
	}
	
	private int numeroArticulo;
	private String descripcion;
	
}