package canak_mirko;

public class A extends Thread {

	public void run() {

		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);
			// sleep(vrednostUMilisekundama)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Nit je prekinuta.");
				e.printStackTrace();
			}
			i++;
		}

	}
/* sleep(milisekunde) - privremeno zaustavlja(suspenduje)izvršavanje niti
 * pa izgleda da se program usporio. Recimo ispis koječega.
 * argument metode sleep() je interval čekanja u milisekundama.
 * 
 * Metoda sleep() u klasi Thread može da izazove izuzetak InterruptedException
 * Desiće se izuzetak ukoliko neka druga nit poželi da prekine ovu suspendovanu nit.
 * 
 * Zato mora da se navede u try{}catch(InterruptedException e)
 */
}
