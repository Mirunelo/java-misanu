package uup;

import java.util.Scanner;

public class Lopta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost poluprečnika: ");
		double r = input.nextDouble();
		
		double P = Math.pow(r, 2) * Math.PI * 4;
		double V = Math.pow(r, 3) * Math.PI * 4.0 / 3;
		
		System.out.println("Površina lopte je:" + P);
		System.out.println("Zapremina lopte je: "+ V);
		
		input.close();
		
	}

}
