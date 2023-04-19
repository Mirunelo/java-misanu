package profesor;

import java.io.*;

public class Zadatak9 {
	public static void main(String[] args) throws Exception {

		double[] f = new double[100];
		double[] g = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za n:");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite vrednost za F(0):");
		f[1] = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za G(0):");
		g[1] = Double.parseDouble(ulaz.readLine());

		for (int i = 0; i <= n; i++) {
			f[i + 1] = f[i] * g[i] + 3 * n - 1;
			g[i + 1] = n * n * f[i] + 2 * g[i];
		}
		System.out.println("Unesite vrednost za F(" + n + ") = " + f[n]);
	}

}
