package canak.mirko;
import java.text.DecimalFormat;
public class Primer16 {
	public static void main(String[] args) {
		
		// Deklarisanje promenljivih a i b
		double a, b;
		DecimalFormat df = new DecimalFormat("###,###0.000");
		
		// Štampanje zaglavlja
		System.out.println("\ta\tb\tcos(a) - cos(b)\t-2 * sin(a + b) / 2 * sin(a - b) / 2");
		for (a = 0.1; a <= 0.5; a += 0.1)
			for (b = 0.1; b <= 0.2; b += 0.1) {
				
				// Izračunavanje vrednosti funkcija
				double p = Math.cos(a) - Math.cos(b);
				double q = -2 * Math.sin((a + b) / 2) * Math.sin((a - b) / 2);
				
				// Štampanje izlaznog rezultata
				System.out.println("\t" + df.format(a) + "\t" + df.format(b) + "\t" + df.format(p) + "\t" + df.format(q));
			}
	}
}