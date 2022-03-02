package otras_Practicas;

public class Operacion{
 public static void main(String args[]){
  int operacion = 4;
  int num_uno = 8;
  int num_dos = 4;
  int resultado = 0;
  
  if(operacion == 1){
   resultado = num_uno + num_dos;
   System.out.println("El Resultado de la suma es: "+resultado);
  }else if(operacion == 2){
    resultado = num_uno - num_dos;
    System.out.println("El Resultado de la resta es: "+resultado);
   } else if(operacion == 3){
      resultado = num_uno * num_dos;
      System.out.println("El Resultado de la multiplicacion es: "+resultado);
    }else if(operacion == 4){
      resultado = num_uno / num_dos;
      System.out.println("El Resultado de la Division es: "+resultado);
     } else {
        System.out.println("La opcion que elegiste no existe.");
      }

 }
}