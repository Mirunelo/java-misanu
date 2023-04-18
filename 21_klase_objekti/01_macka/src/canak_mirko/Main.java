package canak_mirko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Macka macka = new Macka();

		System.out.print("Unesite ime mačke: ");
		macka.ime = sc.nextLine();
		sc.close();

		macka.prikazatiIme();

	}

}
