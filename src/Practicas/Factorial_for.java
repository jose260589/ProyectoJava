package Practicas;
import javax.swing.*;

public class Factorial_for {

	public static void main(String[] args) {
		int resultado=1;
		//long resultado=1; para resultados mas altos
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero factorial"));
		
		for(int i=numero;i>0;i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El resultado del factorial "+numero+"! es: "+resultado);

	}

}
