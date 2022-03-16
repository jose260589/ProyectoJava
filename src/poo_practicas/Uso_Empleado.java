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
		
		Empleado[] misEmpleados=new Empleado[6];
		String nom;
		double sue;
		int agno,mes,dia;
		//se crea para hacer el ejercicicio mas facil
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990,12,17);
		
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995,06,02);
		
		misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002,03,15);
		
		// se crea empleado jefe
		Jefatura jefe_RRHH=new Jefatura("maribel", 55000, 2006,9,25);
		
		jefe_RRHH.estableIncentivo(2570.00);
		/* este for es para llenar los datos por teclado
		for(int i=0;i<3;i++) {
			nom=JOptionPane.showInputDialog("Diga nombre Empleado "+(i+1));
			sue=Double.parseDouble(JOptionPane.showInputDialog("Digita sueldo Empleado "+(i+1)));
			agno=Integer.parseInt(JOptionPane.showInputDialog("Digita años"));
			mes=Integer.parseInt(JOptionPane.showInputDialog("Digita mes"));
			dia=Integer.parseInt(JOptionPane.showInputDialog("Digita dia"));
			
			misEmpleados[i]=new Empleado(nom, sue, agno,mes,dia);
		}*/
		
		misEmpleados[3]=new Empleado("jose");
		
		misEmpleados[4]=jefe_RRHH; //Polimorfismo en accion. Principio de Sustitucion.
		//de esta forma funciona llamar metodos de la subclase. 
		misEmpleados[5]=new Jefatura("Maria", 95000,1999,5,26);
		//de esta forma no funciona el llamar metodos de la sub clase
		
		//como hacer un casting o cambio de tipo
		//tipo     nombre a dar  (tipo)   El tipo a cambiar
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableIncentivo(55000);
		//otro ejemplo 4
		Empleado director_comercial=new Jefatura("Sandra", 85000, 2012,05,05);
		
		Comparable ejemplo=new Empleado("Elisabeth",95000,2011,06,07);
		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfas Comparable");
		}
		//fin ejemplo 4
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
			e.subeSueldo(6);
		}
		//order el arrays
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dame_nombre()+" Sueldo: "+e.dameSueldo()+" Fecha de Alta: "+e.damefecha());
		}	
		
		

	}

}

class Empleado implements Comparable {
	
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
	
	
	//metodo compare to, para ordenar un arrays
	//hay que implementarlo, lo dice en la case empleado
	
	public int compareTo (Object miObjeto){
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}		
		
		return 0;		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}
// si se deja sin constructor se dice que se usa el constructor heredado
//Final class Jefatura extends Empleado: colocando Final se evita que se siga heredando de la clase Jefatura
class Jefatura extends Empleado{
	//Variable
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	//setter
	public void estableIncentivo(double b) {
		incentivo=b;
	}
	//getter
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe+incentivo;
	}
	
}

class Director extends Jefatura{
	
	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
}