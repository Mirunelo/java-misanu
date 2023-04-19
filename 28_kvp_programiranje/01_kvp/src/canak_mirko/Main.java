package canak_mirko;

public class Main {

	public static void main(String[] args) {
		
		/* Prilikom pokretanja Java programa, jedna programska nit odmah počinje da se izvršava.
		 * To je glavna ili inicijalna nit.
		 * 
		 * Upravljanje glavnom niti radi se preko objekta tipa Thread, pozivom metode
		 * currentThread() klase Thread.
		 */
		
		Thread t = Thread.currentThread(); //može bez ove linije, ali onda:
		
		//System.out.println("Trenutna nit: " + Thread.currentThread());
		System.out.println("Trenutna nit: " + t);

		/* getName() - vraća ime niti */
		//System.out.println("Naziv niti: " + Thread.currentThread().getName());
		System.out.println("Naziv niti: " + t.getName());
		
		/* gerPriority() - vraća prioritet niti */
		//System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());
		System.out.println("Prioritet niti: " + t.getPriority());
		
		/* [ime niti, prioritet, ime grupe kojoj pripada nit]
		 * podrazumevano ime glavne niti je main. Njen prioritet je 5, što je takođe
		 * podrazumevana vrednost.
		 * (treći parametar) main je ime grupe niti kojoj ta nit pripada.
		 * Grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom.
		 */
		
	}

}
