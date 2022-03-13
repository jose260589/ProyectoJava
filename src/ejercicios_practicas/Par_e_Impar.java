package ejercicios_practicas;

import java.util.Scanner;

//Este programa es para identificar si un numero por teclado es par o impar
public class Par_e_Impar {
		
	public static void main(String[] args) {
		
		Scanner digito=new Scanner(System.in);
		
		System.out.println("Digite el numero a validar: ");
		int num=digito.nextInt();
		
		if(num%2==0) {
			System.out.println("El numero "+num+" es Par");
		}else {
			System.out.println("El numero "+num+" es Impar");
		}
	}

}
