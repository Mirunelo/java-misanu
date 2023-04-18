package uup;

import java.util.Scanner;

public class Kilobajt {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Unesite kilobajte: ");
		int g = input.nextInt();
		System.out.println("To je bajtova: " + (g * 1024)); input.close();
		
		input.close();
	}

}
