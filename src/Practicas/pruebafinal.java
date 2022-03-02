/*
 * final:= const o constante en otros lenguajes, para que su valor no cambie.
 * static: se puede compartir, pero no pertenece a nadie mas que la clase.
 * 			puede usar, metodos, variables, y clases.
 * */
package Practicas;

public class pruebafinal {

	public static void main(String[] args) {
		//
		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana");
		
		Empleados trabajador3=new Empleados("Antonio");
		
		Empleados trabajador4=new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
		
	}

}


class Empleados{
	
	//variables	
	private final String nombre; //final = const o constante en otros lenguajes, para que su valor no cambie.
	
	private String seccion;
	
	private int id;
	
	private static int idSiguiente=1;
	
	//constructor
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		id=idSiguiente;
		
		idSiguiente++;
	}
	
	//metodo setter
	public void cambiaSeccion(String seccion) {
		this.seccion=seccion;
	}
	/*solo ejemplo
	public void cambiaNombre(String nom) {
		this.nombre=nom;
	}*/
	
	//metodo getter
	public String devuelveDatos() {
		return "El nombre es: "+nombre+" de la seccion: "+seccion+" con el id: #"+id ;
	}
	
	public static String dameIdSiguiente() {
		return "El ID siguiente es: "+idSiguiente;
	}
	
}
