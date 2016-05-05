package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Section
 *
 */
@Entity

public class Section implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Article article;
	@OneToMany(mappedBy = "section")
	private List<Alinea> alineas;

	public Section() {
		super();
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

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Alinea> getAlineas() {
		return alineas;
	}

	public void setAlineas(List<Alinea> alineas) {
		this.alineas = alineas;
	}

}
