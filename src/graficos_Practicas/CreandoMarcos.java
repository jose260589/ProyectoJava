package graficos_Practicas;

import java.awt.Frame;

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
		//tamaño
		//setSize(500,300);
		//ubicacion
		//setLocation(500,300);
		//este metodo agrega a los dos de arriba
		setBounds(500,300,550,250);
		//impedir que se pueda anchar
		//setResizable(false);
		//para dar tamaño a la pantalla, tiene varios elementos
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//Para colocar titulos
		setTitle("Primera ventana");
	}
}
