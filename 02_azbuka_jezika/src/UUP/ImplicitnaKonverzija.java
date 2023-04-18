package UUP;

public class ImplicitnaKonverzija {

	public static void main(String[] args) {
		int i = 10;
		double d = i;
		char c = 'C', z = 69;
		int a = c;
		int b = z;
		System.out.println("i " + i);
		System.out.println("d " + d);
		System.out.println("ASCII kod karaktera " + c + " iznosi " + a + ".");
		System.out.println("ASCII kod karaktera " + z + " iznosi " + b + ".");
	}

}
