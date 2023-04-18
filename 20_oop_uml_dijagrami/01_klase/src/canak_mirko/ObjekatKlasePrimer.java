package canak_mirko;

public class ObjekatKlasePrimer {

	public static void main(String[] args) {

		/* nazivKlase nazivObjekta = new nazivKlase(); */
		
		A objekat = new A(); /* kreiranje novog objekta(instance) klase A */
		/* može i ovako:
		 * A obj = new A();
		 */
		
		/*
		 * Svaki objekat predstavlja instancu određene klase, kreiran tokom izvršavanja
		 * i sastavljen od određenog broja polja(podataka).
		 * 
		 * Metode klase se pozivaju pomoću operatora ´.´ 
		 */


		/* Metode klase se pozivaju pomoću operatora "." */
		/* nazivObjekta.nazivMetode();
		 */
		
		objekat.PrikaziPoruku();

	}

}
