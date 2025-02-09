import java.util.*;

public class C1CuentasUsuarios {

	public static void main(String[] args) {
		
		C2Cliente cl1 = new C2Cliente("Dorian Jaramillo", "00001", 200000);
		C2Cliente cl2 = new C2Cliente("Diana Betancur", "00002", 250000);
		C2Cliente cl3 = new C2Cliente("Alexander Rivas", "00003", 300000);
		C2Cliente cl4 = new C2Cliente("Lucia Bustamante", "00004", 500000);
		C2Cliente cl5 = new C2Cliente("Diana Betancur", "00002", 250000);
		Set<C2Cliente> clientesBanco = new HashSet<C2Cliente>();
				
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		/*for (C2Cliente cliente : clientesBanco) {
			
			//System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta() + " " + cliente.getSaldo());
			
			if(cliente.getNombre().equals("Lucia Bustamante")) {
				
				clientesBanco.remove(cliente);
			}
			
		}*/
		
		Iterator<C2Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombreCliente = it.next().getNombre();
			
			if(nombreCliente.equals("Lucia Bustamante")) {
				
				it.remove();
				
			}
		}
		
		for (C2Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta() + " " + cliente.getSaldo());
			
		}
		
		/*Iterator<C2Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombreCliente = it.next().getNombre();
			
			System.out.println(nombreCliente);
		}*/
		
	}

}
