package otras_Practicas;
import java.util.Scanner;

public class Comparar{
 public static void main(String args[]){
  Scanner entrada = new Scanner(System.in);
  String nombre_uno = "", nombre_dos = "";

 System.out.print("Porfavor ingresa el primer nombre: ");
 nombre_uno = entrada.nextLine();

 System.out.print("Porfavor ingresa el segundo nombre: ");
 nombre_dos = entrada.nextLine();

 if( nombre_uno.equalsIgnoreCase(nombre_dos) ){
   System.out.println("Ambos nombres son iguales");
 }else{
  System.out.println("Los Nombres son diferentes");
 }
  
 }
}