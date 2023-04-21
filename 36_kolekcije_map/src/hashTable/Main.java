/* HashTable klasa implementira Hash Table, koji mapira ključeve ka vrednostima. Svaki objekat
 * koji nije null može biti ključ ili vrednost. Za uspešno pohranjivanje i korišćenje objekata
 * iz HashTable, objekti koji se koriste kao ključevi moraju implementirati hashCode metodu
 * i equals metodu. HashTable klasa je zastarela i upotreba se ne preporučuje, jer je nastala
 * pre pojave Kolekcija kad nije implementirala Map interfejs. HashTable je sinhronizovana,
 * a to znači da je sporija u odnosu na ostale implementacije Map interfejsa. */

package hashTable;

// Da bi kreirali Hashtable i omogućili nabrajanje uvozimo sledeće java.util:
import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) {

		// Kreiranje podrazumevanog Hashtable inicijalnog kapaciteta 11 i loadFactor 0.75
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		// Kreiranje Hashtable zadajući inicijalni kapacitet
		Hashtable<Integer, String> hti = new Hashtable<Integer, String>(4);
		
		// Kreiranje Hashtable inic. kapaciteta 3 i loadFactora 0.5
		Hashtable<Integer, String> htif = new Hashtable<>(3, 0.5f);
		
		// Dodavanje elemenata
		System.out.println("Dodajemo studente u Hashtable...");
		ht.put(20221234, "Petar Petrović");
		ht.put(20204321, "Mira Mirić");
		ht.put(20192468, "Milutin Milić");
		
		// Uzimanj vrednosti iz Hashtable
		String student = ht.get(20204321);
		System.out.println("Student sa brojem indeksa 20204321 zove se: " + student);
		
		// Brisanje lemenata iz Hashtable
		System.out.println("Brišemo studenta sa indeksom 20192468...");
		ht.remove(20192468);
		
		// Nabrajanje elemenata Hashtable
		Enumeration<Integer> kljucevi = ht.keys();
		while(kljucevi.hasMoreElements()) {
			int kljuc = kljucevi.nextElement();
			System.out.println("Indeks: " + kljuc + ", Student: " + ht.get(kljuc));
		}
		
		// Karakteristike Hashtable:
		// 1. Slično HashMap, ali sinhronizovano
		// 2. Hashtable čuva ključ/vrednost u Hash table
		// 3. U Hashtable mi specificiramo ključ i vrednost koju želimo da dodelimo tom ključu.
		//    Ključ se hešuje, a rezultujući hash kod je indeks sačuvane vrednosti.
		// 4. Inicijalni podrazumevani kapacitet Hashtable klase je 11 a loadFactor 0.75.
		// 5. Hashtable omogućuje ne tako brzo nabrajanje, dok u HashMap nabrajanja nema.
		
		// Hashtable implementira Serializable, Cloneable, Map<K.V> Interfejse.
		// Nasleđuje Dictionary<K.V>. Direktne potklase su: Properties i UIDefaults.
		
		System.out.println("\nUbacujemo elemente...");
		hti.put(1, "jedan");
		hti.put(2, "dva");
		hti.put(3, "tri");
		htif.put(4, "četri");
		htif.put(5, "pet");
		htif.put(6, "šest");
		System.out.println("Mapiranje hti: " + hti);
		System.out.println("Mapiranje htif: " + htif);
		
		// Kreiramo Hashtable i prosleđujemo joj elemente ( hti )
		System.out.println("\nKreiramo Hashtable i prosleđujemo mu elemente ( hti )...");
		Hashtable<Integer, String> htc = new Hashtable<>(hti);
		
		// Štampamo veličinu i sadržaj:
		System.out.println("Veličina mape htc: " + htc.size());
		System.out.println("Mapiranje htc: " + htc);
		
		// Proveravamo da li postoji ključ i ako postoji štampamo vrednost
		if(htc.containsKey(3)) {
			String vrednost = htc.get(3);
			System.out.println("Vrednost za ključ 3 je: " + vrednost);
		}
		
		// Izmene u Hashtable vrše se prostim dodavanjem sa put()
		System.out.println("\nIzmena vrednosti ključa 3...");
		htc.put(3, "trojka");
		System.out.println("Mapiranje htc: " + htc);
		
		// Brisanje elementa iz Hashtable
		System.out.println("\nBrišemo element sa ključem 3...");
		htc.remove(3);
		System.out.println("Mapiranje htc: " + htc);
		
		// Nabrajanje možemo vršiti i sa unapređenom for petljom
		System.out.println("\nDodajemo par elementata...");
		htc.put(3, "tri");
		htc.put(4, "četri");
		htc.put(5, "pet");
		System.out.println("I nabrajamo sve elemente unapređenom for petljom...");
		for(Map.Entry<Integer, String> e : htc.entrySet())
			System.out.println(e.getKey() + " -> " + e.getValue());
		
	}

}
