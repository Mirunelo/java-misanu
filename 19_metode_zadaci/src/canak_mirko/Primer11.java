package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer11 {
	public static double[] h(int n, double x){
		double[] hermit = new double[10];
		hermit[0] = 1.0;
		hermit[1] = x;
		for (int i = 1; i <= n; i++)
			hermit[i + 1] = 2 * (x * hermit[i] - n * hermit[i - 1]);
		return hermit;
		}
	public static void main(String[] args) throws Exception {
		
		// Deklarisanje podataka
		double x;
		int n;
		double[] hermit = new double[10];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		// Unos podataka
		System.out.println("Unesite stepen polinoma n: ");
		n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost x: ");
		x = Double.parseDouble(ulaz.readLine());
		
		// Štampanje zaglavlja
		System.out.println("Stepen \t h[stepen] \n======================");
		
		// Poziv metode za izračunavanje Hermiteovih polinoma
		hermit = h(n, x);
		
		// Štampanje rezultata
		for (int i = 0; i <= n; i++)
			System.out.println(i + "\t" + df.format(hermit[i]));
		}
	}