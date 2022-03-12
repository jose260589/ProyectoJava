/*Sumar, restar, multiplicar, dividir y el resto de dos numeros.
 * */

package Ejercicios_Practicas;

public class Trabajar_Dosnumeros {

	public static void main(String[] args) {
		
		double a=5;
		double b=8;
		double c=0;
		
		//Suma
		c=a+b;
		System.out.println("La suma de "+a+"+"+b+" es: "+c);
		
		//resta
		c=b-a;
		System.out.println("La resta de "+b+"-"+a+" es: "+c);
		
		//multiplicacion
		c=a*b;
		System.out.println("La multiplicacion de "+a+"*"+b+" es: "+c);
		
		//Division
		c=b/a;
		System.out.println("La division de "+b+"/"+a+" es: "+c);
		
		//modulo
		c=(b%a);
		System.out.println("residuo de la division "+b+"/"+a+" es: "+c);
		
		
	}

}
