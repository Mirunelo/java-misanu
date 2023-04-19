package canak_mirko;

public class Z extends Thread {
	
	Z (String s){
		super (s);
	}
	
	public void run() {
		for(int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName());
	}

}
