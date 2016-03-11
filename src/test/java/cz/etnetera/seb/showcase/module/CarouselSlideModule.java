package cz.etnetera.seb.showcase.module;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.module.Module;

public class CarouselSlideModule extends Module {

	@RequiredElement
	@FindBy(css = ".hero__content")
	protected SebElement contentEl;

	public SebElement getContentEl() {
		return contentEl;
	}

}
