package cz.etnetera.seb.showcase.test;

import org.junit.Test;

import cz.etnetera.seb.showcase.page.HomePage;

public class HomePageTest extends SebTest {

	@Test
	public void valid() {
		seb.goTo(HomePage.class);
	}

}
