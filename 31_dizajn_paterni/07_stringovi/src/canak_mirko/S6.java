package canak_mirko;

public class S6 {

	public static void main(String[] args) {

		// Stringovi se predstavljaju klasom String
		String str = "123456ygfdsdcvg789523%$A&$&";
		System.out.println(str);

		// Kreiranje stringa pomoću ključne reči new
		String str1 = new String("Utorak, 24. januar.");
		System.out.println(str1);

		// Inicijalizacija stringa postojećim stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);

		// Inicijalizacija nizom char vrednosti
		char s3[] = { 'J', 'A', 'V', 'A' };
		System.out.println(s3);

		// Inicijalizacija podnizom
		String s4 = new String(s3, 0, 3);
		System.out.println(s4);

		// Metoda charAt vraća karakter tipa char sa zdadate pozicije u stringu
		char ch2 = "Java".charAt(3);
		System.out.println("Karakter na poziciji 3: " + ch2 + "\n");

		char ch3[] = { 'J', 'A', 'V', 'A' };
		String s7 = new String(ch3);

		//
		System.out.println("Length = " + s7.length());
		System.out.println("");

		/*
		 * Metoda equals vrsi leksikografsko poredjenje stringova, pri cemu se pravi
		 * razlika izmedju velikih i malih slova. Vraca true ako su stringovi isti, u
		 * suprotnom vraca false. Metoda iqualsIgnoreCase leksikograski poredi
		 * stringove, ali ne pravi razliku izmedju malih i velikih slova. Metoda
		 * compareTo poziva se kao: s1.compareTo(s2) vraca 0 ako su s1 i s2 jednaki,
		 * negativan broj ako je s1 manji, pozitivan broj ako je s1 veci od s2.
		 */

		// 6.
		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";

		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s10 + " = " + s8.equalsIgnoreCase(s10));

		// boolean b;
		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");
		System.out.println(s11 + " equals " + s12 + " = " + s11.equals(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));
		System.out.println(s11 + " equals " + s13 + " = " + s11.equals(s13));
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println(s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));
		System.out.println(s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));

		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";
		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));
		
		System.out.println("\nJoš primera za ==\n");
		String s21 = "Java"; // Alocirana memorija za objekat
		String s22 = "Java"; // Isti sadrzaj! Pravi se referenca ka s1 ali se ne kreira nov objekat
		String s23 = new String("Java"); // Uvek se kreira nov objekat, alocira se memorija
		String s24 = "Java";
		
		if (s21 == s22)
			System.out.println(s21 + " == " + s22);
		else
			System.out.println(s21 + " != " + s22);
		if (s21 == s23)
			System.out.println(s21 + " == " + s23);
		else
			System.out.println(s21 + " != " + s23);
		if (s21 == s24)
			System.out.println(s21 + " == " + s24);
		else
			System.out.println(s21 + " != " + s24);
		
		System.out.println(System.identityHashCode(s21));
		System.out.println(System.identityHashCode(s22));
		System.out.println(System.identityHashCode(s23));
		System.out.println(System.identityHashCode(s24));

	}

}
