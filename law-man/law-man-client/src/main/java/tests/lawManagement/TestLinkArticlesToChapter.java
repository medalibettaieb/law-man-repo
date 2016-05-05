package tests.lawManagement;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Article;
import services.basicmanagement.interfaces.LawManagementRemote;

public class TestLinkArticlesToChapter {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		LawManagementRemote proxy = (LawManagementRemote) context.lookup(
				"law-man-ear/law-man-ejb/LawManagement!services.basicmanagement.interfaces.LawManagementRemote");

		List<Article> articles = new ArrayList<>();

		Article article = new Article();
		article.setId(1);
		article.setName("Article1");
		Article article2 = new Article();
		article2.setId(2);
		article2.setName("Article2");

		articles.add(article);
		articles.add(article2);

		proxy.linkArticlesToChapter(1, articles);

	}

}
