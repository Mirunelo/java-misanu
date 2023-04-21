// Java program koji demonstrira TreeMap
// uz upotrebu Comparator konstruktora

package treeMap;

import java.util.TreeMap;

public class Main {
	
	// Poziva konstruktor unutar main()
	static void ComparatorKonstruktor() {
		// Kreiranje prazne TreeMap-e
		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>(new SortIndeks());
		
		// Mapiranje String vrednosti ka int ključevima
		tm.put(new Student(111, "Pera", "Beograd"), 2);
		tm.put(new Student(137, "Milica", "Valjevo"), 3);
		tm.put(new Student(123, "Đorđe", "Niš"), 1);
		
		// Štampanje elemenata TreeMap-e
		System.out.println("TreeMap: " + tm);
	}

	// Main glavni metod
	public static void main(String[] args) {
		
		System.out.println("TreeMap koristi " + "TreeMap(Comparator)" + " konstruktor:\n");
		ComparatorKonstruktor();

	}

}
