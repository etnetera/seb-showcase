package cz.etnetera.seb.showcase.page.common;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.page.Page;
import cz.etnetera.seb.showcase.context.WithHeaderNavigation;
import cz.etnetera.seb.showcase.module.HeaderNavigationModule;

public class LayoutPage extends Page implements WithHeaderNavigation {

	@RequiredElement
	@FindBy(css = "#menu.layout__navigation")
	protected HeaderNavigationModule headerNavigationEl;

	@Override
	public HeaderNavigationModule getHeaderNavigationEl() {
		return headerNavigationEl;
	}
	
}
