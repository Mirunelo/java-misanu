package uup;
import java.io.*;
import java.text.DecimalFormat;
public class Zadatak4 {

	public static void main(String[] args) throws Exception {

		// a, b, c - stranice trougla
		// s - poluobim trougla
		// p - površina trougla
		// R - poluprečnik opisanog kruga
		// r - poluprečnik upisanog kruga
		// d - rastojanje izmedju centra opisanog i upisanog kruga
		double a, b, c, s, p, R, r, d;
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podataka
		System.out.print("Unesite vrednost za a: ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za b: ");
		b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za c: ");
		c = Double.parseDouble(ulaz.readLine());
		
		// Izračunavanje vrednosti
		s = (a + b + c) / 2;
		p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		double o = a * b * c;
		R = o / (4 * p);
		r = o / (2 * R * s);
		d = Math.sqrt(R * (R - 2 * r));
		
		// Štampanje rezultata
		System.out.println("\nR = " + df.format(R) + "\tr = " + df.format(r) + "\td = " + df.format(d));

	}

}
