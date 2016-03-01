package cz.etnetera.seb.showcase.module.navigation;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.module.Module;

public class MainMenuItemModule extends Module {

	@RequiredElement
	@FindBy(css = "a.menu__item-link")
	protected SebElement linkEl;
	
	protected String title;
	
	protected String href;

	@Override
	protected void setup() {
		super.setup();
		title = linkEl.getAttribute("title");
		href = linkEl.getAttribute("href");
	}

	public SebElement getLinkEl() {
		return linkEl;
	}

	public String getTitle() {
		return title;
	}

	public String getHref() {
		return href;
	}

}
