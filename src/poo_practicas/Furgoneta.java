package poo_practicas;
//extends se usa para usar herencia, no se puede hacer herencia multiple
public class Furgoneta extends Coche {

	private int capacidad_carga;
	
	private int plazas_extra;
	
	//contructor
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		super(); //llamar al constructor de la clase padre padre
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
	}
	
	//getter
	public String dimeDatosFurgoenta() {
		
		return "La capacidad de carga es: "+capacidad_carga+ " Y las plazas son: "+plazas_extra;
	}
	
}
