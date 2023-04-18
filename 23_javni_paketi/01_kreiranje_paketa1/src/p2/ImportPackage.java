/* Prvi način: prelaskom pokazivača miša preko naziva klase i importovanjem klase */

package p2;

/* import p1.*  -bi importovalo sve klase u paketu p1 */
import p1.First; /* Importujemo samo klasu First paketa p1 */
/* import paket.nazivKlase; -imporujemo samo zadatu klasu iz navedenog paketa */
/* import paket.*; - importujemo sve klase iz navedenog paketa */

public class ImportPackage {

	public static void main(String[] args) {

		First f = new First(); /* Kreiranje objekta klase */
		f.view(); /* za dati objekat poziv funkcije. */
		System.out.println("Promenljiva a = " + f.a);
	}

}
