package zadatak_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak04_drugacije {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Koliko brojeva želite da unesete u niz: ");
		int n = Integer.parseInt(ulaz.readLine());

		int[] niz = new int[n];
		System.out.println("Unesite brojeve:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print((i + 1) + ". -> ");
			niz[i] = Integer.parseInt(ulaz.readLine());
		}

		int s = 0;
		for (int i : niz)
			if (i % 2 == 0)
				s++;

		System.out.println("Niz sadrži:");
		System.out.println("- parnih brojeva:   " + s);
		System.out.println("- neparnih brojeva: " + (niz.length - s));
		
	}

}
