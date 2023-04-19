package ostalo;

import java.io.*;

public class Zadatak1_Mirko_Canak {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite prvi broj:");
		int b1 = Integer.parseInt(bf.readLine());
		System.out.println("Unesite drugi broj:");
		int b2 = Integer.parseInt(bf.readLine());
		
		int min;
		
		if ( b1 < b2 )
			min = b1;
		else
			min = b2;
		
		System.out.println("Manji od unetih brojeva je: " + min);	
		
	}

}
