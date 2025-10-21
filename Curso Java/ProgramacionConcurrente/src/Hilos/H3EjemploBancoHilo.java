//Programa que permite hacer transferencias entre cuentas de un banco.

package Hilos;

import java.util.concurrent.locks.*;

public class H3EjemploBancoHilo {

	public static void main(String[] args) {
		
		Banco b = new Banco();
		
		for(int i = 0; i < 100; i++) {
			
			EjecucionTransferencia r= new EjecucionTransferencia(b, i, 2000);
			Thread t = new Thread(r);
			
			t.start();
		}

	}

}

class Banco{
	
	public Banco() {
		
		cuentas = new double[100];
		
		for(int i = 0; i < cuentas.length; i++) {
			
			cuentas[i] = 2000;
			//saldoSuficiente = cierreBanco.newCondition();
			
		}
		
	}
	
	public synchronized void transeferncia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		
		//cierreBanco.lock();
		
		//try {
			
			//Controla que el saldo de la cuenta de origen es inferior a la cantidad pedida.
			while(cuentas[cuentaOrigen] < cantidad) {
				
				//return;
				//saldoSuficiente.await();
				wait();			
			}
		
			System.out.println(Thread.currentThread());
		
			cuentas[cuentaOrigen] -= cantidad; //Dinero que sale de la cuenta de origen.
		
			System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
		
			cuentas[cuentaDestino] += cantidad; //Dinero que entra a la cuenta de destino.
		
			System.out.printf(" Saldo total: %10.2f\n", getSaldoTotal());
			
			//saldoSuficiente.signalAll();
			
			notifyAll();
			
		//}finally{
			
			//cierreBanco.unlock();
			
		//}
	}
	
	public double getSaldoTotal() {
		
		double sumaCuentas = 0;
		
		for(double a: cuentas) {
			
			sumaCuentas += a;
		}
		
		return sumaCuentas;
	}
	
	private final double[] cuentas;
	//private Lock cierreBanco = new ReentrantLock(); //ReentrantLock hace que se ejecute un hilo a la vez
	//private Condition saldoSuficiente;
	
}

class EjecucionTransferencia implements Runnable{

	public EjecucionTransferencia(Banco b, int de, double max) {
		
		banco = b;
		deLaCuenta = de;
		cantidadMax = max;
	}
	
	public void run() {
		
		int paraLaCuenta;
		double cantidad;
		
		try {
			while(true) {
				
				paraLaCuenta = (int)(100*Math.random());
				cantidad = cantidadMax*Math.random();
				
				banco.transeferncia(deLaCuenta, paraLaCuenta, cantidad);
				
				Thread.sleep((int)(Math.random()*10));
			}
		}catch(InterruptedException e) {}
		
		
	}
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
}