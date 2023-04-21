/* Vektori su tu od jdk 1.0. Vektor je tip List-e koji predstavlja dinamički niz
 * kojem se automatski povećava kapacitet kad se popuni za 100%.
 * Podrazumevano se kreira sa 10 mesta.
 * Vektori su sinhronizabilni - Thread bezbedni za razliku od ArrayList-a,
 * ali su sporiji od njih.
 * Vektori sadrže mnoge stare metode koje nisu deo Kolekcija.
 * Takođe implementiraju List interfejs i sadrže sve metode Kolekcija. */

package vektori;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		// Kreira podrazumevani vektor inicijalnog kapaciteta 10
		Vector<Integer> vi = new Vector<Integer>();
		System.out.println("Kapacitet default Vector-a: " + vi.capacity());
		System.out.println("Dodajemo 10 elemenata...");
		for (int i = 0; i < 10; i++)
			vi.add(i);
		System.out.println(vi);
		System.out.println("Kapacitet nakon dodatih 10 elemenata: " + vi.capacity());
		System.out.println("Dodajemo još jedan element...");
		vi.add(10);
		System.out.println(vi);
		System.out.println("Kapacitet nakon prekoračenja inicijalnog kapaciteta +100%: " + vi.capacity());
		System.out.println();

		// Kreira vektor zadatog inicijalnog kapaciteta 4
		Vector<Character> vc = new Vector<Character>(4);
		System.out.println("Kapacitet Vector-a: " + vc.capacity());
		System.out.println("Dodajemo 5 elemenata...");
		for (char ch = 'a'; ch < 'f'; ch++)
			vc.add(ch);
		System.out.println(vc);
		System.out.println("Kapacitet nakon dodatih 5 elemenata +100%: " + vc.capacity());
		System.out.println();

		// Kreira vektor zadatog inicijalnog kapaciteta 3
		// i kad se popuni, kapacitet se povećava za 2
		Vector<String> vs = new Vector<String>(3, 2);
		System.out.println("Kapacitet Vector-a: " + vs.capacity());
		System.out.println("Dodajemo 4 elemenata...");
		for (int i = 1; i < 5; i++)
			vs.add("Broj " + i);
		System.out.println(vs);
		System.out.println("Kapacitet nakon dodatih 4 elementa (zadato +2): " + vs.capacity());
		System.out.println("Dodajemo još 10 elemenata...");
		for (int i = 5; i < 11; i++)
			vs.addElement("Broj " + i);
		System.out.println(vs);
		System.out.println("Kapacitet nakon dodatih 6 novih elementa: " + vs.capacity());
		System.out.println();

		// Kreira vektor koji sadrži elemente kolekcije ( vs )
		Vector<String> vcs = new Vector<String>(vs);
		System.out.println("Vektor koji sadrži elemente prethodnog vektora: ");
		for (String str : vcs)
			System.out.print(str + ", ");

		// Brisanje elementa zadatog indeksa
		System.out.println("\nBrišemo element sa indeksom 3...");
		vcs.removeElement(3);

		// Iteriramo kroz Vektorske elemente for petljom
		for (int i = 0; i < vcs.size(); i++)
			System.out.print(vcs.get(i) + ", ");

		// Zamena elemenata
		System.out.println("\nMenjamo objekat " + vcs.set(3, "Zamena 5"));
		System.out.println("Nakon zamene: " + vcs);

		// Dodajemo element na željenu poziciju indeksa
		vcs.insertElementAt("Dodaj 0", 0);
		System.out.println("Nakon dodavanja: " + vcs);

		// Brisanje elemenata
		System.out.println("Brišemo element " + vcs.remove(3));
		System.out.println("Brišemo element " + vcs.get(7));
		vcs.removeElementAt(7);
		System.out.println("Nakon brisanja: " + vcs);

	}

}
