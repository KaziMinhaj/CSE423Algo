
public class MidpointLine {

	public static void main(String[] args) {
		
		//initial
		int x0=0;
		int y0=2;
		
		//final point
		int x1=70;
		int y1=52;
		
		int dx,dy,incrE,incrNE, d,x,y;
		dx=x1-x0;
		dy=y1-y0;
		d=2*dy-dx;
		incrE=2*dy;
		incrNE=2*(dy-dx);
		x=x0;
		y=y0;
		System.out.println("X"+"    Y"+"    d"+"    pixel");
		
		System.out.print(x+"   "+y+"   "+d);
		
		while(x<x1) {
			if(d<=0) {
				//chose E
				System.out.println("     E");
				
				d=d+incrE;
				x=x+1;
				
				System.out.print(x+"   "+y+"   "+d);
				
			}else {
				//choose NE
				System.out.println("     NE");
				
				d=d+incrNE;
				x=x+1;
				y=y+1;
				
				System.out.print(x+"   "+y+"   "+d);
			}
		}

	}

}
