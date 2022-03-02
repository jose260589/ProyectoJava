package Practicas;
import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor ");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor ");
		
		//convertir string a int
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("Hola "+ nombre_usuario+" El año que viene tendrás "+(edad_usuario+1)+" años.");
		
		

	}

} 