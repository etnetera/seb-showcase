package cz.etnetera.seb.showcase.module.navigation;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.module.Module;

public class MainMenuModule extends Module {

	@FindBy(css = "li.menu__item-wrapper")
	protected List<MainMenuItemModule> menuItemEls;

	public List<MainMenuItemModule> getMenuItemEls() {
		return menuItemEls;
	}

}
