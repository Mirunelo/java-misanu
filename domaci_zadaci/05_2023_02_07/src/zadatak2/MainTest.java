package zadatak2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainTest {

	public static void main(String[] args) throws Exception {
		
		// inicijalizacija promenljivih
		double st, a, b, c, r;
		
		// Unos parametara predmeta - svaki predmet dobija sopstvenu slovnu oznaku
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Koliko kvadara želite da unesete?");
		int kn = Integer.parseInt(ulaz.readLine());
		Kvadar k[] = new Kvadar[kn];
		for(int i = 0; i < kn; i++) {
			System.out.print("Kvadar (K" + (i+1) + "):\nUnesite specifičnu težinu (NPR: zlato 19, srebro 10.5, gvožđe 7.2 g/cm\u00b3 itd.): ");
			st = Double.parseDouble(ulaz.readLine());
			System.out.print("Unesite stranice kvadra:\na = ");
			a = Double.parseDouble(ulaz.readLine());
			System.out.print("b = ");
			b = Double.parseDouble(ulaz.readLine());
			System.out.print("c = ");
			c = Double.parseDouble(ulaz.readLine());
			k[i] = new Kvadar(st, a, b, c);	
		}
		System.out.println("Koliko sferi želite da unesete?");
		int sn = Integer.parseInt(ulaz.readLine());
		Sfera s[] = new Sfera[sn];
		for(int i = 0; i < sn; i++) {
			System.out.print("Sfera (S" + (i+1) + "):\nUnesite specifičnu težinu (NPR: zlato 19, srebro 10.5, gvožđe 7.2 g/cm\u00b3 itd.): ");
			st = Double.parseDouble(ulaz.readLine());
			System.out.print("Unesite poluprečnik sfere r = ");
			r = Double.parseDouble(ulaz.readLine());
			s[i] = new Sfera(st, r);
		}
		
		// Izračunava prosečnu težinu svih K i S predmeta
		double suma = 0;
		for(int i = 0; i < kn; i++)
			suma += k[i].tezina();
		for(int i = 0; i < sn; i++)
			suma += s[i].tezina();
		double prosek = suma/(kn+sn);
		System.out.println("----------------------------------------------------");
		System.out.println("  Prosečna težina svih predmeta iznosi: " + df.format(prosek/1000.0) + " kg");
		System.out.println("----------------------------------------------------");
		
		// Štampa opise K i S predmeta koji su teži od proseka
		System.out.println("\nPredmeti " + k[0].getOznaka() + " i " + s[0].getOznaka() + " čija je težina veća od prosečne:");
		for(int i = 0; i < kn; i++)
			if(k[i].tezina() > prosek)
				System.out.println(k[i].opis());
		for(int i = 0; i < sn; i++)
			if(s[i].tezina() > prosek)
				System.out.println(s[i].opis());
		
		// Provera -> štampam sve predmete:
		//System.out.println("\nPredmeti " + k[0].getOznaka() + " i " + s[0].getOznaka() + " sviiiii:");
		//for(int i = 0; i < kn; i++)
		//	System.out.println(k[i].opis());
		//for(int i = 0; i < sn; i++)
		//	System.out.println(s[i].opis());
		
	}

}
