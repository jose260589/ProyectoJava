package otras_Practicas;

import java.util.Scanner;

public class Vacaciones{
 public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  String nombre = "";
  int clave = 0, antiguedad = 0;

   System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
   
   System.out.println("Cual es el nombre del trabajador?");
   nombre = in.nextLine();

   System.out.println("Cuantos años de servicio tiene el trabajador?");
   antiguedad = in.nextInt();

   System.out.println("Cual es la clave de su departamento?");
   clave = in.nextInt();

   if(clave == 1){
     if(antiguedad == 1){
        System.out.println(nombre+", derecho a 6 días.");
     }else if(antiguedad >=2 && antiguedad <=6){
             System.out.println(nombre+", derecho a 14 días");
      }else if(antiguedad == 7){
              System.out.println(nombre+", derecho a 20 días");
       }else{
            System.out.println(nombre+", aun no tiene derecho a vacaciones");
       }
   }else if(clave == 2){
            if(antiguedad == 1){
              System.out.println(nombre+", derecho a 7 días.");
            }else if(antiguedad >=2 && antiguedad <=6){
                    System.out.println(nombre+", derecho a 15 días");
                  }else if(antiguedad == 7){
                          System.out.println(nombre+", derecho a 22 días");
                   }else {
                         System.out.println(nombre+", aun no tiene derecho a vacaciones");
                   }
   }else if(clave == 3){
            if(antiguedad == 1){
              System.out.println(nombre+", derecho a 10 días.");
            }else if(antiguedad >=2 && antiguedad <=6){
                    System.out.println(nombre+", derecho a 20 días");
            }else if(antiguedad == 7){
                    System.out.println(nombre+", derecho a 30 días");
            } else {
                   System.out.println(nombre+", aun no tiene derecho a vacaciones");
            }
   } else {
          System.out.println("Error Clave del departamento no existe");
          }



 }
}