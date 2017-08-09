package lt.vsc.darius.laivu_musis.main;

import java.util.ArrayList;

public class AplinkaImplementation implements Aplinka {
	private static int xyMax = 10;
	private static int maxKeturvieciu = 1;
	private static int maxTrivieciu = 2;
	private static int maxDvivieciu = 3;
	private static int maxVienvieciu = 4;
	private LaivasImplementation[][] lenta = new LaivasImplementation[10][10];
	private Suvis[][] suviuLenta = new Suvis[10][10];
	private ArrayList<LaivasImplementation> laivuEile = new ArrayList<LaivasImplementation>();

	@Override
	public Laivas padetiLaiva(int dydis, int x, int y, Kryptis kryptis) {
		x = x - 1;
		y = y - 1;
		LaivasImplementation naujasLaivas = null;
		if (arGaliuDetiLaivaTokioDydzio(dydis)) {
			naujasLaivas = new LaivasImplementation(dydis, x, y, kryptis);
			laivuEile.add(naujasLaivas);
			mazinkDydziuLikucius(dydis);
			lenta[x][y] = naujasLaivas;
			while (dydis > 1) {
				if (kryptis == Kryptis.VERTICAL)
					lenta[x + dydis - 1][y] = naujasLaivas;
				else
					lenta[x][y + dydis - 1] = naujasLaivas;
				dydis--;
			}

		}

		return naujasLaivas;
	}

	@Override
	public int gautiGyvuLaivuSkaiciu() {
		int i = 0;
		for (LaivasImplementation l : laivuEile)
			if (l.isArGyvas() == true)
				i++;
		return i;
	}

	@Override
	public Laivas[][] gautiLenta() {
		/*
		 * Laivas lenta[][] = new Laivas[10][10]; for (int i=0; i < 10; i++) for (int
		 * j=0; j < 10; j++) for (LaivasImplementation l : this.laivuMasyvas) { if
		 * (l.gautiX() == i && l.gautiY() == j) { lenta[i][j] = l; int dydis =
		 * l.gautiDydi(); while (dydis > 1) { if (l.gautiKrypti() == Kryptis.VERTICAL)
		 * lenta[i + dydis - 1][j] = l; else lenta[i][j + dydis - 1] = l; dydis--; }
		 * 
		 * } else if (lenta[i][j] != l) lenta[i][j] = null;
		 * 
		 * } System.out.print("   1 2 3 4 5 6 7 8 9 10"); for (int i=1; i < 11; i++) {
		 * System.out.println(); if (i!=10) System.out.print(i+" "); else
		 * System.out.print(i); for (int j=1; j < 11; j++) System.out.print(" " +
		 * lenta[i][j]);
		 * 
		 * }
		 */
		return lenta;
	}

	@Override
	public boolean sauti(int x, int y) {
		x = x - 1;
		y = y - 1;
		suviuLenta[x][y] = new Suvis();
		if (lenta[x][y] != null) {
			suviuLenta[x][y].setSuvisTaiklus();
			lenta[x][y].mazintiLaivoGyvybes();
			return true;
		} else
			return false;

	}

	@Override
	public int gautiLaivuSkaiciu() {
		return laivuEile.size();
	}

	public Suvis[][] getSuviuLenta() {
		return suviuLenta;
	}

	public boolean arGaliuDetiLaivaTokioDydzio(int laivoDysis) {
		switch (laivoDysis) {
		case 1:
			if (maxVienvieciu > 0)
				return true;
			break;
		case 2:

			if (maxDvivieciu > 0)
				return true;
			break;
		case 3:
			if (maxTrivieciu > 0)
				return true;
			break;
		case 4:
			if (maxKeturvieciu > 0)
				return true;
			break;
		}
		return false;

	}

	public void mazinkDydziuLikucius(int laivoDysis) {
		switch (laivoDysis) {
		case 1:
			maxVienvieciu--;
			break;
		case 2:
			maxDvivieciu--;
			break;
		case 3:
			maxTrivieciu--;
			break;
		case 4:
			maxKeturvieciu--;
			break;

		}
	}

	public boolean arLaivasNelipaAntKitoIrTelpaILenta(int dydis, int x, int y, Kryptis kryptis) {
		
		int xMax = xyMax;
		int yMax = xyMax;
		boolean arTelpa = false;
		switch (kryptis) {
		case HORIZONTAL:
			xMax = xyMax - dydis;
			break;

		case VERTICAL:
			yMax = xyMax - dydis;
			break;
		}
		if (x <= xMax && x >= 0 && y <= yMax && y >= 0) arTelpa = true;
		if (arTelpa && lenta[x][y]==null)
		}
		
	}
}
