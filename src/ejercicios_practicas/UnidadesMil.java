package ejercicios_practicas;

import java.util.Scanner;

public class UnidadesMil {

	public static void main(String[] args) {
		int a;
		int unidad=0;
		int decena=0;
		int centena=0;
		int unidadmil=0;
		
		Scanner in=new Scanner(System.in);
		
		a=in.nextInt();
		
		if(a>1){
			unidad=(a%10);
			decena=(a%100)/10;
			centena=(a%1000)/100;
			unidadmil=(a%10000)/1000;
			
		}
		
		System.out.println("Unidad: "+unidad);
		System.out.println("Decena: "+decena);
		System.out.println("centena: "+centena);
		System.out.println("Unidad de mil: "+unidadmil);

	}

}
