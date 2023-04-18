package canakmirko;

public class Promenljive {

	public static void main(String[] args) {

		byte b = 123;
		System.out.println("Vrednost promenljive b je: "+ b);

		short s = 12345;
		System.out.println("Vrednost promenljive s je: " + s);
		
		int i = 1234567891; 
		System.out.println("Vrednost promenljive i je: " + i);
		
		long l = 1234567891234567891L;
		System.out.println("Vrednost promenljive l je: " + l);
		
		long ll = 1234_5678_9012_12L;
		System.out.println("Vrednost promenljive ll je: " + ll);
		
		float f = 25.05f;
		System.out.println("Vrednost promenljive f je: " + f);
		
		// inicijalalizacija se zavrsava slovom f ili slovom F
		float F = 123.123F;
		System.out.println("Vrednost promenljive F je: " + F);
		
		float F1 = 123.123f;
		System.out.println("Vrednost promenljive F1 je: " + F1);
		
		double d = 12345.12345d; // zavrsava se slovom d ili D (može i bez d. - JA)
		System.out.println(d);
		
		boolean bln = true;
		boolean blen = false;
		System.out.println(bln);
		System.out.println(blen);
		
		char znak = '%';
		System.out.println(znak);
		
	}

}
