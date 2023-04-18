package canak.mirko;

import java.text.DecimalFormat;

public class Primer11a {
	public static void main(String[] args) {
		
		double y;
		int i = 0;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Štampanje zaglavlja
		
		System.out.println("\tR.BR.\tX\tY(X)");
		
		for (double x = 1.0; x <= 2.0; x += 0.2) {
			
			// Izračunavanje vrednosti funkcije
			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8);
			i++;
			
			// Štampanje rezultata
			
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
		}
	}
}