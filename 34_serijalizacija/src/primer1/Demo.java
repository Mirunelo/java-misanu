// JAVA program za serijalizaciju i deserijalizaciju
// JAVA objekta.

package primer1;

import java.io.*;
@SuppressWarnings("unused")

/*
 * Implementacija java.io.Serializable interfejsa je neophodna da omogući
 * serijalizaciju Java objekta. Serializable je interfejs bez podataka i metoda,
 * koji služi sa obeleži JAVA klasu, da bi objekti te klase dobili određene
 * sposobnosti. Kloniranje i prenos. 1) ukoliko klasa roditelj implementira
 * Serializable interfejs, klasa dete ne mora, što ne važi u obratnom slučaju.
 * 2) Samo nestatički podaci se čuvaju kroz proces Serijalizacije. 3) Statički
 * podaci i transient podaci se ne čuvaju u procesu serijalizacije. 4)
 * Konstruktor objekta se nikad ne poziva kada se neki objekat deserijalizuje.
 * 5) Pridruženi objekti moraju implementirati Serializable interfejs.
 */
public class Demo implements java.io.Serializable{
	
	/**
	 * 
	 */
	/*
	 * serialVersionUID se koristi tokom deserijalizacije da se verifikuje da
	 * pošiljalac i primalac objekta imaju učitane klase za taj objekat koje su
	 * kompatibilne u pogledu serijalizacije. Ukoliko je primalac učitao klasu za
	 * objekat koji ima drugačiji UID od onog u klasi pošiljaoca, deserijalizacija
	 * će rezultirati izuzetkom InvalidClassException. Serijalizabilna klasa može
	 * deklarisati svoj vlastiti UID eksplicitno deklarišući ime polja. Mora biti
	 * static, final i tipa long. Ukoliko serijalizabilna klasa eksplicitno ne
	 * deklariše UID onda će u toku izvršenja programa biti iskalkulisan
	 * podrazumevani UID baziran na raznim aspektima klase. Dobra praksa nalaže da
	 * sve serijalizabilne klase eksplicitno deklarišu vrednost UID pošto je
	 * izračunavanje vrlo osetljivo na detalje klase koji mogu zavisiti i od
	 * implementiranog kompajlera, a bilo kakva izmena u klasi ili korišćenje
	 * drugačijeg ID-a može uticati na serijalizovane podatke. Takođe se preporučuje
	 * upotreba private modifikatora za UID, zato što je beskorisan kao nasleđeni
	 * član.
	 */
	private static final long serialVersionUID = 2872965861695658546L;
	public int a;
	public String b;
	
	// Konstruktor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}
