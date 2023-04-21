/* ArrayList klasa je ekvivalentna klasi Vector, osim što je nesinhronizabilna
 * i Thread nebezbedna, ali je dosta brža. Predstavlja niz promenljive veličine.
 * Implementira List interfejs i sve opcione list operacije i dozvoljava sve
 * elemente uključujući i null. Nasleđuje AbstractList klasu. ArrayList se ne može
 * koristiti sa primitivnim tipovima podataka, već se moraju koristiti omotačke klase.
 * Java ArrayList omogućava nasumičan pristup listi. Duplikati elemenata su dozvoljeni.
 * Moguće je uneti i null. */

package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// Prazna lista sa podrazumevanim kapacitetom 10 mesta
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Prazna lista zadatog inicijalnog kapaciteta 5 mesta
		ArrayList<Character> ac = new ArrayList<Character>(5);
		
		// Doadavanje elemenata u liste
		for(int i = 65; i < 70; i++) {
			al.add(i);
			ac.add((char) i);			
		}
		
		System.out.println("Elementi Integer liste: " + al);
		System.out.println("Elementi Character liste: " + ac);
		
		// Lista koja sadrži elemente ( ac )
		ArrayList<Character> acl = new ArrayList<Character>(ac);
		System.out.println("Elementi liste koja sadrži kolekciju (ac): " + acl);
		
		// Dodavanje elementa na željeno mesto indeksa
		System.out.println("Dodajemo element na željeno mesto...");
		acl.add(5, 'F');
		System.out.println("Štampamo: " + acl);
		
		// Izmena elemenata
		int br = 0;
		System.out.println("Izmena elemenata...");
		for(char ch = 'a'; ch < 'g'; ch++)
			acl.set(br++, ch);
		System.out.println("Štampamo: " + acl);
		
		// Brisanje elemenata
		System.out.println("Brišemo zadnji element...");
		acl.remove(5);
		System.out.println("Štampamo: " + acl);
		
		// ArrayList Sortiranje
		System.out.println("Dodajemo element...");
		al.add(12);
		System.out.println("Štampamo listu: " + al);
		System.out.println("Sortiramo listu...");
		Collections.sort(al);
		System.out.println("Štampamo: " + al);
		
		// Iterator
		Iterator<Integer> itr = al.iterator();
		System.out.println("Štampanje elemenata pomoću iteratora...");
		while(itr.hasNext())
			System.out.print(itr.next() + ", ");
		System.out.println("\nResetujemo iterator i štampamo ponovo...");
		itr = al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + ", ");
	}

}
