package canak_mirko;

import java.io.*;

public class Primer6 {
	static int faktorijel(int n) {
		if (n == 0)
			return 1;
		else
			return faktorijel(n - 1) * n;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za m: ");
		int m = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		int l;
		if (m > n)
			l = faktorijel(m - n);
		else if (m == n)
			l = faktorijel(m);
		else
			l = faktorijel(n - m);
		System.out.println("Za unete vrednosti m = " + m + " i n = " + n + " dobija se " + l);
	}
}