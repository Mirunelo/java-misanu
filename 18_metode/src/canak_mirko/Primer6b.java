package canak_mirko;

import java.text.DecimalFormat;
import static java.lang.Math.*;

public class Primer6b {

	static double f(double x) {
		return 2 * x - log(x);
	}

	static double g(double x) {
		return tan(x / 2.) + abs(x);
	}

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,##0.00");

		double x, y;
		System.out.println("\tX\tY");
		for (x = 0.1; x <= 0.9; x += 0.1) {
			y = f(2 * g(f(x)));
			System.out.println("\t" + df.format(x) + "\t" + df.format(y));
		}
	}
}