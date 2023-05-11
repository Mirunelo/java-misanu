// VIEW
package mvc_komponente;

public class Prikaz {

	// Metoda za prikaz podataka o zaposlenima
	public void stampajZaposlenog(String ime, int id, String odeljenje) {
		System.out.println("Podaci o zaposlenom: ");
		System.out.println("Ime: " + ime);
		System.out.println("ID: " + id);
		System.out.println("Odeljenje: " + odeljenje);
	}

}