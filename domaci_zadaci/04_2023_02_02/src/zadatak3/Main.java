package zadatak3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Broj đaka i zaposlenih za unos:
		System.out.print("Koliko đaka želite da unesete? -> ");
		int brdj = Integer.parseInt(ulaz.readLine());
		Djak[] dj = new Djak[brdj];
		System.out.print("Koliko zaposlenih želite da unesete? -> ");
		int brzap = Integer.parseInt(ulaz.readLine());
		Zaposlen[] zap = new Zaposlen[brzap];

		// Unos đaka:
		for (int i = 0; i < dj.length; i++) {
			System.out.println("\nUnesite podatke za đaka br. " + (i + 1) + ".");
			System.out.print("\nIme i prezime: ");
			String ime = ulaz.readLine();
			System.out.print("Datum rođenja: ");
			String dat = ulaz.readLine();
			System.out.print("Adresa stanovanja: ");
			String adr = ulaz.readLine();
			System.out.print("Naziv škole: ");
			String nsko = ulaz.readLine();
			System.out.print("Razred: ");
			String raz = ulaz.readLine();
			dj[i] = new Djak(nsko, raz);
			dj[i].imeOsobe = ime;
			dj[i].datumRodjenja = dat;
			dj[i].adresaStanovanja = adr;
		}

		// Unos zaposlenih:
		for (int i = 0; i < zap.length; i++) {
			System.out.println("\nUnesite podatke za zaposlenog br. " + (i + 1) + ".");
			System.out.print("\nIme i prezime: ");
			String ime = ulaz.readLine();
			System.out.print("Datum rođenja: ");
			String dat = ulaz.readLine();
			System.out.print("Adresa stanovanja: ");
			String adr = ulaz.readLine();
			System.out.print("Naziv firme: ");
			String nf = ulaz.readLine();
			System.out.print("Radno odeljenje: ");
			String ro = ulaz.readLine();
			zap[i] = new Zaposlen(nf, ro);
			zap[i].imeOsobe = ime;
			zap[i].datumRodjenja = dat;
			zap[i].adresaStanovanja = adr;
		}

		// Štampanje podataka o osobama:
		System.out.println("\nĐaci:\n-----");
		for (Djak d : dj)
			d.tekstualniOpis();
		System.out.println("\nZaposleni:\n----------");
		for (Zaposlen z : zap)
			z.tekstualniOpis();

	}

}
