package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Chapter
 *
 */
@Entity

public class Chapter implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Law law;
	@OneToMany(mappedBy = "chapter", cascade = CascadeType.PERSIST)
	private List<Article> articles;

	public Chapter() {
		super();
	}

	public Chapter(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Law getLaw() {
		return law;
	}

	public void setLaw(Law law) {
		this.law = law;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public void linkArticlesToThisChapter(List<Article> articles) {
		this.articles = articles;
		for (Article a : articles) {
			a.setChapter(this);
		}
	}

	@Override
	public String toString() {
		return "Chapter [id=" + id + ", name=" + name + "]";
	}

}
