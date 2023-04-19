package zadatak_03;

public class Main {

	public static void main(String[] args) {

		NasumicanBroj bingo = () -> Math.random();

		System.out.println("Program je generisao slučajni broj: " + bingo.slucajanBroj());
		
	}

}
