package canak_mirko;

import java.util.Scanner;

public class Primer11b {

	//* Rekurzivna definicija metoda */
	//public static int fibonaciRekurzivno(int n) {
	//	/* izlaz iz rekurzije */
	//	if (n == 0 || n == 1)
	//		return 1;
	//	/* rekurzivni korak */
	//	else {
	//		int n1 = fibonaciRekurzivno(n - 1);
	//		int n2 = fibonaciRekurzivno(n - 2);
	//		return n1 + n2;
	//	}
	//}
    
	public static int fibonaciRekurzivno(int i) {
		if (i == 0 || i == 1)
			return 1;
		else
			return fibonaciRekurzivno(i - 1) + fibonaciRekurzivno(i - 2);
	}
	
	/* Iterativna definicija metoda korišćenjem principa dinamičkog programiranja */
	public static int fibonaciIterativno(int n) {
		/* niz za čuvanje prvih n+1 Fibonačijevih brojeva jer indeksi počinju od 0. */
		int fibonaci[] = new int[n + 1];
		/* nulti element niza se inicijalizuje na 1 */
		fibonaci[0] = 1;
		/* ako je n bar 1, inicijalizuje se i prvi element na 1 */
		if (n >= 1)
			fibonaci[1] = 1;
		/* za svako i, 2 <= i <= n, primenjuje se rekurentna formula */
		for (int i = 2; i < n + 1; i++)
			fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];

		/* n-ti član Fibonačijevog niza je */
		/* element fibonaci[n] dobijenog niza */
		return fibonaci[n];
	}

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		/* Broj za koji se računa n-ti član Fibonačijevog niza */
		int n;
		System.out.print("Unesite ceo nenegativan broj " + " - negativan za kraj: ");
		//n = ulaz.nextInt();
		while ((n = ulaz.nextInt()) >= 0) {
			/* Rekurzivna varijanta */
			long vremePocetak = System.nanoTime();
			int fibonaciR = Primer11b.fibonaciRekurzivno(n);
			long vremeKraj = System.nanoTime();
			System.out.println("Rekurzivna varijanta:");
			System.out.println("Fibonači(" + n + ") = " + fibonaciR);
			System.out.println("Vreme: " + (vremeKraj - vremePocetak) + "ns");
			
			vremePocetak = System.nanoTime();
			int fibonaciI = Primer11b.fibonaciIterativno(n);
			vremeKraj = System.nanoTime();
			System.out.println("Iterativna varijanta:");
			System.out.println("Fibonači(" + n + ") = " + fibonaciI);
			System.out.println("Vreme: " + (vremeKraj - vremePocetak) + "ns");
			System.out.print("Unesite ceo nenegativan broj " + " - negativan za kraj: ");
		}
		ulaz.close();
	}
}