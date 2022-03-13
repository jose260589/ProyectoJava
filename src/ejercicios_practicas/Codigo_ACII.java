package ejercicios_practicas;

import java.util.Scanner;

public class Codigo_ACII {

	public static void main(String[] args) {
		
		Scanner entra=new Scanner(System.in);
		
		System.out.println("Introduce un numero para ver el codigo ACII.");
		int a=entra.nextInt();
		//asi de facil se cambia a codigo ACII, Esto es un casting
		char codigo=(char)a;
		
		System.out.println("El codigo ACII de: "+a+" es: "+codigo);

	}

}
