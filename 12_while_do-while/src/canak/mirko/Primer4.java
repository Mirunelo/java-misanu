package canak.mirko;

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);

		int n;
		
		System.out.println("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		
		 int i = 1;
		 while ( i <= n) {
			 if (i % 2 != 0)
				 System.out.println(i);
			 i++;
			 }
		 
		 ulaz.close();
		}

}
