//package teoria;
package otras_Practicas;

public class juego {
	protected int p;
	protected int p2;
	
	
	public juego(){
				int a;
}
	
	public void posiciondelarrova(String w[][]){//con esto se colocara el @ en su posicion inicial
		int x,y,d=0;
		String z;
		for(x=0;x<15;x++){
			if(d==1){
				break;
			}
			for(y=0;y<1;y++){
		z=(String) w[x][y];
				
		if(z.equals("null")){
			//x=4;
			//y=0;
			w[x][y]="@";
			this.p=x;
			this.p2=y;
			
			d=1;
			
			
		}
		}
		}
		
	}
	
	public void uno(int p,int p2){
		int x=this.p;
		int y=this.p2;
		x=x+1;
		y=y-1;
		if((x>14)||(y<0)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void dos(int p,int p2){
		int x=this.p;
		int y=this.p2;
		x=x+1;
		
		if(x>14){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void tres(int p,int p2){
		int x=this.p;
		int y=this.p2;
		x=x+1;
		y=y+1;
		
		if((x>14)||(y>49)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void cuatro(int p,int p2){
		int x=this.p;
		int y=this.p2;
		//x=x+1;
		y=y-1;
		
		if((y<0)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void seis(int p,int p2){
		int x=this.p;
		int y=this.p2;
		//x=x+1;
		y=y+1;
		
		if((y>49)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void siete(int p,int p2){
		int x=this.p;
		int y=this.p2;
		x=x-1;
		y=y-1;
		
		if((x<0)||(y<0)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void ocho(int p,int p2){
		int x=this.p;
		int y=this.p2;
		x=x-1;
		//y=y-1;
		
		if((x<0)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public void nueve(int p,int p2){
		int x=this.p;
		int y=this.p2;
		x=x-1;
		y=y+1;
		
		if((x<0)||(y>49)){
			System.out.println("movimiento no permitido");
			}else {
				this.p=x;
				this.p2=y;
			}
	}
	
	public int getp(){
		return p;
	}
	
	public int getp2(){
		return p2;
	}
	
}
	
	

