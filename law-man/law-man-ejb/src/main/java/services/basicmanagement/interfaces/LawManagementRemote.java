package services.basicmanagement.interfaces;

import java.util.List;

import javax.ejb.Remote;

import persistence.Alinea;
import persistence.Article;
import persistence.Chapter;
import persistence.Law;
import persistence.Section;

@Remote
public interface LawManagementRemote {
	void addLaw(Law law);

	void linkChaptersToLaw(int idLaw, List<Chapter> chapters);

	void linkArticlesToChapter(int idChapter, List<Article> articles);

	void linkSectionsToArticle(int idArticle, List<Section> sections);

	void linkAlineasToSection(int idSection, List<Alinea> alineas);

	Law findLawById(int idLaw);

	List<Article> findArticlesByLawIdObjectWay(int idLaw);

	List<Article> findArticlesByLawIdEjbqlWay(int idLaw);

	List<Chapter> findChaptersByLawId(int idLaw);

	List<Law> findAllLaws();

	void deleteLaw(int idLaw);

}
