package zadatak_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadatak09_drugacije {

	public static void main(String[] args) throws IOException {
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos Stringa
		System.out.println("Unesite String sa proizvoljnim brojem razmaka:");
		String str = new String(ulaz.readLine());
		
		// Sumiranje "space"-ova
		int s = 0;
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i)==' ')
				s++;
		
		// Ispis
		System.out.println("\nUneti String sadrži " + s + " \"space\" simbola");
		
	}

}
