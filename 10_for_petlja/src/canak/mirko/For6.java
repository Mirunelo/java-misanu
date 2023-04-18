package canak.mirko;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int faktorijel = 1;
		System.out.print("Unesite prirodan broj: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; ++i) {
			faktorijel = faktorijel * i;
		}
		System.out.println("Faktorijel unetog broja iznosi: " + faktorijel);
		sc.close();
	}

}
