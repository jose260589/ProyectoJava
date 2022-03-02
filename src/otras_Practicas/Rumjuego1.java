//package teoria;
package otras_Practicas;
import java.util.*;

public class Rumjuego1 {

	
	public static void main(String[] args) {
		int x,y,d=0,p=0,p2=0;
		
                juego user=new juego();
		
		
		
		String m[][]=new String[15][50],z[][]=new String[15][50];
		//llenado del vector
		llenarvector(m);
		posicionastericos(m);
		user.posiciondelarrova(m);
		p=user.getp();//estos optendran la posicion inicial y total del arrova
		p2=user.getp2();
		
		
		//matriz con la k se puede ganar
		for(x=0;x<14;x++){//vector para pantalla
			System.out.println();
			for(y=0;y<49;y++){
				
				System.out.print(m[x][y]+" ");
				
			}
		}
		 
		for(x=0;x<14;x++){//vector para pantalla primer inicio
			System.out.println();
			for(y=0;y<49;y++){
				if((x==p)&&(y==p2)){
					z[p][p2]="@";
					System.out.print(z[x][y]+" ");
				}else{
					z[x][y]="9";
				System.out.print(z[x][y]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("No todos los juegos se podran ganar");
		Scanner s=new Scanner(System.in);
		System.out.println();
		while(p2!=49){
			
			
			System.out.println();
			System.out.println("Digite moviemiento (1-9)");
			String imput=s.nextLine();
			if(imput.equals("")){
			System.out.println("Digite algo ");
			}else{
				d=Integer.parseInt(imput);
			}
			if(d==1){
				
				user.uno(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==2){
				user.dos(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==3){
				user.tres(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==4){
				user.cuatro(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==6){
				user.seis(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==7){
				user.siete(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==8){
				user.ocho(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==9){
				user.nueve(p, p2);
				z[p][p2]="0";
				p=user.getp();
				p2=user.getp2();
				if(m[p][p2].equals("*")){
					System.out.println("Jugador te encontraste una mina");
					z[p][p2]="*";
					break;
				}
				//System.out.println("x "+p+" y "+p2);
				
			}else if(d==5){
				p=user.getp();
				p2=user.getp2();
				System.out.println("Usted se encuentra en la posicion "+p+","+p2);
			}
			
			for(x=0;x<14;x++){//vector para pantalla
				System.out.println();
				for(y=0;y<49;y++){
					if((x==p)&&(y==p2)){
						z[p][p2]="@";
						System.out.print(z[x][y]+" ");
					}else{
					System.out.print(z[x][y]+" ");
					}
				}
			}
			
		}
		System.out.println();
		if(user.p2==49){
			System.out.println("Ganaste");
		}else{
			for(x=0;x<14;x++){//vector para pantalla
				System.out.println();
				for(y=0;y<49;y++){
					
					System.out.print(z[x][y]+" ");
					
				}
			}
			
			System.out.println("Perdiste");
		}
	
		}
		
		
	
		//llenar el vector en la clase juego1
		public static void llenarvector(String v[][]){//
			int x,y;
			for(x=0;x<14;x++){
				//System.out.println("");
				for(y=0;y<50;y++){
					v[x][y]="null";
					//System.out.print(m[x][y]);
					
				}
			}
		}
		/*pasar el vector bombas a la clase juegos1, y provar si se puede tener los valores
		 * k contienen las bombas, para compararlos con la matriz de pantalla 
		 * o la posicion del vector*/
		public static void posicionastericos(String m[][]){//con esto se colocaran las bombas o *
			int d=0,x,y;
			while(d!=225){
				x=(int) (Math.random()*100);
				if(x<15){
					y=(int) (Math.random()*100);
					if(y<50){
				m[x][y]="*";
				d+=1;
				
					}
				}
			}			
		}
		
		

	}


