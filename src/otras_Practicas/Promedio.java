package otras_Practicas;

public class Promedio{
 public static void main(String args[]){
  int Matematica = 5;
  int Biologia = 5;
  int Quimica = 7;
  int Promedio = 0;

  Promedio = (Matematica + Biologia + Quimica) / 3;
  
  if(Promedio >= 6){
   System.out.println("El Alumno Aprobo con " + Promedio); 
  }else{
   System.out.println("El Alumno Reprobo con " + Promedio); 
  }  
 }
}