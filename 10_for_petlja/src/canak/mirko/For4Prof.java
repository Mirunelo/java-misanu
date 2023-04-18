package canak.mirko;

import java.util.Scanner;

public class For4Prof {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko brojeva zelite da saberete? ");
		int brojSabiraka = sc.nextInt();
		
		int zbir = 0;
		for(int i = 1; i <=brojSabiraka; i++)
		{
			System.out.println("Unesite " + i + " broj: ");
			int sabirak = sc.nextInt();
			zbir = zbir + sabirak;
		}
		System.out.println("Zbir brojeva iznosi: " + zbir);
		sc.close();
	}

}
