package biblioteke;

import java.io.IOException;

public class Main implements DbOperator {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println(
				"========================================\n=> JAVA program za manipulaciju bazom <=\n========================================");

		String adresa = "jdbc:mysql://localhost:3306/biblioteke";
		String korisnik = "root";
		String sifra = "";

		Biblioteke b1 = new Biblioteke(adresa, korisnik, sifra);

		b1.GlavniMeni();

	}

}