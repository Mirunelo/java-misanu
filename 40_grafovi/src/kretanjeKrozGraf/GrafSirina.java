/* BFS metoda koristi red za odlaganje čvorova Grafa.
 * Ovde se prolaze čvorovi po širini. To znači po nivoima.
 * Kad istražimo sve čvorove na jednom nivou, prelazimo na sledeći.
 * */
package kretanjeKrozGraf;

import java.util.LinkedList;
import java.util.ListIterator;

public class GrafSirina {

	private int cvorovi; // Broj čvorova
	private LinkedList<Integer> sused_lista[]; // Lista suseda

	// Konstruktor: Inicijalizuje listu suseda po broju čvorova c
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GrafSirina(int c) {
		cvorovi = c;
		sused_lista = new LinkedList[c];
		for (int i = 0; i < c; ++i) // Kreiraj listu suseda
			sused_lista[i] = new LinkedList();
	}

	// Dodaj granu u Graf
	void addEdge(int c, int g) {
		sused_lista[c].add(g); // Dodaj granu čvoru u listi suseda.
	}

	// BFS kretanje od korenskog čvora
	void BFS(int koren_cvor) {
		// Inicijalno ni jedan čvor nije posećen
		boolean posecen[] = new boolean[cvorovi];

		// BFS red
		LinkedList<Integer> red = new LinkedList<Integer>();

		// trenutni čvor = posećen, ubaci ga u red
		posecen[koren_cvor] = true;
		red.add(koren_cvor);

		while (red.size() != 0) {
			// izbaci element iz reda i procesuiraj ga
			koren_cvor = red.poll();
			System.out.print(koren_cvor + " ");

			// nađi sve susedne čvorove trenutnog čvora i procesuiraj ih
			ListIterator<Integer> i = sused_lista[koren_cvor].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!posecen[n]) {
					posecen[n] = true;
					red.add(n);
				}

			}

		}

	}

}