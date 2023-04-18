package canak.mirko;

import java.util.Scanner;

public class Case6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite operand +, -, * ili / ");
		char operand = sc.next().charAt(0);
		System.out.print("\nUnesite prvi realan broj: ");
		double x = sc.nextDouble();
		System.out.print("Unesite drugi realan broj: ");
		double y = sc.nextDouble();

		sc.close();

		switch (operand) {

		case '+': {
			System.out.println("\nx + y = " + (x + y));
			break;
		}
		case '-': {
			System.out.println("\nx - y = " + (x - y));
			;
			break;
		}
		case '*': {
			System.out.println("\nx * y = " + (x * y));
			break;
		}
		case '/': {
			System.out.println("\nx / y = " + (x / y));
			break;
		}
		default: {
			System.out.println("\nPogrešno ste uneli operand!");
		}

		}

	}

}
