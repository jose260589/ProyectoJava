/*
Calcular nota dividida en 3 partes
1. un 30% en 3 talleres.
2. un 30% en dos evaluaciones cortas realizadas
3. un 40% corresponde al proyecto final, que se divide en un 
50% de un trabajo y otro 50% la sustentacion del proyecto
*/

package ejercicios_practicas;

import java.util.Scanner;

public class Calcular_notas {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Notas a=new Notas();
		
		//Varibales
		Double N1,N2,N3;
		
		System.out.println("Favor Digitar la primera Nota del Taller: ");
		N1=in.nextDouble();
		System.out.println("Favor Digitar la Segunda Nota del Taller: ");
		N2=in.nextDouble();
		System.out.println("Favor Digitar la Segunda Nota del Taller: ");
		N3=in.nextDouble();		
		
		a.Nota1(N1, N2, N3);
		System.out.println("El resultado es: "+a.Resultado());
		
		System.out.println("Favor Digitar la primera Nota de Evaluacion: ");
		N1=in.nextDouble();
		System.out.println("Favor Digitar la Segunda Nota de Evaluacion: ");
		N2=in.nextDouble();
		
		a.Nota2(N1, N2);
		System.out.println("El resultado es: "+a.Resultado());

		
		System.out.println("Favor Digitar la primera Nota del Trabajo: ");
		N1=in.nextDouble();
		System.out.println("Favor Digitar la Segunda Nota del Sustentacion: ");
		N2=in.nextDouble();
		
		a.Nota3(N1, N2);
		System.out.println("El resultado es: "+a.Resultado());
	}

}


class Notas {
	
	//Variables
	public Double Nota_Global=0.00;
	
	void Nota1(Double n1,Double n2,Double n3) {
		Nota_Global+=(((n1+n2+n3)/3)*0.30);
	}
	
	public Double Resultado() {
		return Nota_Global;
	}
	
	void Nota2(Double n1,Double n2) {
		Nota_Global+=(((n1+n2)/2)*0.30);
	}
	
	void Nota3(Double n1,Double n2) {
		Nota_Global+=(((n1+n2)/2)*0.40);
	}
	
}