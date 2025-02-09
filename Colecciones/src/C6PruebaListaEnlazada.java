//Ejercicio Paises y capitales

import java.util.*;

public class C6PruebaListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("Colombia");
		paises.add("Argentina");
		paises.add("Brasil");
		paises.add("Uruguay");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Bogotá");
		capitales.add("Buenos Aires");
		capitales.add("Brasilia");
		capitales.add("Montevideo");
		
		/*System.out.println(paises);
		System.out.println(capitales);*/
		
		ListIterator<String> iterPaises = paises.listIterator();
		ListIterator<String> iterCapitales = capitales.listIterator();
		
		while (iterCapitales.hasNext()){
			
			if(iterPaises.hasNext()) {
				
				iterPaises.next();
				
			}
			
			iterPaises.add(iterCapitales.next());
			
		}
		
		System.out.println(paises);
		
		iterCapitales = capitales.listIterator();
		
		while (iterCapitales.hasNext()) {
			
			iterCapitales.next();
			
			if(iterCapitales.hasNext()) {
				
				iterCapitales.next();
				
				iterCapitales.remove();
				
			}
		}
		
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		
		System.out.println(paises);

	}

}
