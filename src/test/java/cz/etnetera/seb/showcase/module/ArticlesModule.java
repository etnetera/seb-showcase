package cz.etnetera.seb.showcase.module;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import cz.etnetera.seb.module.Module;

public class ArticlesModule extends Module {

	@FindBy(css = "article.post")
	protected List<ArticleBoxModule> articleBoxEls;
	
	public List<ArticleBoxModule> getArticleBoxEls() {
		return articleBoxEls;
	}

	public ArticleBoxModule getFirstArticleBoxEl() {
		return articleBoxEls.get(0);
	}
	
	public ArticleBoxModule getRandomArticleBoxEl() {
		return articleBoxEls.get((int) (Math.random() * articleBoxEls.size()));
	}

}
