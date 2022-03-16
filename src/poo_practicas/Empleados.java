package poo_practicas;

import java.util.*;

public class Empleados {

	public static void main(String[] args) {
		
		
		Empleados2[] misEmpleados=new Empleados2[6];
		
		//se crea para hacer el ejercicicio mas facil
		misEmpleados[0]=new Empleados2("Paco Gomez", 85000, 1990,12,17);
		
		misEmpleados[1]=new Empleados2("Ana Lopez", 95000, 1995,06,02);
		
		misEmpleados[2]=new Empleados2("Maria Martin", 105000, 2002,03,15);
		
		// se crea empleado jefe
		Jefaturas jefe_RRHH=new Jefaturas("maribel", 55000, 2006,9,25);
		
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
		
		misEmpleados[3]=new Empleados2("jose");
		
		misEmpleados[4]=jefe_RRHH; //Polimorfismo en accion. Principio de Sustitucion.
		//de esta forma funciona llamar metodos de la subclase. 
		misEmpleados[5]=new Jefaturas("Maria", 95000,1999,5,26);
		//de esta forma no funciona el llamar metodos de la sub clase
		
		//como hacer un casting o cambio de tipo
		//tipo     nombre a dar  (tipo)   El tipo a cambiar
		Jefaturas jefa_Finanzas=(Jefaturas) misEmpleados[5];
		
		jefa_Finanzas.estableIncentivo(55000);
		
		/* bucle for normal
		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dame_nombre()+" Sueldo: "+misEmpleados[i].dameSueldo()
			+" Fecha de Alta: "+misEmpleados[i].damefecha());
		}*/	
		
		//ejemplo con interfaces
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		System.out.println("El jefe "+jefa_Finanzas.dame_nombre()+
		" tiene un bonus de: "+jefa_Finanzas.establece_bonus(500));
		jefa_Finanzas.establece_bonus(500);
		
		System.out.println("El jefe "+misEmpleados[3].dame_nombre()+
		" tiene un bonus de: "+misEmpleados[3].establece_bonus(200));
		jefa_Finanzas.establece_bonus(500);		
		
		//buble for mejorado
		for(Empleados2 e: misEmpleados) {
			e.subeSueldo(6);
		}
		//ordenar el arrays
		Arrays.sort(misEmpleados);
		
		for(Empleados2 e: misEmpleados) {
			System.out.println("Nombre: "+e.dame_nombre()+" Sueldo: "+e.dameSueldo()+" Fecha de Alta: "+e.damefecha());
		}	
		
		

	}

}

class Empleados2 implements Comparable, Trabajadores {
	
	public Empleados2(String nom, double sue, int agno, int mes, int dia){//clase defina de la clase
	
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato=calendario.getTime();

	
	}
	
	//sobre carga de constructores. se debe crear con el mismo nombre de la clase, pero no deben tener misma cantidad de
	//parametros a recibir.
	public Empleados2(String nom) {
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
		
		Empleados2 otroEmpleado=(Empleados2) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}		
		
		return 0;		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
}
// si se deja sin constructor se dice que se usa el constructor heredado
//Final class Jefatura extends Empleado: colocando Final se evita que se siga heredando de la clase Jefatura
class Jefaturas extends Empleados2 implements Jefes{
	//Variable
	private double incentivo;
	
	public Jefaturas(String nom, double sue, int agno, int mes, int dia) {
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
	
	public String tomar_decisiones(String decisiones) {
		
		return "Un miembro de la direccion a tomado la decicion: "+decisiones;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
}

class Directores extends Jefaturas{
	
	public Directores(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
}