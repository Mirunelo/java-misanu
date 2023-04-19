package canak_mirko;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File f = new File("L:/JAVA/mirko.java");
		
		System.out.println("Fajl: " + f.getName() + (f.isFile() ? " je fajl " : " nije fajl!"));
		System.out.println("Apsolutna putanja: " + f.getAbsolutePath());
		System.out.println(f.exists() ? "Fajl " + f.getName() + " postoji" : "Fajl ne postoji");
		System.out.println(f.isDirectory() ? "Direktorijum" : f.getName() + " je Fajl");
		System.out.println(f.canRead() ? "Fajl može biti pročitan" : "Fajl ne može biti pročitan");
		System.out.println(f.canWrite() ? "Omogućeno je upisivanje" : "Nije omogućeno upisivanje");
		System.out.println("Veličina: " + f.length());
		System.out.println("Poslednja promena fajla: " + f.lastModified());
		
	}

}
