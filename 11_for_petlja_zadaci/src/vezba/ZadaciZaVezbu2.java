package vezba;

import java.io.*;

public class ZadaciZaVezbu2 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double s = 0;
		
		System.out.print("Unesite n: ");
		double n = Double.parseDouble(bf.readLine());
		
		for (double i = 1.0; i <= n; i++)
			s += (Math.pow(-1, i-1) * i / (i + 1));
		
		System.out.println("Suma S iznosi: " + s);
		
	}

}
