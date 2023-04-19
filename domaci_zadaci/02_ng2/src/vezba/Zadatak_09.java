package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_09 {
	
	static int f0, g0;
	
	public static int racunajF(int n) {
		if (n == -1) {
			return f0;
		}
		int f_n = racunajF(n - 1);
		int g_n = racunajG(n - 1);
		return f_n * g_n + 3 * n - 1;
	}
	
	public static int racunajG(int n) {
		if (n == -1) {
			return g0;
		}
		int f_n = racunajF(n - 1);
		int g_n = racunajG(n - 1);
		return n * n * f_n + 2 * g_n;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite prirodan broj n: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.print("Zadajte vrednosti (prirodan broj) za:\nF(0) = ");
		f0 = Integer.parseInt(ulaz.readLine());
		System.out.print("G(0) = ");
		g0 = Integer.parseInt(ulaz.readLine());

		int f = racunajF(n - 1);
		System.out.println("F(" + n + ") = " + f);
	}
}