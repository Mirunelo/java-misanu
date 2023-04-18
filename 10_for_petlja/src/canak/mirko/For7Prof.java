package canak.mirko;

import java.util.Scanner;

public class For7Prof {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m, n;
		int suma = 0;
		System.out.println("Unesite prvi broj: ");
		m = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= m; ++i)
		{
			suma = suma + n*(n+i*m);
		}
		System.out.println(suma);
	}

}
