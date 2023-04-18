package canak.mirko;

import java.text.DecimalFormat;

public class ZadatakZaVezbu_03 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00");
		
		int i = 1;
		double x, y;
		
		System.out.println("R.Br.\t  X\t Y(X)\n");
		
		for ( x = 1.0; x <= 5.0; x += 0.5 ) {
			y = x - 0.8 * x * x;
			System.out.println(" " + i++ + ".\t" + df.format(x) + "\t" + df.format(y));
		}
		
		i = 1;
		x = 1.0;
		
		System.out.println("\nR.Br.\t  X\t Y(X)\n");
		
		while ( x <= 5 ) {
			y = x - 0.8 * Math.pow(x, 2);
			System.out.println(" " + i++ + ".\t" + df.format(x) + "\t" + df.format(y));
			x += 0.5;
		}
	}

}
