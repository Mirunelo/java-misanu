package canak.mirko;
import java.io.*;
public class Primer14 {
	public static void main(String[] args) throws Exception {
		
		// Inicijalizacija podataka o sumama pozitivnih i negativnih celih brojeva
		int sp = 0, sn = 0;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos podatka o celim brojevima
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unos celih brojeva: ");
		for (int i = 1; i <= n; i++) {
			// Unos celih brojeva
			System.out.println(i + ". broj");
			int m = Integer.parseInt(ulaz.readLine());
			// Izracunavanje sume
			if (m > 0)
				sp += m;
			else
				sn += m; }
		
		// Štampanje rezultata
		System.out.println("Zbir pozitivnih brojeva je " + sp + " a negativnih " + sn);
		
	}
}