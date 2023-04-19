package profesor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak8 {
	public static void main(String[] args) throws Exception {
		double[] x = new double[100];
		double[] f = new double[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za n:");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.println("Unesite elemente niza x i f: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("k[" + i + "] = ");
			f[i] = Double.parseDouble(ulaz.readLine());
		}
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		for (int i = 1; i <= n; i++) {
			s1 += Math.log10(x[i]);
			s2 += Math.log10(f[i]);
			s3 += Math.log10(x[i]) * Math.log10(f[i]);
			s4 += Math.log10(x[i]) * Math.log10(x[i]);
		}
		double b1 = (s1 * s2 - n * s3) / (s1 * s1 - n * s4);
		double b0 = (s2 - b1 * s4) / n;
		System.out.println("Unesite vrednost za x0:");
		double x0 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za xk:");
		double xk = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za dx:");
		double dx = Double.parseDouble(ulaz.readLine());
		DecimalFormat df = new DecimalFormat("###,##0.00");
		System.out.println("\tX\tY(X)");
		for (double i = x0; i <= xk; i += dx)
			System.out.println("\t" + df.format(i) + "\t" + df.format(b0 * Math.pow(i, b1)));
	}

}
