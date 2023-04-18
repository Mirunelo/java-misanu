package canak_mirko;

public class Main {

	public static void main(String[] args) {

		/* I nacin: Inicijalizacija dvodimenzionalnog niza */
		int[][] a = { {10,20,30}, {40,50,60}, {70,80,90} };
		
		/* Stampanje elemenata dvodimenzionalnog niza */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
