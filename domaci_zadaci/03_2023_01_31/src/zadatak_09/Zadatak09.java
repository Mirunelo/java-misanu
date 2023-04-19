package zadatak_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadatak09 {

	public static void main(String[] args) throws IOException {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos Stringa
		System.out.println("Unesite String sa proizvoljnim brojem razmaka:");
		String str = ulaz.readLine();
		
		// Konvertujemo uneti String u niz karaktera
		char[] ch = str.toCharArray();
		
		// Sumiramo broj "space"-a
		int s = 0;
		for(char c : ch)
			if(c==' ')
				s++;
		
		// Ispis
		System.out.println("\nUneti String sadrži " + s + " \"space\" simbola");
		
	}

}
