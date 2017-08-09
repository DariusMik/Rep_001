package lt.vsc.darius.laivu_musis.main;

public class Mainas {

	public static void main(String[] args) {
		System.out.println("testas");
	AplinkaImplementation ap = new AplinkaImplementation();
	ap.padetiLaiva(4, 5, 5, Kryptis.HORIZONTAL);
	ap.padetiLaiva(3, 1, 1, Kryptis.HORIZONTAL);
	ap.padetiLaiva(4, 1, 5, Kryptis.HORIZONTAL);
	ap.gautiLenta();
	System.out.println();
	System.out.println(ap.gautiGyvuLaivuSkaiciu());

	}

}
