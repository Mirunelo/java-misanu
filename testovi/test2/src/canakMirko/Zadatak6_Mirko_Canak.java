package canakMirko;

import java.io.*;

public class Zadatak6_Mirko_Canak {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj: ");
		int n = Integer.parseInt(bf.readLine());
		int i = 0;
		
		do {
			n /= 10;
			i++;
		} while ( n != 0 );
		
		System.out.println("Ukupan broj cifara je: " + i);
	}

}
