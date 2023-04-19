package zadatak1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_01 {

	public static void main(String[] args) throws Exception {

		// 1. Napisati program koji pretvara binarni u dekadni broj.

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite binarni broj: ");
		long bin = Long.parseLong(ulaz.readLine());

		System.out.print(bin + " binarno = ");

		int b = 1;
		int s = 0;
		long bm = 0;
		while (bin != 0 && (bm == 0 || bm == 1)) {
			bm = bin % 10;
			bin /= 10;
			s += bm * b;
			b *= 2;
		}

		if (bm == 0 || bm == 1) {
			System.out.println(s + " decimalno.");
			System.out.println(
					"Provera metodom: ( " + s + " decimalni broj u binarni: " + Integer.toBinaryString(s) + " )");
		} else
			System.out.println("Pogrešno ste uneli binarni broj!");

	}

}
