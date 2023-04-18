package canak_mirko;

public class Box {

	double width;
	double height;
	double depth;
	
}

/* Klasa u Javi predstavlja uputstvo koje kaže kako će izgledati i kako će se ponašati objekt koji je iz nje kreiran.
Polja (atributi) sadrže trenutno stanje nekog objekta (ili klase).
Metode implementiraju ponašanje objekata odnosno klase.
Java podržava sledeće nivoe pristupa članovima klase (promenljivama i metodama): private, protected, public,
i ukoliko se ne zada, package.

Private:
- Najrestriktivniji nivo pristupa. Privatnom članu mogu da
pristupe samo ostali članovi klase u kojoj je on definisan.
- Članovi izvedene klase ne mogu da mu pristupe.
Privatni članovi deklarišu se ključnom reči private.

Protected:
- Zaštićenim članovima mogu da pristupaju članovi klase u kojoj
je definisa, članovi izvedenih klasa i sve klase unutar istog paketa.
- Zaštićeni članovi deklarišu se ključnom reči protected

Public: - Bilo koja klasa, u bilo kom paketu, ima pravo pristupa javnim članovima neke klase.
- Javni članovi klase implementiraju način komunikacije sa nekim objektom.
- Ključna reč public se koristi da bi se deklarisao javni član klase.

Package:
- Ovo je nivo pristupa koji se dobija ukoliko se ne navede
nijedan deklarator nivoa pristupa.
- Ovaj nivo pristupa dozvoljava klasama unutar istog paketa
da pristupi članovima klase. Podrazumeva se da su klase unutar
istog paketa poverljivi prijatelji.*/
