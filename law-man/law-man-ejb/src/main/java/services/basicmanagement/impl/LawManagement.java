package services.basicmanagement.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistence.Alinea;
import persistence.Article;
import persistence.Chapter;
import persistence.Law;
import persistence.Section;
import services.basicmanagement.interfaces.LawManagementLocal;
import services.basicmanagement.interfaces.LawManagementRemote;

/**
 * Session Bean implementation class LawManagement
 */
@Stateless
public class LawManagement implements LawManagementRemote, LawManagementLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public LawManagement() {
	}

	@Override
	public void addLaw(Law law) {
		entityManager.persist(law);

	}

	@Override
	public void linkChaptersToLaw(int idLaw, List<Chapter> chapters) {
		Law lawFound = findLawById(idLaw);
		for (Chapter c : chapters) {
			c.setLaw(lawFound);
			entityManager.merge(c);
		}

	}

	@Override
	public void linkArticlesToChapter(int idChapter, List<Article> articles) {
		Chapter chapterFound = entityManager.find(Chapter.class, idChapter);
		for (Article a : articles) {
			a.setChapter(chapterFound);
			entityManager.merge(a);
		}

	}

	@Override
	public void linkSectionsToArticle(int idArticle, List<Section> sections) {
		// TODO Auto-generated method stub

	}

	@Override
	public void linkAlineasToSection(int idSection, List<Alinea> alineas) {
		// TODO Auto-generated method stub

	}

	@Override
	public Law findLawById(int idLaw) {
		return entityManager.find(Law.class, idLaw);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chapter> findChaptersByLawId(int idLaw) {
		String jpql = "SELECT c FROM Chapter c WHERE c.law.id=:i";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("i", idLaw);
		return query.getResultList();
	}

	@Override
	public List<Law> findAllLaws() {
		return entityManager.createQuery("SELECT l FROM Law l").getResultList();
	}

	@Override
	public void deleteLaw(int idLaw) {
		entityManager.remove(findLawById(idLaw));
	}

	public List<Chapter> findChaptersByLawIdJpqlSolution(int idLaw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findArticlesByLawIdEjbqlWay(int idLaw) {
		Law low = findLawById(idLaw);
		return entityManager.createQuery("select a from Article a,Law l join l.chapters lc where a.chapter=lc and l=:p",
				Article.class).setParameter("p", low).getResultList();
	}

	@Override
	public List<Article> findArticlesByLawIdObjectWay(int idLaw) {
		List<Article> listArticles = new ArrayList<Article>();
		Law law = findLawById(idLaw);
		List<Chapter> listChapters = law.getChapters();
		for (Chapter c : listChapters) {
			List<Article> articles = c.getArticles();
			for (Article a : articles) {
				listArticles.add(a);
			}
		}
		return listArticles;
	}

	@Override
	public void updateLaw(Law lawSlected) {
		entityManager.merge(lawSlected);

	}

}
