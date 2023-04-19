package zadatak_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Zadatak07_prosto {

	public static void main(String[] args) throws Exception {

		// Kreiramo datoteku za upis u root-u objekta
		FileOutputStream fos = new FileOutputStream("datoteka.java");
		
		// Po uslovu zadatka zadajemo string koji treba upisati u datoteku
		String str = "Ja sam programer!";
		
		// Konvertujemo naš string u niz karaktera
		char[] c = str.toCharArray();
		
		// Upisujemo elemente niza karaktera u datoteku
		for(char ch: c)
			fos.write(ch);
		fos.close();
		
		// Otvaramo formiranu datoteku za čitanje
		FileInputStream fis = new FileInputStream("datoteka.java");
		
		// Ispsiuemo sadržaj datoteke na ekranu
		int i;
		while((i = fis.read())!= -1)
			System.out.print((char)i);
		fis.close();
		
	}

}
