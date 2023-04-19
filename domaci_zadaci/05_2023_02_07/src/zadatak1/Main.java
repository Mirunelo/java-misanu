package zadatak1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {

		// Upis tačaka A i B
		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Zadajte tačke A i B koordinatama X i Y.\nTačka A:\nX = ");
		double x1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Y = ");
		double y1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Tačka B:\nX = ");
		double x2 = Double.parseDouble(ulaz.readLine());
		System.out.println("Y = ");
		double y2 = Double.parseDouble(ulaz.readLine());
		
		// Postavljanje koordinata tačaka preko parametrizovanog konstruktora
		TackeURavni tackaA = new TackeURavni(x1, y1);
		TackeURavni tackaB = new TackeURavni(x2, y2);
		// Postavljanje tačke O u koordinatni početak pozivom default konstruktora
		TackeURavni tackaO = new TackeURavni();
		// Postavljanje tačke C putem Set-era na X = 12, Y = -9
		TackeURavni tackaC = new TackeURavni();
		tackaC.setX(12);
		tackaC.setY(-9);
		
		// Pozivanje metode za opis tačaka
		System.out.println("\nTačka O:  " + tackaO.opisTacke());
		System.out.println("\nTačka A:  " + tackaA.opisTacke());
		System.out.println("\nTačka B:  " + tackaB.opisTacke());
		System.out.println("\nTačka C:  " + tackaC.opisTacke());
		
		// Pozivanje metode za izračunavanje rastojanja između tačaka A i B
		double rastojanje = tackaA.rastojanje(tackaB);
		// Štampanje rastojanja
		System.out.println("\nRastojanje između tačaka A i B iznosi: " + df.format(rastojanje));
		
		// Određivanje rastojanja tačaka A i B od koordinatnog početka O
		rastojanje = tackaA.rastojanje(tackaO);
		System.out.println("\nRastojanje tačke A od koordinatnog početka: " + df.format(rastojanje));
		rastojanje = tackaB.rastojanje(tackaO);
		System.out.println("Rastojanje tačke B od koordinatnog početka: " + df.format(rastojanje));
		rastojanje = tackaC.rastojanje(tackaO);
		System.out.println("Rastojanje tačke C od koordinatnog početka: " + df.format(rastojanje));
		
	}

}
