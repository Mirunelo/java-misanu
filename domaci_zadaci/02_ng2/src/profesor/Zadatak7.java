package profesor;

import java.io.*;

public class Zadatak7 {

	public static void main(String[] args) throws Exception {

		double[] a = new double[100];
		double[] b = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za n:");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente niza a: ");
		for (int i = 1; i <= 2 * n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Double.parseDouble(ulaz.readLine());
		}

		for (int i = 1; i <= 2 * n; i++) {
			b[i] = 0.5 * (a[i] + a[2 * n + 1 - i]);
			System.out.print("\tb[" + i + "] = " + b[i]);
		}
	}
}
