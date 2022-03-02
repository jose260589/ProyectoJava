package Practicas;

public class Usando_Clase_Math {

	public static void main(String[] args) {
		//Raiz cuadrada
		/*double raiz=Math.sqrt(25);
		
		System.out.println(raiz);*/
		
		double num1=5.85;
		
		/*Refundiciones
		 * se coloca entre parentesis al valor que se quiere convertirl
		 * ex: (int)Math.round(num1);
		 * */
		int resultado=(int)Math.round(num1);
		
		System.out.println(resultado);
		
		//exponente
		
		double base=5;
		
		double exponente=3;
		
		 resultado=(int)Math.pow(base, exponente);
		
		System.out.println("El Resultado de la base "+base+" elevado al exponente "+
		exponente + " es "+resultado);
		
		

	}

}
