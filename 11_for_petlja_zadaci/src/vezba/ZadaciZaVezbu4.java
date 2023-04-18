package vezba;

public class ZadaciZaVezbu4 {

	public static void main(String[] args) {
		
		double omega;

		System.out.printf("%11s%28s%n", "Vitkost:", "Koeficijent izvijanja:");
		for ( double lambda = 10; lambda <=75; lambda++ ) {
			omega = 1 / ( 1 - 0.8 * Math.pow(lambda/100, 2));
			System.out.printf("%8.0f%22.3f%n", lambda, omega);
		}
		
	}

}
