package practicas;

public class arrays1 {

	public static void main(String[] args) {
		//Declaracion y recorrido normal de un array
		
		int[] mi_array=new int[5];
		
		mi_array[0]=5;
		mi_array[1]=38;
		mi_array[2]=-15;
		mi_array[3]=92;
		mi_array[4]=71;
		//int[] mi_array={5,38,-15,92,71} otro tipo de declaracion. no es aconsejable, pero de utilizarse, se usa un length
		//System.out.println(mi_array[3]);
		
		for(int i=0;i<5;i++) {
			System.out.println(mi_array[i]);
		}

	}

}
