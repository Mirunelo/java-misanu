package zadatak2;

public class Main {
	
	static Student st = new Student();

	public static void main(String[] args) {
		
		// Kreiramo studente 1 i 2:
		st.dodajStudenta("Petar Petrović", 20221234L, 3);
		st.dodajStudenta("Đorđe Đorđević", 20207864515L, 5);
		// Duplikat studenta se ne može kreirati
		st.dodajStudenta("Petar Petrović", 20221234L, 10);
		
		// Dodajemo ocene studentu 1:
		// Ispit će se kreirati sa ocenom 10 i šifrom "Matema"
		dodajIspite(1, "Matematika", 12);
		// Ispit će se kreirati sa ocenom 5 i šifrom "OOP"
		dodajIspite(1, "OOP", 4);
		// Ispit će se kreirati sa ocenom 6 i šifrom "Muzičk"
		dodajIspite(1, "Muzičko vaspitanje", 6);
		
		// Exception: Četvrti ispit se ne može dodati u niz kapaciteta 3
		dodajIspite(1, "Fizika", 8);
		
		// Opis studenta 1
		System.out.println();
		opisStudenta(1);

		System.out.println();
		
		////////////// OBRADA STUDENTA 2 //////////////
		
		dodajIspite(2, "Fizičko vaspitanje", 10);
		dodajIspite(2, "Biologija", 9);
		dodajIspite(2, "Geografija", 7);
		dodajIspite(2, "Istorija", 6);
		dodajIspite(2, "Programiranje", 19);
		// Exception
		dodajIspite(2, "Fizika", 2);
		
		System.out.println();
		opisStudenta(2);
		
	}
	
	private static void dodajIspite(int i, String ime, int ocena) {
		st.getStudenti().get(i).dodajIspit(ime, ocena);
	}
	
	private static void opisStudenta(int i) {
		System.out.println(st.getStudenti().get(i).opis());
	}

}
