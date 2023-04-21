/* SortedMap je Interfejs u Kolekcijama. Taj interfejs nasleđuje Map Interfejs i omogućava
 * sortiranje elemenata, pa se mogu prolaziti sortirani po ključu. Klasa koja implementira
 * ovaj interfejs je TreeMap. Glavna razlika između SortedMap i obične Map-e je da su
 * elementi sortirani po ključu, a Map elementi su pohranjeni po proizvoljnom redosledu.  */


package sortedMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		// Kreiramo TreeMap koji će se sortirati po rastućoj vrednosti ključeva
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		// Dodajemo elemente
		System.out.println("Dodajemo parove elemenata...");
		sm.put(7, "Sedam");
		sm.put(9, "devet");
		sm.put(4, "četri");
		System.out.println("Štampamo: " + sm);
		
		// Čitanje elemenata
		String vrednost = sm.get(4);
		System.out.println("Vrednost ključa 4 je: " + vrednost);
		
		// Brisanje elementa
		System.out.println("Brišemo element ključa 7...");
		sm.remove(7);
		
		// Nabrajanje elemenata unapređenom for petljom
		System.out.println("\nNabrajamo elemente:");
		for(int key : sm.keySet()) {
			System.out.println("Ključ: " + key + " -> Vrednost: " + sm.get(key));
		}
		
		System.out.println("\nDodajemo još elemenata...");
		sm.put(8, "Osam");
		sm.put(2, "Dva");
		sm.put(6, "Šest");
		
		// Korišćenje iteratora nad SortedMap-om
		System.out.println("\nUvozimo Map, Set i Iterator...\nNabrajamo elemente:");
		Set<?> s = sm.entrySet();
		Iterator<?> i = s.iterator();
		while(i.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry m = (Map.Entry)i.next();
			int kljuc = (Integer)m.getKey();
			vrednost = (String)m.getValue();
			System.out.println("Ključ: " + kljuc + " -> Vrednost: " + vrednost);
		}
		
		// Izmene u Mapi se vrše prosto put() metodom
		System.out.println("\nMenjamo vrednost kod ključa 2...");
		sm.put(2, "Dvojka");
		System.out.println("Štampamo: " + sm);
		
		// Brisanje elementa
		System.out.println("\nBrišemo element pod ključem 4...");
		sm.remove(4);
		System.out.println("Štampamo: " + sm);
		
		// Nabrajanje elemenata unapređenom for petljom
		System.out.println("\nNabrajamo elemente unapređenom for petljom...");
		for(Map.Entry<Integer, String> e: sm.entrySet()) {
			int kljuc = e.getKey();
			// Pronalaženje vrednosti
			vrednost = e.getValue();
			System.out.println(kljuc + " -> " + vrednost);
		}
		
		/*TreeMap klasa koja je implementirana u Kolekcijama je implementacija SortedMap
		 * interfejsa i SortedMap nasleđuje Map interfejs. Ponaša se kao prosta Map-a uz
		 * izuzetak da čuva ključeve sortirane. TreeMap koristi "drvo" strukturu podataka.
		 * Objekti su pohranjeni i sortirani po rastućem poretku. Ali možemo ih pohraniti
		 * i po opadajućem poretku prosleđujući komparator.*/
		
		// Kreiranje Map-e gde se ključevi sortiraju po opadajućem poretku
		SortedMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		// Dodavanje elemenata
		System.out.println("\nDodajemo elemente...");
		tm.put(7, "Sedam");
		tm.put(4, "Četri");
		tm.put(11, "Jedanaest");
		tm.put(1, "Jedan");
		System.out.println("Štampamo: " + tm);
		
		// Prednosti SortedMap-a:
		// 1) SortedMap interfejs omogućuje sortiranje elemenata po ključu i koristan je
		//    kad je potrebno dobiti elemente po specifičnom redosledu.
		// 2) Pošto se elementi sortiraju možemo predvideti poredak nabrajanja elemenata
		//    pa je lakše napisati algoritam koji procesuira elemente u željenom poretku.
		// 3) Performanse pretraživanja su veoma visoke.
		
		// Mane SortedMap-a:
		// 1) Sporo upisivanje elemenata u odnosu na obične Map-e
		// 2) Ključevi u SortedMap moraju implementirati java.lang.Comparable interfejs ili
		//    korisnički Comparator mora da se navede. To može stvoriti problem ukoliko je
		//    potrebno koristiti ključeve koji ne implementiraju taj interfejs.
		
		////////////////////////////
		// SINHRONIZOVANI TreeMap //
		////////////////////////////
		
		// S obzirom da je TreeMap nesinhronizovan i samim tim nebezbedan za multi Thread
		// korišćenje isti se može eksterno sinhronizovati uz pomoć metode u primeru ispod.
		// Ovo je najbolje raditi za vreme kreiranja, da se izbegnu problemi usled pristupa
		// setu koji nije bio sinhronizovan.
		
		// Kreiranje sinhronizovane TreeMap-e
		System.out.println("\nKreiranje sinhronizovanog TreeMap-a...");
		SortedMap<Integer, String> sincTM = Collections.synchronizedSortedMap(new TreeMap<Integer, String>());
		sincTM.put(21, "Dvadesetjedan");
		System.out.println("Štampanje: " + sincTM);
		
		// Kreiranje TreeMap-e koristeći postojeću Map-u
		System.out.println("\nKreiramo novu tmc kao kopiju tm Map-e...");
		TreeMap<Integer, String> tmc = new TreeMap<>(tm);
		System.out.println("Štampamo tmc: " + tmc);
		
		
		
	}

}
