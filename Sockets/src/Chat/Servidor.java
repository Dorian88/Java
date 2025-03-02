package Chat;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {

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
			
			String nick, ip, mensaje;
			ArrayList<String> listaIp = new ArrayList<String>();
			PaqueteEnvio paqueteRecibido;
			
			while(true) {
				
				Socket miSocket = servidor.accept();
				
				//Recibe informacion de un cliente
				ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());
				paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();
				nick = paqueteRecibido.getNick();
				ip = paqueteRecibido.getIp();
				mensaje = paqueteRecibido.getMensaje();
				
				if(!mensaje.equals(" Online")) {
					
					areaTexto.append("\n" + nick + ": " + mensaje + " para " + ip);
					Socket enviaDestinatario = new Socket(ip, 9090);
					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
					paqueteReenvio.writeObject(paqueteRecibido);
					
					paqueteReenvio.close();
					enviaDestinatario.close();
					
				}else {
					
					InetAddress localizacion = miSocket.getInetAddress();
					String ipRemota = localizacion.getHostAddress();
					System.out.println("Online: " + ipRemota);
					
					listaIp.add(ipRemota);
					
					paqueteRecibido.setIps(listaIp);
					
					for (String z : listaIp) {
						
						System.out.println("Array: " + z);
						
						Socket enviaDestinatario = new Socket(z, 9090);
						ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
						paqueteReenvio.writeObject(paqueteRecibido);
						
						paqueteReenvio.close();
						enviaDestinatario.close();
					}
					
					
				}
				
				paqueteDatos.close();
				miSocket.close();
				
			}
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	JTextArea areaTexto;

}