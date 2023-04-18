package canak.mirko;

import java.util.Scanner;

public class Primer1 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		
		/* for petlja */
		
		System.out.print("Unesite n: ");
		int n = ulaz.nextInt();
		double s = 0;
		
		for ( int i = 1; i <= n; i++) {
			s += (double) i / ( i + 1 );
		}
		System.out.println("Suma iznosi: " + s);
		
		/* while petlja */
		
		System.out.print("Unsite n: ");
		int nn = ulaz.nextInt();
		int ii = 1;
		double ss = 0;
		
		while ( ii <= nn ) {
			ss += (double) ii / ( ii + 1 );
			ii++;
		}
		
		System.out.println("Suma iznosi: " + ss);
		
		/* do - while petlja */
		
		System.out.print("Unsite n: ");
		int nnn = ulaz.nextInt();
		int iii = 1;
		double sss = 0;
		
		do {
			sss += (double) iii / ( iii + 1 );
			iii++;
		} while ( iii <= nnn );
		
		System.out.println("Suma iznosi: " + sss);
		
		ulaz.close();
		
	}

}
