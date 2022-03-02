package otras_Practicas;

public class Vectores2{
 public static void main(String args[]){
  int numeros[] = new int[5];

  for (int i=0; i<numeros.length; i++){
  numeros[i] =i + 10;
  }

  System.out.print("[" + numeros[0] +"]");
  System.out.print("[" + numeros[1] +"]");
  System.out.print("[" + numeros[2] +"]");
  System.out.print("[" + numeros[3] +"]");
  System.out.print("[" + numeros[4] +"]");
 }
}