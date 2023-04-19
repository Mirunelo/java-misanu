package ugnjezdeniInterfejs;

import java.util.Scanner;

import ugnjezdeniInterfejs.InterfejsSpoljnji.InterfejsUgnjezdeni;

public class UgnjezdeniInterfejs implements InterfejsUgnjezdeni {

	public void ugnjezdenaMetoda(int n) {

		int iteration = 0, num = 0, x = 1, y = 1;

		while (num < n) {

			y = 1;

			iteration = 0;

			while (y <= x) {

				if (x % y == 0)

					iteration++;

				y++;

			}

			if (iteration == 2) {

				System.out.printf("%d ", x);

				num++;

			}

			x++;

		}

	}

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.print("Program će prikazati prvih n prostih brojeva.\nUnesite n: ");
		int n = ulaz.nextInt();
		ulaz.close();

		UgnjezdeniInterfejs obj = new UgnjezdeniInterfejs();

		obj.ugnjezdenaMetoda(n);

	}

}
