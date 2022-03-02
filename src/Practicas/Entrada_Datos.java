package Practicas;
import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {
		
		//Inicializar un objeto tipo Scanner, objeto es entrada
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		// con .nextLine(), puedes introducir texto
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años.");
		
		System.out.println("Introduce tu proxima edad ");
		
		double edad2=entrada.nextDouble();
		
		System.out.println("El priximo año tendre "+edad2);
	}

}
