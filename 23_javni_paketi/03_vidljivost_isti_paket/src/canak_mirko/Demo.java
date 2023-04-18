package canak_mirko;

public class Demo {

	public static void main(String[] args) {

		/* Base ob1 = new Base(); - da ne štampa dva puta isto */
		SamePackage ob3 = new SamePackage();
		ob3.equals(null); /* Samo da ne bude warning */

	}

}
