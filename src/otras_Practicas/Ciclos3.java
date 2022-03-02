package otras_Practicas;
public class Ciclos3{
 public static void main(String args[]){
  int i = 0, z = 0, r = 1;
  
  System.out.println("Serie con for:");
  for(i = 1; i <= 5; i++){  
     if(i < 5){
       System.out.print(z + "," + r + ",");
     }else{
       System.out.print(z + "," + r);
     }
    z = r+z;
    r = r + z;  
  }
  i = 1;
  z = 0;
  r = 1;
  System.out.println("");

  System.out.println("Serie con While: ");
  while(i <= 5){
     if(i < 5){
       System.out.print(z + "," + r + ",");
     }else{
       System.out.print(z + "," + r);
     }
    z = r+z;
    r = r + z;   
   i++;
  }
  i = 1;
  z = 0;
  r = 1;
  System.out.println("");  

  System.out.println("Serie con Do-While: ");
  do{
     if(i < 5){
       System.out.print(z + "," + r + ",");
     }else{
       System.out.print(z + "," + r);
     }
    z = r+z;
    r = r + z;  
   i++;
  }while(i <= 5);
 }
}