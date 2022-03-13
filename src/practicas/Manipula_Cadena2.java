package practicas;
public class Manipula_Cadena2 {

	public static void main(String[] args) {
		
		
		
		String frase="Hoy es un estupendo día para aprender más ingles";
		
		String frase_resume=frase.substring(1, 3);
		String frase_resume2=frase.substring(10); 
		
		System.out.println(frase_resume); 
		System.out.println(frase_resume2);
		
		//equal
		
		String alumno1, alumno2;
		
		alumno1="David";
		
		alumno2="david";
		
		System.out.println(alumno1.equals(alumno2)); // Deben ser exactamente igual
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); // puede diferenciar entre mayuscula y minusculas
		
		

	}

}
