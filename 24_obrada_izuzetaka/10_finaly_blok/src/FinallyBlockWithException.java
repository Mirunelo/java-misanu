
public class FinallyBlockWithException {

	/* Through an exception out of the method. */
	void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo"); /* -> mi smo bacili izuzetak!!!
												 * throws je u zaglavlju metode, a throw se koristi za bacanje izuzetka
												 * u telu metode
												 */
		} finally {/* finally blok se izvršava bez obrzira da li je ili nije došlo do izuzetka */
			System.out.println("procA's finally");
		}
	}

	void procB() {
		try {
			System.out.println("inside procB");
			return; /* break, continue, System.exit(0) */
		} finally { /* kako god izašli iz programa finally blok se izvrši obavezno */
			System.out.println("procB's finally");
		}
	}

	/* Execute a try block normally. */
	void procC() {
		try {
			System.out.println("inside procC");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("procC's finally");
		}
	}

}
