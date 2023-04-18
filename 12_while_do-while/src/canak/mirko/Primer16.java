package canak.mirko;

import java.util.Scanner;

public class Primer16 {

	public static void main(String[] args) {

				 Scanner ulaz = new Scanner(System.in);
				 
				 int k;
				 double p = 1;
				 
				 System.out.println("Unesite vrednost za k: ");
				 k = ulaz.nextInt();
				 
				 int i = k;
				 while (i <= (2 * k))
					 p *= i++;
				 System.out.println("Proizvod je " + p);
				 
				 ulaz.close();
		
	}

}
