package uup;

import java.util.Scanner;

public class ReciprocnaVrednost {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		System.out.print("Unesite vrednost za c: ");
		int c = input.nextInt();
		double r = 0;
		double min = a;

		if (b < min)
			min = b;
		if (c < min)
			min = c;

		System.out.println("Najmanji broj je " + min);

		if (min == 0)
			r = 3;
		else
			r = 1 / min;

		System.out.println("r = " + r);

		input.close();
	}
}