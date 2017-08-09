package lt.vsc.darius.laivu_musis.main;


public class AplinkaImplementation implements Aplinka {
	private int xMax=10;
	private int yMax=10;
	private Laivas[][] lenta = new Laivas[9][9];
	private int laivuSkaicius = 0;

	@Override
	public Laivas padetiLaiva(int dydis, int x, int y, Kryptis kryptis) {
		x = x - 1;
		y = y - 1;
		LaivasImplementation naujasLaivas = null;
		switch (kryptis) {
		case HORIZONTAL:
			xMax = xMax - dydis;
			break;

		case VERTICAL:
			xMax = xMax - dydis;
			break;
		}
		if (x <= xMax && x >= 0 && y <= yMax && y >= 0) {
			naujasLaivas = new LaivasImplementation(dydis, x, y, kryptis);
			this.laivuSkaicius++;
			lenta[x][y] = naujasLaivas;
			while (dydis > 1) {
				if (kryptis == Kryptis.VERTICAL)
					lenta[x + dydis - 1][y] = naujasLaivas ;
				else
					lenta[x][y + dydis - 1] = naujasLaivas;
				dydis--;
			}

		}

		return naujasLaivas;
	}

	@Override
	public int gautiGyvuLaivuSkaiciu() {
		return laivuSkaicius;
	}

	@Override
	public Laivas[][] gautiLenta() {
		/*Laivas lenta[][] = new Laivas[10][10];
		for (int i=0; i < 10; i++)
			for (int j=0; j < 10; j++)
				for (LaivasImplementation l : this.laivuMasyvas) {
					if (l.gautiX() == i && l.gautiY() == j) {
						lenta[i][j] = l;
						int dydis = l.gautiDydi();
						while (dydis > 1) {
							if (l.gautiKrypti() == Kryptis.VERTICAL)
								lenta[i + dydis - 1][j] = l;
							else
								lenta[i][j + dydis - 1] = l;
							dydis--;
						}

					} else if (lenta[i][j] != l)
						lenta[i][j] = null;

				}
		System.out.print("   1 2 3 4 5 6 7 8 9 10");
		for (int i=1; i < 11; i++) {
			System.out.println();
			if (i!=10) System.out.print(i+" ");
			else System.out.print(i);
			for (int j=1; j < 11; j++)
			System.out.print(" " + lenta[i][j]);
			
		}*/
		return lenta;
	}

	@Override
	public boolean sauti(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int gautiLaivuSkaiciu() {
		return this.laivuSkaicius;
	}

}
