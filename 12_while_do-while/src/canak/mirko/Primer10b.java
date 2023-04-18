package canak.mirko;

import java.util.Scanner;

public class Primer10b {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner (System.in);
		int n;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		int i = 1;
		while (i <= n){
			s += 1/(double)(2 * i);
			i++;
			}
		
		/* for (int i = 1; i <= n; i++)
		 * s += 1/(double)(2 * i);
		 */
		
		System.out.println("n = " + n + " s = " + s);
		
		ulaz.close();
		
		}
}