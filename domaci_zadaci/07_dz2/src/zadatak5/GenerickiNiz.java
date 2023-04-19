package zadatak5;

public class GenerickiNiz<T> {

	private final Object[] OBJ_NIZ; // niz objekata
	public final int DUZINA; // dužina niza

	public GenerickiNiz() {
		DUZINA = 20;
		OBJ_NIZ = new Object[DUZINA];
	}
	
	public GenerickiNiz(int duzina) {
		// Instanciranje novog niza objekata zadate dužine
		DUZINA = duzina;
		OBJ_NIZ = new Object[DUZINA];
	}

	// Dohvati broj elemenata niza
	public int brElemenata() {
		int brElemenata = 0;
		for(int i = 0; i < OBJ_NIZ.length; i++)
			if(OBJ_NIZ[i] != null)
				brElemenata++;
		return brElemenata;
	}

	// Dohvatanje elemenata niza
	public T get(int i) {
		if(i < brElemenata()) {
			@SuppressWarnings("unchecked")
			final T E = (T) OBJ_NIZ[i];
			return E;
		}
		else {
			System.err.println("Greška! Ne možete dohvatiti nepostojeći element.");
			return null;
		}
		
	}

	// Dodavanje elemenata u niz
	public void set(int i, T e) {
		try {
			OBJ_NIZ[i] = e;
			System.out.println("Vožnja je uspešno dodata");
		}catch(ArrayIndexOutOfBoundsException err) {
			System.err.println("Greška! Element se ne može dodati. Niz je prepunjen.");
		}
	}

	// Pražnjenje niza
	public void isprazniNiz() {
		for(int i = 0; i < OBJ_NIZ.length; i++)
			OBJ_NIZ[i] = null;
		System.out.println("Niz je ispražnjen.");
	}
	
}
