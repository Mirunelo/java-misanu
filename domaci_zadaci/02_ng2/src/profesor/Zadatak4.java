package profesor;

import java.text.*;

public class Zadatak4 {

	public static void main(String[] args) {
		double a, y, x, z;
		int i = 0;
		DecimalFormat df = new DecimalFormat("###,##0.00");
		System.out.println("\tR.BR.\tX\tA\tY\tZ");
		for (x = 1.0; x <= 4.0; x += 1.0)
			for (a = 0.1; a <= 0.5; a += 0.1)
				for (y = 0.1; y <= 0.2; y += 0.05) {
					z = Math.pow((x + a + y) / (x - y), 2) - x / (x + a);
					i++;
					System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(a) + "\t" + df.format(y) + "\t"
							+ df.format(z));
				}
	}

}
