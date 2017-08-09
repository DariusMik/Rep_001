package lt.vsc.darius.laivu_musis.main;

public class LaivasImplementation implements Laivas {

	private int laivoDydis;
	private int x;
	private int y;
	private Kryptis kryptis;
	private boolean arGyvas;
	private int laivoGyvybes;

	public LaivasImplementation(int laivoDysis, int x, int y, Kryptis kryptis) {
		this.setKryptis(kryptis);
		this.laivoDydis = laivoDysis;
		this.x = x;
		this.y = y;
		laivoGyvybes = laivoDysis;
		setArGyvas(true);
	}

	private void setKryptis(Kryptis kryptis) {
		this.kryptis = kryptis;

	}

	public int gautiDydi() {
		return laivoDydis;
	}

	public void nustatytiDydi(int laivoDydis) {
		this.laivoDydis = laivoDydis;

	}

	@Override
	public int gautiX() {
		return x;
	}

	@Override
	public int gautiY() {
		return this.y;
	}

	public Kryptis gautiKrypti() {
		return kryptis;
	}

	public boolean isArGyvas() {
		return arGyvas;
	}

	public void setArGyvas(boolean arGyvas) {
		this.arGyvas = arGyvas;
	}

	public int getLaivoGyvybes() {
		return laivoGyvybes;
	}

	public void mazintiLaivoGyvybes() {
		laivoGyvybes--;
		if (laivoGyvybes < 1)
			setArGyvas(false);
	}

}
