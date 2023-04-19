package zadatak_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OpisnaOcena<T1, T2> {

	List<T1> ocene = new ArrayList<T1>();
	List<T2> opisneOcene = new LinkedList<T2>();

	int i = 0;

	public void setOcena(T1 o) {
		ocene.add(o);
	}

	public void setOpisnaOcena(T2 oo) {
		opisneOcene.add(oo);
	}

	public void stampaj() {
		for (T1 o : ocene)
			System.out.println(o + " : " + opisneOcene.get(i++));
	}

}
