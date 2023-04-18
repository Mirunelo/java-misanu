package canak.mirko;

import java.util.Scanner;

public class For14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int parni = 0;
		
		System.out.println("Koliko brojeva zelite da unesete?");
		
		int x = sc.nextInt();
		
		for (int i = 1; i<= x; i++)
		{
			System.out.println("unesite " + i + " . broj ");
			int broj = sc.nextInt();
			if (broj%2==0)
			{
				++parni;
				suma = suma + broj;
			}
		}
		double sredina = (double) suma/parni;
		System.out.println("Aritmetička sredina unetih brojeva iznosi: " + sredina);
		sc.close();
		
	}

}
