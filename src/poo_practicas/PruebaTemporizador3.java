package poo_practicas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador3 {

	public static void main(String[] args) {
		
		Reloj2 mireloj =new Reloj2(3000, true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
	}
}

class Reloj2{
	
	private int intervalo;
	
	private boolean sonido;
	
	public Reloj2(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}
		
	public void enMarcha() {
		//de este forma se creo una clase interna dentro del metodo enMarcha, 
		class DameLaHora3 implements ActionListener{
			//metodo constructor
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3 segundo: "+ahora);
				
				if(sonido==true) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente=new DameLaHora3();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}
}