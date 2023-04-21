/* LinkedList je deo Kolekcija u java.util paketu. Ova klasa predstavlja implementaciju
 * LinkedList strukture podataka, koja je linearna i gde se elementi pakuju kao posebni
 * objekti koji se sastoje od dva dela, podataka i adrese. Elementi su povezani uz pomoć
 * pokazivača i adresa. Svaki element je poznat kao čvor (node). LinkedList je dinamički
 * niz. Ne mora se zadavati veličina, koja se automatski povećava po potrebi. Elementi se
 * ne dodaju kontinualno. LinkedList ima duplo linkovanu strukturu podataka, tj. imaju još
 * jedan pokazivač, tzv. prethodni pokazivač. Mana LinkedList-e je što podacima ne možemo
 * pristupiti direktno, već moramo početi od početka, slediti link da bi došli do čvora
 * kojem želimo da pristupimo, što je sporo. LinkedList troši više memorije od ArrayList.
 * Prednosti su efektno dodavanje elementa u sredinu liste, zato što se menja samo link
 * između elemenata, tj. sami elementi se ne pomeraju. Prosta je iteracija u oba smera
 * zato što svaki element ima pokazivač na prethodni i sledeći.*/

package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		// Kreiranje LinkedList-e
		LinkedList<String> ls = new LinkedList<String>();
		
		// Dodavanje elemenata
		System.out.println("Dodajemo 5 elemenata...");
		for(int i = 1; i < 6; i++)
			ls.add("Broj " + i*10);
		System.out.println(ls);
		System.out.println("Dodajemo element na kraj...");
		ls.addLast("Broj 100");
		System.out.println(ls);
		System.out.println("Dodajemo element na početak...");
		ls.addFirst("Broj 0");
		System.out.println(ls);
		System.out.println("Dodajemo element sa indeksom 2...");
		ls.add(2, "Broj 15");
		System.out.println(ls);
		
		// Brisanje elemenata
		System.out.println("Brišemo element Broj 15");
		ls.remove("Broj 15");
		System.out.println(ls);
		System.out.println("Brišemo element sa indeksom 5...");
		ls.remove(5);
		System.out.println(ls);
		System.out.println("Brišemo prvi i poslednji element...");
		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
		System.out.println();
		
		// Kreiranje LinkedList-e koja sadrži Kolekciju ( ls )
		System.out.println("Kreiramo List-u koja sadrži elemente prethodne...");
		LinkedList<String> lsc = new LinkedList<String>(ls);
		System.out.println("Štampamo List-u: " + lsc);
		
		// Izmena elementa
		System.out.println("Izmenimo element sa indeksom 1...");
		lsc.set(1, "Izmena 20");
		
		// Iteriramo listu
		for(int i = 0; i < lsc.size(); i++)
			System.out.print(lsc.get(i) + ", ");
		System.out.println();
		for(String e : lsc)
			System.out.print(e + "; ");
		System.out.println();
		
		// Prebacivanje elemenata liste u niz Objekata
		System.out.println("Prebacujemo List-u u niz...");
		Object[] niz = lsc.toArray();
		System.out.println("Štampamo niz:");
		for(Object o : niz)
			System.out.print(o + " - ");
		System.out.println();
		
		// Upotreba ListIterator-a
		System.out.println("\nUpotreba ListIterator-a...");
		ListIterator<String> itr = lsc.listIterator();
		System.out.println("Štampamo listu:");
		while(itr.hasNext())
			System.out.print(itr.next() + " -> ");
		System.out.println("\nŠtampamo listu unazad:");
		while(itr.hasPrevious())
			System.out.print(itr.previous() + " <- ");
	}

}
