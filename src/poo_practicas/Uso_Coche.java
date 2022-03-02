package poo_practicas;

import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		
		//instanciar una clase, ejemplo 1
		Coche Renault=new Coche();
		
	
	//	System.out.print(Renault.ruedas);
		System.out.println(Renault.dime_datos_generales());
		
		Renault.estable_color(JOptionPane.showInputDialog("Digita color Coche"));
		
		System.out.println(Renault.info_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("Tiene Asientos de cuero?"));
		
		System.out.println(Renault.dime_asientos());
		
		//climatizador
		Renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		
		System.out.println("Precio Final del coche es "+Renault.dime_precio());
	}

}
