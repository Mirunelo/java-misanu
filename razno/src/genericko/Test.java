package genericko;

// GENERIČKA KLASA
class Test<T, U, N> {

	// POLJE
	T objekat1;
	U objekat2;
	N[] objekat3;

	// KONSTRUKTORI
	Test() {
	}

	Test(N[] objekat3) {
		this.objekat3 = objekat3;
	}

	Test(T objekat1, U objekat2) {
		this.objekat1 = objekat1;
		this.objekat2 = objekat2;
	}

	// GET-eri i SET-eri (generisani Source alatkom)
	public T getObjekat1() {
		return objekat1;
	}

	public void setObjekat1(T objekat1) {
		this.objekat1 = objekat1;
	}

	public U getObjekat2() {
		return objekat2;
	}

	public void setObjekat2(U objekat2) {
		this.objekat2 = objekat2;
	}

	// Niz get-er
	public N[] getObjekat3() {
		return objekat3;
	}

	// Niz set-er
	public void setObjekat3(N[] objekat3) {
		this.objekat3 = objekat3;
	}

	// METODE:

	// STATIC generička metoda za štampanje prosleđenih elemenata
	static <T> void generickaStampa(T element) {
		System.out.println(element.getClass().getName() + " = " + element + "\n");
	}

	// STATIC generička metoda za štampanje nizova
	static <N> void generickaStampaNiza(N[] niz) {
		System.out.print(niz.getClass().getName() + "] = ");
		for (N e : niz)
			System.out.print(e + ", ");
		System.out.println();
	}

	// Metoda za štampanje objekata 1 i 2 tipa surprise
	void stampaObjekte() {
		System.out.println(objekat1.getClass().getName() + " = " + objekat1);
		System.out.println(objekat2.getClass().getName() + " = " + objekat2 + "\n");
	}

	// Metoda za štampanje objekta 3 kao niza elemenata
	void stampaNiz() {
		System.out.print(objekat3.getClass().getName() + "] = ");
		for (N e : objekat3)
			System.out.print(e + ", ");
		System.out.println();
	}

}
