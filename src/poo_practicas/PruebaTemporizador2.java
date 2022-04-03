package poo_practicas;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj(3000, true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa para terminar");

	}

}


class Reloj{
	
	private int intervalo;
	
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}
	
	
	public void enMarcha() {
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}
	
	private class DameLaHora2 implements ActionListener{
		//metodo constructor
		public void actionPerformed(ActionEvent evento) {
			
			Date ahora=new Date();
			
			System.out.println("Te pongo la hora cada 3 segundo: "+ahora);
			
			if(sonido==true) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}
