package poo_practicas;

public class Coche {
	
	//para encapsular un dato se usa "private", despues no se podra accesar a los datos.
	//para accesar a esta propiedad se usan los metodos.
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
	//modificador de acceso o getter
	/*
	 * Para tener acceso al dato o metodo, tenemos que usar.
	 * public ya que es necesario que sea publico para accesar.
	 * tipo de dato. en este caso String, ya que queremos que devuelva String
	 * Nombre_Dato mas ()
	 * Ej. public String dime_largo()
	 * 
	 * *nota: se necesita si o si un return ya que debe usar un dato a devolver.
	 * */
	/*public String dime_largo() {
		
		return "El largo del coche es "+largo;
	}*/
	
	public String dime_datos_generales() {
		return "La Plataforma del vehiculo tiene "+ruedas + " ruedas "+
	". Mide "+largo/1000+ " metros con un ancho de "+ ancho +
	" cm y un peso de plataforma de "+peso_plataforma+ " kg.";
	}
	
	//modificador de acceso o setter
	/* public ya que es necesario que sea publico para accesar
	 * void. esto es para accesar y modificar datos
	 * nombre_datos()
	 * ej: public void estable_color() 
	 *  Nota: Este metodo no devuelve datos
	 *  */
	public void estable_color(String a) {
		color=a; //De esta forma se usa un metodo para cambiar valor inicial
	}
	/* forma normal
	public void estable_color() {
		color="azul";
	}*/
	
	public String info_color() {
		return "El color del coche es "+color;
	}
	
	public void configura_asientos(String asientos_cuero) {//setter
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;	
		}else {
			this.asientos_cuero=false;	
		}
		
	}
	
	public String dime_asientos() { //getter
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador(String climatizador) {//setter
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;	
		}else {
			this.climatizador=false;	
		}
		
	}
	
	public String dime_climatizador() { //getter
		if(climatizador==true) {
			return "El coche tiene climatizador";
		}else {
			return "El coche tiene aire acondicionado";
		}
	}
	
	//un metodo que combina setter y getter, pero no se recomienda.
	public String dime_peso_coche() {
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}else {
			peso_total=peso_total+30;
		}
		
		if(climatizador==true) {
			peso_total+=20;
		}else {
			peso_total+=10;
		}
		
		return "El peso del coche es "+peso_total;
	}
	
	public int dime_precio() {
		
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		
		if(climatizador==true) {
			precio_final+=1500;
		}
		
		return precio_final;
		
		
	}
	
}
