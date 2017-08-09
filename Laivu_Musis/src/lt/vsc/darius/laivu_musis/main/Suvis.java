package lt.vsc.darius.laivu_musis.main;

public class Suvis {
	private static int kiekSuviuBuvo = 0;
	private static int kiekTaikliuSuviuBuvo = 0;
	private boolean arTaiklus;

	public Suvis() {
		arTaiklus = false;
		kiekSuviuBuvo++;
	}

	public void setSuvisTaiklus() {
		arTaiklus = true;
		kiekSuviuBuvo++;
	}

	public boolean arSuvisBuvoTaiklus() {
		return arTaiklus;
	}

	public static int getKiekSuviuBuvo() {
		return kiekSuviuBuvo;
	}

	public static int getKiekTaikliuSuviuBuvo() {
		return kiekTaikliuSuviuBuvo;
	}

}
