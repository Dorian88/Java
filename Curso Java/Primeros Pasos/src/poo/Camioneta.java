package poo;

public class Camioneta extends Carro{
	
	private int capacidadCarga, plazasExtra;
	
	public Camioneta(int plazasExtra, int capacidadCarga) {
		
		super();
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;
	}
	
	//Método Getter
	public String dimeDatosCamioneta() {
		
		return "La capacidad de carga de la camioneta es " + capacidadCarga + " y las plazas son " + plazasExtra;
	}

}
