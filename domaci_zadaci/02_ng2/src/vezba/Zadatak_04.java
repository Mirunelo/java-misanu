package vezba;

import java.text.DecimalFormat;

public class Zadatak_04 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##0.00");

		System.out.println("R.BR.\t  x\t  a\t  y\t  z\n-------------------------------------");
		int i = 0;
		double z, a, x, y;
		for (x = 1.0; x <= 4; x++)
			for (a = 0.1; a <= 0.5; a += 0.1)
				for (y = 0.5; y >= 0.2; y -= 0.05) {
					z = Math.pow((x + a + y) / (x - y), 2) - x / (x + a);
					System.out.printf("%3d", ++i);
					System.out.println(".\t" + df.format(x) + "\t" + df.format(a) + "\t" + df.format(y) + "\t" + df.format(z));
				}
	}
}
