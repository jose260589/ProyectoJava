package Practicas;

public class Arrays4 {
// arrays dimensionales
	public static void main(String[] args) {
		
		int [][] matrix=new int[4][5];
		
		//llenado de matris
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=41;
		
		for(int x=0;x<4;x++) {
			for(int z=0;z<5;z++) {
				System.out.println(matrix[x][z]);
			}
		}

	}

}