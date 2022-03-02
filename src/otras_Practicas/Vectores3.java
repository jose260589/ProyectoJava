package otras_Practicas;

import java.util.Scanner;

public class Vectores3{
 public static void main(String args[]){
    
  Scanner in = new Scanner(System.in);
  int a = 0, indice = 0;
  System.out.print("Digitar el tamaño del vector: ");
    indice = in.nextInt();

  int numeros[] = new int[indice];
  
  for (int i=0; i<numeros.length; i++){
    a = 1 + i;
    System.out.print("Digitar la posicion "+ a + " del vector: ");
    numeros[i] = in.nextInt();
  }
   
for (int i=0; i<numeros.length; i++){
    System.out.print("[" + numeros[i] +"]");
  }
 }
}