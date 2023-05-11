/*Da bi izvršili smislenu aktivnost kao što je pretraga da li neki podatak postoji,
 * mi moramo da prođemo Graf, tj. sve njegove čvorove i grane barem jednom. To se
 * radi uz pomoć algoritama koji nam pomažu da prolazimo kroz Graf i vršimo pretragu.
 * 
 * Postoje dva algoritma u Java programskom jeziku:
 * 1. BFS - pretraga po širini
 * 2. DFS - pretraga po dubini*/ 

package kretanjeKrozGraf;

public class Main {

	public static void main(String[] args) {

		///////////////////////////////
		//  Pretraživanje po širini  //
		//       BFS Algoritam       //
		///////////////////////////////

		/* BFS metoda koristi red za odlaganje čvorova Grafa.
		 * Ovde se prolaze čvorovi po širini. To znači po nivoima.
		 * Kad istražimo sve čvorove na jednom nivou, prelazimo na sledeći.
		 * 
		 *  Aplikacije koje koriste BFS:
		 *  1) Đubretar: Čejni algoritam koristi BFS tehniku da kopira kolekcije smeća.
		 *  2) Emitovanje u mreži: emitovanje paketa u mreži vrši se BFS tehnikom.
		 *  3) GPS navigacija: BFS pronalazi susedni čvor dok se navigiramo sa GPS.
		 *  4) Socijalne mreže: BFS pronalazi mrežu ljudi koja okružuje određenu ličnost.
		 *  5) U Grafovima koji ne koriste težine BFS tehnika se koristi da nađe minimalno
		 *     razgranato stablo i najkraću putanju između čvorova.*/
		
		// Kreiraj Graf od 5 čvorova
		GrafSirina gs = new GrafSirina(5);

		// Dodaj grane Grafu
		gs.addEdge(0, 1);
		gs.addEdge(0, 2);
		gs.addEdge(0, 3);
		gs.addEdge(1, 2);
		gs.addEdge(2, 4);

		// Štampaj sekvencu BFS kretanja kroz Graf
		System.out.println("Pretraga Grafa po širini BFS\n(sa 0 kao startnim čvorom):");
		gs.BFS(0);
		System.out.println("\n");

		///////////////////////////////
		//  Pretraživanje po dubini  //
		//       DFS Algoritam       //
		///////////////////////////////
		
		/* DFS tehnika startuje u korenskom čvoru i prolazi susedne čvorove idući
		 * sve dublje u Graf. Čvorovi se prolaze po dubini dok se ne dođe do poslednjeg
		 * čvora deteta koje treba istražiti. Kada se to desi DFS se vraća na početak i
		 * startuje od sledećeg čvora i prolazi čvorove po dubini. DFS koristi stek
		 * strukturu za čuvanje čvorova koji se prolaze.
		 * 
		 *  Aplikacije koje koriste DFS:
		 *  1) Detekcija ciklusa u Grafu.
		 *  2) Pronalaženje puta između dva zadata čvora.
		 *  3) U Grafovima koji nemaju težinu nalazimo minimalni razmak i najkraći put.
		 *  4) Topološko sortiranje: Kada moramo da zakažemo poslove. Imamo zavisnosti
		 *     između poslova. Njime rešavamo i zavisnost između linkera, planera instrukcija,
		 *     serijalizacije podataka itd... */

		// Kreiraj Graf objekat i dodaj mu 5 grana
		GrafDubina gd = new GrafDubina(5);
		gd.addEdge(0, 1);
		gd.addEdge(0, 2);
		gd.addEdge(0, 3);
		gd.addEdge(1, 2);
		gd.addEdge(2, 4);

		// Štampaj sekvencu DFS kretanja kroz Graf
		System.out.println("Pretraga Grafa po dubini DFS\n(sa 0 kao startnim čvorom):");
		gd.DFS(0);
	}

}