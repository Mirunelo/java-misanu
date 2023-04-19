package zadatak_06;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		OpisnaOcena<Integer, String> ocena = new OpisnaOcena<Integer, String>();

		int oc = 0;
		boolean test = true; // ovo ne mora ako se koristi komentarisani kod
		while (test) {
			try {
				System.out.print("Unesite ocenu od 1 do 5 (za prekid unesite -1): ");
				oc = Integer.parseInt(ulaz.readLine());
			} catch (NumberFormatException e) {
				System.out.print("");
			}

			//if (oc != -1 && (oc < 1 || oc > 5))
			//	System.out.println("\nOcena mora biti celobrojna vrednost od 1 do 5!");
			//else if (oc == -1)
			//	break;
			//else {
				switch (oc) {
				case 1: {
					ocena.setOcena(oc);
					ocena.setOpisnaOcena("nedovoljan");
					break;
				}
				case 2: {
					ocena.setOcena(oc);
					ocena.setOpisnaOcena("dovoljan");
					break;
				}
				case 3: {
					ocena.setOcena(oc);
					ocena.setOpisnaOcena("dobar");
					break;
				}
				case 4: {
					ocena.setOcena(oc);
					ocena.setOpisnaOcena("vrlodobar");
					break;
				}
				case 5: {
					ocena.setOcena(oc);
					ocena.setOpisnaOcena("odličan");
					break;
				}
				// case -1: i default su višak ako se koristi komentarisani kod
				case -1: {
					test = false;
					break;
				}
				default: {
					System.out.println("\nOcena mora biti celobrojna vrednost od 1 do 5!");
					break;
				}
			}

		}

		ocena.stampaj();

	}

}
