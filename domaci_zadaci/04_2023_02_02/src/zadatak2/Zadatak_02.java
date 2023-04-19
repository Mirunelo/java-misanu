package zadatak2;

public class Zadatak_02 {

	public static void main(String[] args) {

		int[] niz = { 1, 2, 3, 2, 1, 4, 5, 6, 5, 7, 12, 34, 444, 345, 12, 345, 8, 3, 6, 2 };
		for (int i : niz)
			System.out.print(i + " ");
		System.out.print(" -> ");

		System.out.print(niz[0] + " ");
		for (int i = 1; i < niz.length; i++)
			for (int j = i - 1; j >= 0; j--) {
				if (niz[i] == niz[j])
					break;
				if (j == 0)
					System.out.print(niz[i] + " ");
			}

	}
}
