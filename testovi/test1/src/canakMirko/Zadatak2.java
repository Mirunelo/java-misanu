package canakMirko;

import java.io.*;
import java.text.DecimalFormat;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {

		// Unos x, y i z
		System.out.print("Unesite promenljive:");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nx: ");
		double x = Double.parseDouble(buff.readLine());
		System.out.print("y: ");
		double y = Double.parseDouble(buff.readLine());
		System.out.print("z: ");
		double z = Double.parseDouble(buff.readLine());
		
		// Računanje funkcije
		double f = (x-2*y)*(x+z)/(2*x+y);
		
		// Štampanje rezultata
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("\nVrednost funkcije f za unete promenljive je " + df.format(f));
		
	}

}
