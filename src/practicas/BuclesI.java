package practicas;
import javax.swing.*;

public class BuclesI {

	public static void main(String[] args) {
		
		String clave="Jose";
		
		String pass="";
		//Ejemplo While
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña:");
			
			if(clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
			
		}
		System.out.println("Contraseña correcta");

	}

}
