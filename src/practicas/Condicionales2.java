package practicas;
//use de switch

import java.util.Scanner;
import javax.swing.*;

public class Condicionales2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int opcion;
		
		System.out.println("De cual figura deseas Hallar el area. ");
		System.out.print("1-Cuadrado ");
		System.out.print("2-Rectangulo ");
		System.out.print("3-Triangulo ");
		System.out.println("4-Circulo ");
		
		opcion=entrada.nextInt();
		
		switch(opcion) {
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El área del cuadrado es "+Math.pow(lado, 2));
			
			break;
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
			
			System.out.println("El área del rectangulo es "+(base*altura));
			
			break;
		
		case 3:
			 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
			
			System.out.println("El área del triangulo es "+(base*altura)/2);
			
			break;
		
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.printf("%1.2f","El radio del Circulo es "+ Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			System.out.println("La opcion introducida no es la correcta.");
		
		}
	
	}

}
