package canak.mirko;

import java.util.Scanner;

public class For10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite interval:\nOd: ");
		int x = sc.nextInt();
		System.out.print("Do:");
		int y = sc.nextInt();
		sc.close();
		
		for(int i = x; i <= y; ++i)
		{
			if (i%3==0)
			{
				System.out.println("Broj " + i + " je deljiv sa 3.");
			}
		}
		
	}

}
