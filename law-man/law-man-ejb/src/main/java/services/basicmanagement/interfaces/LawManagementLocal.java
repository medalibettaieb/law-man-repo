package services.basicmanagement.interfaces;

import java.util.List;

import javax.ejb.Local;

import persistence.Alinea;
import persistence.Article;
import persistence.Chapter;
import persistence.Law;
import persistence.Section;

@Local
public interface LawManagementLocal {
	void addLaw(Law law);

	void linkChaptersToLaw(int idLaw, List<Chapter> chapters);

	void linkArticlesToChapter(int idChapter, List<Article> articles);

	void linkSectionsToArticle(int idArticle, List<Section> sections);

	void linkAlineasToSection(int idSection, List<Alinea> alineas);

	Law findLawById(int idLaw);

	List<Chapter> findChaptersByLawId(int idLaw);

	List<Law> findAllLaws();

	void deleteLaw(int idLaw);

	List<Chapter> findChaptersByLawIdJpqlSolution(int idLaw);

	List<Article> findArticlesByLawId(int idLaw);
}
