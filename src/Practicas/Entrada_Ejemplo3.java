package Practicas;
//import javax.swing.*;


public class Entrada_Ejemplo3 {

	public static void main(String[] args) {
		
		String num1="1";
				//JOptionPane.showInputDialog("Introduce el numero a sacar raiz");
		//convertir de string a double
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de "+num2 + " es ");
		//Dar formato a salida de datos con numeros
		System.out.printf("%1.2f", Math.sqrt(num2));
		

		


	}

}
