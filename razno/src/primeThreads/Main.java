package primeThreads;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Program za izračunavanje prostih brojeva u zadatom intervalu upotrebom više
		 * procesorskih niti.
		 */

		// Finalna lista prostih brojeva
		List<Integer> prostiBrojevi = new ArrayList<Integer>();

		// XXX ---> broj dodatnih niti <---XXX //
		//int brNiti = 1; // <-- XXX 2 niti XXX
		//int brNiti = 2; // <-- XXX 3 niti XXX
		int brNiti = 3; // <-- XXX 4 niti XXX
		//int brNiti = 4; // <-- XXX 5 niti XXX
		//int brNiti = 5; // <-- XXX 6 niti XXX
		//int brNiti = 6; // <-- XXX 7 niti XXX
		//int brNiti = 7; // <-- XXX 8 niti XXX
		// itd...

		// XXX ---> parametri niti <---XXX //
		// Prva nit radi od prvog parametra, ... , a zadnja do poslednjeg //
		//int[] parametar = {0, 695000, 1000000}; // <-- XXX 2 niti XXX
		//int[] parametar = { 0, 565000, 805000, 1000000 }; // <-- XXX 3 niti XXX
		int[] parametar = { 0, 490000, 695000, 860000, 1000000 }; // <-- XXX 4 niti XXX
		//int[] parametar = { 0, 435000, 620000, 765000, 890000, 1000000 }; // <-- XXX 5 niti XXX
		//int[] parametar = { 0, 400000, 570000, 700000, 810000, 910000, 1000000 }; // <-- XXX 6 niti XXX
		//int[] parametar = { 0, 365000, 525000, 650000, 750000, 840000, 925000, 1000000 }; // <-- XXX 7 niti XXX
		//int[] parametar = { 0, 335000, 480000, 597000, 702000, 784000, 862000, 930000, 1000000 }; // <-- XXX 7 niti XXX
		// itd...

		// setujemo tajmer
		long timer = System.currentTimeMillis();

		// kreiramo objekat t klase Thread1 koja nasleđuje Thread klasu
		Thread1 t = new Thread1(parametar[0], parametar[1]); // prva nit
		// možemo dodeliti ime niti
		t.setName("Nit br.1");

		// Kreiramo niz nit[]-i - koristimo klasu koja je implementirala Runnable
		Thread2[] nit = new Thread2[brNiti];
		for (int j = 0; j < parametar.length - 2; j++)
			nit[j] = new Thread2(parametar[j + 1] + 1, parametar[j + 2]);

		// Prosleđujemo naše nit[]-i Thread klasi
		Thread[] tn = new Thread[brNiti];
		for (int j = 0; j < tn.length; j++)
			tn[j] = new Thread(nit[j], "Nit br." + (j + 2));

		// Određivanje prioriteta niti (daje razočaravajuće rezultate)
		t.setPriority(5); // od 1(MAX) do 10(MIN) default je 5

		// Ispisujemo podatke o svim nitima
		System.out.println(Thread.currentThread().getName() + " program ima prioritet " + Thread.currentThread().getPriority());
		System.out.println(t + " -> " + t.getName() + " ima prioritet " + t.getPriority() + " i pripada: " + t.getClass());
		for (int j = 0; j < tn.length; j++)
			System.out.println(tn[j] + " -> " + tn[j].getName() + " ima prioritet " + tn[j].getPriority() + " i pripada: " + tn[j].getClass());

		// startujemo niti
		t.start(); // Prva nit
		for (int j = 0; j < tn.length; j++)
			tn[j].start(); // Ostale niti

		// 1. Main klasa čeka da niti završe posao
		for (int j = tn.length - 1; j >= 0; j--)
			tn[j].join();
		t.join();

		// 2. Provera da li su sve niti stvarno završile posao
		// - ilustracija isAlive() metode.
		boolean alive = true;
		while (alive) {
			boolean test = false;
			for (int j = 0; j < tn.length; j++) {
				if (tn[j].isAlive() == false)
					continue;
				else
					test = true;
			}
			if (t.isAlive() == true || test == true)
				continue; // -> nastavi while petlju ako je neka od niti isAlive() još živa
			else
				alive = false;
		}

		// Dohvatamo rezultate niti i prepisujemo ih u rezultujuću listu:

		// nit koja je nasledila Thread
		for (Integer e : t.getProstiBr())
			prostiBrojevi.add(e);

		// niti koje su implementirale Runnable
		for (int j = 0; j < tn.length; j++)
			for (Integer e : nit[j].getProstiBr())
				prostiBrojevi.add(e);

		System.out.println(prostiBrojevi);
		System.out.println("Pronašli smo " + prostiBrojevi.size() + " prostih brojeva.");

		// Izračunavamo trajanja niti i celog programa i ispisujemo ih
		timer = System.currentTimeMillis() - timer;
		System.out.println("\n\nIzvršenje niti br.1 je trajalo " + t.getTajmer() + " milisekundi.");

		for (int j = 0; j < tn.length; j++)
			System.out.println("\nIzvršenje niti br." + (j+2) + " je trajalo " + nit[j].getTajmer() + " milisekundi.");

		System.out.println("----------------------------------------------------");
		System.out.println("\nIzvršenje programa je trajalo " + timer + " milisekundi.");

	}

}
