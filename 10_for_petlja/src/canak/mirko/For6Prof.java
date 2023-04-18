package canak.mirko;

import java.util.Scanner;

public class For6Prof {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, faktorijel;
		faktorijel = 1; // 1 predstavlja neutral za mnozenje
		System.out.println("Unesite broj: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			faktorijel = faktorijel * i;
		}
		System.out.println("Faktorijel broja " + n + " iznosi: " + faktorijel);
		sc.close();
	}

}
