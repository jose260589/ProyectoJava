package graficos_Practicas;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1=new miMarco();
		//PARA HACER PANTALLA VISIBLE
		marco1.setVisible(true);
		//PARA CERRAR VENTANA
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class miMarco extends JFrame{
	
	//constructor
	public miMarco() {
		
		setSize(500,300);
	}
}
