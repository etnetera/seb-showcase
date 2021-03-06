package cz.etnetera.seb.showcase.page;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.page.PageConfig;
import cz.etnetera.seb.showcase.context.WithArticles;
import cz.etnetera.seb.showcase.module.ArticlesModule;
import cz.etnetera.seb.showcase.page.common.BasicLayoutPage;

@PageConfig(uri = "/blog")
public class BlogPage extends BasicLayoutPage implements WithArticles {

	@RequiredElement
	@FindBy(css = ".layout__main > .blog")
	protected ArticlesModule articlesEl;
	
	@Override
	public ArticlesModule getArticlesEl() {
		return articlesEl;
	}

}
