package canak_mirko;

import java.io.*;

public class Primer10 {
	public static void main(String[] args) throws Exception {
		double[] f = new double[1001];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite broj n: ");
		int n = Integer.parseInt(ulaz.readLine());
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++)
			f[i] = 3 * f[i - 1] - 2 * f[i - 2] + f[i - 1] * f[i - 2];
		System.out.println("F(" + n + ") = " + f[n]);
	}
}