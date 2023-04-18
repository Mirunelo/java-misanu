package canak_mirko;

import java.io.*;

public class Primer12 {
	/* Definisanje funkcije */
	static int f(int x, int y, int z) {
		int f = (y < z) ? y : z;
		if (x > f)
			f = x;
		return f;
	}

	public static void main(String[] args) throws Exception {

		/* Deklarisanje podataka */
		int x, y, z;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		/* Unos podataka */
		System.out.print("Unesite vrednost za x: ");
		x = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		y = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za z: ");
		z = Integer.parseInt(ulaz.readLine());

		/* Štampanje rezultata */
		System.out.println("Dobijena vrednost izraza f je " + f(x, y, z));
	}
}