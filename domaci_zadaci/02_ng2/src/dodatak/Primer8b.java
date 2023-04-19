package dodatak;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer8b {

	private static double racunajQ(double[] x, double[] y) {
		double s1, s2, s3, s4, s5;
		s1 = s2 = s3 = s4 = s5 = 0;
		for (int i = 1; i < x.length; i++) {
			s1 += x[i] * y[i];
			s2 += x[i];
			s3 += y[i];
			s4 += x[i] * x[i];
			s5 += y[i] * y[i];
		}
		double n = (double) x.length - 1;
		double q = (n * s1 - s2 * s3) / Math.sqrt(n * Math.abs(s4 * s5));
		return q;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Učitaj broj elemenata vektora x i y, n = ");
		int n = Integer.parseInt(bf.readLine());
		double[] x = new double[n + 1];
		double[] y = new double[n + 1];

		for (int i = 1; i < x.length; i++) {
			System.out.println("X[" + i + "] = ");
			x[i] = Double.parseDouble(bf.readLine());
			System.out.println("Y[" + i + "] = ");
			y[i] = Double.parseDouble(bf.readLine());
		}

		System.out.println("\nQ = " + racunajQ(x, y));

	}

}