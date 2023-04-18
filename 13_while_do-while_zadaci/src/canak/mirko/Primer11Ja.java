package canak.mirko;

public class Primer11Ja {

	public static void main(String[] args) {
		
		int i=1;
		double x, y;
		
		System.out.println("R.BR.\tX\tY(X)");
		
		for( x = 1; x <= 2 ;x += 0.2) {
			y = x + 2.5 * Math.pow(x,3)/(x - 2.8);
			System.out.println(i + "\t" + x + "\t" + y);
			i++;
		}
				
	}

}
