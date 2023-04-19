package zadatak2;

import java.util.ArrayList;

public class Zadatak_02_ArrayList {

	/* Program iz zadatog niza prirodnih brojeva briše duplikate. */

	public static void main(String[] args) {

		// Zadajemo niz prirodnih brojeva
		int[] niz = { 1, 2, 3, 2, 1, 4, 5, 6, 5, 7, 12, 34, 444, 345, 12, 345, 8, 3, 6, 2 };

		ArrayList<Integer> al = new ArrayList<>();

		// Prebacujemo sve elemente niza u dinamički ArrayList
		for (int i : niz)
			al.add(i);

		// Štampamo početni izgled dinamičkog niza
		System.out.println(al);

		// Pretražujemo dinamički niz i brišemo duplikate
		// ostavio sam if sa .intValue() da znam da može i tako
		for (int i = 0; i < al.size(); i++)
			for (int j = i - 1; j >= 0; j--) {
				// if (al.get(j).equals(al.get(i))) {
				if (al.get(j).intValue() == (al.get(i).intValue())) {
					al.remove(i);
					i--;
					break;
				}
			}
		// Štampamo modifikovani dinamički niz bez duplikata
		System.out.println(al);
	}

}
