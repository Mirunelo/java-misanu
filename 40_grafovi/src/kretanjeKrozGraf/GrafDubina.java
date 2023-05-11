/* Depth-First Traversal (DFS) ili pretraživanje po dubini je tehnika koja startuje
 * sa korenskim čvorom, a zatim prolazi susednim čvorovima idući sve dublje u Graf.
 * Čvorovi se prolaze dok ne bude više dete čvorova za ispitivanje. Nakon toga DFS
 * se vraća na sledeći čvor i prolazi ponovo u dubinu. DFS koristi Stek strukturu
 * podataka da skladišti čvorove koji se prolaze.
 * */
package kretanjeKrozGraf;

import java.util.LinkedList;
import java.util.ListIterator;

public class GrafDubina {

	private int cvorovi; // Broj čvorova

	// Deklaracije liste suseda
	private LinkedList<Integer> sused_lista[];

	// Konstruktor: Inicijalizuje listu suseda po broju čvorova c
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GrafDubina(int c) {
		cvorovi = c;
		sused_lista = new LinkedList[c];
		for (int i = 0; i < c; ++i)
			sused_lista[i] = new LinkedList();
	}

	// Dodaj granu u Graf
	void addEdge(int c, int g) {
		sused_lista[c].add(g); // Dodaj granu čvoru u listi suseda.
	}

	// Pomoćna funkcija za DFS tehniku
	void DFS_pomocnik(int c, boolean posecen[]) {
		// Trenutni čvor je posećen
		posecen[c] = true;
		System.out.print(c + " ");

		// Obrađuj sve susedne čvorove
		ListIterator<Integer> i = sused_lista[c].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!posecen[n])
				DFS_pomocnik(n, posecen);
		}

	}

	void DFS(int c) {
		// Inicijalno ni jedan čvor nije posećen
		boolean posecen[] = new boolean[cvorovi];

		// Pozovi rekurzivnu moeodu DFS_pomocnik za DFS metodu
		DFS_pomocnik(c, posecen);
	}

}