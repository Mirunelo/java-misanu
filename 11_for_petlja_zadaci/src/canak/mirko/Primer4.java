package canak.mirko;

import java.io.*;

public class Primer4 {
	public static void main(String[] args) throws Exception {
		double suma = 0;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1; i <= n; i++)
			suma += (double) i / (i + 1); // suma = suma + (double)i / (i + 1);
		// a = a + 200;
		// a += 200;
		System.out.println("Dobijena vrednost sume je " + suma);
	}
}