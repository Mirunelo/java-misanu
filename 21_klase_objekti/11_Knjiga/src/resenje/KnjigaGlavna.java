package resenje;

import java.util.Scanner;

public class KnjigaGlavna {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Knjiga obj = new Knjiga();
		obj.imeIBroj();

		System.out.print("Unesite ime knjige: ");
		String unetoIme = sc.nextLine();
		System.out.print("Unesite broj stranica: ");
		int unetBr = sc.nextInt();

		sc.close();

		obj.setIme(unetoIme);
		obj.setBrojStranica(unetBr);
		obj.imeIBroj();

	}

}
