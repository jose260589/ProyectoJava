package poo_practicas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Luis Conde", 5000,2009,02,25);
		lasPersonas[1]=new Alumno("JOSE INOA", "Ing. Sistema");

		
		for (Persona p: lasPersonas) {
			System.out.println(p.dame_nombre() + " , " + p.dameDescripcion());
		}
		
	}

}

//crear clase abstracta
abstract class Persona{
	//Variables
	private String nombre;
	
	//Constructor
	public Persona(String nom) {
		nombre=nom;
	}
	
	public String dame_nombre() {//Getter
		
		return nombre;
	}
	//De esta forma se declara metodo abstracto
	public abstract String dameDescripcion();
	
}


class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia){//clase defina de la clase
	
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato=calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;

	
	}
	//construcion o mejora metodo abstracto
	public String dameDescripcion() {
		return "Este empleado tiene un id= "+ Id + " Con un sueldo= "+sueldo;
	}
	
	public double dameSueldo() {//Getter
		return sueldo;
	}
	
	public Date damefecha() {//getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
		
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
	
}


class Alumno extends Persona{
	public Alumno(String nom, String car) {
		super(nom);
		
		carrera=car;
	}
	
	//metodo  abstracto
	public String dameDescripcion() {
		return "Este Alumno esta estudiando la carrera de " + carrera;
	}
	
	
	//varibable
	private String carrera;
}