package canak.mirko;

import java.io.*;

public class ElseIf7 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite tri redna broja dana u godini:\nk1: ");
		short k1 = Short.parseShort(bf.readLine());
		System.out.print("k2: ");
		short k2 = Short.parseShort(bf.readLine());
		System.out.print("k3: ");
		short k3 = Short.parseShort(bf.readLine());

		if (k1 % 7 == 1 && k2 % 7 == 1 && k3 % 7 == 1) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 01. januara.");
		} else if (k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 02. januara.");
		} else if (k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 03. januara.");
		} else if (k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 04. januara.");
		} else if (k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 05. januara.");
		} else if (k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 06. januara.");
		} else if (k1 % 7 == 0 && k2 % 7 == 0 && k3 % 7 == 0) {
			System.out.println("\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 07. januara.");
		} else {
			System.out.println("\nUčitani redni brojevi dana u godini nisu isti dani u godini.");
		}

	}

}
