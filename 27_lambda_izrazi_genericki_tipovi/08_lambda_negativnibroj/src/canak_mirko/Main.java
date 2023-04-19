package canak_mirko;

public class Main {

	public static void main(String[] args) {

		TestiraNegativanBroj negativanBroj = (n) -> (n<0);
		
		if(negativanBroj.testNegativanBroj(45))
			System.out.println("Broj -45 je negativan broj.");
		else
			System.out.println("Broj je pozitivan.");
		
	}

}
