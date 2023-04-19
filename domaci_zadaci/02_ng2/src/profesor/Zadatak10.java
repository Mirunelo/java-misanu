package profesor;

import java.text.DecimalFormat;

public class Zadatak10 {

	static double f(double x, double y) {

		if (x < y)
			return Math.exp(x) * Math.cos(3 * y);
		else if (x == y)
			return Math.sin(x);
		else
			return (1 + Math.sqrt(Math.abs(x * y)));
	}

	public static void main(String[] args) throws Exception {

		double x, y;

		DecimalFormat df = new DecimalFormat("###,##0.00");

		System.out.println("\tX\tY\tF(X, Y)");
		for (x = 0.1; x <= 0.5; x += 0.1)
			for (y = 0.01; y <= 0.03; y += 0.01)
				System.out.println("\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(f(x, y)));
	}

}
