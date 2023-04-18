package canak.mirko;

public class For3 {

	public static void main(String[] args) {

		int zbir = 0; // 0 predstavlja neutral prilikom sabiranja
		for(int i = 1; i <= 10; i++)
		{
			zbir = zbir + i; // zbir += i;
		}
		System.out.println("Zbir brojeva iznosi: " + zbir);
	}

}
