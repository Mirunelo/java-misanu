package prime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		InterfacePrime prime = (n) -> {
			int b = 0;
			for (int i = 2; i < Integer.MAX_VALUE; i++) {
				if (i / 2 < 2) {
					n[b++] = i;
					if (b == n.length)
						return n;
				} else {
					for (int j = 2; j <= i / 2; j++)
						if (i % j == 0)
							break;
						else if (j == i / 2 && i % j != 0) {
							n[b++] = i;
							if (b == n.length)
								return n;
						} else
							continue;
				}
			}
			return n;
		};
		
		Scanner ulaz = new Scanner(System.in);

		int i;
		while (true) {
			System.out.print("Koliko prostih brojeva želite naći (počev od 2 kao prvog) ? ");
			i = ulaz.nextInt();
			if (i <= 0)
				System.out.println("\nPogrešan unos!\n");
			else
				break;
		}
		ulaz.close();

		int[] niz = new int[i];

		long timer = System.currentTimeMillis();
		prime.prostBroj(niz);
		long trajanje = System.currentTimeMillis() - timer;

		for (int j : niz) {
			System.out.print(j + ", ");
		}
		System.out.println("\nIzvršenje programa je trajalo " + trajanje + " milisekundi.");

	}

}
