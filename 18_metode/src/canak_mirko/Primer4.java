package canak_mirko;

public class Primer4 {
	public static int zbir(double x, double y) {
		return (int)(x + y);
	}

	public static int zbir(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		double x = 2.3, y = 4.5;
		int a = 3, b = 4;
		System.out.println("Poziv za podatke tipa double: " + zbir(x, y));
		System.out.println("Poziv za podatke tipa int: " + zbir(a, b));
	}
}