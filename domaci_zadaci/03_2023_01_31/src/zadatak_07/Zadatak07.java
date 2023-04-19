package zadatak_07;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak07 {

	public static void main(String[] args) throws IOException {

		// Kreiramo datoteku za upis u root-u objekta
		FileOutputStream fos = new FileOutputStream("fajl.java");
		// Povezivanje tastature sa Stream-om
		DataInputStream dis = new DataInputStream(System.in);

		// Unosimo željeni tekst sa tastature do unosa '$'
		System.out.println("Unesite željeni tekst (za prekid unesite $):");
		char ch;
		while ((ch = (char) dis.read()) != '$') {
			fos.write(ch);
		}
		fos.close();

		// Otvaramo formiranu datoteku za čitanje
		FileInputStream fis = new FileInputStream("fajl.java");

		// Ispsiuemo sadržaj datoteke na ekranu
		int cod;
		while ((cod = fis.read()) != -1) {
			System.out.print((char) cod);
		}
		fis.close();

	}

}
