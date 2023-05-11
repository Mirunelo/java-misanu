/* MVC Arhitektura (Model-view-controller) je dizajn patern na polju razvoja aplikacija na web-u
 * To je način da organizujemo naš kod. Program treba da se sastoji od posebnih objekata:
 * 1) Model podataka;
 * 2) Prezentacija informacija;
 * 3) Kontrola informacijama.
 * Model: Model sadrži programske podatke (iz baze podataka) i skup klasa u kojima je sadržana
 * sva poslovna logika aplikacije. Programer može da konstruiše model, definisanjem klasa i
 * atributa, pa da formira bazu podataka i obratno, što je češći slučaj.
 * View:  Komponenta za prikaz podataka dobijenih od Modela preko Kontrolera. Korisnik treba
 * da vidi samo ono što View komponenta prikazuje i nema pristup drugim podacima.
 * Controller: Posrednička komponenta između Model-a i View-a. Sadrži metode za kontrolu toka
 * programa i upravlja korisničkim zahtevima. Utiče na stanje modela (odlučuje kako će se model
 * izmeniti) na osnovu korisničkih zahteva. Odlučuje o načinu prikaza podataka korisniku.
 * Interakcija između MVC komponenata:
 * - View - prikazuje korisniku stanje modela, obezbeđuje UI korisniku za unos podataka i poziva
 *          operacije koje treba da se izvrše nad podacima;
 * - Controller - Prihvata zahteve korisnika i poziva operaciju koja je definisana u Model-u.
 *                Ukoliko Model promeni stanje, prikazuje ga korisniku;
 * - Model - Stanje sistema koje se može promeniti izvršavanjem operacija nad objektima u Model-u
 *           podataka. Model ne vodi računa ni o načinu upravljanja podacima ni o načinu prikaza.
 * Prednosti:
 * - model se može prikazati na više načina;
 * - lakše je dodati novi prikaz podataka;
 * - lakše se menja interakcija sa korisnikom;
 * - više programera može paralelno raditi na razvoju komponenata
 * - mogućnost ponovne upotrebe koda;
 * - pojedinačni delovi se mogu lako testirati, menjati i poboljšavati;
 * - prikaz podataka je odvojen od logike obrade podataka.
 * Mane:
 * - previše složena za manje aplikacije, što pogoršava i dizajn i karakteristike;
 * - usled čestih izmena Modela prikaz podataka može biti problematičan.
 * */

package mvc_komponente;

public class Main {

	private static Zaposleni pribaviZaposlenogIzBaze(int id) {
		BazaPodataka baza = new BazaPodataka();
		return baza.getZaposleni(id);
	}

	private static void prikaz(Zaposleni model) {
		// MVC => V (View - Prikaz)
		Prikaz prikaz = new Prikaz();
		// MVC => C (Controller - Kontroler)
		Kontroler kontroler = new Kontroler(model, prikaz);
		kontroler.prikazPromene();
	}

	private static void izmenaPodataka(Zaposleni model) {
		// MVC => V (View - Prikaz)
		Prikaz prikaz = new Prikaz();
		// MVC => C (Controller - Kontroler)
		Kontroler kontroler = new Kontroler(model, prikaz);
		kontroler.setIme("Nenad");
		System.out.println("\nPodaci zaposlenog posle izmene podataka:");
		kontroler.prikazPromene();
	}

	public static void main(String[] args) {

		// Unosimo ID zaposlenog s kojim ćemo raditi
		// da bi pribavili njegov model iz baze podataka
		int id = 44444444;
		// MVC => M
		Zaposleni model = pribaviZaposlenogIzBaze(id);

		// Provera da li model zaposlenog postoji
		if (model != null) {
			// Kreira prikaz traženog modela tj. podataka o zaposlenom u konzoli
			prikaz(model);

			// Vrši izmenu podataka u modelu zaposlenog s kojim radimo
			izmenaPodataka(model);
		} else
			System.out.println("Ne postoji zaposleni sa ID brojem: " + id);
	}

}