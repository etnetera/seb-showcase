package cz.etnetera.seb.showcase.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import cz.etnetera.seb.Seb;
import cz.etnetera.seb.showcase.configuration.SebConfig;

abstract public class SebTest {

	@Rule public TestName name = new TestName();
	
	protected Seb seb;
	
	@Before
	public void before() {
		seb = new Seb(SebConfig.class);
		seb.setLabel(getClass().getSimpleName(), name.getMethodName());
	}
	
	@After
	public void after() {
		if (seb != null) seb.quit();
	}

}
