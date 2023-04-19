// Serijalizacija i deserijalizacija se koriste:
// 1) Da sačuvaju stanje objekta
// 2) Da omoguće transfer objekta kroz mrežu

package primer2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	// Metoda za štampanje podataka o radniku
	public static void printdata(Radnik obj1) {
		
		System.out.println("Ime = " + obj1.ime);
		System.out.println("Godine = " + obj1.godine);
		System.out.println("a = " + obj1.a);
		System.out.println("b = " + Radnik.b);
		
	}

	public static void main(String[] args) {
		
		Radnik obj = new Radnik("Pera Perić", 50, 7, 1250);
		String imeDatoteke = "Radnik.txt";
		
		// Serijalizacija je mehanizam konvertovanja stanja objekta u niz bajtova.
		// niz bajtova je nezavisan od platforme.
		try {
			// Snimanje objekta u datoteku
			FileOutputStream file = new FileOutputStream(imeDatoteke);
			
			// Klasa ObjectOutputStream sadrži writeObject() metodu za
			// serijalizaciju objekta.
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Metoda za serijalizaciju objekta
			out.writeObject(obj);
			
			out.close();
			file.close();
			
			System.out.println("Objekat je serijalizovan\nPodaci pre serijalizacije:");
			printdata(obj);
			
			// Objekat je serijalizovan, a vrednost static promenljive ćemo promeniti
			// da bi dokazali, da ista nije bila sačuvana u procesu serijalizacije.
			Radnik.b = 2000;
		}catch(IOException e) {
			System.out.println("IO izuzetak je uhvaćen");
		}
		
		obj = null;
		
		// Deserijalizacija je reversan proces od Serijalizacije gde se niza bajtova
		// koristi za ponovno kreiranje JAVA objekta u memoriji.
		try {
			// Učitavanje objekta iz datoteke
			FileInputStream file = new FileInputStream(imeDatoteke);
			
			// Klasa ObjectInputStream sadrži readObject() metodu za
			// deserijalizaciju objekta.
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Metoda za deserijalizaciju objekta
			obj = (Radnik)in.readObject();
			
			in.close();
			file.close();
			System.out.println("Objekat je deserijalizovan\nPodaci nakon deserijalizacije:");
			
			// Primetićemo da transient promenljiva a nije sačuvana serijalizacijom!
			// Promenljiva a je dobila podrazumevanu int vrednost 0.
			// Ni static promenljiva b nije sačuvala vrednost serijalizacijom!
			// Promenljiva b ima vrednost poslednje promene, a to je 2000.
			printdata(obj);
		}catch(IOException e) {
			System.out.println("IO izuzetak je uhvaćen");
		}catch(ClassNotFoundException e) {
			System.out.println("CassNotFound izuzetak je uhvaćen");
		}

	}

}
