package canak.mirko;

import java.util.Scanner;

public class For13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko brojeva zelite da unesete?");
		int brojSabiraka = sc.nextInt();
		int aritSred = 0;
		int suma = 0;
		for (int i = 1; i <= brojSabiraka; i++)
		{
			System.out.println("Unesite " + i + " broj: ");
			int sabirak = sc.nextInt();
			suma = suma + sabirak;
		}
		aritSred = suma / brojSabiraka;
		System.out.println("Aritmeticka sredina brojeva iznosi: " + aritSred);
		sc.close();
	}

}
