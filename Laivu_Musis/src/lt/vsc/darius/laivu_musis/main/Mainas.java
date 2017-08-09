package lt.vsc.darius.laivu_musis.main;

public class Mainas {

	public static void main(String[] args) {
	Laivas [][] lenta;
		System.out.println("testas");
	AplinkaImplementation ap = new AplinkaImplementation();
	ap.padetiLaiva(4, 1, 5, Kryptis.HORIZONTAL);
	ap.padetiLaiva(3, 3, 5, Kryptis.HORIZONTAL);
	lenta = ap.gautiLenta();
	System.out.println(lenta[0][8].gautiDydi());
	}

}
