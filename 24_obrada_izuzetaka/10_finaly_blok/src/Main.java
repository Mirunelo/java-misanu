
public class Main {

	public static void main(String[] args) {

		FinallyBlockWithException fbwe = new FinallyBlockWithException();
		
		try {
			fbwe.procA();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		fbwe.procB();
		try {
			fbwe.procC();
		} catch (Exception e) {
			System.out.println("Ponovo hvatamo bačen Exception u metodi procC!");
		}
	}

}
