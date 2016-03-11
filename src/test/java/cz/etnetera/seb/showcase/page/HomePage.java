package cz.etnetera.seb.showcase.page;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.page.PageConfig;
import cz.etnetera.seb.showcase.context.WithArticles;
import cz.etnetera.seb.showcase.context.WithCarousel;
import cz.etnetera.seb.showcase.module.ArticlesModule;
import cz.etnetera.seb.showcase.module.CarouselModule;
import cz.etnetera.seb.showcase.page.common.LayoutPage;
import org.openqa.selenium.support.FindBy;

@PageConfig(uri = "")
public class HomePage extends LayoutPage implements WithArticles, WithCarousel {

	@RequiredElement
	@FindBy(css = ".layout__main > .blog")
	protected ArticlesModule articlesEl;

	@RequiredElement
	@FindBy(css = ".heroes")
	protected CarouselModule carouselEl;
	
	@Override
	public ArticlesModule getArticlesEl() {
		return articlesEl;
	}

	@Override
	public CarouselModule getCarouselEl() {
		return carouselEl;
	}

}
