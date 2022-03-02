package otras_Practicas;

import java.util.Scanner;

public class matricesdinamicas{
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);
  int fila = 0, columna = 0, contador = 1;

  System.out.print("Digitar el valor de la fila: ");
  fila = entrada.nextInt();
  System.out.print("Digitar el valor de la columna: ");
  columna = entrada.nextInt();

  int numeros[][] = new int [fila][columna];

  for(int j = 0; j<fila; j++){
     for(int i = 0; i<columna; i++){
        numeros [j][i] = contador;
        contador++;
        System.out.print("[" +numeros[j][i] +"]");
    }
     System.out.println();   
   }
 }
}