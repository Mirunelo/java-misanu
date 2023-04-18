package canak_mirko;

public class Primer3 {
	static boolean test = true; // nepromanljiva koja važi u celom programu i svim metodama.
	final static int vrsta; // nepromenljiva koja važi u celom programu i svim metodama.
	static int kolona = 2; // promenljiva koja važi u celom programu i svim metodama.
	static {
		vrsta = 3;
	}

	static void prikaziMatricu(int matrica[][]) {
		System.out.println("Dobijena matrica izgleda ");
		for (int i = 0; i < vrsta; i++) {
			for (int j = 0; j < kolona; j++)
				System.out.print(" " + matrica[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }  };
		prikaziMatricu(a);
		System.out.println(kolona);
		test = false;
		}
}