package canak.mirko;

import java.io.*;
import java.text.DecimalFormat;

public class UgnjezdenoFor {
	public static void main(String[] args) throws Exception {
		// s - spoljašnja suma
		// s1 - unutrašnja suma
		double s = 0, s1;
		DecimalFormat df = new DecimalFormat("###,##0.00");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());
		
		for (int i = 1; i <= n; i++) {
			s1 = 0;
			for (int j = 1; j <= n; j++) {
				if (j != 3)
					s1 += (j + 3.5) / (j - 3.0);
			}
			s += s1;
		}
		System.out.println("Dobijena vrednost sume je " + df.format(s));
	}
}