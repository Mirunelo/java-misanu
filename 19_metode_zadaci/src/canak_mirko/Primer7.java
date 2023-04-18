package canak_mirko;

import java.text.DecimalFormat;

public class Primer7 {
	static double sh(double x) {
		double p0 = 1.0;
		int k = 1;
		double p1 = p0 * (1 + x * x / (k * k * Math.PI * Math.PI));
		while (Math.abs(p1 / p0 - 1) > 1.0E-8) {
			p0 = p1;
			k++;
			p1 = p0 * (1 + x * x / (k * k * Math.PI * Math.PI));
		}
		return x * p1;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("\tX\tSH(X)\t(EXP(X)-EXP(-X))/2");
		for (double x = 0.1; x <= 1.2; x += 0.1)
			System.out.println(
					"\t" + df.format(x) + "\t" + df.format(sh(x)) + "\t" + df.format((Math.exp(x) - Math.exp(-x)) / 2));
	}
}