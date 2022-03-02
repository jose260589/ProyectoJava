package Practicas;

public class Arrays5 {

	public static void main(String[] args) {
		
		int [][] matrix= {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		for(int x=0;x<4;x++) {
			System.out.println();
			for(int z=0;z<5;z++){
				System.out.print(matrix[x][z]+" ");
			}
		}

	}

}
