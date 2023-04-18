package uup;

import java.util.Scanner;

public class Farenhajt {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.print("Unesite temperaturu u celzijusima: ");
		double tc=input.nextDouble();
		
		System.out.println("Temperatura u farenhajtima je: " + (tc * 1.8 + 32));
		
		input.close();
	}

}
