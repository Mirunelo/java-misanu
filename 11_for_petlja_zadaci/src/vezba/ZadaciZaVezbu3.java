package vezba;

public class ZadaciZaVezbu3 {

	public static void main(String[] args) {

		double s = 0;
		double p = 1;

		for (double i = 1.0; i <= 50.0; ++i) {
			for (double j = 1.0; j <= i; ++j)
				if (j != 3.0)
					p *= (j + 2) / (j - 3);
			s += p;
			p = 1;
		}
		System.out.println("Tražena suma proizvoda iznosi:" + s);

	}

}
