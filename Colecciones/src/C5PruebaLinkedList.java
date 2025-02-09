import java.util.*;

public class C5PruebaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("Dorian");
		personas.add("Diana");
		personas.add("Alexander");
		personas.add("Luisa"); 
		
		System.out.println(personas.size());
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("Edwin");
		
		for (String persona : personas) {
			
			System.out.println(persona);
			
		}

	}

}
