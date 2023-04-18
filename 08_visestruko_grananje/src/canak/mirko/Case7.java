package canak.mirko;

import java.io.*;

public class Case7 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int o1, o2, o3;

		System.out.print("Unesite tri redna broja dana u godini:\nk1: ");
		short k1 = Short.parseShort(bf.readLine());
		System.out.print("k2: ");
		short k2 = Short.parseShort(bf.readLine());
		System.out.print("k3: ");
		short k3 = Short.parseShort(bf.readLine());

		o1 = k1 % 7;
		o2 = k2 % 7;
		o3 = k3 % 7;

		int o = (o1 == o2 && o1 == o3) ? 1 : 0;

		switch (o) {

		case 1: {

			switch (o1) {

			case 1: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 01. januara.");
				break;
			}
			case 2: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 02. januara.");
				break;
			}
			case 3: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 03. januara.");
				break;
			}
			case 4: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 04. januara.");
				break;
			}
			case 5: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 05. januara.");
				break;
			}
			case 6: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 06. januara.");
				break;
			}
			default: {
				System.out.println(
						"\nUčitani redni brojevi dana u godini pretstavljaju isti dan koji je bio 07. januara.");
			}

			}
			break;
		}
		default: {
			System.out.println("\nUčitani redni brojevi dana u godini nisu isti dani u godini.");
			break;
		}

		}

	}

}
