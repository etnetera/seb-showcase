package cz.etnetera.seb.showcase.test;

import org.junit.Test;

import cz.etnetera.seb.showcase.logic.ArticleLogic;

public class ArticleTest extends SebTest {

	@Test
	public void firstArticleAccessible() {
		seb.initLogic(ArticleLogic.class).goToFirstArticle();
	}
	
	@Test
	public void anyArticleAccessible() {
		seb.initLogic(ArticleLogic.class).goToRandomArticle();
	}

}
