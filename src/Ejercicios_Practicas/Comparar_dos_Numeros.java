package Ejercicios_Practicas;

import java.util.Scanner;

public class Comparar_dos_Numeros {

	public static void main(String[] args) {
		//pedir numeros y guardarlos
		Scanner digito=new Scanner(System.in);
		
		System.out.println("Digite el primer numero a validar: ");
		int num=digito.nextInt();
		
		System.out.println("Digite el segundo numero a validar: ");
		int num2=digito.nextInt();
		
		//comparacion
		if(num==num2) {
			System.out.println("Ambos numeros son iguales");
		}else if(num>=num2){
			System.out.println("El numero "+num+" es mayor que "+num2);
		}else{
			System.out.println("El numero "+num2+" es mayor que "+num);
		}

	}

}
