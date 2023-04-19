package canak_mirko;

public class Main {

	public static void main(String[] args) {

		//	TestiraBroj paranBroj = /* Ovde dolazi lambda izraz */

		//	levaStranaLambdaIzraza -> DesnaStranaLambdaIzraza
		//	() -> 123.45
		//	double nekaMetoda() {return 123.45; }

			TestiraBroj paranBroj = (n) -> ( n % 2 ) == 0;

			if(paranBroj.testParanNeparan(10))
				System.out.println("Broj 10 je paran broj.");
			else
				System.out.println("Broj je neparan.");

	}

}
