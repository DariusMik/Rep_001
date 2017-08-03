package lt.vsc.darius.laivu_musis.main;

import java.util.ArrayList;

public class AplinkaImplementation implements Aplinka {
	private int xMax=10;
	private int yMax=10;
	private ArrayList<LaivasImplementation> laivuMasyvas = new ArrayList<LaivasImplementation>();

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
		char lenta[][] = new char[11][11];
		for (int i=1; i < 11; i++)
			for (int j=1; j < 11; j++)
				for (LaivasImplementation l : this.laivuMasyvas) {
					if (l.gautiX() == i && l.gautiY() == j) {
						lenta[i][j] = 'L';
						int dydis = l.gautiDydi();
						while (dydis > 1) {
							if (l.gautiKrypti() == Kryptis.VERTICAL)
								lenta[i + dydis - 1][j] = 'L';
							else
								lenta[i][j + dydis - 1] = 'L';
							dydis--;
						}

					} else if (lenta[i][j] != 'L')
						lenta[i][j] = '#';

				}
		System.out.print("   1 2 3 4 5 6 7 8 9 10");
		for (int i=1; i < 11; i++) {
			System.out.println();
			if (i!=10) System.out.print(i+" ");
			else System.out.print(i);
			for (int j=1; j < 11; j++)
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
