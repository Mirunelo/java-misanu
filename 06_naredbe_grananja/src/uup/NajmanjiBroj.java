package uup;

import java.util.Scanner;

public class NajmanjiBroj {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		System.out.print("Unesite vrednost za c: ");
		int c = input.nextInt();
		int min = a;

		if (b < min)
			min = b;
		if (c < min)
			min = c;

		System.out.print("Najmanji broj je: " + min);

		input.close();
	}
}