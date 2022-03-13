package practicas;
//bucle for each
public class arrays2 {

	public static void main(String[] args) {
		 
		String[] paises=new String[8];
		
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		//diferencias de for
		//normal
		for(int i=0;i<paises.length;i++) {
			System.out.println(paises[i]);
		}
		System.out.println("For dos:");
		//for each
		for(String elemento:paises) {
			System.out.println(elemento);
		}
		
		
		

	}

}
