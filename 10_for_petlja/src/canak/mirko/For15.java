package canak.mirko;

import java.util.Scanner;

public class For15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int neg=0;
		int poz=0;
		int nula=0;
		
		for (int i = 1; i <= 10; ++i)
		{
			System.out.println("Unesite broj: ");
			int broj = sc.nextInt();
			if (broj<0)
			{
				++neg;
			}
			else if (broj>0)
			{
				++poz;
			}
			else
			{
				++nula;
			}
		}
		System.out.println("Imamo " + nula + " nula, " + poz + " pozitivnih i " + neg + " negativnih.");
		sc.close();
	}

}
