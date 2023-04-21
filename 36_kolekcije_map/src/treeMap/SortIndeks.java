package treeMap;

import java.util.Comparator;

// Pomoćna klasa za implementaciju Comparator-a

public class SortIndeks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		//return o1.indeks - o2.indeks; // -> sortira indekse po rastućem poretku
		return o2.indeks - o1.indeks; // -> sortira indekse po opadajućem poretku
	}
	
	

}
