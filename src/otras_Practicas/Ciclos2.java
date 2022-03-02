package otras_Practicas;
public class Ciclos2{
 public static void main(String args[]){
  int i = 0, z = 100;
  
  System.out.println("Serie con for:");
  for(i = 1; i <= 5; i++){
     z =z - 1;
     if(i < 5){
       System.out.print(i + "," + z + ",");
     }else{
       System.out.print(i + "," +z);
     }
  }
  i = 1;
  z = 100;
  System.out.println("");

  System.out.println("Serie con While: ");
  while(i <= 5){
      z =z - 1;
      if(i < 5){
       System.out.print(i + "," + z + ",");
     }else{
       System.out.print(i + "," +z);
     }
   i++;
  }
  i = 1;
  z = 100;
  System.out.println("");  

  System.out.println("Serie con Do-While: ");
  do{
   z =z - 1;
   if(i < 5){
       System.out.print(i + "," + z + ",");
     }else{
       System.out.print(i + "," +z);
     }
   i++;
  }while(i <= 5);
 }
}