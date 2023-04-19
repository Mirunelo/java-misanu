package zadatak_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// VALJAK:
		System.out.print("Stvaramo valjak...\nUnesite poluprecnik r: ");
		double r = sc.nextDouble();
		System.out.print("Unesite visinu valjka: ");
		double h = sc.nextDouble();
		
		Valjak v1 = new Valjak(r, h);
		
		// Dohvatanje poluprečnika i visine
		System.out.println("Poluprečnik valjka iznosi: " + v1.getR());
		System.out.println("Visina valjka iznosi: " + v1.getH());
		
		// Izračunavanje zapremine valjka
		System.out.println("Zapremina valjka iznosi " + v1.zapremina(r, h));
		
		// Tekstualni opis valjka
		System.out.println("Geometrijsko telo je" + v1.opis());
		
		// KANTA:
		System.out.print("Stvaramo kantu...\nUnesite poluprecnik r: ");
		r = sc.nextDouble();
		System.out.print("Unesite visinu kante: ");
		h = sc.nextDouble();
		System.out.println("Unesite popunjenost, maksimalno " + (Math.PI * r * r * h));
		double p = sc.nextDouble();
		
		Kanta k1 = new Kanta(r, h, p);
		
		// Dohvatanje količine tečnosti u kanti
		System.out.println("Kanta je napunjena sa " + k1.getPopunjenost() + " tečnosti.");
		// Određivanje koliko još može da se dolije
		System.out.println("U kantu možemo sipati još " + k1.moguDoliti() + " tecnosti.");
		// Ispitivanje da li je kanta skroz puna ili skroz prazna
		k1.ispitivanjeKante();
		// Dodavanje određene količine tečnosti
		System.out.print("Koliko tečnosti želite da dodate: ");
		p = sc.nextDouble();
		k1.dolivanjeTecnosti(p);
		// Odlivanje određene količine tečnosti
		System.out.print("Koliko tečnosti želite da odlijete: ");
		p = sc.nextDouble();
		k1.odlivanjeTecnosti(p);
		// Presipanje moguće najveće količine tečnosti iz jedne kante u drugu
		// Pravimo drugu kantu
		System.out.print("Unesite poluprecnik r: ");
		r = sc.nextDouble();
		System.out.print("Unesite visinu kante: ");
		h = sc.nextDouble();
		System.out.println("Unesite popunjenost, maksimalno " + (Math.PI * r * r * h));
		p = sc.nextDouble();
		
		Kanta k2 = new Kanta(r, h, p);
		
		System.out.println("U drugu kantu možete dodati maksimalno " + k2.moguDoliti() + " tečnosti");
		
		System.out.print("Koliko želite presuti tečnosti iz kante 1 u kantu 2: ");
		double presip = sc.nextDouble();
		k1.presipanjeTecnosti(k2, presip);
		
		// Tekstualni opis kanti:
		System.out.println("Kanta 1: " + k1.opis());
		System.out.println("Kanta 2: " + k2.opis());
		sc.close();
		
	}
	
}
