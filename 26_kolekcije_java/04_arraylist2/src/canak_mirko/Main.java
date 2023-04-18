package canak_mirko;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> kolekcija = new ArrayList<String>();
		
		/* Meoda u okviru List:
		 * size() - vraća broj elemenata smeštenih u kolekciji ArrayList*/
		System.out.println("Početna dužina: " + kolekcija.size());
		
		/* Meoda u okviru List:
		 * add() - dodaje element na kraj kolekcije */
		kolekcija.add("Prvi"); /* 0 */
		kolekcija.add("Drugi"); /* 1 */
		kolekcija.add("Treći"); /* 2 */
		kolekcija.add("Četvrti"); /* 3 */
		
		/* Prolazak kroz kolekciju */
		for(String s : kolekcija) {
			System.out.println((s));
		}
			
		
		System.out.println("\nTrenutna dužina: " + kolekcija.size());
		
		/* provera da li se neki zadati element nalazi unutar kolekcije
		 * contains - vraća true ako kolekcija sadrži traženi element, odnosno
		 * vraća false ukoliko kolekcija ne sadrži traženi element.
		 */
		
		boolean sadrzi = kolekcija.contains("Treći"); /* true ili false */
		
		if(sadrzi /* == true */ ) { /* sadrzi == true */
			System.out.println("Traženi element se nalazi u zadatoj kolekciji!");
		}
		else {
			System.out.println("Traženi element se ne nalazi u zadatoj kolekciji!");
		}
		
		/* get() - vraća element sa zadatim indeksom */
		String element = kolekcija.get(2);
		System.out.println("Element sa indeksom 2 u kolekciji je: " + element);
		
		/* indexOf - vraća indeks prve pojave zadatog elementa kolekcije
		 * vratiće -1 ukoliko traženi element ne postoji */
		int pozicija = kolekcija.indexOf("Drugi");
		System.out.println("Element \"Drugi\" je na poziciji: " + pozicija);
		
		/* toArray - služi za prebacivanje elemenata u niz */
		String[] nizString = new String[kolekcija.size()];
		kolekcija.toArray(nizString);
		
		/* Prolazak kroz niz */
		for(String s : nizString)
			System.out.printf("%s ", s);
		
		/* remove - briše prvu pojavu zadate vrednosti */
		kolekcija.remove("Treći");
		System.out.println("\nKolekcija nakon uklanjanja elementa \"Treći\": ");
		for(String s : kolekcija)
			System.out.printf("%s " , s);
		
		/* clear - briše sve elemente iz zadate kolekcije */
		kolekcija.clear();
		System.out.println("\nVeličina kolekcije nakon brisanja: " + kolekcija.size());
			
	}

}
