package lt.vsc.darius.laivu_musis.test;


import org.junit.Assert;
import org.junit.Test;
import lt.vsc.darius.laivu_musis.main.Aplinka;


public class AplinkaTest {
	
	
	@Test
	public void tikrinamArPradziojLaivuYraNulis () {
		
		Aplinka aplinka = new Aplinka();
		int kiekis = aplinka.gautiLaivuSkaiciu();
	
		Assert.assertTrue(kiekis == 0);
		
		
		System.out.println("testuojam");
	}
	
	@Test
	private void tikrinamArPoPadejimoLaivuYraVienas() {
		Aplinka  aplinka = new Aplinka();

		aplinka.padetiLaiva();
		int kiekis = aplinka.gautiLaivuSkaiciu();
		Assert.assertTrue(kiekis == 1);
	}

}
