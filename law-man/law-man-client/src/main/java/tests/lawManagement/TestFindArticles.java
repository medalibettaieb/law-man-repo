package tests.lawManagement;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Article;
import services.basicmanagement.interfaces.LawManagementRemote;

public class TestFindArticles {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		LawManagementRemote proxy = (LawManagementRemote) context.lookup(
				"law-man-ear/law-man-ejb/LawManagement!services.basicmanagement.interfaces.LawManagementRemote");

		List<Article> articles = proxy.findArticlesByLawId(1);
		System.out.println(articles.size());

	}

}
