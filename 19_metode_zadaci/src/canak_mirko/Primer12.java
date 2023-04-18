package canak_mirko;

import java.io.*;
import java.text.DecimalFormat;

public class Primer12 {
	public static double ugao(double x1, double x2, double y1, double y2) {
		double x = x2 - x1;
		double y = y2 - y1;
		if (x == 0)
			return 0;
		else
			return Math.atan(y / x);
	}

	public static double rastojanje(double x1, double x2, double y1, double y2) {
		double x = x2 - x1;
		double y = y2 - y1;
		return Math.sqrt((x * x) + (y * y));
	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###.##");
		
		// Unos podataka
		System.out.println("Unesite koordinatu x1: ");
		double x1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite koordinatu y1: ");
		double y1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite koordinatu x2: ");
		double x2 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite koordinatu y2: ");
		double y2 = Double.parseDouble(ulaz.readLine());
		
		// Štampanje rezultata
		System.out.println("Direkcioni ugao: "+ df.format(ugao(x1, x2, y1, y2)) + "\nRastojanje: " + df.format(rastojanje(x1, x2, y1, y2)));
		}
	}