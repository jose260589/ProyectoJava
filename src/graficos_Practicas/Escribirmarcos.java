package graficos_Practicas;

import javax.swing.*;
import java.awt.*;

public class Escribirmarcos {

	public static void main(String[] args) {
		
		MarcoConTexto pan=new MarcoConTexto();
		
		
		pan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Prueba de Level");
		
		//Para agregar laminas
		Lamina lam1=new Lamina();
		//esto es para agregarla o ponerla por encima
		add(lam1);
	}
	
	
}
//crear un panel
class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		//llamando el componente de la clase heredada
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo Swing", 50, 50);
	}
	
}