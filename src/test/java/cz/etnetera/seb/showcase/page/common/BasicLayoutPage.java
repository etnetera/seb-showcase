package cz.etnetera.seb.showcase.page.common;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.showcase.module.ContentHeaderModule;

public class BasicLayoutPage extends LayoutPage {

	@RequiredElement
	@FindBy(css = "article.content header.content__header")
	protected ContentHeaderModule contentHeaderEl;

	public ContentHeaderModule getContentHeaderEl() {
		return contentHeaderEl;
	}

}
