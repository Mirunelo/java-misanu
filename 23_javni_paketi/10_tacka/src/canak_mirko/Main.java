package canak_mirko;

public class Main {

	public static void main(String[] args) {

		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2, 2);

		System.out.println("Rastojanje od koordinatnog početka tačke 1 iznosi: " + t1.poteg());
		System.out.println("Rastojanje od koordinatnog početka tačke 2 iznosi: " + t2.poteg());
		System.out.println("Rastojanje od koordinatnog početka tačke 3 iznosi: " + t3.poteg());

		System.out.println();

		System.out.println("Rastojanje tačke t1 od tačke t2: " + t1.Rastojanje(t2));
		System.out.println("Rastojanje tačke t1 od tačke t3: " + t1.Rastojanje(t3));
		System.out.println("Rastojanje tačke t2 od tačke t3: " + t2.Rastojanje(t3));

	}

}
