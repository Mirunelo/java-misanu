package primeThreads;

import java.util.ArrayList;
import java.util.List;

public class DveNiti {

	// static List<Integer> prostiBrojevi = new ArrayList<Integer>();

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Program za izračunavanje prostih brojeva u zadatom intervalu upotrebom dve
		 * procesorskih niti. U intervalu od 800 hiljada do miliona za slabije računare.
		 */

		// Finalna lista prostih brojeva
		List<Integer> prostiBrojevi = new ArrayList<Integer>();

		// XXX ---> broj dodatnih niti <---XXX //
		int brNiti = 1;

		// XXX ---> parametri niti <---XXX //
		// Prva nit radi od 800.000 do 904.000, druga nastavlja do 1.000.000 //
		int[] parametar = { 800000, 904000, 1000000 };

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
		for(int j = 0; j < tn.length; j++)
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
		boolean alive = true;
		while (alive) { // -> ilustracija isAlive() metode.
			boolean test = false;
			for (int j = 0; j < tn.length; j++) {
				if (tn[j].isAlive() == false)
					continue;
				else
					test = true;
			}
			if (t.isAlive() == true || test == true)
				continue; // -> nastavi while petlju ako je neka od niti isAlive() = true
			else
				alive = false;
		}

		// dohvatamo rezultate niti i prepisujemo ih u rezultujuću listu:
		// nit koja je nasledila Thread
		for (Integer e : t.getProstiBr())
			prostiBrojevi.add(e);
		// niti koje su implementirale Runnable
		for (int j = 0; j < tn.length; j++)
			for (Integer e : nit[j].getProstiBr())
				prostiBrojevi.add(e);

		System.out.println(prostiBrojevi);
		System.out.println("Pronašli smo " + prostiBrojevi.size() + " prostih brojeva.");

		// Izračunavamo dužinu rada niti i celog programa i ispisujemo je
		timer = System.currentTimeMillis() - timer;
		System.out.println("\n\nIzvršenje niti br.1 je trajalo " + t.getTajmer() + " milisekundi.");

		for (int j = 0; j < tn.length; j++)
			System.out.println("\nIzvršenje niti br." + (j+2) + " je trajalo " + nit[j].getTajmer() + " milisekundi.");

		System.out.println("----------------------------------------------------");
		System.out.println("\nIzvršenje programa je trajalo " + timer + " milisekundi.");

	}
}
