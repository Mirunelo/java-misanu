package canak.mirko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unsite karakter: ");
		char k = sc.next().charAt(0);
		
		System.out.println("Unelii ste karakter ' " + k + " ' ");
		
		sc.close();
		
	}

}
