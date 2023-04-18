package vezba;

import java.io.*;

public class ZadaciZaVezbu1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double p = 1.0;
		
		System.out.print("Unesite n: ");
		double n = Double.parseDouble(bf.readLine());
		
		for (double i = 1.0; i <= n; i++)
			p *= 1-1/(i+1);
		
		System.out.print("Vrednost proizvoda P iznosi: " + p);
	}

}
