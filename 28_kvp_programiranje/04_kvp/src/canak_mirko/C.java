package canak_mirko;

public class C extends Thread{

	C (String s){
		super(s); /* 	poziva se konstruktor Thread sledećeg oblika:
						public Thread(String imeNiti) */
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
}
