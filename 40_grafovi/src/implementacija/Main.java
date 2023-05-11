/* Graf je vrsta strukture podataka, tačnije apstraktan tip podataka, koji se sastoji
 * od skupa čvorova i skupa grana, koji predstavljaju odnose (veze) između čvorova.
 * Graf se definiše kao G = (v, E), gde je V konačan i ne prazan skup čvorova, a E je
 * skup grana (veza između čvorova).
 * Grafovi se dele na (i kombinacija dole pomenutog):
 * 1) Neusmerene - Kada grane nemaju određen smer.
 * 2) Usmereni - Kada grane imaju smer.
 * 3) Težinski Grafovi - svaka grana ima dodeljenu težinu. Težina normalno ukazuje na
 *    distancu između dva čvora.
 * 
 * Grafovi se prezentuju:
 * 1) Listom povezanosti - struktura podataka koja sadrži listu svih susednih čvorova.
 * 2) Matrica povezanosti - matrica čiji redovi i kolone, respektivno predstavljaju
 *    početne i krajnje čvorove, a član matrice može biti 0 ili 1, tj. ne postoji,
 *    odnosno postoji veza između ta dva čvora.
 * 3) Simbolički Graf - za vrlo velike Grafove koji imaju neku pravilnost u položaju grana.
 * 4) Matrica Incidencije - Redovi su čvorovi, a kolone grane. U svakoj koloni stoje
 *    jedinice na mestima koja odgovaraju čvorovima koje spaja odgovarajuća grana,
 *    a na ostalim mestima su nule.
 *    
 * Grafovi se najviše koriste da prikažu razne kompjuterske mreže, socijalne mreže, itd.
 * Takođe mogu da se koriste da prikažu razne zavisnosti u softveru ili arhitekturi.
 * Ti Grafovi zavisnosti su vrlo korisni za analiziranje softvera i u procesu debagovanja.*/

package implementacija;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Definisanje grana Grafa
		List<Grana> grane = Arrays.asList(new Grana(0, 1, 2), new Grana(0, 2, 4), new Grana(1, 2, 4),
				new Grana(2, 0, 5), new Grana(2, 1, 4), new Grana(3, 2, 3), new Grana(4, 5, 1), new Grana(5, 4, 3));

		// Pozivanje konstruktora klase Graf radi konstruisanja Grafa
		Graf graf = new Graf(grane);

		// Štampanje Grafa kao liste zavisnosti
		graf.printGraf(graf);
	}

}