package practicas;
import javax.swing.*;

public class Peso_Ideal {
//bucles identerminado
	public static void main(String[] args) {
		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu Genero(H/M):");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce altura en CM"));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			pesoideal=altura-120;
		}
		
		System.out.print("Tu peso ideal es "+ pesoideal +" kg.");
	}

}
