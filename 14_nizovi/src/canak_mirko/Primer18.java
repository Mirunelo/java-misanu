package canak_mirko;
import java.io.*;
public class Primer18 {
	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		double s = 0, s1 = 0, p = 1;
		
		// Kreiranje celobrojnog niza x
		double[] x = new double[100];
		
		// Unos vrednosti promenljive n
		System.out.print("Unesite broj elemenata n niza x: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Unos elemenata niza x
		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			}
		for (int i = 1; i <= n; i++) {
			s += x[i] * x[i];
			s1 += x[i]; p *= x[i];
			}
		s = Math.sqrt(s/n - Math.pow(s1/n, 2));
		p = Math.pow(p, 1./n);
		System.out.print("S = " + s + "\t P = " + p);
	}
}