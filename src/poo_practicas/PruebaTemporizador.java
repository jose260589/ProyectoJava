package poo_practicas;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente=new DameLaHora();
		
		Timer mitemporizador=new Timer(5000, oyente);
		
		//Inicio temporizador
		mitemporizador.start();
		
		//para que quede una pantalla con un mensaje 
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		//para detener el programa cuando se de a aceptar
		System.exit(0);
		
		

	}

}

// se crea la clave para que de la hora, y se implementa la clase actionlistener
// para luego crear metodo actionperforme para que escuche o se cree un evento
class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent E) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada "+ ahora);
		 
	}
}