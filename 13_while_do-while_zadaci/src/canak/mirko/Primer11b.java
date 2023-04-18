package canak.mirko;

import java.text.DecimalFormat;

public class Primer11b {
	
	public static void main(String[] args) {
		double y, x = 1.0;
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Štampanje zaglavlja
		
		System.out.println("\tR.BR.\tX\tY(X)");
		
		while (x <= 2.0) {
			
			// Izračunavanje vrednosti funkcije
			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8);
			i++;
			
			// Štampanje rezultata
			
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
			x += 0.2;
		}
	}

}