package zadatak1;

public class Main {

	public static void main(String[] args) {

		// Stvaranje vektora:
		
		// od 1 do 10
		Vektor v0 = new Vektor();
		// od 1 do zadate gornje granice
		Vektor v1 = new Vektor(3);
		// od zadate donje do zadate gornje granice
		Vektor v2 = new Vektor(2, 5);
		
		// Neka realna vrednost
		double vrednost = 1.0;
		
		// testiranje dohvatanja graničnih vrednosti indeksa
		for(int i = v0.getIndex0(); i <= v0.getIndexN(); i++)
			// testiranje postavljanja komponente sa zadatim indeksom
			v0.setKomponenta(i, vrednost++);
		// Resetovanje vrednosti
		vrednost = 1.0;
		for(int i = v1.getIndex0(); i <= v1.getIndexN(); i++)
			v1.setKomponenta(i, vrednost++);
		vrednost = 1.0;
		for(int i = v2.getIndex0(); i <= v2.getIndexN(); i++)
			v2.setKomponenta(i, vrednost++);
		
		// Štampanje vektora:
		System.out.print("Vektor v0[" + v0.getIndex0() + ", " + v0.getIndexN() + "]: ");
		for(int i = v0.getIndex0(); i <= v0.getIndexN(); i++)
			// testiranje dohvatanja komponente sa zadatim indeksom
			System.out.print(v0.getKomponenta(i) + ", ");
		System.out.print("\nVektor v1[" + v1.getIndex0() + ", " + v1.getIndexN() + "]: ");
		for(int i = v1.getIndex0(); i <= v1.getIndexN(); i++)
			System.out.print(v1.getKomponenta(i) + ", ");
		System.out.print("\nVektor v2[" + v2.getIndex0() + ", " + v2.getIndexN() + "]: ");
		for(int i = v2.getIndex0(); i <= v2.getIndexN(); i++)
				System.out.print(v2.getKomponenta(i) + ", ");
		
		// Izračunavanje skalarnih proizvoda dva vektora:
		System.out.println("\n\nMnožimo elemente dva vektora sa istim indeksima,\na suma svih tih proizvoda je skalarni proizvod ta dva vektora.");
		// testiranje skalarnog proizvada dva vektora
		double skalarProizvod = v0.skalarniProizvod(v1);
		System.out.print("\nSkalarni proizvod vektora v0 i v1 iznosi: " + skalarProizvod);
		skalarProizvod = v0.skalarniProizvod(v2);
		System.out.print("\nSkalarni proizvod vektora v0 i v2 iznosi: " + skalarProizvod);
		skalarProizvod = v1.skalarniProizvod(v2);
		System.out.print("\nSkalarni proizvod vektora v1 i v2 iznosi: " + skalarProizvod);
		
	}

}
