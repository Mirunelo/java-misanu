package canak.mirko;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int zbir=0;
		System.out.println("Koliko brojeva zelite da saberete: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.print("Unesite " + i + " broj: ");
			int broj = sc.nextInt();
			zbir = zbir + broj;
		}
		System.out.println("Zbir ovih brojeva je :" + zbir);
		sc.close();
	}

}
