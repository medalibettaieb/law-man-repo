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
 * Entity implementation class for Entity: Article
 *
 */
@Entity

public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Chapter chapter;
	@OneToMany(mappedBy = "article")
	private List<Section> sections;
	@OneToMany(mappedBy = "articleProposed")
	private List<Amendment> amendmentsMaster;
	@OneToMany(mappedBy = "articleAmended")
	private List<Amendment> amendmentsSlave;

	public Article() {
		super();
	}

	public Article(String name) {
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

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public List<Amendment> getAmendmentsMaster() {
		return amendmentsMaster;
	}

	public void setAmendmentsMaster(List<Amendment> amendmentsMaster) {
		this.amendmentsMaster = amendmentsMaster;
	}

	public List<Amendment> getAmendmentsSlave() {
		return amendmentsSlave;
	}

	public void setAmendmentsSlave(List<Amendment> amendmentsSlave) {
		this.amendmentsSlave = amendmentsSlave;
	}

}
