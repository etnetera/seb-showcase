package cz.etnetera.seb.showcase.module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.element.RequiredElement;
import cz.etnetera.seb.element.SebElement;
import cz.etnetera.seb.module.Module;
import cz.etnetera.seb.showcase.page.ArticlePage;

public class ArticleBoxModule extends Module {

	@RequiredElement
	@FindBy(className = "post__inner")
	protected SebElement innerEl;

	protected SebElement headerEl;
	
	protected SebElement thumbnailEl;
	
	protected SebElement titleEl;
	
	protected SebElement excerptEl;
	
	protected SebElement linkEl;
	
	protected SebElement footerEl;
	
	protected SebElement authorLinkEl;
	
	protected List<SebElement> tagEls;
	
	protected String title;

	@Override
	protected void setup() {
		super.setup();
		headerEl = innerEl.findOne(By.className("post__header"));
		thumbnailEl = headerEl.findOne(By.className("post__thumbnail"));
		titleEl = headerEl.findOne(By.className("post__title"));
		excerptEl = innerEl.findOne(By.className("post__excerpt"));
		linkEl = excerptEl.findOne(By.cssSelector("a.post__link"));
		footerEl = innerEl.findOne(By.className("post__footer"));
		authorLinkEl = footerEl.findOne(By.className("author-link"));
		tagEls = footerEl.find(By.cssSelector(".tags .tag a"));
		title = titleEl.findOne(By.tagName("a")).getText();
	}
	
	public ArticlePage goToArticlePage() {
		linkEl.click();
		ArticlePage articlePage = initPage(ArticlePage.class);
		articlePage.verifyTitle(title);
		return articlePage;
	}

}
