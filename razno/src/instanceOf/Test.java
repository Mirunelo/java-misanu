package instanceOf;

public class Test {

	public static void main(String[] args) {

		// Deklarišemo niz objekata klasa A i B
		System.out.println("// Deklarišemo nizA[] objekata klase A od 10 članova.");
		System.out.println("A[] nizA = new A[10];\n");
		
		A[] nizA = new A[10];
		
		System.out.println("// Deklarišemo nizB[] objekata klase B od 5 članova.");
		System.out.println("B[] nizB = new B[5];\n");
		
		B[] nizB = new B[5];

		// Inicijalizujemo objekte klase B
		System.out.println("// Inicijalizujemo \033[1;31mnizB[4] objekat klase B\033[0m, a kao rezultat dobijamo:");
		
		nizB[4] = new B();
		
		System.out.println("***( Zato što naša klasa B nasleđuje klasu A )");
		System.out.println("\nLinija koda:\n\033[1;31mnizB[3] = null;\033[0m \nKao rezultat daje šupalj nos do očiju.\n");
		
		nizB[3] = null;

		System.out.println("Inicijalizujemo \033[1;31mnizA[7] objekat klase A\033[0m i dobijamo kao rezultat:");
		
		nizA[7] = new A();
		
		System.out.println("\nInicijalizujemo \033[1;31mnizA[3] objekat klase A\033[0m i dobijamo kao rezultat:");
		
		nizA[3] = new A();

		System.out.println();

		if (nizB[1] instanceof A)
			System.out.println("nizB[1] je instanca klase A zato što je klasa B nasledila klasu A");
		else
			System.out.println("nizB[1] nije instanca klase A");

		if (nizB[3] instanceof A)
			System.out.println("nizB[3] je instanca klase A zato što je klasa B nasledila klasu A");
		else
			System.out.println("nizB[3] nije instanca klase A");

		if (nizB[4] instanceof A)
			System.out.println("nizB[4] je instanca klase A zato što je klasa B nasledila klasu A");
		else
			System.out.println("nizB[4] nije instanca klase A");

		// ------------------------------- //

		if (nizA[7] instanceof A)
			System.out.println("nizA[7] je instanca klase A");
		else
			System.out.println("nizA[7] nije instanca klase A");
		
		if (nizA[3] instanceof B)
			System.out.println("nizA[3] je instanca klase B");
		else
			System.out.println("nizA[3] nije instanca klase B");

	}

}
