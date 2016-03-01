package cz.etnetera.seb.showcase.logic;

import org.junit.Assert;

import cz.etnetera.seb.logic.Logic;
import cz.etnetera.seb.showcase.context.WithArticles;
import cz.etnetera.seb.showcase.module.ArticleBoxModule;
import cz.etnetera.seb.showcase.page.ArticlePage;
import cz.etnetera.seb.showcase.page.HomePage;

public class ArticleLogic extends Logic {

	public ArticlePage goToFirstArticle() {
		if (!isAt(WithArticles.class)) {
			goTo(HomePage.class);
		}
		ArticleBoxModule articleBoxEl = getPage(WithArticles.class).getArticlesEl().getFirstArticleBoxEl();
		Assert.assertNotNull("First article box exists", articleBoxEl);
		return articleBoxEl.goToArticlePage();
	}
	
	public ArticlePage goToRandomArticle() {
		if (!isAt(WithArticles.class)) {
			goTo(HomePage.class);
		}
		ArticleBoxModule articleBoxEl = getPage(WithArticles.class).getArticlesEl().getRandomArticleBoxEl();
		Assert.assertNotNull("Random article box exists", articleBoxEl);
		return articleBoxEl.goToArticlePage();
	}

}
