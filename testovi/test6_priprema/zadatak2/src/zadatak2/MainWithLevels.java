package zadatak2;

import java.util.Scanner;

public class MainWithLevels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x0 = 0;
		int o0 = 0;
		int x = 0;
		int o = 0;
		System.out.println("Unesite nivo 1, 2, 3, 4 ili 5:");
		int nivo = sc.nextInt();
		switch(nivo) {
		case 1:{
			x = 2;
			o = 2;
			break;
		}
		case 2:{
			x = 3;
			o = 3;
			break;
		}
		case 3:{
			x = 4;
			o = 4;
			break;
		}
		case 4:{
			x = 4;
			o = 6;
			break;
		}
		case 5:{
			x = 5;
			o = 7;
			break;
		}
		}
		int[][] xo = new int[x][o];
		for( int i = 0; i < x; i++)
			for( int j = 0; j < o; j++)
				xo[i][j] = 0;
		
		stampajMatricu(xo);
		
		do {
			x0 = (int) (Math.random()*10);
			o0 = (int) (Math.random()*10);
		}while(x0 >= x || o0 >= o);
		
		xo[x0][o0] = 1;
		
		System.out.println("Traženi simbol se nalazi u kom redu?");
		int x1 = sc.nextInt()-1;
		System.out.println("U kojoj koloni?");
		int o1 = sc.nextInt()-1;
		
		if ( x0 == x1 && o0 == o1) {
			System.out.println("Pobedili ste!!!");
			stampajMatricu(xo);
		}
		else {
			System.out.println("Izabrali ste:");
			xo[x1][o1] = 1;
			xo[x0][o0] = 0;
			stampajMatricu(xo);
			System.out.println("Izgubili ste. Rešenje je:");
			xo[x0][o0] = 1;
			stampajMatricu(xo);
		}
		
		sc.close();
		
	}

	private static void stampajMatricu(int[][] xo) {
		for( int i = 0; i < xo.length; i++) {
			for( int j = 0; j < xo[0].length; j++) {
				if(xo[i][j] == 1) {
					System.out.print("X ");
					continue;
				}
				else {
					System.out.print(xo[i][j] + " ");
					continue;
				}
			}System.out.println();
				}
		}

	
}
