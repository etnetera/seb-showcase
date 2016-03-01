package cz.etnetera.seb.showcase.configuration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import cz.etnetera.seb.SebException;
import cz.etnetera.seb.configuration.BasicSebConfiguration;

public class SebConfig extends BasicSebConfiguration {

	public static final String PREFIX = "seb.showcase.";
	
	public static final String ENVIRONMENT = PREFIX + "environment";
	public static final String HEADLESS = PREFIX + "headless";
	public static final String PHANTOMJS_USER_AGENT = PREFIX + "phantomjs.useragent";
	
	@Override
	public void init() {
		super.init();
		addResourcePropertiesAfter(BasicSebConfiguration.SYSTEM_PROPERTIES_KEY, "env",
				"seb." + getEnvironment().name().toLowerCase() + ".properties");
	}
	
	@Override
	protected boolean isDefaultReported() {
		return true;
	}
	
	@Override
	protected WebDriver getDefaultDriver(DesiredCapabilities caps) {
		if (isHeadless()) {
			// load path to allow setting it not only from system properties, but whole configuration chain
			String executablePath = getPhantomJSExecutablePath();
			if (executablePath == null)
				throw new SebException("PhantomJS executable path is required for headless mode.");
			System.setProperty(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, executablePath);
			
			caps.merge(DesiredCapabilities.phantomjs());
			String userAgent = getPhantomJSUserAgent();
			if (userAgent != null)
				caps.setCapability("phantomjs.page.settings.userAgent", userAgent);
			
			caps.setJavascriptEnabled(true);
			caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] { "--web-security=no",
					"--ignore-ssl-errors=yes", "--ssl-protocol=tlsv1" });
			WebDriver driver = new PhantomJSDriver(caps);
			driver.manage().window().setSize(new Dimension(1280, 800));
			return driver;
		} else {
			return super.getDefaultDriver(caps);
		}
	}
	
	public Environment getEnvironment() {
		return getProperty(ENVIRONMENT, Environment.class, Environment.DEV);
	}
	
	public boolean isHeadless() {
		return getProperty(HEADLESS, Boolean.class, false);
	}
	
	public String getPhantomJSUserAgent() {
		return getProperty(PHANTOMJS_USER_AGENT);
	}
	
	public String getPhantomJSExecutablePath() {
		return getProperty(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY);
	}
	
	public static enum Environment {
		
		DEV, PROD
		
	}

}
