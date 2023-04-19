package canak_mirko;

/* Nit se može napraviti za svaki objekat koji implementira interfejs Runnable.
 * Da bi klasa implementirala interfejs Runnable, potrebno je samo da ima metodu
 * run(), deklarisana u sledećem obliku: Public void run()
 * U metodi run() zadajete kod koji treba da se izvršava u novoj niti.
 * Kada se izvrši metoda run() nit se uništava. */

public class A implements Runnable{

	public void run() {
		
		for ( int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
