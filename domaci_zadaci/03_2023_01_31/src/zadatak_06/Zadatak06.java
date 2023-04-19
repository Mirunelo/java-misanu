package zadatak_06;

public class Zadatak06 {

	public static void main(String[] args) {

		System.out.println("dekadni\t->\tbinarni   ->\tbinarni\n broj:\t\t broj:\t\tmetodom:");

		for (int i = 0; i <= 9; i++) {
			int b;
			int bin = 0;
			int m = 1;
			int test = i;
			do {
				b = test % 2;
				bin += b * m;
				m *= 10;
				test /= 2;
			} while (test > 0);
			// dekadni u binarni kodom:
			System.out.print("  " + i + "\t->\t  " + bin);
			// dekadni u binarni provera metodom:
			System.out.println("\t  ->\t  " + Integer.toBinaryString(i));
		}

	}

}
