package vezba;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite karakter: ");

		char a = sc.next().charAt(0);

		if (a >= 'A' && a <= 'Z')
			System.out.println("Uneti karakter je veliko slovo: " + a);

		else if (a >= 'a' && a <= 'z')
			System.out.println("Uneti karakter je malo slovo: " + a);

		else if (a >= '0' && a <= '9')
			System.out.println("Uneti karakter je cifra: " + a);
		else
			System.out.println("Uneti karakter je specijalni simbol: " + a);

		sc.close();

	}

}
