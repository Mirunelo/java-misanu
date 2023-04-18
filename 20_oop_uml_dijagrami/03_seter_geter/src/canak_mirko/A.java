package canak_mirko;

public class A {

	private String message;

	/*
	 * Deklarisanjem privatnih podataka vrši se enkapsulacija - skrivanje podataka
	 * Sprečava se promena vrednosti promenljivih iz koda van zadate klase
	 * 
	 * podatak = atribut = osobina klase
	 * Objekti imaju svoje atribute
	 * atributi se predstaljaju preko promenljivih u deklaraciji klase
	 * deklarišu se unutar klase van svih metoda
	 * 
	 * Metode klase
	 * 
	 * Metoda setMessage postavlja poruku.
	 */
	public void setMessage(String msg) {
		/*
		 * metoda je public, da bi se omogućio pristup tim podacima
		 * void znači da ne vraćaju rezultat, kao parametar imaju
		 * promenljivu istog tipa kao podatak koji postavljaju.
		 */

		message = msg; /* postavlja vrednost promenljivoj message */

	}

	/* Metoda getMessage() vraća poruku. */
	String getMessage() {
		/* nema parametara, vraćaju odgovarajući tip podataka */
		return message;
	}

	/*
	 * Parametri i arguenti metoda Promenljivu deklarisanu u zaglavalju metode
	 * nazivamo parametrom. Argument se prosleđuje metodi priliko poziva metode.
	 * !!!Prilikom poziva, parametri dobijaju vrednosti argumenata metode.
	 * 
	 */

}
