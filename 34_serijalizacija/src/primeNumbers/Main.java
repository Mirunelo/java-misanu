/* Program traži proste brojeve.
 * Serijalizacija i deserijalizacija se koristi kao bekap podataka
 * koji omogućava da program sa svakim startovanjem nastavi da traži
 * nove proste brojeve.
 * Cilj -> Razumevanja procesa Serijalizacije i Deserijalizacije Objekta.
 */
package primeNumbers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		// Pravimo objekat klase Prime za pronalaženje prostih brojeva
		Prime pn = new Prime();
		
		// Deserijalizacija
		// Pošto ne postoji datoteka prime.ser pri prvom pokretanju, imaćemo izuzetak
		try {
			FileInputStream backup = new FileInputStream("prime.ser");
			ObjectInputStream input = new ObjectInputStream(backup);
			pn = null;
			pn = (Prime)input.readObject();
			input.close();
			backup.close();
		}catch(IOException | ClassNotFoundException e) {
			System.out.println("Izuzetak uhvaćen.");
		}
		
		// Pronalaženje prostih brojeva
		pn.CalculatePrimes(pn.getN());
		
		// Štampanje rezultata i vremena potrebnog za pronalaženje prostih brojeva
		pn.PrimeNumbers();
		
		// Ukupno vreme koje je potrošeno prilikom svih dosadašnjih pokretanja programa
		System.out.println("\nIzvršenje programa je trajalo " + pn.getTimer() + " milisekundi.");
		
		// Serijalizacija
		try {
			FileOutputStream backup = new FileOutputStream("prime.ser");
			ObjectOutputStream out = new ObjectOutputStream(backup);
			out.writeObject(pn);
			out.close();
			backup.close();
		}catch(IOException e) {
			System.err.println("IO izuzetak je uhvaćen.");
		}
	}

}
