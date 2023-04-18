package canak.mirko;

import java.util.Locale;

public class For2 {

	public static void main(String[] args) {
		
		System.out.printf("%3s%12s%8s \n", "Broj", "Kvadrat", "Kub");

		for (int broj = 10; broj <= 50; broj=broj+10)
		{
			System.out.printf("%3d%,11d%,11d \n", broj, broj*broj, broj*broj*broj);
			System.out.printf(Locale.GERMAN, "%4.2f%10.2f%11.2f \n", Math.sqrt(broj), Math.sqrt(broj+broj), Math.sqrt(broj+broj+broj));
			System.err.printf("%9.3e%10.2e%11.1e \n", Math.sqrt(broj), Math.sqrt(2*broj), Math.sqrt(3*broj));
		}
		
	}

}
