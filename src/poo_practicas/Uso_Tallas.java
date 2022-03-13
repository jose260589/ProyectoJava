package poo_practicas;
import java.util.*;

public class Uso_Tallas {
	//Ejemplo1
	//enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	//ejemplo2 los tipos enumerados deben ser abreviados
	enum Talla{
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		//getter
		public String dame_Abreviatura() {
			return abreviatura;
		}
		
		//variable
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		
		/*ejemplo 1
		Talla s=Talla.MINI;
		
		Talla m=Talla.MEDIANO;
		
		Talla l=Talla.GRANDE;
		
		Talla xl=Talla.MUY_GRANDE;
		
		//Este valor da error porque no esta creado o agregado en enum 
		//Talla xxl=Talla.Enorme;
		 * 
		 */
		
		//ejemplo2
		Scanner entrada=new Scanner(System.in);
		
		System.out.println(" Escribe una Talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
			
		String entrada_datos=entrada.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla="+la_talla);
		
		System.out.println("Abreviatura="+la_talla.dame_Abreviatura());
	}

}
