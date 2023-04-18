package canak_mirko;

public class KonstruktorSaParametrom {
	
	/* Konstruktor sa paraetrom */

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5); /* kreiranje objekta sa paramtrom */
		
		System.out.println("Površina kruga iznosi: " + c1.area());
		
	}

}
/* Ako ne navedemo konstruktor šta će se desiti?
 * - Postavljene će biti podrazumevane vrednosti ( 0, null, false).
 */
/* Da li u konstrukotru možemo zadati početu vrednost (ne preko parametra)?
 * - Da, možemo. I to ćemo zadati u Klasi u telu konstruktora.
 */
 /* Konstruktor sa parametrom kako pozivamo?
  * - Na isti način kao i metodu sa parametrom.
  * tj. pozivamo konstruktor Klase koji inicijalizuje podatak.
  * tj. prilikom kreiranja objekta navodi se i vrednost.
  */
		 