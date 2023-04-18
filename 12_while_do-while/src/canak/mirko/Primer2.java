package canak.mirko;

public class Primer2 {

	public static void main(String[] args) {

		int i = 0;
		int izvrsavanje = 0;
		while ( ++i < 5) {
			System.out.println(i);
			izvrsavanje++;
		}
		System.out.println("++i se izvršava: " + izvrsavanje + " puta.");
		izvrsavanje = 0;
		i = 0;
		while ( i++ < 5 ) {
			System.out.println(i);
			izvrsavanje++;
		}
		System.out.println("i++ se izvršava: " + izvrsavanje + " puta.");
	}

}
