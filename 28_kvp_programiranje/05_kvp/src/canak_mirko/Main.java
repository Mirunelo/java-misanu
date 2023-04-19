package canak_mirko;

public class Main {

	public static void main(String[] args) {

		A obKlaseA = new A();
		B obKlaseB = new B();
		C obKlaseC = new C();
		
		Thread t1 = new Thread(obKlaseA, "Nit 1");
		Thread t2 = new Thread(obKlaseB, "Nit 2");
		Thread t3 = new Thread(obKlaseC, "Nit 3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
