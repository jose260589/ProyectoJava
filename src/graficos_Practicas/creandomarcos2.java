package graficos_Practicas;
import java.awt.Toolkit;
import java.awt.*;

import javax.swing.*;

public class creandomarcos2 {

	public static void main(String[] args) {
		
		Pantalla crear=new Pantalla();
		
		
		crear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		crear.setVisible(true);
		

	}

}

class Pantalla extends JFrame{
	
	public Pantalla() {
		//para crear otra forma de pantalla en el centro
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4,alturaPantalla/4);
		
		setTitle("Pantalla centrada");
		//colocar icono en JFrame- parte a partir de la raiz del proyecto
		Image miIcono=mipantalla.getImage("src/graficos_Practicas/iconos/configuraciones.png");
		setIconImage(miIcono);
	}
	
}
