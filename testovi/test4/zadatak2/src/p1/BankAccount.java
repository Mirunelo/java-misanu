package p1;

public class BankAccount {

	private double stanje;

	public BankAccount() {
		stanje = 0.0;
	}

	public BankAccount(double s) {
		stanje = s;
	}

	public void dodajSumu(double d) {
		System.out.println("\nTrenutni iznos na računu:\n" + stanje + "\nIznos uplate:\n" + d);
		stanje = stanje + d;
		ispisPoruke();

	}

	public double getStanje() {
		return stanje;
	}

	public void ispisPoruke() {
		System.out.println("\nVaše tenutno stanje iznosi: " + stanje);
	}

}
