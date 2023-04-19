package vezba;

import java.text.DecimalFormat;

public class Zadatak_10 {

	/* Metoda za izračunavanje f(x,y) */
	private static void fOdXY(double x, double y) {

		DecimalFormat df = new DecimalFormat("#.###");
		double f;
		if (x < y)
			f = Math.exp(x) * Math.cos(3 * y);
		else if (x == y)
			f = Math.sin(x);
		else
			f = 1 + Math.sqrt(Math.abs(x * y));
		System.out.println(df.format(x) + "\t" + df.format(y) + "\t" + df.format(f));

	}

	/* Glavni program */
	public static void main(String[] args) {

		double x, y;
		System.out.println(" X\t Y\tF(X,Y)");
		System.out.println("======================");
		for (x = 0.1; x <= 0.5; x += 0.1)
			for (y = 0.01; y <= 0.03; y += 0.01)
				fOdXY(x, y);

		/*
		 * S obzirom da je verovatno greška u postavci zadatka jer je X uvek veće od Y,
		 * uradiću još jednu tabelu sa y = 0.1 (0.1) (0.3) x = 0.1 (0.1) (0.5)
		 */
		System.out.println("\n X\t Y\tF(X,Y)");
		System.out.println("======================");
		for (x = 0.1; x <= 0.5; x += 0.1)
			for (y = 0.1; y <= 0.3f; y += 0.1) 	// y <= 0.3 ne prolazi 0.3. Ako stavim y <= 0.4, to prolazi i kroz 0.4.
												// y <= 0.3f prolazi i kroz 0.3. Rezultat se dobija bez greške.
				fOdXY(x, y);					// Može se staviti i y <= 0.301. I to radi posao. Moraću da zavirim u debuger.

	}

}
