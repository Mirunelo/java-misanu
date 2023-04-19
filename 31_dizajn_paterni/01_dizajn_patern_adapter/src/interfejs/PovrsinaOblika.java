package interfejs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PovrsinaOblika implements Oblici {

	@Override
	public void kvadrat() throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite dužinu stranice kvadrata: ");
		double s = Double.parseDouble(ulaz.readLine());
		double povrsinaKvadrata = s * s;
		System.out.println("Površina kvadrata iznosi: " + povrsinaKvadrata);

	}

	@Override
	public void krug() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite poluprečnik kruga: ");
		double r = Double.parseDouble(ulaz.readLine());
		double povrsinaKruga = Math.PI * r * r;
		System.out.println("Površina kruga iznosi: " + povrsinaKruga);

	}

	@Override
	public void pravougaonik() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite stranicu a pravougaonika: ");
		double a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu b pravougaonika: ");
		double b = Double.parseDouble(ulaz.readLine());
		double povrsinaPravougaonika = a * b;
		System.out.println("Površina pravougaonika iznosi: " + povrsinaPravougaonika);

	}

	@Override
	public void trougao() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite bazu trougla: ");
		double b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite visinu trougla: ");
		double h = Double.parseDouble(ulaz.readLine());
		double povrsinaTrougla = 0.5 * b * h;
		System.out.println("Površina trougla iznosi: " + povrsinaTrougla);

	}

}
