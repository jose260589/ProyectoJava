package poo_practicas;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1= new Coche();
		
		micoche1.estable_color("Rojo");
		micoche1.configura_climatizador("no");
		
		Furgoneta mifurgoneta1=new Furgoneta(580,7);
		
		 mifurgoneta1.estable_color("blanco");
		 mifurgoneta1.configura_asientos("si");
		 mifurgoneta1.configura_climatizador("si");
		 
		 System.out.println(micoche1.dime_datos_generales()+"\n"+micoche1.info_color());
		 
		 System.out.println(mifurgoneta1.dime_datos_generales()+"\n"+mifurgoneta1.dimeDatosFurgoneta()+
				 "\n"+mifurgoneta1.info_color());
		

	}

}
