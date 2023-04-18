package canak.mirko;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prirodan broj m: ");
		int m = sc.nextInt();
		System.out.print("Unesite prirodan broj n: ");
		int n = sc.nextInt();
		int s = n * (n+m);
		sc.close();
		
		for(int i = 2; i <= m; i++)
		{
			s += n * (n + i * m);
		}
		System.out.println("Rezultat S = " + s);
	}

}
