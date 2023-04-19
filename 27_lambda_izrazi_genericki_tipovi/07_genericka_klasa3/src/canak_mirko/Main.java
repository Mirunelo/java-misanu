package canak_mirko;

public class Main {

	public static <Tip> void stampajNiz(Tip[] pocetniNiz) {
		for (Tip element : pocetniNiz)
			System.out.printf("%s  ", element);
		System.out.println((int)pocetniNiz[0]+(int)pocetniNiz[1]);
	}

	public static void main(String[] args) {

		Integer[] i = { 1, 2, 3, 4, 5, 6, 7 };
		Double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] c = { 'j', 'a', 'v', 'a' };

		System.out.println("\nSadržaj celobrojnog niza: ");
		stampajNiz(i);

		System.out.println("\nSadržaj double niza: ");
		stampajNiz(d);

		System.out.println("\nSadržaj Character niza: ");
		stampajNiz(c);

	}
}