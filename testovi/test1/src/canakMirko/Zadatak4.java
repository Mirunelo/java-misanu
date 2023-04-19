package canakMirko;

import java.io.*;
import java.text.DecimalFormat;

public class Zadatak4 {

	public static void main(String[] args) throws Exception {

		// Unos koordinata tačaka A i B
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite koordinate tačke A:");
		System.out.print("Xa = ");
		double xa = Double.parseDouble(buff.readLine());
		System.out.print("Ya = ");
		double ya = Double.parseDouble(buff.readLine());
		System.out.println("\nUnesite koordinate tačke B:");
		System.out.print("Xb = ");
		double xb = Double.parseDouble(buff.readLine());
		System.out.print("Yb = ");
		double yb = Double.parseDouble(buff.readLine());
		
		// Izračunavanje restojanje između zadatih tačaka
		double d = Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb, 2) );
		
		// Štampanje rezultata
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\nRastojanje između tačke A i B iznosi d = " + df.format(d));
		
	}

}
