package Practicas;
import javax.swing.*;

public class BuclesI {

	public static void main(String[] args) {
		
		String clave="Jose";
		
		String pass="";
		//Ejemplo While
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa:");
			
			if(clave.equals(pass)==false) {
				System.out.println("Contraseņa incorrecta");
			}
			
		}
		System.out.println("Contraseņa correcta");

	}

}
