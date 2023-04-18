package canak.mirko;
import java.text.DecimalFormat;
public class Primer15 {
	public static void main(String[] args) {
		// Deklarisanje podataka
		double x, y, z;
		// Inicijalizacija rednog broja
		int i = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Štampanje zaglavlja
		System.out.println("\tR.br.\tX\tY\tZ");
		for (x = 0.0; x <= 10.0; x += 1.0) {
			
			// Izračunavanje vrednosti funkcija
			y = Math.sqrt(x) + 0.2 * x - Math.pow(x, 2) /(x + 1.);
			z = y - 0.3 * Math.pow(y, 2) / (y + 1.);
			
			// Uvećanje rednog broja
			i++;
			
			// Štampanje rezultata
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(z));
		}
	}
}