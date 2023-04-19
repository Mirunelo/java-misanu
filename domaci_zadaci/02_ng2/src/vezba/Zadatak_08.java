package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak_08 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.0####");
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		double[] x = new double[n + 1];
		double[] f = new double[n + 1];
		System.out.println("Unesite parove vrednosti x[k] i f[k]:");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("f[" + i + "] = ");
			f[i] = Double.parseDouble(ulaz.readLine());
		}

		/*
		 * Na predavanju su koeficijenti rešavani metodom, ali pošto u ovom zadatku to
		 * nije traženo...
		 */

		double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		for (int i = 0; i < n; i++) {
			s1 += Math.log10(x[i]);
			s2 += Math.log10(f[i]);
			s3 += Math.log10(x[i]) * Math.log10(f[i]);
			s4 += Math.pow(Math.log10(x[i]), 2);
		}

		/* Izračunavanje koeficijenta b1 */
		double b1 = (s1 * s2 - n * s3) / (s1 * s1 - n * s4);

		/* Izračunavanje koeficijenta b0 */
		double b0 = Math.pow(10, (s2 - b1 * s4) / n);

		double y = 0;
		System.out.println("\nIzračunati koeficijenti glase:\n\u03B2\u2081 = " + df.format(b1) + "\t\u03B2\u2080 = "
				+ df.format(b0));
		System.out.println("\n X\t\t Y(X)\n=======================");
		/*
		 * float sam morao da upotrebim da bi mi iteracija prošla i kroz poslednju
		 * vrednost. Double mi pravi probleme za neke vrednosti poslednje unetog x[k].
		 * Recimo za x poslednje 3.5 izbaci mi tabelu do 3.4 bez obzira da li sam
		 * koristio <= ili <. Videću u debageru šta se tu dešava. Pratim vrednosti
		 * promenljivih pa vidim.
		 */
		for (float d = (float) x[0]; d <= x[n - 1]; d += 0.1) {
			y = b0 * Math.pow(d, b1);
			System.out.println(df.format(d) + "\t\t" + df.format(y));
		}

		/*
		 * Ne znam da li sam skroz dobro razumeo zadatak? To je jedan od zadataka koji
		 * sam pokazivao kolegama na poslu, kad me pitaju kako mi ide škola. Kažem
		 * kolegama: "Evo, upravo rešavam ovaj zadatak.".
		 */

	}

}