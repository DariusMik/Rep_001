package lt.vsc.darius.laivu_musis.main;

public class Mainas {

	public static void main(String[] args) {
	

	AplinkaImplementation ap = new AplinkaImplementation();


	ap.padetiLaiva(1, 6, 1, Kryptis.HORIZONTAL);
	ap.padetiLaiva(1, 1, 1, Kryptis.VERTICAL);
	ap.padetiLaiva(1, 9, 1, Kryptis.HORIZONTAL);
	ap.padetiLaiva(1, 1, 9, Kryptis.VERTICAL);
	ap.padetiLaiva(1, 1, 7, Kryptis.VERTICAL);
	ap.padetiLaiva(2, 3, 3, Kryptis.VERTICAL);
	


	ap.sauti(1, 9);

	System.out.println(ap.gautiLaivuSkaiciu());
	System.out.println(ap.gautiGyvuLaivuSkaiciu());
	}

}
