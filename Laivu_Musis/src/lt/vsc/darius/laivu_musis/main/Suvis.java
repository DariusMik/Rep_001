package lt.vsc.darius.laivu_musis.main;

public class Suvis {
	private static int kiekSuviuBuvo = 0;
	private static int kiekTaikliuSuviuBuvo = 0;
	private int x;
	private int y;
	private boolean arTaiklus;

	public Suvis(int x, int y) {
		this.x = x;
		this.y = y;
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

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public static int getKiekSuviuBuvo() {
		return kiekSuviuBuvo;
	}

	public static int getKiekTaikliuSuviuBuvo() {
		return kiekTaikliuSuviuBuvo;
	}


}
