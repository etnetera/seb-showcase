package cz.etnetera.seb.showcase.module;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.module.Module;

public class ContentHeaderModule extends Module {

	@RequiredElement
	@FindBy(css = "h1.content__title")
	protected SebElement titleEl;
	
	protected String title;

	@Override
	protected void setup() {
		super.setup();
		title = titleEl.getText();
	}

	public SebElement getTitleEl() {
		return titleEl;
	}

	public String getTitle() {
		return title;
	}

}
