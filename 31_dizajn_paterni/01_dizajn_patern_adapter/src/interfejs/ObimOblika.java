package interfejs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObimOblika implements Oblici {

	@Override
	public void kvadrat() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite dužinu stranice kvadrata: ");
		double s = Double.parseDouble(ulaz.readLine());
		double obimKvadrata = 4 * s;
		System.out.println("Obim kvadrata iznosi: " + obimKvadrata);
	}

	@Override
	public void krug() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite poluprečnik kruga: ");
		double r = Double.parseDouble(ulaz.readLine());
		double obimKruga = 2 * r * Math.PI;
		System.out.println("Obim kruga iznosi: " + obimKruga);

	}

	@Override
	public void pravougaonik() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite stranicu a pravougaonika: ");
		double a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu b pravougaonika: ");
		double b = Double.parseDouble(ulaz.readLine());
		double obimPravougaonika = 2 * (a + b);
		System.out.println("Obim pravougaonika iznosi: " + obimPravougaonika);

	}

	@Override
	public void trougao() throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite stranicu trougla a: ");
		double a = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu trougla b: ");
		double b = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite stranicu trougla c: ");
		double c = Double.parseDouble(ulaz.readLine());
		double obimTrougla = a + b + c;
		System.out.println("Obim trougla iznosi: " + obimTrougla);

	}

}
