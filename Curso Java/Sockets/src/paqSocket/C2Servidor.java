package paqSocket;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class C2Servidor {

	public static void main(String[] args) {
		
		MarcoServidor miMarco = new MarcoServidor();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor() {
		
		setBounds(1000, 300, 280, 350);
		
		JPanel miLamina = new JPanel();
		
		miLamina.setLayout(new BorderLayout());
		
		areaTexto = new JTextArea();
		
		miLamina.add(areaTexto, BorderLayout.CENTER);
		
		add(miLamina);
		
		setVisible(true);
		
		//Creo un hilo
		Thread miHilo = new Thread(this);
		miHilo.start();
	}
	
	
	public void run() {
		
		try {
			
			ServerSocket servidor = new ServerSocket(9999);
			
			while(true) {
				
				Socket miSocket = servidor.accept();
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				String mensajeTexto = flujoEntrada.readUTF();
				
				areaTexto.append("\n" + mensajeTexto);
				
				miSocket.close();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	JTextArea areaTexto;

}
