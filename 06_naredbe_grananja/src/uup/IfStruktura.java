package uup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfStruktura {
	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost za x: ");
		int x = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za y: ");
		int y = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za p: ");
		int p = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za q: ");
		int q = Integer.parseInt(ulaz.readLine());

		/*
		 * Prva varijanta int f = (p < q) ? p : q; if (y > f) f = y; if (x < f) f = x;
		 */

		/*
		 * Preko mathint f = Math.min(x, Math.max(y, Math.min(p, q)));
		 */

		/* Treća varijanta */

		int f;
		if (p < q)
			f = p;
		else
			f = q;

		if (y > f)
			f = y;
		if (x < f)
			f = x;

		System.out.println("\nVrednost funkcije f je " + f);

	}
}