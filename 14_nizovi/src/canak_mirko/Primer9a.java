package canak_mirko;
import java.io.*;
public class Primer9a {
	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double s, s1 = 0, s2 = 0;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos dimenzije niza
		System.out.println("Unesite broj elemenata n niza x:");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Unos elemenata niza
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			}
		
		// Izračunavanje odgovarajućih suma
		for (int i = 1; i <= n; i++) { s1 += x[i] * x[i]; s2 += x[i];
		}
		
		//Izračunavanje standardne devijacije
		s = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));
		
		//Štampanje rezultata
		System.out.println("Standardna devijacija je " + s);
	}
}