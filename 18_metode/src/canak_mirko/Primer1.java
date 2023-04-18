package canak_mirko;

public class Primer1 {
	public static int kvadratBroja(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.println("Proizvod brojeva: " + x + " i " + y + " iznosi: " + kvadratBroja(x, y));
	}
}