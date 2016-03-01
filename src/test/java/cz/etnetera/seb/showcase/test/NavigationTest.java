package cz.etnetera.seb.showcase.test;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import cz.etnetera.seb.showcase.context.WithHeaderNavigation;
import cz.etnetera.seb.showcase.page.HomePage;
import cz.etnetera.seb.showcase.page.common.LayoutPage;

public class NavigationTest extends SebTest {

	@Test
	public void iterateMainMenu() {
		seb.goTo(HomePage.class);
		List<String> hrefs = seb.getPage(WithHeaderNavigation.class).getHeaderNavigationEl().getMainMenuEl()
				.getMenuItemEls().stream().map(el -> el.getHref()).collect(Collectors.toList());
		hrefs.forEach(href -> {
			seb.waiting(2).sleep();
			seb.goToUrl(href);
			seb.initPage(LayoutPage.class);
		});
	}

}
