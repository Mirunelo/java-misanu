package canakmirko;

public class Operatori {

	public static void main(String[] args) {
		
		// Operatori 
		// Binarni operatori
		//  5 + 10 
		
		// = 
		
		// =  operator dodele vrednosti
		// vrednost koja se nalazi sa desne strane
		// znaka = dodeljuje se promenljivoj koja se nalazi 
		// sa leve strane znaka =
		
		int a = 5; // asocijativnost je sa desna na levo 
		int b = 50; 
		
		int zbir = a + b;
		System.out.println("Vrednost promenljive zbir je: " + zbir);
		
		// + je binarni operator
		// -, *, /, %
		
		int razlika = a - b;
		System.out.println("Razlika = " + razlika);
		
		int proizvod = a * b;
		System.out.println("Proizvod = " + proizvod);
		
		
		// Operator / predstavlja celobrojno deljenje
		float kolicnik = 13 / 3;  
		System.out.println("Količnik = " + kolicnik);
		
		// Deljenje sa ostatkom % 
		int ostatak = 17 % 3;
		System.out.println("Ostatak = " + ostatak);
		
		float tacnoDeljenje = 17f / 3f;
		System.out.println("Tacno deljenje: " + tacnoDeljenje);
		
		double provera = (double)50/3;
		System.out.println("Provera = " + provera);
		
	}

}
