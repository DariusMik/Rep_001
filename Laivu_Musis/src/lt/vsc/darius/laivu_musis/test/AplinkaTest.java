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

		Laivas pirmasLaivas = aplinka.padetiLaiva(4, 2, 2, Kryptis.VERTICAL);
		Assert.assertTrue(pirmasLaivas.gautiDydi() > 0);
	}

	@Test
	public void arLaivuiPriskirtosXirY() {
		AplinkaImplementation aplinka = new AplinkaImplementation();

		Laivas pirmasLaivas = aplinka.padetiLaiva(4, 2, 2, Kryptis.HORIZONTAL);
		Assert.assertTrue(pirmasLaivas.gautiX() == 2 && pirmasLaivas.gautiY() == 2);
	}

	@Test
	public void arPaduodamosKoordinatesLegalios() {
		AplinkaImplementation aplinka = new AplinkaImplementation();
		Laivas pirmasLaivas = aplinka.padetiLaiva(4, 11, 11, Kryptis.HORIZONTAL);
		Laivas antrasLaivas = aplinka.padetiLaiva(4, 4, 8, Kryptis.HORIZONTAL);

		Assert.assertTrue(pirmasLaivas == null);
		Assert.assertTrue(antrasLaivas != null);
	}

}
