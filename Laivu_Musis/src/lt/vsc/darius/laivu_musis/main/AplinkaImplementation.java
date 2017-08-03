package lt.vsc.darius.laivu_musis.main;

import java.util.ArrayList;

public class AplinkaImplementation implements Aplinka {
	private int xMax=10;
	private int yMax=10;
	private ArrayList<LaivasImplementation> laivuMasyvas = new ArrayList<LaivasImplementation>();

	/*
	 * public LaivasImplementation padetiLaiva(int laivoDydis, int x, int y, String
	 * pozicija) { LaivasImplementation naujasLaivas = null; if (pozicija ==
	 * "Vertikaliai") yMax = yMax - laivoDydis + 1; else xMax = xMax - laivoDydis +
	 * 1;
	 * 
	 * if (x <= xMax && x > 0 && y <= yMax && y > 0) { naujasLaivas = new
	 * LaivasImplementation(laivoDydis, x, y, pozicija); laivuSkaicius++; } return
	 * naujasLaivas;
	 * 
	 * }
	 */
	@Override
	public Laivas padetiLaiva(int dydis, int x, int y, Kryptis kryptis) {
		LaivasImplementation naujasLaivas = null;
		switch (kryptis) {
		case HORIZONTAL:
			xMax = xMax - dydis + 1;
			break;

		case VERTICAL:
			xMax = xMax - dydis + 1;
			break;
		}
		if (x <= xMax && x > 0 && y <= yMax && y > 0) {
			naujasLaivas = new LaivasImplementation(dydis, x, y, kryptis);
			laivuMasyvas.add(naujasLaivas);

		}

		return naujasLaivas;
	}

	@Override
	public int gautiGyvuLaivuSkaiciu() {
		int temp = 0;
		for (LaivasImplementation l : this.laivuMasyvas)
			if (l.isArGyvas())
				temp++;
		return temp;
	}

	@Override
	public Laivas[][] gautiLenta() {
		char lenta[][] = new char[10][10];
		for (int i=0; i < 10; i++)
			for (int j=0; j < 10; j++)
				for (LaivasImplementation l : this.laivuMasyvas) {
					if (l.gautiX() == i && l.gautiY() == j) {
						lenta[i][j] = 'L';
						int dydis = l.gautiDydi();
						while (dydis > 1) {
							if (l.gautiKrypti() == Kryptis.HORIZONTAL)
								lenta[i + dydis - 1][j] = 'L';
							else
								lenta[i][j + dydis - 1] = 'L';
							dydis--;
						}

					} else if (lenta[i][j] != 'L')
						lenta[i][j] = '#';

				}
	
		for (int i=0; i < 10; i++) {
			System.out.println();
			for (int j=0; j < 10; j++)
				System.out.print(" " + lenta[i][j]);
		}
		return null;
	}

	@Override
	public boolean sauti(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int gautiLaivuSkaiciu() {
		return this.laivuMasyvas.size();
	}

}
