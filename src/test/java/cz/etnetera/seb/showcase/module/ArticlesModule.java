package cz.etnetera.seb.showcase.module;

import cz.etnetera.seb.module.Module;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ArticlesModule extends Module {

	@FindBy(css = "article.post")
	protected List<ArticleBoxModule> articleBoxEl;
	
	public List<ArticleBoxModule> getArticleBoxEl() {
		return articleBoxEl;
	}

	public ArticleBoxModule getFirstArticleBoxEl() {
		return articleBoxEl.get(0);
	}
	
	public ArticleBoxModule getRandomArticleBoxEl() {
		return articleBoxEl.get((int) (Math.random() * articleBoxEl.size()));
	}

}
