package canakMirko;

import java.util.Scanner;

public class Zadatak4_Mirko_Canak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int n, i = 0, s = 0;
		
		do {
			System.out.print("Unesite broj: ");
			n = sc.nextInt();
			s += n;
			i++;
		} while( n != 0 );
		
		double mid = (double) s / (i - 1);
		
		System.out.println("Aritmetička sredina unesenih brojeva je: " + mid);
		
		sc.close();
		
	}

}
