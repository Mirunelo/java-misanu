package canak_mirko;

import java.text.DecimalFormat;

public class Primer4 {
	static double f(double x) {
		double s = 0;
		for (int k = 0; k <= 20; k++)
			s += Math.cos(k * x) + (x * x - 3 * k * x) / (Math.sin(x) + Math.cos(x));
		return s;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("\tX\tF(X)");
		for (double x = 0; x <= 2; x += 0.2)
			System.out.println("\t" + df.format(x) + "\t" + df.format(f(x)));
	}
}