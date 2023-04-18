package canak_mirko;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/* Ranije smo imali ArrayList, a sada imamo LinkedList */
		List<String> ll = new LinkedList<String>();

		/* Dodavanje elemenata u povezanoj listi */
		ll.add("A"); /* 0 */
		ll.add("B"); /* 1 */

		ll.add(2, "C"); /* 2 */

		System.out.println("Elementi povezane liste su: " + ll);

		/* Brisanje elementa iz povezane liste */
		ll.remove(0);
		ll.remove("B");

		System.out.println("Elementi povezane liste nakon brisanja elemenata su: " + ll);

		ll.add("D");
		ll.add("E");
		ll.add("F");
		/*
		 * Unutar interfejsa List, indeksiranje ide od 0. (ne može se indeksirati
		 * stringovnim tipom.
		 */

		System.out.println("Elementi povezane liste nakon dodavanja elemenata su: " + ll);

		/* Traženje elemenata u povezanoj listi */
		boolean sadrzi = ll.contains("E");
		if (sadrzi)
			System.out.println("Lista sadrži element E.");
		else
			System.out.println("Lista ne sadrži element E.");

		/* Pristupanje(uzimanje) vrednosti elementa iz povezane liste */
		Object element = ll.get(3); /* Object je super klasa iz koje su izvedene sve ostale klase */
		System.out.println("Zatražen element je: " + element);

		/* Postavljanje vrednosti elementa u povezanoj listi */
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon dodavanja stringa Z na mesto 1 izgleda ovako: " + ll);
		

	}

}
