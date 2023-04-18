package canak_mirko;

import java.io.*;

public class Primer11a {
	/* Definisanje rekurzivne funkcije */
	public static int fibonaci(int i) {
		if (i <= 1)
			return i;
		else
			return fibonaci(i - 1) + fibonaci(i - 2);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		/* Unos podatka n */
		System.out.print("Unesite n = ");
		int n = Integer.parseInt(ulaz.readLine());

		/* Štampanje Fibonacijevih brojeva */
		for (int i = 1; i <= n; i++)
			System.out.print(fibonaci(i - 1) + " ");
	}
}