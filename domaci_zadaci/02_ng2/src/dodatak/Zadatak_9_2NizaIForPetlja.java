package dodatak;

import java.io.*;

public class Zadatak_9_2NizaIForPetlja {
	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite prirodan broj n: ");
		int n = Integer.parseInt(ulaz.readLine());

		int[] f = new int[n + 1];
		int[] g = new int[n + 1];

		System.out.print("Zadajte vrednosti (prirodan broj) za:\nF(0) = ");
		f[0] = Integer.parseInt(ulaz.readLine());
		System.out.print("G(0) = ");
		g[0] = Integer.parseInt(ulaz.readLine());

		for (int i = 0; i < n; i++) {
			f[i + 1] = f[i] * g[i] + 3 * i - 1;
			g[i + 1] = i * i * f[i] + 2 * g[i];
		}

		System.out.println("\nRezultat:\nF(" + n + ") = " + f[n] + "\nG(" + n + ") = " + g[n]);
	}
}