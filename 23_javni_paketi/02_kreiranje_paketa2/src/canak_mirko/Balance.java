package canak_mirko;

class Balance {

	String name;
	double bal;

	Balance(String n, double b) {
		name = n;
		bal = b;
	}

	void show() {
		if (bal < 0)
			System.out.println("U minusu: ");
		System.out.println(name + " = " + bal + "\n");
	}

}
