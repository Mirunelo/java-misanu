package canak_mirko;

public class Main {

	public static void main(String[] args) {
		
		/* isAlive() - utvrđuje da li se nit još izvršava
		 * join() - Main klasa čeka da se nit završi pa nastavlja
		 */

		A a1 = new A("Prva nit");
		System.out.println("Prva nit se izvršava: " + a1.t.isAlive());
		A a2 = new A("Druga nit");
		System.out.println("Druga nit se izvršava: " + a2.t.isAlive());
		A a3 = new A("Treća nit");
		System.out.println("Treća nit se izvršava: " + a3.t.isAlive());
		
		try {
			a1.t.join();
			a2.t.join();
			a3.t.join();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Prva nit se izvršava: " + a1.t.isAlive());
		System.out.println("Druga nit se izvršava: " + a2.t.isAlive());
		System.out.println("Treća nit se izvršava: " + a3.t.isAlive());
	
	}
}
