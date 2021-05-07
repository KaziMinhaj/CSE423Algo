public class MidPointCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y, d;
		
		//change here
		int radius=11;
		
		
		//d = x^2 + y^2 -r^2
		//d = 1*1 + (radius-0.5)*(radius-0.5)-(radius*radius);
		  d=1-radius;
		
		x = 0;

		y = radius;
		
		
		
		System.out.println("X"+"    Y"+"    d"+"    pixel");
		
		//change here
		System.out.print((x)+"   "+(y)+"   "+d);

		

		while (x < y) {

		if (d < 0) {

		//choose E
			System.out.println("     E");

		d = d + 2*x + 3;

		x = x + 1;
		
		//change here
		System.out.print((x)+"   "+(y)+"   "+d);
		

		}

		else {

		//choose SE
			System.out.println("     SE");
		d = d + (2*x)-(2*y)+5;

		x = x + 1;

		y = y - 1;
		
		//change here
		System.out.print((x)+"   "+(y)+"   "+d);
		}



		}
	}

}