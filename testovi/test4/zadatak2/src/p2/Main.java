package p2;

import java.io.*;

import p1.BankAccount;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		BankAccount r1 = new BankAccount();
		BankAccount r2 = new BankAccount(500.0);

		System.out.print("Unesite iznos uplate za račun r2: ");
		r2.dodajSumu(Double.parseDouble(bf.readLine()));

		System.out.println("\nStanje na računu r1 iznosi: " + r1.getStanje());
		System.out.print("\nUnesite iznos uplate za račun r1: ");
		r1.dodajSumu(Double.parseDouble(bf.readLine()));

	}

}
