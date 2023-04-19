package vezba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_02 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;
		boolean test = true;

		while (test) {
			try {
				System.out.print("Unesite trocifren broj: ");
				n = Integer.parseInt(bf.readLine());
				if (n < 100 || n >= 1000)
					test = true;
				else
					test = false;
			} catch (NumberFormatException e) {
				test = true;
			}
		}
		int j = n % 10;
		int s = n / 100;
		int d = n / 10 % 10;
		int broj = j * 100 + d * 10 + s;
		int proizvod = j * s * d;
		int sumaKubova = j * j * j + d * d * d + s * s * s; // više mi se sviđa
		// int sumaKubova = (int) (Math.pow(j, 3) + Math.pow(d, 3) + Math.pow(s, 3));

		System.out.println("\nIspisom cifara u obrnutom redosledu dobija se broj: " + broj);

		System.out.println("\nProizvod cifara unetog broja iznosi: " + proizvod);
		System.out.println("Suma kubova cifara unetog broja iznosi: " + sumaKubova);

	}

}
