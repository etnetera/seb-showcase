package cz.etnetera.seb.showcase.module;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.module.Module;
import cz.etnetera.seb.showcase.module.navigation.MainMenuModule;

public class HeaderNavigationModule extends Module {

	@RequiredElement
	@FindBy(css = "a.layout__logo")
	protected SebElement logoEl;
	
	@RequiredElement
	@FindBy(css = ".menu.menu--main")
	protected MainMenuModule mainMenuEl;

	public SebElement getLogoEl() {
		return logoEl;
	}

	public MainMenuModule getMainMenuEl() {
		return mainMenuEl;
	}

}
