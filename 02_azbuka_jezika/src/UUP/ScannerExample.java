package UUP;

import java.util.*;
public class ScannerExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Unesi ime i prezime: ");
		String name = in.nextLine();
		System.out.println("Vaše ime i prezime glasi: " + name);
		in.close();
	}

}
