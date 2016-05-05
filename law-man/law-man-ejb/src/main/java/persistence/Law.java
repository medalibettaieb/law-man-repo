package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Law implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String text;
	private TypeLaw typeLaw;

	@OneToMany(mappedBy = "law")
	private List<Chapter> chapters;
	@OneToMany(mappedBy = "lawProposed")
	private List<Amendment> amendmentsMaster;
	@OneToMany(mappedBy = "lawAmended")
	private List<Amendment> amendmentsSlave;

	public Law() {
	}

	public Law(String text) {
		super();
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public TypeLaw getTypeLaw() {
		return typeLaw;
	}

	public void setTypeLaw(TypeLaw typeLaw) {
		this.typeLaw = typeLaw;
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
