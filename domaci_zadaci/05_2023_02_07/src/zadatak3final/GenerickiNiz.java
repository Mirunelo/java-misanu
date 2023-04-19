package zadatak3final;

public class GenerickiNiz<T> {

	private final Object[] OBJ_NIZ; // niz objekata
	public final int DUZINA; // dužina niza

	// Konstruktor klase
	public GenerickiNiz(int duzina) {
		// Instanciranje novog niza objekata zadate dužine
		OBJ_NIZ = new Object[duzina];
		DUZINA = duzina;
	}

	// Geter-uj broj elemenata niza
	int brElemenata() {
		return OBJ_NIZ.length;
	}

	// Geter-uj OBJ_NIZ[i]
	T get(int i) {
		// @SuppressWarnings("unchecked") sprečava upozorenje o
		// kastovanju Objekta u parametrizovani tip bez provere tipa.
		@SuppressWarnings("unchecked")
		final T E = (T) OBJ_NIZ[i];
		return E;
	}

	// Seter-uj element u OBJ_NIZ[i]
	void set(int i, T e) {
		OBJ_NIZ[i] = e;
	}

}
