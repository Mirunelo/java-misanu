package interfejs;

public class TestOblika {

	public static void main(String[] args) throws Exception {

		ObimOblika obimGeometrijskogTela = new ObimOblika();
		PovrsinaOblika povrsinaGeometrijskogTela = new PovrsinaOblika();

		povrsinaGeometrijskogTela.krug();
		povrsinaGeometrijskogTela.kvadrat();
		povrsinaGeometrijskogTela.pravougaonik();
		povrsinaGeometrijskogTela.trougao();

		obimGeometrijskogTela.krug();
		obimGeometrijskogTela.kvadrat();
		obimGeometrijskogTela.pravougaonik();
		obimGeometrijskogTela.trougao();

	}

}
