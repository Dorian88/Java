package poo;

//import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		Carro miCarro1 = new Carro();
		Camioneta miCamioneta = new Camioneta(7, 580);
		
		/*Carro miCarro = new Carro();
		
		miCarro.estableceColor(JOptionPane.showInputDialog("Ingresa el color que deseas para el carro."));
		miCarro.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		miCarro.configuraClimatizador(JOptionPane.showInputDialog("\"¿Tiene climatizador de cuero?"));
		
		
		System.out.println(miCarro.MostrarDatosGenerales());
		System.out.println(miCarro.mostrarColor());
		System.out.println(miCarro.mostrarAsientos());
		System.out.println(miCarro.mostrarClimatizador());
		System.out.println(miCarro.dimePesoCarro());
		System.out.println("El precio final del carro es: " + miCarro.precioCarro());*/
		
		miCarro1.estableceColor("Rojo");
		miCamioneta.estableceColor("Verde");
		miCamioneta.configuraAsientos("si");
		miCamioneta.configuraClimatizador("si");
		
		System.out.println(miCarro1.MostrarDatosGenerales() + " " + miCarro1.mostrarColor());
		System.out.println(miCamioneta.MostrarDatosGenerales() + miCamioneta.dimeDatosCamioneta());

	}

}
