package canak_mirko;

/* Pokretanje nove niti
 * Novu nit pokrećete tako što napravite instancu objekta tipa Thread.
 * To se može uraditi na dva načina:
 * 1. Implementacija interfejsa Runnable ***
 * 2. Proširivanjem klase Thread. */

/* U main klasi:
 * Nakon kreiranja klase koja implementra interfejs Runnable, potrebno je
 * napraviti instancu objekta tipa Thread.
 */

public class Main {

	public static void main(String[] args) {

		A a = new A(); // ***
		Z z = new Z();
		
		/* *****
		 * Oblik konstruktora:
		 * Thread(Runnable objekatNit, String imeNiti)
		 * objekatNit je instanca klase koja implementira interfejs Runnable.
		 * Definiše mesto gde započinje nit.
		 * 
		 * imeNiti - predstavlja ime nove niti (koje vi zadaj
		 */

		Thread t1 = new Thread(a, "Nit1");
		Thread z1 = new Thread(z, "ZetCi_1");
		Thread t2 = new Thread(a, "Nit2");
		Thread z2 = new Thread(z, "ZetCi_2");
		Thread t3 = new Thread(a, "Nit3");
		Thread z3 = new Thread(z, "ZetCi_3");

		t1.start(); /* metoda start() poziva metodu run() */
		z1.start();
		t2.start();
		z2.start();
		t3.start();
		z3.start();

	}

}
