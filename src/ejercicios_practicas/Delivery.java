package ejercicios_practicas;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
		System.out.print("─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─\n"+
                      "          Menu Tipo de panes         "+
                    "\n ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─\n"+
                      "- 1. Amasado: $1.500.             \n"+
                      "- 2. Ciabatta: $1.950.           \n"+
                      "- 3. Dobladitas: $2.100.   \n"+
                      "- 4. Frica: $1.800.       \n");
		
		int monto_global=0;
		int cantglobal=0;
		int descuento=0;
		
		Scanner pedido = new Scanner(System.in); 

			System.out.print("Cantidad Pan Amasado: ");
			cantglobal=pedido.nextInt();
			if(cantglobal>0) {
				monto_global=monto_global+(cantglobal*1500);
			}
			
			System.out.print("Cantidad Pan Ciabatta: ");
			cantglobal=pedido.nextInt();
			if(cantglobal>0) {
				monto_global=monto_global+(cantglobal*1950);
			}

			System.out.print("Cantidad Pan Dobladitas: ");
			cantglobal=pedido.nextInt();
			if(cantglobal>0) {
				monto_global=monto_global+(cantglobal*2100);
			}
			
			System.out.print("Cantidad Pan frica: ");
			cantglobal=pedido.nextInt();
		
		if(cantglobal>0) {
			monto_global=monto_global+(cantglobal*1800);
		}
		
		if(monto_global>=5000) {
			System.out.print("Total Factura "+monto_global+"\n"
					+"Costo Envio: GRATIS \n"
					+"Total a Pagar es: "+monto_global);
		}else {
			descuento=(int) (monto_global*0.10);
			System.out.print("Total Factura "+monto_global+"\n"
					+"Costo Envio: "+descuento+ "\n"
					+"Total a Pagar es: "+(monto_global+descuento));
		}
	}

}
