package lt.vsc.darius.laivu_musis.test;

import org.junit.Assert;
import org.junit.Test;
import lt.vsc.darius.laivu_musis.main.*;

public class AplinkaTest {

	@Test
	public void tikrinamArPradziojLaivuYraNulis() {

		AplinkaImplementation aplinka = new AplinkaImplementation();
		int kiekis = aplinka.gautiLaivuSkaiciu();

		Assert.assertTrue(kiekis == 0);

	}

	@Test
	public void tikrinamArPoPadejimoLaivuYraVienas() {
		AplinkaImplementation aplinka = new AplinkaImplementation();

		aplinka.padetiLaiva(4, 1, 1, Kryptis.HORIZONTAL);
		int kiekis = aplinka.gautiLaivuSkaiciu();
		Assert.assertTrue(kiekis == 1);
	}

	@Test
	public void tikrinamKokiLaivaPadejom() {
		AplinkaImplementation aplinka = new AplinkaImplementation();

		Laivas pirmasLaivas = aplinka.padetiLaiva(3, 7, 2, Kryptis.HORIZONTAL);
		Assert.assertTrue(pirmasLaivas.gautiDydi() > 0);
	}

	@Test
	public void arLaivuiPriskirtosXirY() {
		AplinkaImplementation aplinka = new AplinkaImplementation();

		Laivas pirmasLaivas = aplinka.padetiLaiva(3, 7, 2, Kryptis.HORIZONTAL);
		Assert.assertTrue(pirmasLaivas.gautiX() == 6 && pirmasLaivas.gautiY() == 1);
	}

	@Test
	public void arPaduodamosKoordinatesLegalios() {
		AplinkaImplementation aplinka = new AplinkaImplementation();
		Laivas fLaivas = aplinka.padetiLaiva(1, 9, 1, Kryptis.HORIZONTAL);
		Laivas aLaivas = aplinka.padetiLaiva(1, 6, 1, Kryptis.HORIZONTAL);
		Laivas bLaivas = aplinka.padetiLaiva(1, 1, 1, Kryptis.VERTICAL);
		Laivas cLaivas = aplinka.padetiLaiva(1, 1, 9, Kryptis.VERTICAL);
		Laivas dLaivas = aplinka.padetiLaiva(2, 3, 3, Kryptis.VERTICAL);
		Laivas eLaivas = aplinka.padetiLaiva(1, 1, 7, Kryptis.VERTICAL);
		

		Assert.assertTrue(aLaivas != null);
		Assert.assertTrue(bLaivas != null);
		Assert.assertTrue(cLaivas != null);
		Assert.assertTrue(dLaivas != null);
		Assert.assertTrue(eLaivas != null);
		Assert.assertTrue(fLaivas != null);
	}

}
