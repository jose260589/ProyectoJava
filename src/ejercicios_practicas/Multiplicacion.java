package ejercicios_practicas;

import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {
		//Este programa sirve para mostrar tabla de multiplicacion hasta el numero 20, dependiendo el multiplo que se elija
		Scanner write=new Scanner(System.in);
		
		System.out.print("Favor Digitar el numero de la tabla de multiplicacion: ");
		
		int Multiplo=write.nextInt();
		
		System.out.println("----------------------------");
		
		for(int i=1;i<=20;i++) {
			System.out.println(Multiplo+" x "+i+" = "+(Multiplo*i));
		}
		
		System.out.println("----------------------------");		
		
		
	}

}
