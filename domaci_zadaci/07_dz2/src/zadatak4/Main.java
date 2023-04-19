package zadatak4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		// Stvaramo niz materijalnih tačaka kapaciteta 3 tačke
		NizTacaka nT = new NizTacaka(3);
		
		// Unosimo materijalne tačke dok se ne unese negativna masa
		double m = 0;
		double x, y, z;
		while(m >= 0) {
			System.out.print("Unesite koordinate materijalne tačke:\nX = ");
			x = ulaz.nextDouble();
			System.out.print("Y = ");
			y = ulaz.nextDouble();
			System.out.print("Z = ");
			z = ulaz.nextDouble();
			System.out.print("Unesite masu tačke(negativna vrednost prekida unos):\nm = ");
			m = ulaz.nextDouble();
			if(m >= 0)
				nT.dodajTacku(m, x, y, z);
		}
		
		System.out.println("\nBroj unetih tačaka: " + nT.brojTacaka());
		nT.stampajTacke();
		
		System.out.println();
		
		// Traži tačku koja najviše privlači tačku jedinične mase u koord. početku
		System.out.println(nT.fatalnaPrivlacnost(1, 0, 0, 0));
		
		ulaz.close();
		
	}

}
