package canak.mirko;
import java.text.DecimalFormat;
public class Primer15a {
	public static void main(String[] args) {
		double y;
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Štampanje zaglavlja
		System.out.println("\tR.BR.\tX\tY(X)");
		for (double x = 1.0; x <= 10.0; x += 0.5) {
			
			// Izračunavanje vrednosti funkcije
			y = x - 0.3 * Math.pow(x, 2) / (x + 1.2); i++;
			
			// Štampanje rezultata
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
		}
	}
}