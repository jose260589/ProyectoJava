package poo_practicas;

import java.util.*;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990,12,17);
		
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995,06,02);
		
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002,03,15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dame_nombre()+" Sueldo: "+empleado1.dameSueldo()
		+" Fecha de Alta: "+empleado1.damefecha());
		
		System.out.println("Nombre: "+empleado2.dame_nombre()+" Sueldo: "+empleado2.dameSueldo()
		+" Fecha de Alta: "+empleado2.damefecha());
		
		System.out.println("Nombre: "+empleado3.dame_nombre()+" Sueldo: "+empleado3.dameSueldo()
		+" Fecha de Alta: "+empleado3.damefecha());*/
		
		Empleado[] misEmpleados=new Empleado[4];
		String nom;
		double sue;
		int agno,mes,dia;
		
		for(int i=0;i<3;i++) {
			nom=JOptionPane.showInputDialog("Diga nombre Empleado "+(i+1));
			sue=Double.parseDouble(JOptionPane.showInputDialog("Digita sueldo Empleado "+(i+1)));
			agno=Integer.parseInt(JOptionPane.showInputDialog("Digita a�os"));
			mes=Integer.parseInt(JOptionPane.showInputDialog("Digita mes"));
			dia=Integer.parseInt(JOptionPane.showInputDialog("Digita dia"));
			
			misEmpleados[i]=new Empleado(nom, sue, agno,mes,dia);
		}
		
		misEmpleados[3]=new Empleado("jose");
		/* bucle for normal
		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dame_nombre()+" Sueldo: "+misEmpleados[i].dameSueldo()
			+" Fecha de Alta: "+misEmpleados[i].damefecha());
		}*/	
		//buble for mejorado
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dame_nombre()+" Sueldo: "+e.dameSueldo()+" Fecha de Alta: "+e.damefecha());
		}		

	}

}

class Empleado {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){//clase defina de la clase
	
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato=calendario.getTime();

	
	}
	
	//sobre carga de constructores. se debe crear con el mismo nombre de la clase, pero no deben tener misma cantidad de
	//parametros a recibir.
	public Empleado(String nom) {
		//nombre=nom; //forma normal, pero de esta forma queda con datos sin evaluar.
		
		//mejor forma.
		this(nom, 3000,2000,01,01);//de esta forma llama al constructor que corresponda con la cantidad de de parametros. 
	}
	
	public String dame_nombre() {//Getter
		
		return nombre;
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
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}
