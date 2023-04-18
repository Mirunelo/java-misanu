package uup;

import java.util.Scanner;

public class Sekunde {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Proteklo sekundi: ");
		int n = input.nextInt();
		
		int sat = n / 3600;
		int sek1 = n % 3600;
		int min = sek1 / 60;
		int sek = sek1 % 60;
		
		System.out.println("proteklo sati: " + sat);
		System.out.println("minuta: " + min);
		System.out.println("sekundi: " + sek);
		
		input.close();
		
	}

}
