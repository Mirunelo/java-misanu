package canak_mirko;

import java.io.*;

public class Primer17 {
	public static void main(String[] args) throws Exception {
		double[] f = new double[1001];
		double s;
		int i, n, broj = 0;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj izmedju 1 i 1000: ");
		broj = Integer.parseInt(ulaz.readLine());

		if (broj < 1 || broj > 1000)
			System.out.println("Greška.");
		else {
			f[1] = 0.5;
			for (n = 2; n <= broj; n++) {
				s = 0;
				for (i = 1; i <= n - 1; i++)
					s += f[i] * f[n - i];
				f[n] = s;
			}

			System.out.println("F(" + broj + ") = " + f[broj]);

		}

	}
}