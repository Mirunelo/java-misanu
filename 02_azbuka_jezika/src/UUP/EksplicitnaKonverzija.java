package UUP;

public class EksplicitnaKonverzija {

	public static void main(String[] args) {
		double d = 10.82d;
		int i = (int) d;
		char c = (char) i;
		System.out.println("d " + d);
		System.out.println("i " + i);
		System.out.println("c " + c);
		System.out.println("Kad se samo odbace decimale broja " + d + " bez zaokruživanja,\ndobije se celi broj " + i + " koji predstavlja ASCII kod karaktera.");
		System.out.println("ASCII kod (10) predstavlja New Line ili NL \"\\n\"");
	}

}