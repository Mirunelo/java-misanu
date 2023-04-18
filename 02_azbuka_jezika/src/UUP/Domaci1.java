package UUP;

public class Domaci1 {

	public static void main(String[] args) {
		final short MAX_VREDNOST = 150;
		//int x&y = MAX_VREDNOST + 1; //ne može '&' jer nije slovo engleskog alfabeta.
		int $vr1 = MAX_VREDNOST + 2;
		int masa = MAX_VREDNOST + 3;
		//int kol. = MAX_VREDNOST + 4; //ne može '.' jer je to znak specijalnog tipa, tzv. separator.
		int x_1 = MAX_VREDNOST + 5;
		int _masa = MAX_VREDNOST + 6;
		//int suma brojeva = MAX_VREDNOST + 7; //Dve reči razdvojene razmakom ne mogu biti identifikatori. Moglo bi sumaBrojeva na primer.
		System.out.println("Konstanta MAX_VREDNOST iznosi: " + MAX_VREDNOST);
		System.out.println("Vrednosti za: \t$vr1\tmasa\tx_1\t_masa");
		System.out.print("iznose: \t" + $vr1 + "\t" + masa + "\t" + x_1 + "\t" + _masa);
			}

}
