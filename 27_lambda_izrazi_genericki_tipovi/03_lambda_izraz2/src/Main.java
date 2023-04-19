
public class Main {

	public static void main(String[] args) {

		ProveraDeljivosti pd = (n, d) -> (n % d) == 0;
		
		if (pd.testDeljivosti(10, 2))
			System.out.println("Broj 10 je deljiv sa 2.");
		else
			System.out.println("Brojevi nisu deljivi.");
		
	}

}
