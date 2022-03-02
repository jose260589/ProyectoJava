package Practicas;
// if, else, else if
import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Favor Introducir edad a evaluar: ");
		
		int edad=entrada.nextInt();
		/* Primer Ejemplo
		if(edad>=18){
			System.out.println("Es Mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}*/
		
		//ejemplo2
		if(edad<18) {
			System.out.println("Eres adolecente");
		} else if(edad>=18 && edad<40) {
			System.out.println("Eres Joven");
		} else if(edad>=40 && edad<65) {
			System.out.println("Eres maduro");
		} else if(edad>=65) {
			System.out.println("Eres muy mayor, debe cuidarse");
		}

	}

}
