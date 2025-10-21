package poo;

public class Carro {
	
	private int rueda, largo, ancho, motor, pesoPlataforma, pesoTotal;
	private String color;
	private boolean asientosCuero, climatizador;
	
	//Método constructor
	public Carro() {
		rueda = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	//Métodos getters
	public String MostrarDatosGenerales() {
		
		return "La plataforma del vehículo tiene " + rueda + " llantas " + ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
				" cm. Un peso de plataforma de " + pesoPlataforma + " kg";
	}
	
	public String mostrarColor() {
		
		return "El color del carro es: " + color;
	}
	
	public String mostrarAsientos() {
		if(asientosCuero == true) {
			return "El carro tiene asientos de cuero";
		}else {
			return "El carro tiene asientos de serie";
		}
	}
	
	public String mostrarClimatizador() {
		if (climatizador == true) {
			return "El carro tiene climatizador";
		}else {
			return "el carro tiene aire acondicionado";
		}
	}
	
	public int precioCarro() {
		int precioFinal = 10000;
		
		if(asientosCuero == true) {
			precioFinal += 2000;
		}
		
		if(climatizador == true) {
			precioFinal += 1500;
		}
		
		return precioFinal;
	}
	
	//Métodos setters
	public void estableceColor(String colorCarro) {
		color = colorCarro;
	}
	
	public void configuraAsientos(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}else {
			this.asientosCuero = false;
		}
	}
	
	public void configuraClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	
	//Método que es Getter y Setter a la vez
	public String dimePesoCarro() {
		int pesoCarroceria = 500;
		
		pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if(asientosCuero == true) {
			pesoTotal = pesoTotal + 50;
		}
		
		if(climatizador == true) {
			pesoTotal = pesoTotal + 20;
		}
		
		return "El peso del carro es " + pesoTotal;
	}
}
