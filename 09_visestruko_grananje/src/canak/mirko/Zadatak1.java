package canak.mirko;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/* 1. deo algoritma: Unos podataka
		 * 2. deo algoritma: Obrada podataka
		 * 3. deo algoritma: Ispisivanje vrednosti
		 */
		
		/* 1. deo algoritma */
		Scanner sc = new Scanner(System.in);
		
		int najveciBroj;
		
		System.out.println("Unesite prvi broj: ");
		int br1 = sc.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		int br2 = sc.nextInt();
		
		System.out.println("Unesite treći broj: ");
		int br3 = sc.nextInt();
		
		sc.close();
		
		/* 2. Obrada podataka
		 * 5, 2, 10
		 */
		if (br1>br2)//(br1 > br2) == true
		{
			if(br1>br3) /* (br1 > br3) == true */
			{
			najveciBroj = br1;
			}
			else
			{
				najveciBroj = br3;
			}
		}
		else
		{
			if (br2 >br3)
			{
				najveciBroj = br2;
			}
			else
			{
				najveciBroj = br3;
			}
		}
		/* Ispisivanje vrednosti */
		
		System.out.println("Najveći od unetih brojeva je: " + najveciBroj);
	}

}
