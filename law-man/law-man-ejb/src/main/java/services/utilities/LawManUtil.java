package services.utilities;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Agent;
import persistence.Article;
import persistence.Chapter;
import persistence.Law;
import persistence.Member;
import persistence.TypeLaw;

/**
 * Session Bean implementation class LawManUtil
 */
@Singleton
@LocalBean
@Startup
public class LawManUtil {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public LawManUtil() {
	}

	@PostConstruct
	public void initDb() {
		Law law = new Law("municipalité", TypeLaw.CONSTITUTION);
		Law law2 = new Law("terrorisme", TypeLaw.CONSTITUTION);

		Chapter chapter = new Chapter("chapter 1");
		Chapter chapter2 = new Chapter("chapter 2");

		List<Chapter> chapters = new ArrayList<>();
		chapters.add(chapter);
		chapters.add(chapter2);

		Article article = new Article("Article1");
		Article article2 = new Article("Article2");
		Article article3 = new Article("Article3");

		List<Article> articles = new ArrayList<>();
		articles.add(article);
		articles.add(article2);
		articles.add(article3);

		chapter.linkArticlesToThisChapter(articles);

		law.linkChaptersToThisLaw(chapters);
		
		Agent agent = new Agent();
		agent.setName("Haykel");
		agent.setLogin("haykel");
		agent.setPassword("haykel");
		agent.setRole("dev");
		
		Member member = new Member();
		member.setName("Kefi");
		member.setLogin("kefi");
		member.setPassword("kefi");
		member.setPlace(10);
		

		entityManager.persist(law);
		entityManager.persist(agent);
		entityManager.persist(member);
	}

}
