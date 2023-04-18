package canak.mirko;

import java.util.Scanner;

public class ElseIf3 {

	public static void main(String[] args) {

		/* 1. deo: Unos podataka */

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite karakter: ");
		char slovo = sc.next().charAt(1);

		sc.close();

		/* 2. deo: Obrada podataka */

		if (slovo >= 'a' && slovo <= 'z' || slovo >= 'A' && slovo <= 'Z') {
			if (slovo == 'a' || slovo == 'A')
				System.out.println(slovo + " je samoglasnik.");
			else if (slovo == 'e' || slovo == 'E')
				System.out.println(slovo + " je samoglasnik.");
			else if (slovo == 'i' || slovo == 'I')
				System.out.println(slovo + " je samoglasnik.");
			else if (slovo == 'o' || slovo == 'O')
				System.out.println(slovo + " je samoglasnik.");
			else if (slovo == 'u' || slovo == 'U')
				System.out.println(slovo + " je samoglasnik.");
			else
				System.out.println("'" + slovo + "' je suglasnik.");
		} else
			System.out.println("Uneli ste '" + slovo + "' umesto slovo.");

	}

}
