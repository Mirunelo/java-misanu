// Serijalizacija i deserijalizacija se koriste:
// 1) Da sačuvaju stanje objekta
// 2) Da omoguće transfer objekta kroz mrežu

package primer1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Demo obj1 = new Demo(1, "Pera Perić");
		String imeDatoteke = "file.ser";
		
		// Serijalizacija je mehanizam konvertovanja stanja objekta u niz bajtova.
		// niz bajtova je nezavisan od platforme.
		try {
			
			// Snimanje objekta u datoteku
			FileOutputStream file = new FileOutputStream(imeDatoteke);
			
			// Klasa ObjectOutputStream sadrži writeObject() metodu za
			// serijalizaciju objekta.
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Metoda za serijalizaciju objekta
			out.writeObject(obj1);
			
			out.close();
			file.close();
			
			System.out.println("Objekat je serijalizovan");
			
		}catch(IOException e) {
			System.out.println("IO izuzetak je uhvaćen");
		}
		
		Demo obj2 = null;
		
		// Deserijalizacija je reversan proces od Serijalizacije gde se niza bajtova
		// koristi za ponovno kreiranje JAVA objekta u memoriji.
		try {
			
			// Čitanje objekta iz datoteke
			FileInputStream file = new FileInputStream(imeDatoteke);
			
			// Klasa ObjectInputStream sadrži readObject() metodu za
			// deserijalizaciju objekta.
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Metoda za deserijalizaciju objekta
			obj2 = (Demo)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Objekat je deserijalizovan");
			System.out.println("a = " + obj2.a);
			System.out.println("b = " + obj2.b);
			
		}catch(IOException e) {
			System.out.println("IO izuzetak je uhvaćen");
		}catch(ClassNotFoundException e) {
			System.out.println("ClassNotFound izuzetak je uhvaćen");
		}

	}

}
