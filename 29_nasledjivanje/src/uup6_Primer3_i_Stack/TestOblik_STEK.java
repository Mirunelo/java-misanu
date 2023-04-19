package uup6_Primer3_i_Stack;

import java.util.Stack;

public class TestOblik_STEK {

	public static void main(String[] args) {

		Krug krug = new Krug(1);

		Pravougaonik pravougaonik = new Pravougaonik(4, 5);
		
		Kvadrat kvadrat = new Kvadrat(5);

		// Stack stek = new Stack(); - valjalo bi da bude parametrizovano kao ispod.
		Stack<Oblik> stek = new Stack<Oblik>();

		stek.push(krug);
		stek.push(pravougaonik);
		stek.push(kvadrat);

		while (!stek.empty()) {
			// Oblik oblik = (Oblik) stek.pop();
			Oblik oblik = stek.pop();
			System.out.println("Površina je " + oblik.uzmiPovrsinu());
		}
	}
}