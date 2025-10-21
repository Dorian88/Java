package Hilos;

public class H2SincronizarHilos {

	public static void main(String[] args) {
		
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios2 hilo2 = new HilosVarios2(hilo1);
		
		hilo2.start();		
		hilo1.start();
		
		/*try {
			
			hilo1.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		hilo2.start();
		
		try {
			
			hilo2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}*/
		
		
		System.out.println("Ha terminado las tareas");

	}

}

class HilosVarios extends Thread{
	
	public void run() {
		
		for(int i = 0; i < 15; i++) {
			
			System.out.println("Ejecutando Hilo " + getName());
			
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
	}
	
}

class HilosVarios2 extends Thread{
	
	public HilosVarios2(Thread hilo) {
		
		this.hilo = hilo;
	}
	
	public void run() {
		
		try {
			
			hilo.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		for(int i = 0; i < 15; i++) {
			
			System.out.println("Ejecutando Hilo " + getName());
			
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
	}
	
	private Thread hilo;
	
}