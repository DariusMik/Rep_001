package lt.vsc.darius.laivu_musis.main;

public class Mainas {

	public static void main(String[] args) {
	Laivas [][] lenta;
		System.out.println("testas");
	AplinkaImplementation ap = new AplinkaImplementation();
	ap.padetiLaiva(4, 1, 5, Kryptis.HORIZONTAL);
	ap.gautiLenta();
	System.out.println();
	System.out.println(ap.gautiGyvuLaivuSkaiciu());

	}

}
