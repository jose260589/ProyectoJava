package Practicas;

import javax.swing.JOptionPane;

public class Comprueba_mail_for {

	public static void main(String[] args) {
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce Mail");
		
		for(int i=0;i<mail.length();i++){
			
			if(mail.charAt(i)=='@') {
				arroba=true;
			}
		}
		
		if(arroba==true) {
			System.out.println("Mail es Valido");	
		} else if(arroba==false) {
			System.out.println("Mail es Invalido");	
		}
		

	}

}
