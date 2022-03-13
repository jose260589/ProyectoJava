package practicas;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] matriz_aleatorios=new int[150];
		
		for(int i=0;i<matriz_aleatorios.length;i++) {
			matriz_aleatorios[i]=(int)Math.round(Math.random()*1000);
		}
		/*for(int i=0;i<matriz_aleatorios.length;i++) {
			System.out.println(matriz_aleatorios[i]);
		}*/
		for(int numeros:matriz_aleatorios) {
			System.out.println(numeros);
		}
		

	}

}
