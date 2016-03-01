package cz.etnetera.seb.showcase.page;

import org.junit.Assert;

import cz.etnetera.seb.page.PageConfig;
import cz.etnetera.seb.showcase.page.common.BasicLayoutPage;

@PageConfig(uriRegex = "/blog/.+")
public class ArticlePage extends BasicLayoutPage {

	public void verifyTitle(String title) {
		Assert.assertEquals("Content header title match", title, getContentHeaderEl().getTitle());
	}

}
