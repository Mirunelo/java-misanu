package canak_mirko;
import java.io.*;
public class Primer9 {
	// Definisanje funkcije
	static double t(double z) {
		if (z <= 0) return z + 2;
		else if (z > 1) return z;
		else return Math.exp(z);
		}
	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos dimenzije niza x
		System.out.println("Unesite dimenziju n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			}
		//Štampanje zaglavlja
		System.out.println("\tR.BR.\tX\tY");
		for (int i = 1; i <= n; i++) {
			//Izračunavanje vrednosti funkcije
			double y = t(x[i] + 2) + 1.4 * t(Math.pow(x[i], 2) - 1);
			
			//Štampanje rezultata
			System.out.println("\t" + i + "\t" + x[i] + "\t" + y);
		}
	}
}