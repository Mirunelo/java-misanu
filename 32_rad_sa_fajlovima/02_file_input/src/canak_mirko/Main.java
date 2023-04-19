package canak_mirko;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		/* Osnovne UI operacije
		 * 
		 * Za UI operacije Java koristi tokove(Stream).
		 * Strimovi obezbeđuju načine za rad sa podacima koji se primaju i šalju.
		 * 
		 */
		
		/* Klasa koja omogućuje da se poveže tastatura sa stream-om */
		DataInputStream dis = new DataInputStream(System.in);
		
		/* Povezivanje fajla sa klasom FileOutputStream */
		FileOutputStream fos = new FileOutputStream("rezultat.txt");
		
		System.out.println("Unesite string (unos prekinite unosom karaktera $)");
		
		/* read()
		 * write()
		 */
		
		char ch;
		
		while((ch = (char)dis.read()) != '$') {
			fos.write(ch);
		}
		
		fos.close();
		
	}

}
