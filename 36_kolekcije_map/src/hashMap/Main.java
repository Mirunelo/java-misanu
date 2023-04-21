/*HashMap je deo Java Kolekcija od Java 1.2. Ova klasa se nalazi u java.util paketu.
 * Omogućava osnovnu implementaciju Map Interfejsa Jave. Čuva podatke u paru (Ključ/Vrednost).
 * Podacima se pristupa preko ključa. Pokušaj upisivanja duplog ključa rezultuje promenom
 * vrednosti vezane za taj ključ. Sličan je HashTable klasi, ali nije sinhronizovan.
 * Može se čuvati i null Ključ, ali samo jedan, dok možemo imati više Vrednosti koje su null.
 * Klasa ne garantuje sortiranje Map-e.*/

package hashMap;

// Da bi koristili klasu HashMap i njene metode moramo je importovati
import java.util.HashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Kreiranje prazne HashMap-e inicijalnog kapaciteta 16 i loadFactor 0.75
		HashMap<Integer, String> hm = new HashMap<>();
		
		// Kreiranje HashMap-e kapaciteta 4 (loadFactor 0.75)
		HashMap<Integer, String> hmi = new HashMap<>(4);
		
		// Kreiranje HashMap-e kapaciteta 3 i loadFactor-a 0.5
		HashMap<Integer, String> hmif = new HashMap<>(3, 0.5f);
		
		// Dodavanje elemenata
		System.out.println("Dodajemo par elemenata u Map-u...");
		hm.put(1, "jedan");
		hm.put(2, "dva");
		hm.put(3, "tri");
		
		// Štampanje veličine i sadržaja Map-e
		System.out.println("Veličina Map-e: " + hm.size() + "\n" + hm);
		
		// Promena Vrednosti radi se put() metodom
		System.out.println("Vršimo izmenu vrednosti vezanu za ključ 3...");
		hm.put(3, "trojka");
		System.out.println("Izmenjena Map-a: " + hm);
		
		// Provera da li postoji ključ i ako postoji štampamo vrednost
		System.out.println("\nProveravamo da li postoji ključ 3...");
		if(hm.containsKey(3)) {
			// Mapiranje - pristup elementu HashMap-e
			String vrednost = hm.get(3);
			
			// Štampamo vrednost datog ključa
			System.out.println("Vrednost za ključ 3 je: " + vrednost);
		}
		
		// Brisanje elementa HashMap-e
		System.out.println("Brišemo element čiji je ključ 3...");
		hm.remove(3);
		
		// Proveravamo da li smo uspešno obrisali element 3
		System.out.println("Proveravamo da li smo obrisali element 3...");
		System.out.println("Da li postoji element 3 (true/false): " + hm.containsKey(3));
		
		// Kopiranje HashMap-e hm u novoformiranu hmi clone() metodom
		System.out.println("\nKopiramo elemente hm u hmi...");
		hmi = (HashMap<Integer, String>) hm.clone();
		System.out.println("Štampanje hmi: " + hmi);
		
		// HashMap implementira Serializable, Cloneable, Map<K,V> interfejse.
		// Nasleđuje AbstractMap<K,V> klasu. Direktne potklase su LinkedHashMap i PrinterStateReasons
		
		// Osobine HashMap:
		// 1. Velika brzina pristupa
		// 2. Korišćenje hashing funkcije za mapiranje ključeva što ubrzava pristup vrednostima
		// 3. Čuva Ključ/Vrednost parove
		// 4. Podržava jedan null Ključ i bezbroj null Vrednosti
		// 5. Ne sortira se (LinkedHashMap omogućava sortiranje prilikom dodavanja elemenata)
		// 6. Omogućava duplikate Vrednosti, ali ne i Ključ-eva.
		// 7. Thread-unsafe: Ako više Thread-ova pristupa istoj HashMap-i simultano što može
		//    dovesti do nedoslednosti podataka. Ako je potrebna Thread safety koristi se
		//    ConcurrentHashMap.
		
		System.out.println("\nDodajemo elemente u hmif...");
		hmif.put(1, "jedinica");
		hmif.put(2, "dvojka");
		hmif.put(3, "trojka");
		hmif.put(4, "četvorka");
		hmif.put(5, "petica");
		hmif.put(6, "šestica");
		System.out.println("Štampamo hmif: " + hmif);
		
		// Kreiramo HashMap-u i prosleđujemo joj hmif elemente
		System.out.println("\nPravimo hmc Map-u i prosleđujemo joj elemente hmif Map-e...");
		HashMap<Integer, String> hmc = new HashMap<>(hmif);
		System.out.println("Štampamo hmc: " + hmc);
		
		// Nabrajanje elemenata unapređenom for petljom
		System.out.println("\nNabrajamo elemente hmc unapređenom for petljom...");
		for(Map.Entry<Integer, String> e : hmc.entrySet())
			System.out.println("Ključ: " + e.getKey() + " -> Vrednost: " + e.getValue());
		
		// Pojmovnik:
		// Hashing: tehnika konvertovanja velikog String-a u mali String koji predstavlja
		//          isti taj string. Kraća vrednost pomaže u indeksiranju i bržoj pretragi.
		// Inicijalni kapacitet: Kapacitet pri kreiranju.
		// Load Factor: % vrednost kapaciteta pri kojem se kapacitet uvećava 0.75 -> 75%.
		// Threshold: Proizvod inic. kapac. i load factora NPR: 16 * 0.75 = 12. Nakon 12
		//            unetih parova počinje Rehashing...
		// Rehashing: Proces dupliranja kapaciteta HashMap-e nakon dostizanja Threshold-a
		
		//////////////////////////////
		// SINHRONIZOVANA HashMap-a //
		//////////////////////////////
		
		/* Ukoliko više Thread-ova pristupa ovoj klasi simultano i bar jedan manipuliše
		 * njenom strukturom onda je neophodno da je sinhronizujemo eksterno. To se radi
		 * tako što se sinhronizuju neki objekti koji enkapsuliraju Map-u. Ukoliko takvi
		 * objekti nepostoje onda se može umotati u Collections.synchronizedMap() da se
		 * HashMap sinhronizuje i spreči slučajan nesinhronizovani pristup.*/
		
		// Kreiranje sinhronizovane Mape za multi Thread upotrebu
		Map<Integer, String> synchHashMap = Collections.synchronizedMap(new HashMap<Integer, String>());
		
		// Kreiranje Konkurentne HashMap-e
		Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();
		
		System.out.println("\nKreirali smo sinhronizovanu i konkurentnu HashMap-u...");
		synchHashMap.put(1, "Jedan");
		concurrentHashMap.put(10, "Deset");
		System.out.println("Štampamo ih:\nSync. -> " + synchHashMap + "\nConc. -> " + concurrentHashMap);
		
		// SynchronizedHashMap
		// - Sinhronizacija na Objektnom nivou
		// - Svaki upis/čitanje mora da se zaključa
		// - Zaključavanje cele kolekcije smanjuje performanse
		// - Samo jedna nit ima pristup celoj Mapi, a sve ostale su blokirane
		// - Može izazvati svađu(contention)
		// - Iteratoru pada brzina prilikom vršenja izmena u Map-i
		
		// ConcurrentHashMap
		// - Koristi se kad je neophodna veoma visoka konkurencija u projektu
		// - Thread siguran je i bez sinhronizacije cele Map-e
		// - Čitanje je vrlo brzo, a pisanje se mora zaključati
		// - Nema zaključavanja na Objektnom nivou
		// - Zaključavanje je mnogo granularnije na nivou HashMap-e
		// - ConcurrentHashMap ne baca izuzetak ConcurrentModificationException
		//   ukoliko jedan Thread pokuša da vrši izmene dok drugi Thread vrši iteracije.
		// - ConcurrentHashMap koristi mnoštvo zaključavanja
		
	}

}
