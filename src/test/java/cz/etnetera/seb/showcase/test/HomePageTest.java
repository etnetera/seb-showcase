package cz.etnetera.seb.showcase.test;

import org.junit.Assert;
import org.junit.Test;

import cz.etnetera.reesmo.writer.ReesmoConfiguration;
import cz.etnetera.reesmo.writer.model.result.TestSeverity;
import cz.etnetera.seb.showcase.page.HomePage;

@ReesmoConfiguration(severity = TestSeverity.BLOCKER)
public class HomePageTest extends SebTest {

	@Test
	public void valid() {
		seb.goTo(HomePage.class);
		Assert.assertTrue("Homepage title contains Etnetera2", seb.getWrappedDriver().getTitle().contains("Etnetera2"));
	}

}
