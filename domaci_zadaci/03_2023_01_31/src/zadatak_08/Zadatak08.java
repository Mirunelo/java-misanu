package zadatak_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak08 {
	
	// Promenljiva s dobija default vrednost 0 i koristi se u Main klasi 
	static int s;
	
	// Rekurzivna metoda za računanje sume cifara zadatog broja n
	private static int sumaCifara(int n) {
		s += n%10;
		n /= 10;
		if(n != 0)
			sumaCifara(n);
		return s;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos broja n
		System.out.print("Unesite prirodan broj: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		// Pozivanje rekurzivne metode koja računa sumu cifara broja
		System.out.println("Suma cifara unetog broja iznosi: " + sumaCifara(n));
		
	}

}
