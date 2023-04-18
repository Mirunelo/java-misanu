package canak.mirko;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

		double P = 1.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost za n: ");
		double n = input.nextDouble();
		for (double i = 1; i <= n; i++)
			P = P * (1 - 1 / (i + 1));
		System.out.println(P);
		input.close();
		}

}