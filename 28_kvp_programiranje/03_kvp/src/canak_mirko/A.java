package canak_mirko;

/* Nit se može napraviti i kada klasu Thread proširite novom nasleđenom klasom, a zatim
 * napravite instancu te klase.
 * 
 * Nova potklasa mora da redefiniše metodu run()
 */

public class A extends Thread{
	
	A (String s){
		super(s); /* 	poziva se konstruktor Thread sledećeg oblika:
						public Thread(String imeNiti) */
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}

}
