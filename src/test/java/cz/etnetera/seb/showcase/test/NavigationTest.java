package cz.etnetera.seb.showcase.test;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import cz.etnetera.reesmo.writer.ReesmoConfiguration;
import cz.etnetera.reesmo.writer.model.result.TestSeverity;
import cz.etnetera.seb.showcase.context.WithHeaderNavigation;
import cz.etnetera.seb.showcase.page.HomePage;
import cz.etnetera.seb.showcase.page.common.LayoutPage;

@ReesmoConfiguration(severity = TestSeverity.CRITICAL)
public class NavigationTest extends SebTest {

	@Test
	public void iterateMainMenu() {
		seb.goTo(HomePage.class);
		List<String> hrefs = seb.getPage(WithHeaderNavigation.class).getHeaderNavigationEl().getMainMenuEl()
				.getMenuItemEls().stream().skip(1).map(el -> el.getHref()).collect(Collectors.toList());
		seb.waiting(2).sleep();
		seb.report("Page " + seb.getWrappedDriver().getTitle());
		
		hrefs.forEach(href -> {
			seb.goToUrl(href);
			seb.initPage(LayoutPage.class);
			seb.waiting(2).sleep();
			seb.report("Page " + seb.getWrappedDriver().getTitle());
		});
	}

}
