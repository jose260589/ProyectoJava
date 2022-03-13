package practicas;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int numero,aleatorio,intentos;
		aleatorio=(int)(Math.random()*100);
		
		numero=0;
		intentos=0;
		//System.out.println(aleatorio);
		
		while(aleatorio!=numero) {
			System.out.println("Digita numero, por favor: ");
			numero=entrada.nextInt();
			
			if(aleatorio!=numero){
				intentos+=1;
				if(numero>aleatorio) {
					System.out.println("El Numero "+numero+" es mayor.");
				}else if(numero<aleatorio){
					System.out.println("El Numero "+numero+" es menor.");
				}
			}else {
				System.out.println("El Numero "+numero+" es igual. Aceptaste.");
			}
			
		}
		System.out.println("Numero de intentos: "+intentos);
		//usando do while
		do {
			intentos++;
			System.out.println("Digita numero, por favor: ");
			numero=entrada.nextInt();
			
			if(aleatorio!=numero){
				
				if(numero>aleatorio) {
					System.out.println("El Numero "+numero+" es mayor.");
				}else if(numero<aleatorio){
					System.out.println("El Numero "+numero+" es menor.");
				}
			}else {
				System.out.println("El Numero "+numero+" es igual. Aceptaste.");
			}
			
		}while(numero!=aleatorio);
		System.out.println("Numero de intentos: "+intentos);
	}

}
