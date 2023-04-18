package canak_mirko;

import java.util.Scanner;

public class DefaultConstructorPrikaz {
	
	/* Defaut konstruktor */
	static double f;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Circle c1 = new Circle(); /* kreiranje objekta tada se poziva kostruktor.
		Konstruktor inicijalizuje ( u našem primeru ) vrednost poluprečnik na 10 */
		
		System.out.println("Površina kruga je " + c1.area());
		
		System.out.print("\nUnesite poluprečnik kruga: ");
		double r = sc.nextDouble();
		sc.close();
		
		c1.setPoluprecnik(r); /* Postavljanje setera poluprečnika */
		
		System.out.println("Nova površina kruga za poluprečnik: " + c1.getPoluprecnik() + " iznosi: " + c1.area());
		System.out.println(f);
		
	}

}
/*
 * Ključnom rečju new se kreira nova instanca klase Circle,
 * pri čemu se objekat inicijalizuje podrazumevanim vrednostima.
 * 
 * Ukoliko želimo da se inicijalizacija izvrši nekim drugim vrednostima
 * koje bismo mi definisali, potrebno je realizaciji
 * klase dodati još jedan metod - konstruktor klase.
 * Konstruktor klase je specijalna metoda koja se koristi samo pri kreiranju objekta,
 * da postavi početne vrednosti objekta
 * tj. da inicijalizuje objekat.
 */
/* Za konstruktor vazi sledece:
 * * - konstruktor mora imati isto ime kao i klasa
 * * - konstruktor moze imati i parametre
 * * - konstruktor ne vraca vrednosti, cak se ne moze deklarisati ni kao void
 * * - konstruktor je javna metoda
 */
/* Ukoliko realizacija klase ne ukljucuje kostruktor klase,
 * kompajler obezbedjuje tzv. podrazumevani konstruktor, tj. defaultni konstruktor,
 * * koji nema parametara, i koji podacima objekata daje podrazumevane vrednosti.
 */

/* Podaci klase imaju podrazumevane početne vrednosti,
 * koje su za primitivne tipove byte, char, short, int long, float,
 * i double jednake 0, za tip boolean je false.
 * Za referencijske tipove vrednost je null.
 */